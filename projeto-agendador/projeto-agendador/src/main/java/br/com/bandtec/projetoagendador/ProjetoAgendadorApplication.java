package br.com.bandtec.projetoagendador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@Configuration  //torna a classe uma classe de configuração do Spring
@EnableScheduling  // habilita a criação de agndamentos 
// A EnableScheduling so funciona em conjunto com a @Configuration
public class ProjetoAgendadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoAgendadorApplication.class, args);
	}

}
