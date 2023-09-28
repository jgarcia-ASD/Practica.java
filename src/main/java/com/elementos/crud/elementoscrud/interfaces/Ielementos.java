package com.elementos.crud.elementoscrud.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.elementos.crud.elementoscrud.modelo.Elemento;

@Repository
public interface Ielementos extends CrudRepository<Elemento, Integer> {
    
}
