package com.victorMarchiDev.prova.controllers;

import com.victorMarchiDev.prova.models.Acessorio;
import com.victorMarchiDev.prova.models.Veiculo;
import com.victorMarchiDev.prova.services.VeiculoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    private VeiculoService service;

    public VeiculoController(VeiculoService service) {
        this.service = service;
    }

    @GetMapping("/listar")
    public List<Veiculo> listarVeiculos(){
        return service.listarVeiculos();
    }

    @PostMapping("/criar")
    public ResponseEntity<Veiculo> criarVeiculos(@RequestBody Veiculo veiculo){
        service.criarVeiculo(veiculo);
        return ResponseEntity.ok(veiculo);
    }

    @PostMapping("/addAcessorio/{idVeiculo}")
    public ResponseEntity<String> adicionarAcessorio(
            @PathVariable Long idVeiculo,
            @RequestBody String nomeAcessorio
    ){
        service.adicionarAcessorio(idVeiculo, nomeAcessorio);
        return ResponseEntity.ok("Adicionado com sucesso!");
    }
}
