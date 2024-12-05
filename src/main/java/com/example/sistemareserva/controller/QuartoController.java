package com.example.sistemareserva.controller;

import com.example.sistemareserva.model.Quarto;
import com.example.sistemareserva.repository.QuartoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quartos")
public class QuartoController {
    private final QuartoRepository repository;

    public QuartoController(QuartoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Quarto> listar() {
        return repository.findAll();
    }
}
