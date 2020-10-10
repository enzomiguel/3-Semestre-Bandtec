/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projetojpa3;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Aluno
 */@RestController
 @RequestMapping("/pessoas")
public class PessoaController {
    
    private List<Pessoa> pessoas = new ArrayList<>();
    
    
    @GetMapping
    public List<Pessoa> getPessoas() {
        return pessoas;
    }
    
    @PostMapping
    public ResponseEntity criar(@RequestBody @Valid Pessoa novaPessoa){
        pessoas.add(novaPessoa);
    
        return ResponseEntity.created(null).build();
    
    }
}
