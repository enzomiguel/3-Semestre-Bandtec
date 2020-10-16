
package bandtec.projetojpa4.repository;


import bandtec.projetojpa4.dominios.Fabricante;
import bandtec.projetojpa4.visoes.FabricanteSimples;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface FabricanteRepostory extends CrudRepository<Fabricante, Integer>{
    @Query("select new  bandtec.projetojpa4.visoes.FabricanteSimples(f.id, f.nome) from Fabricante f")
    List<FabricanteSimples> findAllSimples();
}
