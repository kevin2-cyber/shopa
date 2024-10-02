package com.kimikevin.shopa.product.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String name;

    @Column
    private long quantity;
    @Column
    private double unitPrice;
}
