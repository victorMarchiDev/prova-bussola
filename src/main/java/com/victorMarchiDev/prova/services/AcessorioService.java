package com.victorMarchiDev.prova.services;

import com.victorMarchiDev.prova.models.Acessorio;
import com.victorMarchiDev.prova.repository.AcessorioRepository;
import org.springframework.stereotype.Service;

@Service
public class AcessorioService {
    private AcessorioRepository acessorioRepository;

    public AcessorioService(AcessorioRepository acessorioRepository) {
        this.acessorioRepository = acessorioRepository;
    }

    public Acessorio criarAcessorio(Acessorio acessorio){
        return acessorioRepository.save(acessorio);
    }
}
