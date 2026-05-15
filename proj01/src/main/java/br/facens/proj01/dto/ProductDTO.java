package br.facens.proj01.dto;

import br.facens.proj01.model.Product;
import br.facens.proj01.model.Supplier;

public class ProductDTO {
    private String name;
    private Double value;
    private Supplier supplier;

    public ProductDTO(){}
    
    public ProductDTO(String name, double value, String supplier) {
        this.name = name;
        this.value = value;
        this.supplier = new Supplier();
        this.supplier.setNome((supplier));
    }

    public ProductDTO(Product product) {
        this.name = product.getName();
        this.value = product.getValue();
        this.supplier = new Supplier();
        supplier.setNome((product.getSupplier()));
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

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getSupplier() {
        return supplier.getNome();
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

}
