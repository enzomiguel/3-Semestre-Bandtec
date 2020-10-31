
package br.com.bandtec.projetoclienterest.servicos;

import br.com.bandtec.projetoclienterest.modelos.Filme;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "apifilmes",url = "http://5f861cfdc8a16a0016e6aacd.mockapi.io/bandtec-api/")
public interface ApiFilmesService {
    
    @GetMapping("/filmes/{id}")
    Filme getFilme(@PathVariable Integer id);
    
    @GetMapping("todosFilmes")
    Filme todosFilmes();
    
}
