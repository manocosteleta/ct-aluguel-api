package com.mscosta.ctaluguelapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cta_casa")
public class Casa {
    @Id
    @SequenceGenerator(name = "seq_cta_casa_id", sequenceName = "seq_cta_casa_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_cta_casa_id", strategy = GenerationType.SEQUENCE)
    private int id;
    private String descricao;
    private String endereco;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getEndereco() {
        return this.endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Casa(int id, String descricao, String endereco) {
        this.id = id;
        this.descricao = descricao;
        this.endereco = endereco;
    }

    public Casa() {
    }
}
