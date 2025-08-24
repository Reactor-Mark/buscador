package com.buscador.buscador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/buscador")
public class BuscadorController {

    @Autowired
    private LibroRepository libroRepository;

    @PostMapping("/guardar")
    public Libro guardarLibro(@RequestBody Libro libro) {
        return libroRepository.save(libro);
    }

    @GetMapping("/autor/{autor}")
    public List<Libro> buscarPorAutor(@PathVariable String autor) {
        return libroRepository.findByAutor(autor);
    }
}