package com.senac.projetopadrao.controllers;

import com.senac.projetopadrao.model.Satelite;
import com.senac.projetopadrao.repository.SateliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping("/satelites")
public class SateliteController {

    @Autowired
    SateliteRepository sateliteRepository;

    @GetMapping("/")
    public ModelAndView listarSatelite(){

        ModelAndView mv = new ModelAndView("satelites");
        ArrayList<Satelite> satelites;
        satelites = (ArrayList<Satelite>) sateliteRepository.findAll();
        mv.addObject("satelitesLista",satelites);

        return mv;
    }
}
