package br.facens.proj01.dto;

import br.facens.proj01.model.Product;

public class ProductDTO {
    private String name;
    private double value;
    private String supplier;

    public ProductDTO(){}
    
    public ProductDTO(String name, double value, String supplier) {
        this.name = name;
        this.value = value;
        this.supplier = supplier;
    }

    public ProductDTO(Product product) {
        this.name = product.getName();
        this.value = product.getValue();
        this.supplier = product.getSupplier();
    }

    public Product toProduct() {
        return new Product(null, name, value, supplier);
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
