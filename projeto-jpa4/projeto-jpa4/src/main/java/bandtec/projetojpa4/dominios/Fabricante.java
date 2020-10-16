
package bandtec.projetojpa4.dominios;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;


@Entity // indica uma entidade
public class Fabricante {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String nome;
    
    @ManyToOne   //
    private Pais pais;
//    private String paisOrigem;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

//    public String getPaisOrigem() {
//        return paisOrigem;
//    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//    public void setPaisOrigem(String paisOrigem) {
//        this.paisOrigem = paisOrigem;
//    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
    
}
