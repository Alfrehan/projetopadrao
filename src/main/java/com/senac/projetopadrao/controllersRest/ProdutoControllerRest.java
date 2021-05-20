package com.senac.projetopadrao.controllersRest;

import com.senac.projetopadrao.model.Produto;
import com.senac.projetopadrao.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoControllerRest {

    @Autowired
    ProdutoRepository produtoRepository;

    @PostMapping("/add")
    public String addProduto(){

        Produto produto = new Produto();
        produto.setNomeProduto("Caixa de Som BT");
        produto.setPreco("499");
        produtoRepository.save(produto);

        return "Produto adicionado";

    }

}
