package com.elementos.crud.elementoscrud.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

import com.elementos.crud.elementoscrud.interfaceService.IelementosService;
import com.elementos.crud.elementoscrud.modelo.Elemento;

@Controller
@RequestMapping
public class Controlador {
    
    @Autowired
    private IelementosService service;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Elemento>elementos=service.listar();
        model.addAttribute("elementos", elementos);
        return "index";
    }

    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("elemento", new Elemento());
        return "form";
    }

    @PostMapping("/save")
    public String save(@Valid Elemento e, Model model){
        service.save(e);
        return "redirect:/listar";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Elemento>elemento=service.listarId(id);
        model.addAttribute("elemento", elemento);
        return "form";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(Model model, @PathVariable int id){
        service.delete(id);
        return "redirect:/listar";

    }
}
