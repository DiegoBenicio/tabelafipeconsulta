package br.com.exercicio.tabelafipeconsulta;

import br.com.exercicio.tabelafipeconsulta.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TabelafipeconsultaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TabelafipeconsultaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
