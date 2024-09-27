package org.example.persona.services;

import org.example.persona.entities.Libro;
import org.example.persona.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService {
    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository) {
        super(baseRepository);
    }
}
