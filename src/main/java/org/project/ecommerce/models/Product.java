package org.project.ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="price")
    private double price;
    @Column(name="description")
    private String description;
    @Column(name="category")
    private String category;
    @Column(name="quantityInStock")
    private int quantityInStock;

    public Product(String name, double price, String description, String category, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.quantityInStock = quantityInStock;
    }

    public Product() {
    }
}
