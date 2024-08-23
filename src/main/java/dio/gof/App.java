package dio.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *  Projeto Spring Boot para o desafio de GOF da Digital Innovation One.
 * O projeto consiste em um sistema de gerenciamento de estoque de cervejas.
 * O sistema é composto por um banco de dados H2, uma API REST e um cliente
 * que consome a API.
 * 
 * O sistema foi desenvolvido com base no desafio proposto pela Digital Innovation One.
 * 
 * @author vunk
 * @version 1.0
 */

@EnableFeignClients
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
