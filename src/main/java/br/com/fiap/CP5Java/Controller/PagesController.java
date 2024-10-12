package br.com.fiap.CP5Java.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {

    @GetMapping("/req/login")
    public String login(){
        return "login";
    }

    @GetMapping("/req/cadastro")
    public String cadastro(){
        return "cadastro";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }



    }

