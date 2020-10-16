
package bandtec.projetojpa4.visoes;


public class FabricanteSimples {
     private Integer id;
    
    private String nome;

    public FabricanteSimples(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    
    
}
