package com.elementos.crud.elementoscrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.elementos.crud.elementoscrud.interfaceService.IelementosService;
import com.elementos.crud.elementoscrud.interfaces.Ielementos;
import com.elementos.crud.elementoscrud.modelo.Elemento;

@Service
public class ElementoService implements IelementosService {

    @Autowired
    private Ielementos data;

    @Override
    public List<Elemento> listar() {
        return (List<Elemento>)data.findAll();
    }

    @Override
    public Optional<Elemento> listarId(int id) {
        return data.findById(id);
    }

    @Override
    public int save(Elemento e) {
        int res=0;
        Elemento elemento=data.save(e);
        if (!elemento.equals(null)) {
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
    
}
