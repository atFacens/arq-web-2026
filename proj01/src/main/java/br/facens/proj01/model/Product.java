package br.facens.proj01.model;

import br.facens.proj01.dto.ProductDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double value;
    private String supplier;
    
    public Product() {
    }

    public Product(int id, String name, double value, String supplier) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.supplier = supplier;
    }

    public ProductDTO toDTO() {
        // return new ProductDTO(this);
        return new ProductDTO(id, name, value);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
    
}
