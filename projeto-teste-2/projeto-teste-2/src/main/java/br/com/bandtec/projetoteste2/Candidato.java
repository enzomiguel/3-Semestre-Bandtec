
package br.com.bandtec.projetoteste2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;

@Entity
@Table(name = "tbl_candidato")
public class Candidato {
    
    @Id
    private  Integer id;
    
    @Column(nullable = false, length = 30)
    private String nome;
    
    private String partido;
    
    @Min(0)
    private int votos;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getPartido() {
        return partido;
    }

    public int getVotos() {
        return votos;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
    
    
}
