package br.facens.proj01.repository;

import org.springframework.data.repository.CrudRepository;

import br.facens.proj01.model.Supplier;

public interface SupplierRepo extends CrudRepository<Supplier, Integer>{
    
}
