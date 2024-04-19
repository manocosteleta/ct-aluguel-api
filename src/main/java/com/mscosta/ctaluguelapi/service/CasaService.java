package com.mscosta.ctaluguelapi.service;

import com.mscosta.ctaluguelapi.model.Casa;
import com.mscosta.ctaluguelapi.repository.CasaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CasaService {
    @Autowired
    private CasaRepository casaRepository;

    public Casa getCasaById(long id) {
        final var casa = casaRepository.findById(id).orElseThrow(() -> new RuntimeException("Casa não encontrada."));
        return casa;
    }
}
