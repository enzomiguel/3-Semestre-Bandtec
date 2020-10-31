
package br.com.bandtec.projetoclienterest.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/arquivos")
public class ArquivosController {
    
    @GetMapping("/criar")
    public void criarArquivo()throws IOException{
        new File("teste-loko.txt").createNewFile();
    }
    
    // baixando um arquivo existente
    @GetMapping("/ler")
    public ResponseEntity lerArquivo() throws FileNotFoundException, IOException, URISyntaxException{
        File arquivo= new File(getClass().getResource("/arquivo-teste.txt").getFile());
        
        //tratar caractere especial no arquivo
        //File arquivo= new File(getClass().getResource("/arquivo-teste.txt").toURI());


        String conteudo = new String(StreamUtils.copyToByteArray(new FileInputStream(arquivo)));
        
        //recuperando o conteudo de um arquivo como string, dessa forma, nem precisamos criar um file
        String conteudoOutraManeira = new String(StreamUtils.copyToByteArray(getClass().getResourceAsStream("arquivo-teste.txt")));
        
        //recuperando o conteudo de um arquivo como array de bytes (ex:pra guarda imagens etc)
        //byte[] conteudoBinario = StreamUtils.copyToByteArray(new FileInputStream(arquivo));
        
        return ResponseEntity.ok(conteudo);
        
        //return ResponseEntity.ok(conteudoBinario);
    
    }
    
}
