package com.senac.projetopadrao.controllers;


import com.senac.projetopadrao.model.Produto;
import com.senac.projetopadrao.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping("/produtos")
public class ProdutosController {

    @Autowired
    ProdutoRepository produtoRepository;
    private Object FindAll;

    @GetMapping("/")
    public ModelAndView listarProdutos() {
        ModelAndView mv = new ModelAndView("produtos");

        ArrayList<Produto> produtos = new ArrayList<>();

        produtos = (ArrayList<Produto>) produtoRepository.findAll();

        mv.addObject("produtos", produtos);

        return mv;

    }
}