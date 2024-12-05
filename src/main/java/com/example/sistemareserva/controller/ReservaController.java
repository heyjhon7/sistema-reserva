package com.example.sistemareserva.controller;

import com.example.sistemareserva.model.Reserva;
import com.example.sistemareserva.repository.ReservaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservaController {
    private final ReservaRepository repository;

    public ReservaController(ReservaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Reserva> listar() {
        return repository.findAll();
    }
}
