package com.senac.projetopadrao.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produtos")
public class ProdutosController {

    @GetMapping("/listar")
    public String listarProdutos(){

        System.out.println("PRODUTOS");

        return "produtos";
    }

    @PostMapping("/add")
    public String addProduto(){
        return "O produto foi adicionado";
    }

}
