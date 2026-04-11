package br.facens.proj01.repository;

import org.springframework.data.repository.CrudRepository;

import br.facens.proj01.model.Product;

// CRUD = Create, Read, Update, Delete
public interface ProductRepo extends CrudRepository<Product, Integer> {

}
