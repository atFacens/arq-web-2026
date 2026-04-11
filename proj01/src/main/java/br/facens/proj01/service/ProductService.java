package br.facens.proj01.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.facens.proj01.dto.ProductDTO;
import br.facens.proj01.model.Product;
import br.facens.proj01.repository.ProductRepo;

@Service
public class ProductService {
    
    @Autowired
    ProductRepo repo;

    public Optional<ProductDTO> geProduct(int id) {
       Optional<Product> optionalProduct =  repo.findById(id);

        if(optionalProduct.isEmpty()) {
            return Optional.empty();
        }

        // ProductDTO productDTO = new ProductDTO(optionalProduct.get());
        ProductDTO productDTO = optionalProduct.get().toDTO();
        
        productDTO.setValue( productDTO.getValue() * 1.1);

       return Optional.of(productDTO);
    }
}
