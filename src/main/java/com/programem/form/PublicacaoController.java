package com.programem.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PublicacaoController {

  @GetMapping("/Publicacao")
  public String Publicacao(Model model) {
    model.addAttribute("Publicacao", new Publicacao());
    return "Publicacao";
  }

  @PostMapping("/Publicacao")
  public String PublicaoSubmit(@ModelAttribute Publicacao publicacao) {
    return "Exibicao";
  }
    
}