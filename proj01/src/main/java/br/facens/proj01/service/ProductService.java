package br.facens.proj01.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.facens.proj01.model.Product;

@Service
public class ProductService {
    Product product = new Product(123, "Monitor Gamer", 1200);

    public Optional<Product> geProduct(int id) {
        if (id == product.getId()) {
            return Optional.of(product);
        }
        return Optional.empty();
    }
}
