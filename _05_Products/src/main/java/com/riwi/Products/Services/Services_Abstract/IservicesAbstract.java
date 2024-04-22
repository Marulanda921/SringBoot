package com.riwi.Products.Services.Services_Abstract;

import java.util.List;

import com.riwi.Products.Entity.Product;

public interface IservicesAbstract {

    public Product save(Product product);
    public List<Product> getAll();
    public Product findById(Long id);
    public boolean delete(Long id);
    public Product update(Long id);
    public List<Product> search(String name);
    
}
