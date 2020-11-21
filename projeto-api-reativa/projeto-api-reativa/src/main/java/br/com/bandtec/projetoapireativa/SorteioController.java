
package br.com.bandtec.projetoapireativa;


import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sorteio")
public class SorteioController {
    
    // Map-> e uma coleção que sempre tem uma chave e um valor(como um JSON)
    // a chave pode ser qualquer tipo 
    // aqui o "resultados" tem chaves do tipo UUID e valores do tipo Integer
    private Map<UUID, Integer> resultados = new HashMap<>();
    // Map do java == Dictonary
    
    
    @PostMapping("/sortear/{numero}")
    public  ResponseEntity sortear(@PathVariable int numero){
        
        //gerando um UUID aleatorio
        UUID identificador = UUID.randomUUID();
        
        // inserindo um elemento no Map "resultados"
        // chave: UUId que geramos
        // valor: 0 (zero)
        resultados.put(identificador, 0);
        
        
        // um objeto do tipo thread fica em execução no segundo plano
        // ou seja, ele nao "trava" o processo principal
        Thread threadSorteio = new Thread(){
            @Override
            public void run() {
                for (int i=1;; i++) {                    
                        int pegou = ThreadLocalRandom.current().nextInt(0,700_000);
                        System.out.println(">Sorteado: " +pegou);
                    if(pegou ==  numero){
                        //atualizando a chave do "identificador" no Map
                        resultados.put(identificador, i);
                    break;
                    }
                }
            }
             
        };
        
        // aqui inicia a thread
         threadSorteio.start(); //execução em paralelo
        
         // accepted --> 202
         return ResponseEntity.accepted().header("identificador", identificador.toString())
            .header("tempo-segundos", "30").build();
    }
    
    @GetMapping("/resultado/{identificador}")
    public ResponseEntity resultado(@PathVariable UUID identificador){
       
        if(resultados.containsKey(identificador)){
             //caso o identificador exista
            if (resultados.get(identificador) ==0) {
                //exise, mas ainda nao sorteou
                return  ResponseEntity.noContent().build();
            }else{
                //existe e JA sorteou
                return  ResponseEntity.ok("Sorteado após " + resultados.get(identificador) + " sorteios!");
            }
        }else{
            // caso o identificador seuqer exista!
            return ResponseEntity.notFound().build();
        }
    }
   
}
