
package br.com.bandtec.projetoclienterest.modelos;


public class Filme {
    
    private String id;
    private String nome;
    private Integer ano;
    private Double custoProducao;
    private Boolean classico;

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAno() {
        return ano;
    }

    public Double getCustoProducao() {
        return custoProducao;
    }

    public Boolean getClassico() {
        return classico;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public void setCustoProducao(Double custoProducao) {
        this.custoProducao = custoProducao;
    }

    public void setClassico(Boolean classico) {
        this.classico = classico;
    }
    
    
}
