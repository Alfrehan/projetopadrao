package com.senac.projetopadrao.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vendas")
public class VendasController {

    @GetMapping("/listar")
    public String listarVendas(){

        System.out.println("VENDAS");

        return "vendas";
    }

    @PostMapping("/add")
    public String addVendas(){
        return "A venda foi realizada";
    }

}
