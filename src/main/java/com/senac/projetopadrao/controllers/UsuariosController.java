package com.senac.projetopadrao.controllers;

import com.senac.projetopadrao.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {

    @GetMapping("/listar")
    public String listarUsuarios(){

        System.out.println("USUARIOS");

        return "usuarios";
    }

    @PostMapping("/add")
    public String addUsuario(){
        return "O usuário foi adicionado";
    }

}
