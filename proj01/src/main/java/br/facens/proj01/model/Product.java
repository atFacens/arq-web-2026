package br.facens.proj01.model;

import br.facens.proj01.dto.ProductDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private double value;
    @ManyToOne
    @JoinColumn(name = "id_supplier", nullable = false)
    private Supplier supplier;

    public Product() {
    }

    public Product(Integer id, String name, double value, Supplier supplier) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.supplier = supplier;
    }

    public ProductDTO toDTO() {
        // return new ProductDTO(this);
        return new ProductDTO(name, value, supplier.getNome());
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
        return supplier.getNome();
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

}
