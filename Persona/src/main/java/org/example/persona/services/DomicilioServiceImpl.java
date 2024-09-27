package org.example.persona.services;

import org.example.persona.entities.Domicilio;
import org.example.persona.repositories.BaseRepository;

public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio, Long> implements DomicilioService{
    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository) {
        super(baseRepository);
    }
}
