package com.microservices.crudservice.controllers;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
        

        @RequestMapping("/ping/{name}")
        public String pingServiceName(@PathVariable String name){
            return "ping"+name;
        }
}
