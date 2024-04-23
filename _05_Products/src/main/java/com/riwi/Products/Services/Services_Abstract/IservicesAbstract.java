package com.riwi.Products.Services.Services_Abstract;

import java.util.List;

import com.riwi.Products.Entity.Product;

public interface IservicesAbstract {

    public Product save(Product product);
    public List<Product> getAll();
    public Product findById(Long id);
    public void delete(Long id);
    public Product update(Long id, Product objProduct);
    public List<Product> search(String name);
    
}


//principio solid, la interfaz se implementa en el propio servicio 