package com.mscosta.ctaluguelapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cta_contrato")
public class Contrato {

    @Id
    @SequenceGenerator(name = "seq_cta_contrato_id", sequenceName = "seq_cta_contrato_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_cta_contrato_id", strategy = GenerationType.SEQUENCE)
    private int id;
    @ManyToOne
    @JoinColumn(name = "casa_id")
    private Casa casa;
    @ManyToOne
    @JoinColumn(name = "inquilino_id")
    private Pessoa inquilino;
    @ManyToOne
    @JoinColumn(name = "locatario_id")
    private Pessoa locatario;
    private String dataCriacao;
    private String dataModificacao;
    private String dataInicioContrato;
    private String dataFimContrato;
    private String valorAluguel;

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public Pessoa getLocatario() {
        return locatario;
    }

    public void setLocatario(Pessoa locatario) {
        this.locatario = locatario;
    }

    public Pessoa getInquilino() {
        return inquilino;
    }

    public void setInquilino(Pessoa inquilino) {
        this.inquilino = inquilino;
    }

    public Contrato(int id, Casa casa, Pessoa inquilino, Pessoa locatario, String dataCriacao, String dataModificacao, String dataInicioContrato, String dataFimContrato, String valorAluguel) {
        this.id = id;
        this.casa = casa;
        this.inquilino = inquilino;
        this.locatario = locatario;
        this.dataCriacao = dataCriacao;
        this.dataModificacao = dataModificacao;
        this.dataInicioContrato = dataInicioContrato;
        this.dataFimContrato = dataFimContrato;
        this.valorAluguel = valorAluguel;
    }

    public Contrato() {}
}
