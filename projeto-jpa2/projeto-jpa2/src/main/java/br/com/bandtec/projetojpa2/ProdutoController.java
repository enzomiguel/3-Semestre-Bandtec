/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projetojpa2;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public ResponseEntity pesquisar(
            @RequestParam(required = false) String nome,
            @RequestParam(required = false)String unidade,
            @RequestParam(required = false) Double preco
    ){
    Produto produtoPesquisa = new Produto(nome,unidade,preco);
    
    List<Produto> produtos = repository.findAll(Example.of(produtoPesquisa));
    
        if (produtos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }else {
        return  ResponseEntity.ok(produtos);
        }
    
    
    }
    
    @GetMapping("/caros")
    public ResponseEntity listaCaros(){
    return ResponseEntity.ok(repository.pesquisarPorPrecoMaiorQue(6.0));
    }
}
