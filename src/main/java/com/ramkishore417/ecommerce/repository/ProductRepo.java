package com.ramkishore417.ecommerce.repository;

import com.ramkishore417.ecommerce.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
