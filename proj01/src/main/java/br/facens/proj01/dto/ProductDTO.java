package br.facens.proj01.dto;

import br.facens.proj01.model.Product;

public class ProductDTO {
    private int id;
    private String name;
    private double value;

    public ProductDTO(int id, String name, double value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public ProductDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.value = product.getValue();
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
}
