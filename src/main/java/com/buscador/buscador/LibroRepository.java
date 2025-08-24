package com.buscador.buscador;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface LibroRepository extends ElasticsearchRepository<Libro, String> {
    List<Libro> findByAutor(String autor);
}