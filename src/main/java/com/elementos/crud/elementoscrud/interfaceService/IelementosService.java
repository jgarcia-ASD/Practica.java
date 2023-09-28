package com.elementos.crud.elementoscrud.interfaceService;

import java.util.List;
import java.util.Optional;

import com.elementos.crud.elementoscrud.modelo.Elemento;

public interface IelementosService {
    public List<Elemento>listar();
    public Optional<Elemento>listarId(int id);
    public int save(Elemento e);
    public void delete(int id);
}
/* posible solucion al 505
public @interface IelementosService {
    public List<Elemento>listar();

}
*/