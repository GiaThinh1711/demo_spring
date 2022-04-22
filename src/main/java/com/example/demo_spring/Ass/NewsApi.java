package com.example.demo_spring.Ass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "api/v1/news")
public class NewsApi {
    @Autowired
    NewsRepository newsRepository;
    public static List<News> listNews;

    static {
        listNews = new ArrayList<>();
        listNews.add(new News(1, "Tin tuc", "Hay khong", "https://scontent.fhan2-3.fna.fbcdn.net/v/t39.30808-6/278917154_3007699266209352_4999631012666085907_n.jpg?_nc_cat=107&ccb=1-5&_nc_sid=5cd70e&_nc_ohc=C2ZO8NGxzTsAX_BrAy5&tn=TykjQc2z4FlE21TQ&_nc_ht=scontent.fhan2-3.fna&oh=00_AT8AC0BBHZfLT62_5CPhul4wc8BrO02ifNN8wzUXSgDSzw&oe=6266FE88", "asdasd", "asdasd", "Con hoat dong"));

    }

    @RequestMapping(method = RequestMethod.GET)
    public List<News> getList(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int limit
    ) {
        return newsRepository.findAll();
    }
    @RequestMapping(method = RequestMethod.GET, path = "{id}")
    public News findById(@PathVariable int id){
        return newsRepository.findById(id).get();
    }

    @PostMapping
    public boolean save(@RequestBody News news) {
        if (news != null) {
            newsRepository.save(news);
            return true;
        } else {
            return false;
        }
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/{id}")
    public News update(@PathVariable int id, @RequestBody News news) {
        News found = newsRepository.findById(id).get();
        if (found != null) {
            found.setTitle(news.getTitle());
            found.setDescription(news.getDescription());
            found.setImage(news.getImage());
            found.setCategory(news.getCategory());
            found.setCreateAt(news.getCreateAt());
            found.setUpdateAt(news.getUpdateAt());
            found.setStatus(news.getStatus());
        }
        newsRepository.save(found);
        return found;
        }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public String delete(@PathVariable int id) {
        newsRepository.delete(newsRepository.findById(id).get());
        return "OK";
    }
}
