package com.ramkishore417.ecommerce.repository;

import com.ramkishore417.ecommerce.models.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepo extends JpaRepository<ProductCategory,Long> {

}
