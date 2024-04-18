package com.mscosta.ctaluguelapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cta_aluguel")
public class Aluguel {

    @Id
    @SequenceGenerator(name = "seq_cta_aluguel_id", sequenceName = "seq_cta_aluguel_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_cta_aluguel_id", strategy = GenerationType.SEQUENCE)
    private int id;
    private String status;
    private String mesReferencia;

    @ManyToOne
    @JoinColumn(name = "contrato_id")
    private Contrato contrato;


    public Aluguel(int id, String status, String mesReferencia, Contrato contrato) {
        this.id = id;
        this.status = status;
        this.mesReferencia = mesReferencia;
        this.contrato = contrato;
    }

    public Aluguel() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMesReferencia() {
        return mesReferencia;
    }

    public void setMesReferencia(String mesReferencia) {
        this.mesReferencia = mesReferencia;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
}
