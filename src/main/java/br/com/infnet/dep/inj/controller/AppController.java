package br.com.infnet.dep.inj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    // @RequestMapping(method = RequestMethod.GET)
    @GetMapping(value = "/")
    public String telaHome() {
        return "home";
    }
}
