//package com.example.demo_spring.Ass;
//
//import com.example.demo_spring.enity.Product;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface NewsRepository extends JpaRepository<News,Integer> {
//   Page<News> findAll(Pageable pageable);
//    @Query(value = "SELECT * FROM news a WHERE a.title LIKE %:title% and a.category LIKE %:category%",
//            nativeQuery = true)
//    List<News> search(
//            @Param("title") String title, @Param("category") String category);
//    List<News> findAllByNameContainsAndPriceLessThanEqual(String title, String image);
//    @Query(value = "select * from news n where n.title like %:title%",nativeQuery = true)
//    List<Object[]> search(@Param("title") String title);
//}
