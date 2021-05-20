package com.senac.projetopadrao.controllers;

import com.senac.projetopadrao.model.Usuario;
import com.senac.projetopadrao.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {

    @Autowired
    UsuarioRepository usuarioRepository;
    private Object FindAll;

    @GetMapping("/")
    public ModelAndView listarUsuarios(){
        ModelAndView mv = new ModelAndView( "usuarios");

        ArrayList<Usuario> usuarios = new ArrayList<>();

        usuarios = (ArrayList<Usuario>) usuarioRepository.findAll();

        mv.addObject("usuarios",usuarios);

        return mv;
    }

    @GetMapping("/add")
    public String addUsurioPage(Usuario usuario){
        return "usuarios_add";
    }

    @PostMapping("/add")
    public String addUsuario(@Validated Usuario usuario){

        usuarioRepository.save(usuario);

        return "redirect:/usuarios/";
    }

}
