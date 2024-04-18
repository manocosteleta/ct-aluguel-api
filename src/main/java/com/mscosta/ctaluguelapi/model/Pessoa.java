package com.mscosta.ctaluguelapi.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "cta_pessoa")
public class Pessoa {

    @Id
    @SequenceGenerator(name = "seq_cta_pessoa_id", sequenceName = "seq_cta_pessoa_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_cta_pessoa_id", strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "contato", nullable = false)
    private String contato;

    public Pessoa(int id, String nome, String contato) {
        this.id = id;
        this.nome = nome;
        this.contato = contato;
    }

    public Pessoa() {
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getContato() {
        return contato;
    }
    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa pessoa)) return false;
        return getId() == pessoa.getId() && getNome().equals(pessoa.getNome()) && getContato().equals(pessoa.getContato());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getContato());
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", contato='" + contato + '\'' +
                '}';
    }
}
