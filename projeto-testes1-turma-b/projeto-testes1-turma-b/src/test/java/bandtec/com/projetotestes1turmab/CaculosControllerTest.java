
package bandtec.com.projetotestes1turmab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.springframework.http.ResponseEntity;

public class CaculosControllerTest {
    
    @Test
    @DisplayName("O dividir() deve dividir 2 números")
    public void dividir() {
        //preparacao (setup) para o teste
        CaculosController controller = new CaculosController();
        double n1= 10.0;
        double n2 = 2.0;
        
        // execucao do metodo  a ser testado
        // e guardamos o seu retorno("resposta")
        ResponseEntity resposta = controller.dividir(n1, n2);
        
        //asserção, verificação do resultado
        assertEquals(5.0, resposta.getBody()); 
        assertEquals(200, resposta.getStatusCodeValue());
        
        // cenario 2: segunfo numero é 0
        n1 = 10.0;
        n2 = 0.0;
        resposta = controller.dividir(n1, n2);
        assertEquals("Divisor nao pode ser 0",resposta.getBody());
        assertEquals(400,resposta.getStatusCodeValue());
    }   
}


