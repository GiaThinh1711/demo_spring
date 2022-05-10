//package com.example.demo_spring.repository;
//
//import com.example.demo_spring.enity.Student;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@RequestMapping(path = "api/v1/products")
//public class ProductApi {
//    @Autowired
//    ProductRepository productRepository;
//    private static List<Product> listProduct;
//
//    static {
//        listProduct = new ArrayList<>();
//        listProduct.add(new Product(1,"Fsafas",1,"asd",1));
//    }
//    @RequestMapping(method = RequestMethod.GET)
//    public List<Product> findAll(
//            @RequestParam(defaultValue = "1") int page,
//            @RequestParam(defaultValue = "10") int limit
//    ) {
//        return productRepository.findAll();
//    }
//
//    @RequestMapping(method = RequestMethod.GET, path = "{id}")
//    public Product findById(@PathVariable int id) {
//        return productRepository.findById(id).get();
//    }
//
//    @PostMapping
//    public boolean save(@RequestBody Product p) {
//        if (p != null) {
//            productRepository.save(p);
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    @RequestMapping(method = RequestMethod.PUT, path = "/{id}")
//    public Product update(@PathVariable int id, @RequestBody Product p) {
//        Product found = productRepository.findById(id).get();
//        if (found != null) {
//            found.setName(p.getName());
//            found.setStatus(p.getStatus());
//            found.setDescription(p.getDescription());
//            found.setPrice(p.getPrice());
//        }
//        productRepository.save(found);
//        return found;
//    }
//
//    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
//    public String delete(@PathVariable int id) {
//        productRepository.delete(productRepository.findById(id).get());
//        return "delete";
//    }
//}
