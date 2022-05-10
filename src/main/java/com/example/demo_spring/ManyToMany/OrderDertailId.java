package com.example.demo_spring.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class OrderDertailId implements Serializable {

    @Column(name = "order_id")
    private int orderId;
    @Column(name = "product_id")
    private int productId;

}
