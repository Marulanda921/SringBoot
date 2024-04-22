package com.riwi.Products.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "products") // es lo mismo que tener table

@NoArgsConstructor // Constructor sin argumentos
@AllArgsConstructor //Constructor con argumentos
@Data // getters y setters y tostring


public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int quantity;
    private double price;
}


