/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projetojpa2;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Aluno
 */
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
    /*     Na anotação @Query usamos, por padrão, a linguagem JPQL (Java Persistence Query Language)   
    A JPQL é Orientada a Objetos. Por isso usamos nela os nomes das Classes das Entidades e de seus atributos    
    NÃO usamos os nomes de tabelas e colunas do banco.     
    Na JPQL podemos configurar PARÂMETROS. Eles começam do 1.   
    Ex: ?1, ?2, ?3....     No lugar do ?1 entra o primeiro parâmetro do método   
    No lugar do ?2 entra o segundo parâmetro do método     ...      */
    
    @Query("select p from Produto p where p.preco >?1")
    List<Produto> pesquisarPorPrecoMaiorQue(Double preco);
    
    
    
}
