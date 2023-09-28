package com.elementos.crud.elementoscrud.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventario")
public class Elemento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String ecfuncional;
    private String clase;

    public Elemento() {
        // TODO Auto-generated constructor stub
    }

    public Elemento(int id, String name, String ecfuncional, String clase) {
        super();
        this.id = id;
        this.name = name;
        this.ecfuncional = ecfuncional;
        this.clase = clase;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEcfuncional() {
        return ecfuncional;
    }
    public void setEcfuncional(String ecfuncional) {
        this.ecfuncional = ecfuncional;
    }
    public String getClase() {
        return clase;
    }
    public void setClase(String clase) {
        this.clase = clase;
    }

    
}
