package com.example.demo_spring.Ass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends JpaRepository<News,Integer> {
    @Query(value = "SELECT * FROM news a WHERE a.title LIKE %:title% and a.category LIKE %:category%",
            nativeQuery = true)
    List<News> search(
            @Param("title") String title, @Param("category") String category);
}
