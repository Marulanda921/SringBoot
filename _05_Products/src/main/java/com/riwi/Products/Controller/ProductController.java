package com.riwi.Products.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.Products.Entity.Product;
import com.riwi.Products.Services.Services_Abstract.IservicesAbstract;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/products")
@AllArgsConstructor
public class ProductController {

    @Autowired
    private final IservicesAbstract objIservicesAbstract;
    @GetMapping
    
    //va a responder de manera response entity una lista de productos
    public ResponseEntity<List<Product>> getAll(){
        return ResponseEntity.ok(this.objIservicesAbstract.getAll());
    } 
}
