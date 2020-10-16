
package bandtec.projetojpa4.controller;

import bandtec.projetojpa4.repository.CarroRepository;

import bandtec.projetojpa4.repository.FabricanteRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fabricantes")
public class FabricanteController {
    
     @Autowired
    private FabricanteRepostory repository;
    
    @GetMapping
    public  ResponseEntity getFabricanteSimples(){
        return ResponseEntity.ok(repository.findAllSimples());
    }
}
