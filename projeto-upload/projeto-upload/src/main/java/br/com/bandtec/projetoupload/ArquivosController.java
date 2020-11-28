
package br.com.bandtec.projetoupload;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/arquivos")
public class ArquivosController {
    
    @PostMapping("/simples")
    public ResponseEntity importar(@RequestBody byte[] conteudoArquivo ) throws  IOException{
        Path path = Paths.get("novo-arquivo");
        Files.write(path, conteudoArquivo);
        return ResponseEntity.created(null).build();
    }
    
    @PostMapping("/completo")
    public ResponseEntity enviar(@RequestParam("arquivo") MultipartFile arquivo)throws IOException{
        if(arquivo.isEmpty()){
            return ResponseEntity.badRequest().body("Arquivo não encontrado!");
        }
        System.out.println("Recebendo um arquivo do tipo: " + arquivo.getContentType());
        
        byte[] conteudo = arquivo.getBytes();
        
        Path path = Paths.get(arquivo.getOriginalFilename());
        Files.write(path, conteudo);
        
        return ResponseEntity.created(null).build();
    }
}
