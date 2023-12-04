package com.academia.dev.service;

import com.academia.dev.entities.Promocao;
import com.academia.dev.repository.PromocaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromocaoService {

    PromocaoRepository repository;
    public Promocao salvar(Promocao promocao) {
        return repository.save(promocao);
    }

    public List<Promocao> listar() {
        return repository.findAll();
    }
}
