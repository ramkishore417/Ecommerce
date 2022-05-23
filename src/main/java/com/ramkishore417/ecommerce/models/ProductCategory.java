package com.ramkishore417.ecommerce.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="product_category")
@Data
public class ProductCategory {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="category_name")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productCategory")
    private Set<Product> products;
}
