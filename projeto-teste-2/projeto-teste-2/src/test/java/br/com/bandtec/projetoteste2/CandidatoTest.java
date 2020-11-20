
package br.com.bandtec.projetoteste2;

import java.lang.reflect.Field;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

public class CandidatoTest {
   
    @Test
    @DisplayName("Candidato deve estar anotado corretamente")
     void anotacoesClasse() {
         
         // aqui nos objetos toda a meta programação da classe Candidato
         Class candidato = Candidato.class;
         
         // aqui verificamos se a Candidato esta anotada com @Entity
         boolean temEntity = candidato.isAnnotationPresent(Entity.class);
         
         // assertTrue -> passa se o valor for true
         // segundo parametro: mensagem em caso de falha na asserção
         assertTrue(temEntity,"Candidato deve estar anotado com @Entity");
         
         
         // recuperamos a anotação @Table sobre Candidato
         Table table = (Table) candidato.getDeclaredAnnotation(Table.class);
         
         // se Candidato não estiver anotado com @Table, será null
         assertNotNull(table,"Candidato deve estar anotado com @Table");
         
         //verificando se o @Table tem name='tbl_candidato'
         assertEquals("tbl_candidato", table.name(), "@Table deve ter o nome='tbl_candidato");
    }
     
     @Test
     @DisplayName("nome deve estar anotado corretamente")
     void anotacoesNome() throws NoSuchFieldException{
          Class candidato = Candidato.class;
          
          //recuperando a meta programação do atributo nome
          Field nome =candidato.getDeclaredField("nome");
          
           boolean temColumn = nome.isAnnotationPresent(Column.class);
           assertTrue(temColumn,"Candidato deve estar anotado com @Column");
           
           
           Column column = nome.getDeclaredAnnotation(Column.class);
           
           assertFalse(column.nullable());
           
           assertEquals(30,column.length());
     }
    
     // metodo que teste se 'votos' esta anotado com @Min e com 0 dentro
     
     @Test
     void anotacoesVotos()throws NoSuchFieldException{
         Class candidato = Candidato.class;
          Field votos =candidato.getDeclaredField("votos");
         
           
           Min column = votos.getDeclaredAnnotation(Min.class);
           
           assertNotNull(column);
         
           assertEquals(30,column.value());
     }
}
