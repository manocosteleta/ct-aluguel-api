package com.mscosta.ctaluguelapi.controller;

import com.mscosta.ctaluguelapi.model.Casa;
import com.mscosta.ctaluguelapi.service.CasaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/casa")
public class CasaController {
    @Autowired
    private CasaService casaService;

    @GetMapping("/get")
    public ResponseEntity<Casa> getCasaById(@RequestParam("id") long id) {
        final var response = casaService.getCasaById(id);
        return new ResponseEntity<>(response, response != null ? org.springframework.http.HttpStatus.OK : org.springframework.http.HttpStatus.NOT_FOUND);
    }
}
