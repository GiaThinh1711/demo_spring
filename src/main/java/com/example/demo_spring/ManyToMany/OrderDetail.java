package com.example.demo_spring.ManyToMany;

import javax.persistence.*;

@Entity
public class OrderDetail {
    @EmbeddedId
    private OrderDertailId id;
    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id",referencedColumnName = "id", nullable = false)
    private Order order;
    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id",referencedColumnName = "id", nullable = false)
    private Product product;
    private int quantity;
    private double unitPrice;
}
