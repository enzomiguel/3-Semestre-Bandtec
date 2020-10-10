/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projetojpa3;

import java.time.LocalDate;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import org.hibernate.validator.constraints.Length;

/**
 *
 * @author Aluno
 */
public class Pessoa {
    
    @NotNull
    @Length(min = 2,max = 40)
   
    private  String nome;
    
    @Min(0)
    @Max(35)
    private Integer filhos;
    
    @Past
    private LocalDate nascimento;

    public String getNome() {
        return nome;
    }

    public Integer getFilhos() {
        return filhos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFilhos(Integer filhos) {
        this.filhos = filhos;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }
    
    
}
