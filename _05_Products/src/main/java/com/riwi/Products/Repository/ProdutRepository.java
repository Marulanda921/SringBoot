package com.riwi.Products.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.Products.Entity.Product;

@Repository
public interface ProdutRepository extends JpaRepository<Product, Long>{
    public Product findByName(String name);
}
