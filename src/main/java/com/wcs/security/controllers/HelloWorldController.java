package com.wcs.security.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }
    
    @GetMapping("/avengers/assemble")
    public String champion() {
        return "Avengers... Assemble";
    }
    
    @GetMapping("/secret-bases")
    public ArrayList<String> director() {
    	
    	ArrayList<String> ville = new ArrayList<String>();
    	ville.add("Lyon");
    	ville.add("Lille");
    	ville.add("La Loupe");
    	ville.add("Bordeaux");
    	ville.add("Marseille");

        return ville;
    }
}