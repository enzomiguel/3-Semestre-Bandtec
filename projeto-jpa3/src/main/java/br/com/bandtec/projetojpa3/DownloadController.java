/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projetojpa3;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Aluno
 */
@RestController
@RequestMapping("/download")
public class DownloadController {
    
    @GetMapping
    public ResponseEntity getUm(){
        return ResponseEntity.ok(1);
    }
     
    @GetMapping(value = "zip-loko",produces ="applcation/x-7z-compressed")
    @ResponseBody
 
    public ResponseEntity getZip(){
        
        HttpHeaders headers = new HttpHeaders();
        
        headers.add("Content-Disposition", "attachment; filename=lokao.zip");
        return new ResponseEntity("Conteudo zip fake",headers,HttpStatus.OK);
    }
    
     @GetMapping(value = "imagem-loka",produces ="image/jpeg")
    @ResponseBody
 
    public ResponseEntity getImage(){
        return ResponseEntity.ok("Só que nâo");
    }
    
}
