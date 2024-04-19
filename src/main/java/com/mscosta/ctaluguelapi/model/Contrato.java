package com.mscosta.ctaluguelapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cta_contrato")
public class Contrato {

    @Id
    @SequenceGenerator(name = "seq_cta_contrato_id", sequenceName = "seq_cta_contrato_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_cta_contrato_id", strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "data_criacao")
    private String dataCriacao;
    @Column(name = "data_modificacao")
    private String dataModificacao;
    @Column(name = "data_inicio_contrato")
    private String dataInicioContrato;
    @Column(name = "data_fim_contrato")
    private String dataFimContrato;
    @Column(name = "valor_aluguel")
    private String valorAluguel;
    @ManyToOne
    @JoinColumn(name = "id_casa")
    private Casa casa;
    @ManyToOne
    @JoinColumn(name = "id_inquilino")
    private Pessoa inquilino;
    @ManyToOne
    @JoinColumn(name = "id_locatario")
    private Pessoa locatario;

    public Contrato() {}

    public Contrato(long id, String dataCriacao, String dataModificacao, String dataInicioContrato, String dataFimContrato, String valorAluguel, Casa casa, Pessoa inquilino, Pessoa locatario) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.dataModificacao = dataModificacao;
        this.dataInicioContrato = dataInicioContrato;
        this.dataFimContrato = dataFimContrato;
        this.valorAluguel = valorAluguel;
        this.casa = casa;
        this.inquilino = inquilino;
        this.locatario = locatario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(String dataModificacao) {
        this.dataModificacao = dataModificacao;
    }

    public String getDataInicioContrato() {
        return dataInicioContrato;
    }

    public void setDataInicioContrato(String dataInicioContrato) {
        this.dataInicioContrato = dataInicioContrato;
    }

    public String getDataFimContrato() {
        return dataFimContrato;
    }

    public void setDataFimContrato(String dataFimContrato) {
        this.dataFimContrato = dataFimContrato;
    }

    public String getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(String valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public Pessoa getInquilino() {
        return inquilino;
    }

    public void setInquilino(Pessoa inquilino) {
        this.inquilino = inquilino;
    }

    public Pessoa getLocatario() {
        return locatario;
    }

    public void setLocatario(Pessoa locatario) {
        this.locatario = locatario;
    }
}