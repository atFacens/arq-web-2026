package br.facens.proj01.service;

import java.util.List;
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

    public List<Product> getAll() {
        return (List<Product>) repo.findAll();
    }

    public Product create(ProductDTO productDTO) {
        return repo.save(productDTO.toProduct());
    }

    public boolean delete(int id) {
        if(!repo.existsById(id)){
            return false;
        }
        repo.deleteById(id);
        return !repo.existsById(id);
    }

    public Product update(Product product, int id) {
        if(id > 0 && repo.existsById(id)){
            product.setId(id);
            return repo.save(product);
        }
        return null;
    }

}
