package com.mscosta.ctaluguelapi.service;

import com.mscosta.ctaluguelapi.repository.CasaRepository;
import com.mscosta.ctaluguelapi.repository.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContratoService {
    @Autowired
    private ContratoRepository contratoRepository;

    public boolean existContratoByCasaId(long id) {
        return contratoRepository.findByCasa_Id(id).isPresent();
    }

    public boolean getContratoByPessoaId(long id) {
        return contratoRepository.findByInquilino_Id(id).isPresent() || contratoRepository.findByLocatario_Id(id).isPresent();
    }


}
