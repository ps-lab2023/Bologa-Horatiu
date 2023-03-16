package com.inn.restaurant.com.inn.restaurant.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

//rest API, RESTFUL web services ii o arhitectura, representational state transfer
@RequestMapping(path = "/user") //in o clasa putem avea mai multe API-uri si sa stim la care vrem sa mergem
public interface UserRest {

    @PostMapping(path = "/signup")//de fiecare data cand API este folosit el asteapta un Json care noi il trimitem
    ResponseEntity<String> singUp(@RequestBody(required = true) Map<String, String> requestMap);//valorie se pun in map si de ce ii true pentru ca noi vrem sa folosim API-ul doar atunci cand avem valori in requestmap
}