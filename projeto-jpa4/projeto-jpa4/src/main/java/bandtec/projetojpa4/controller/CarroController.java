
package bandtec.projetojpa4.controller;

import bandtec.projetojpa4.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class CarroController {
    
    @Autowired
    private CarroRepository repository;
    
    @GetMapping
    public  ResponseEntity getCarros(){
        return ResponseEntity.ok(repository.findAll());
    }
    
}
