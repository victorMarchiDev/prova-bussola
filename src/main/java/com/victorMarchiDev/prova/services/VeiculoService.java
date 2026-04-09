package com.victorMarchiDev.prova.services;

import com.victorMarchiDev.prova.models.Acessorio;
import com.victorMarchiDev.prova.models.Veiculo;
import com.victorMarchiDev.prova.repository.AcessorioRepository;
import com.victorMarchiDev.prova.repository.VeiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    private VeiculoRepository veiculoRepo;
    private AcessorioRepository acessorioRepo;

    public VeiculoService(VeiculoRepository veiculoRepo, AcessorioRepository acessorioRepo) {
        this.veiculoRepo = veiculoRepo;
        this.acessorioRepo = acessorioRepo;
    }

    public void removerAcessorio(Long idVeiculo, Long idAcessorio){
        Veiculo veiculo = veiculoRepo.findById(idVeiculo)
                .orElseThrow();
        Acessorio acessorio = acessorioRepo.findById(idAcessorio)
                .orElseThrow();

        veiculo.setAcessorio(null);
    }

    public void criarVeiculo(Veiculo veiculo){
        veiculoRepo.save(veiculo);
    }

    public void adicionarAcessorio(Long idVeiculo, Long idAcessorio){
        Veiculo veiculo = veiculoRepo.findById(idVeiculo)
                .orElseThrow();
        Acessorio acessorio = acessorioRepo.findById(idAcessorio)
                        .orElseThrow();
        veiculo.setAcessorio(acessorio);
    }

    public List<Veiculo> listarVeiculos() {
        return veiculoRepo.findAll();
    }
}
