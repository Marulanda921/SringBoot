package com.riwi.Products.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    //le acabo de decir que el id va a ser un id dinamico
    @GetMapping(path = "/{id}")
    //indicamos que viene de una variable /
    public ResponseEntity <Product> get(@PathVariable Long id){
        return ResponseEntity.ok(this.objIservicesAbstract.findById(id));
    }

     //request body permite decirle a spring que viene de el cuepo de la peticion
     //dice que lo que se trae tiene que ser del tipo de datos de la entidad   
     @PostMapping
    public ResponseEntity<Product> insert(@RequestBody Product objProduct){
       return ResponseEntity.ok(this.objIservicesAbstract.save(objProduct));
    }

    @PutMapping(path = "/{id}")
    //esto es lo que se obtiene de la entidad 
    public ResponseEntity<Product> update(@PathVariable Long id, @RequestBody Product objProduct){
     return ResponseEntity.ok(this.objIservicesAbstract.update(id, objProduct));

}

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        this.objIservicesAbstract.delete(id);
        return ResponseEntity.noContent().build();
    }
}


//PATRON DE DISEÑO BUILDER
