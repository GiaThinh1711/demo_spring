//package com.example.demo_spring.Ass;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Sort;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class NewsService {
//    @Autowired
//    private NewsRepository newsRepository;
//    public Page<News> findAll(int page, int limit){
//        return newsRepository.findAll(
//                PageRequest.of(page, limit, Sort.by(Sort.Direction.DESC,"title"))
//        );
//    }
//    public Optional<News> findById(int id){
//        return newsRepository.findById(id);
//    }
//    public News save(News news){
//        return newsRepository.save(news);
//    }
//    public void deleteById(int id){
//        newsRepository.deleteById(id);
//    }
//}
