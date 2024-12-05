package com.example.sistemareserva.controller;

import com.example.sistemareserva.model.Funcionario;
import com.example.sistemareserva.repository.FuncionarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    private final FuncionarioRepository repository;

    public FuncionarioController(FuncionarioRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Funcionario> listar() {
        return repository.findAll();
    }
}
