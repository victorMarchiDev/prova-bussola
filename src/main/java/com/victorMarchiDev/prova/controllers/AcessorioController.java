package com.victorMarchiDev.prova.controllers;

import com.victorMarchiDev.prova.models.Acessorio;
import com.victorMarchiDev.prova.services.AcessorioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acessorios")
public class AcessorioController {

    private final AcessorioService service;

    public AcessorioController(AcessorioService service) {
        this.service = service;
    }

    @PostMapping("/criar")
    public ResponseEntity<Acessorio> criarAcessorio(@RequestBody Acessorio acessorio){
        service.criarAcessorio(acessorio);
        return ResponseEntity.ok(acessorio);
    }
}
