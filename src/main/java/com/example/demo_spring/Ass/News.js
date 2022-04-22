document.addEventListener('DOMContentLoaded', function () {
    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function () {
        if (xhr.readyState == 4 && xhr.status == 200) {
            var data = JSON.parse(xhr.responseText);
            var table = document.querySelector('#news-table');
            for (var i = 0; i < data.length; i++) {
                const element = data[i];
                console.log(element)
                table.innerHTML +=
                    `<tr>
                <td>${element.id}</td>
                <td>${element.title}</td>
                <td>${element.description}</td>
                <td>${element.image}</td>
                <td>${element.content}</td>
                <td>${element.category}</td>
                <td>${element.createAt}</td>
                <td>${element.updateAt}</td>
                <td>${element.status}</td>
                <td><a href="/HTML/Detail.html?id=${element.id}"><i class="fas fa-info-square"></i></a></td>
                <td><i class="fas fa-edit" onclick='editproduct(${element.id})'></i></td>
                <td><a href="/HTML/Detail.html?id=${element.id}"><i class="fas fa-trash" onclick='Delete(${element.id})'></i></a></td>
              </tr>`
            }
        }
    };
    xhr.open('GET', 'http://localhost:8080/api/v1/news', false);
    xhr.send();
});