
package bandtec.projetojpa4.dominios;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity 
public class Pais {
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String modelo;
    
    
     
   

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return modelo;
    }

    

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.modelo = modelo;
    }


     
     
}
