
package br.com.bandtec.projetoagendador.servicos;

import br.com.bandtec.projetoagendador.ClienteRepository;
import br.com.bandtec.projetoagendador.entidade.Cliente;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    @Scheduled(cron = "0 30 4 * * *")
    public void enviarEmailAniversario() {
        LocalDate hoje = LocalDate.now();
        int diaHoje = hoje.getDayOfMonth();
        int mesHoje = hoje.getMonthValue();

        List<Cliente> aniversariantes =
                repository.findByDataNascimentoAndMesNascimento(diaHoje, mesHoje);

        System.out.println("Aniversariantes hoje: "+aniversariantes.size());

        aniversariantes.forEach(cliente ->
                System.out.println("Enviando email com cupom p/ "+cliente.getNome()));
    }
}
