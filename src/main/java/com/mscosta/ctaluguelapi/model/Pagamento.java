package com.mscosta.ctaluguelapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cta_pagamento")
public class Pagamento {

    @Id
    @SequenceGenerator(name = "seq_cta_pagamento_id", sequenceName = "seq_cta_pagamento_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_cta_pagamento_id", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private int id;
    private String descricao;
    private Double valorPago;
    private String status;
    @ManyToOne
    @JoinColumn(name = "aluguel_id")
    private Aluguel aluguel;

    public Aluguel getAluguel() {
        return aluguel;
    }

    public void setAluguel(Aluguel aluguel) {
        this.aluguel = aluguel;
    }


    public Pagamento(int id, String descricao, Double valorPago, String status, Aluguel aluguel) {
        this.id = id;
        this.descricao = descricao;
        this.valorPago = valorPago;
        this.status = status;
        this.aluguel = aluguel;
    }

    public Pagamento() {}

    public int getId() {
        return id;
    }
}
