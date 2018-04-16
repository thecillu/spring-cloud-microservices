package it.cillu.microservicea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Value("${spring.application.name}")
    String name;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/")
    public String sayName(){
        String msa = restTemplate.getForObject("http://zuul-server/api/a/",String.class);
        return name + " received from MSA: " + msa;
    }



}
