
package br.com.bandtec.projetoagendador.servicos;

import java.util.concurrent.ThreadLocalRandom;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/* Service -> Classes para regras de negocio.
Não sao "presas" a chamadas HTTP nem ao banco de dados 
toda classe anota com @Service tem 1 instancia no projeto em execução
Podemos injetar uma Service em classes Controller
Numa Service vc pode injetar Repositores usando o (@Autowired)
*/

@Service
@EnableAsync
public class AgendamentosService {
    
    @Scheduled(fixedRate = 3000)
    public  void filosofar(){
        System.out.println("So colhe quem planta!");
    }
    
    @Scheduled(fixedRate = 3000, initialDelay = 5000)
    public  void poemaPreguicoso(){
        System.out.println("eeeeeeeeeh aiiiiii irmãoooooooo (ouvindo reggae)!");
    }
    
    @Async
    @Scheduled(fixedRate = 500)
    public  void sortearNumero(){
        System.out.println("Iniciano sorteio......");
        int quero = 30;
        while (true){
            int sorteado = ThreadLocalRandom.current().nextInt(0,90_000_000);
            if(sorteado == quero){
                System.out.println("Fui sorteado!");
                break;
            }
         }
    }
    
    @Scheduled(cron = "3,7,10 * * * * *")
    public void repetirMantra(){
        System.out.println("ahá uhú, a Bandtec é nossa!");
    }
    
    
    
    
}
