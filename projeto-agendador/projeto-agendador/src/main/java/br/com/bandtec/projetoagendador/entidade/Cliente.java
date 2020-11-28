
package br.com.bandtec.projetoagendador.entidade;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {
    @Id
    private Integer Id ;
    
    private String nome;
    
    private Integer dataNascimento;
    
    private Integer mesNascimento;

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getId() {
        return Id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getDataNascimento() {
        return dataNascimento;
    }

    public Integer getMesNascimento() {
        return mesNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(Integer dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setMesNascimento(Integer mesNascimento) {
        this.mesNascimento = mesNascimento;
    }
    
}
