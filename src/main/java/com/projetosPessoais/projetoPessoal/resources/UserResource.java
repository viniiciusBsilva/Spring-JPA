package com.projetosPessoais.projetoPessoal.resources;

import com.projetosPessoais.projetoPessoal.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L,"vinicius", "vinicius@gmail.com","8887989", "12345");
        return ResponseEntity.ok().body(user);
    }


}
