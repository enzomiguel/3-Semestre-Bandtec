
package bandtec.com.projetotestes1turmab;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculos")
public class CaculosController {
    
    @GetMapping("/dividir/{n1}/{n2}")
    public ResponseEntity dividir( @PathVariable double n1, @PathVariable double n2){
        if (n2 ==0) {
            return  ResponseEntity.badRequest().body("Divisor nao pode ser 0");
        }
 
       double divisao = n1 / n2;
       return  ResponseEntity.ok(divisao);
    }
}
