package com.academia.dev.controller;

import com.academia.dev.entities.Promocao;
import com.academia.dev.service.PromocaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/promocoes")
@CrossOrigin(origins = "*")
public class PromocoesController {

    @Autowired
    PromocaoService promocaoService;

    @PostMapping
    public ResponseEntity<Promocao> cadastrarUsuarios(@RequestBody Promocao promocao){
        Promocao promocoes = promocaoService.salvar(promocao);
        return ResponseEntity.status(HttpStatus.CREATED).body(promocoes);
    }

    @GetMapping
    public ResponseEntity<List<Promocao>> listarUsuarios(){
        List<Promocao> promocoes = promocaoService.listar();
        return ResponseEntity.ok(promocoes);
    }
}
