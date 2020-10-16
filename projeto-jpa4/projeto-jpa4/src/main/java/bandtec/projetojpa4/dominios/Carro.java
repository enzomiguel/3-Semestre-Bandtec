
package bandtec.projetojpa4.dominios;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Carro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    
    private String modelo;
    
    private Double potencia;
    
    @ManyToOne   //
    private Fabricante fabricante;

    public Integer getId() {
        return Id;
    }

    public String getModelo() {
        return modelo;
    }

    public Double getPotencia() {
        return potencia;
    }

    

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
   
    
    
}
