package com.mscosta.ctaluguelapi.service;

import com.mscosta.ctaluguelapi.dto.request.CasaRequestDto;
import com.mscosta.ctaluguelapi.dto.response.CasaResponseDto;
import com.mscosta.ctaluguelapi.repository.CasaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class CasaService {
    @Autowired
    private CasaRepository casaRepository;
    @Autowired
    private ContratoService contratoService;

    public CasaResponseDto getCasaById(long id) {
        final var casa = casaRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Casa não encontrada"));

       final var isDisponivel = !contratoService.existContratoByCasaId(casa.getId());

        CasaResponseDto response = new CasaResponseDto();
        response.setDescricao(casa.getDescricao());
        response.setEndereco(casa.getEndereco());
        response.setDisponivel(isDisponivel);

        return response;
    }

    public Page<CasaResponseDto> getAllCasas(CasaRequestDto request, PageRequest pageable) {
        return casaRepository.findByDescricaoLikeIgnoreCaseAndEnderecoLikeIgnoreCase(request.getDescricao(), request.getEndereco(), pageable);
    }
}
