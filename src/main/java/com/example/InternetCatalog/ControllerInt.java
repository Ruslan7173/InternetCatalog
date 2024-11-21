package com.example.InternetCatalog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ControllerInt {
    @GetMapping("/hello")
    public String hello( String username){
        return "privet";
    }

    public ControllerInt() {
        System.out.println(" работает Конструктор Controller1" );
    }
    @GetMapping("/index")
    public String index(Model mmm){
        List <String> list= List.of(new String[]{"Belchins", "Kama", " Nordman"});
        mmm.addAttribute("list", list);
        return "index";
    }
}


