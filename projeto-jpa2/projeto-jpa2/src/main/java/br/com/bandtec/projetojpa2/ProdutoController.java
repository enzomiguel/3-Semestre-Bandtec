/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projetojpa2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Aluno
 */
@RestController
@RequestMapping("/produto")
public class ProdutoController {
    
    @Autowired
    private ProdutoRepository repository;
    
    @PostMapping
    public ResponseEntity criar(@RequestBody Produto novoProduto){
    repository.save(novoProduto);
    return  ResponseEntity.created(null).build();
    
    }
    
    @GetMapping
    public ResponseEntity pesquisar(){
    if(repository.count()>0){
    return  ResponseEntity.ok(repository.findAll());
    }else{
    return  ResponseEntity.noContent().build();
    }
    }
}
