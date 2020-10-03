package br.com.bandtec.projetojpa2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author Aluno
 */
@Entity
public class Produto {
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codProduto;
   
   @Column(nullable = false, length = 38)
    private String nome;
   @Column(nullable = false, length = 18)
    private String unidade;
   @Column(name = "preco_produto")
    private Double preco;

    public Produto() {
    }
    
    public Produto(String nome, String unidade, Double preco) {
        this.nome = nome;
        this.unidade = unidade;
        this.preco = preco;
    }
    
    public Integer getCodProduto() {
        return codProduto;
    }

    public String getNome() {
        return nome;
    }

    public String getUnidade() {
        return unidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setCodProduto(Integer codProduto) {
        this.codProduto = codProduto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    
    
}
