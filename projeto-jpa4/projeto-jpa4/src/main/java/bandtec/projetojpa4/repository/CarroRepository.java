
package bandtec.projetojpa4.repository;

import bandtec.projetojpa4.dominios.Carro;
import bandtec.projetojpa4.visoes.CarroSimples;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface CarroRepository extends CrudRepository<Carro, Integer>{
    
    @Query("select new  bandtec.projetojpa4.visoes.CarroSimples(c.id, c.modelo) from Carro c")
    List<CarroSimples> findAllSimples();
    
}
