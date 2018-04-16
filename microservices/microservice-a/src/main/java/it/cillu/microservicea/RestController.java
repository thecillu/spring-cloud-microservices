package it.cillu.microservicea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Value("${spring.application.name}")
    String name;

    @GetMapping("/")
    public String sayName(){
        return name;
    }
}
