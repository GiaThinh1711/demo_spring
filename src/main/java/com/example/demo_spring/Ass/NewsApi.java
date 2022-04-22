package com.example.demo_spring.Ass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "api/v1/news")
public class NewsApi {
    @Autowired
    NewsRepository newsRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<News> getList(@RequestParam(defaultValue = "") String title,
                                 @RequestParam(defaultValue = "")String category){
        if(title.length() > 0 || category.length() > 0){
            return newsRepository.search(title, category);
        }else{
            return newsRepository.findAll();
        }
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public News getDetail(@PathVariable int id){
        return newsRepository.findById(id).get();
    }

    @PostMapping
    public News save(@RequestBody News news) {
        newsRepository.save(news);
        return news;
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/{id}")
    public News update(@PathVariable int id, @RequestBody News newsUpdate) {
            News existing = newsRepository.findById(id).get();
            existing.setTitle(newsUpdate.getTitle());
            existing.setDescription(newsUpdate.getDescription());
            existing.setImage(newsUpdate.getImage());
            existing.setContent(newsUpdate.getContent());
            existing.setCategory(newsUpdate.getCategory());
            existing.setCreateAt(newsUpdate.getCreateAt());
            existing.setUpdateAt(newsUpdate.getUpdateAt());
            existing.setStatus(newsUpdate.getStatus());
            newsRepository.save(existing);
            return newsUpdate  ;
        }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public boolean delete(@PathVariable int id) {
        newsRepository.delete(newsRepository.findById(id).get());
        return true;
    }
}
