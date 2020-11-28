
package br.com.bandtec.projetoagendador;

import br.com.bandtec.projetoagendador.entidade.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

    public List<Cliente> findByDataNascimentoAndMesNascimento(int diaHoje, int mesHoje);
    
}
