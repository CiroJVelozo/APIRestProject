package com.algaworks.algafood.controller;

import com.algaworks.algafood.model.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {



    @GetMapping("/hello")
    @ResponseBody
    public String hello(){

      // Cliente cliente = new Cliente("ciro","gmail","5555555",false,1.9,120.0);

       return "hello";
    }
}
