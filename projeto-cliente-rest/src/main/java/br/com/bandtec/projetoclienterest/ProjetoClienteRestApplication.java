package br.com.bandtec.projetoclienterest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//serve pra se comunicar com outra API
@SpringBootApplication
@EnableFeignClients
public class ProjetoClienteRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoClienteRestApplication.class, args);
	}

}
