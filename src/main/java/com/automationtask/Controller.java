package com.automationtask;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/automation")
public class Controller {
    @GetMapping(value="/get") 
    public String get() {
    	return "task completed";
    }
    }


