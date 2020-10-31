
package br.com.bandtec.projetoclienterest.controller;

import br.com.bandtec.projetoclienterest.modelos.Filme;
import br.com.bandtec.projetoclienterest.servicos.ApiFilmesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.print.resources.serviceui;

@RestController
@RequestMapping("/consultas")
public class ConsultasController {
    
    @Autowired
    private ApiFilmesService service;
    
    @GetMapping("/filme")
    public ResponseEntity getFilme(){
        
        Filme filmeRecuperado = service.getFilme(1);
        //ou numero qualquer ao inves de 1(1 a 50)
        return ResponseEntity.ok(filmeRecuperado);
    }
    
    @GetMapping("/todos")
    public ResponseEntity todosFilmes(){
        Filme todos = service.todosFilmes();
        return ResponseEntity.ok(todos);
    }
}
