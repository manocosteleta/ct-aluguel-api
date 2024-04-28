package com.mscosta.ctaluguelapi.controller;

import com.mscosta.ctaluguelapi.dto.request.PessoaRequestDto;
import com.mscosta.ctaluguelapi.dto.response.PessoaResponseDto;
import com.mscosta.ctaluguelapi.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pessoa")
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;
    @PostMapping
    public ResponseEntity<PessoaResponseDto> inserePessoa(PessoaRequestDto pessoaRequestDto) {
        try {
           final var pessoaResponseDto = pessoaService.createPessoa(pessoaRequestDto);
            return ResponseEntity.ok(pessoaResponseDto);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.badRequest().build();
    }
}
