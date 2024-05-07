package com.restaurant.Restaurant.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Restaurante")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer ID;

    @Column(name = "Nome")
    public String nome;
    @Column(name = "Preco")
    public Double preco;
    @Column(name = "Pontos_Positivos")
    public String pontosPositivos;
    @Column(name = "Pontos_Negativos")
    public String pontosNegativos;
    @Column(name = "NotaA")
    public Double notaA;
    @Column(name = "NotaM")
    public Double notaM;
    @Column(name = "NotaG")
    public Double notaG;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getPontosPositivos() {
        return pontosPositivos;
    }

    public void setPontosPositivos(String pontosPositivos) {
        this.pontosPositivos = pontosPositivos;
    }

    public String getPontosNegativos() {
        return pontosNegativos;
    }

    public void setPontosNegativos(String pontosNegativos) {
        this.pontosNegativos = pontosNegativos;
    }

    public Double getNotaA() {
        return notaA;
    }

    public void setNotaA(Double notaA) {
        this.notaA = notaA;
    }

    public Double getNotaM() {
        return notaM;
    }

    public void setNotaM(Double notaM) {
        this.notaM = notaM;
    }

    public Double getNotaG() {
        return notaG;
    }

    public void setNotaG(Double notaG) {
        this.notaG = notaG;
    }

}
