document.addEventListener('DOMContentLoaded',function(){
    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function(){
        if(xhr.readyState == 4 && xhr.status == 200){
            var data = JSON.parse(xhr.responseText);
            var table = document.querySelector('#student-table');
            for(var i = 0 ; i < data.length;i++){
                const element = data[i];
                table.innerHTML +=
                    `<tr>
                <td>${element.rollNumber}</td>
                <td>${element.fullName}</td>
                <td>${element.email}</td>
                <td>${element.address}</td>
                <td>${element.status}</td>
                <td><i class="fas fa-caret-right"></i><a href="/HTML/Detail.html?id=${element.id}"><a></td>
                <td><i class="fas fa-coffee" onclick='editproduct(${element.id})'></i></td>
                <td><a href="/HTML/Detail.html?id=${element.id}"><i class="fas fa-coffee" onclick='Delete(${element.id})'></i><a></td>
              </tr>`
            }
        }
    };
    xhr.open('GET','http://localhost:8080/api/v1/students',false);
    xhr.send();
});