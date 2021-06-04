package br.com.eduardo.agendaapi;

import br.com.eduardo.agendaapi.model.entity.Contato;
import br.com.eduardo.agendaapi.model.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AgendaApiApplication {


	@Bean
	public CommandLineRunner runner(@Autowired ContatoRepository repository){
		return args -> {
			Contato contato = new Contato();
			contato.setNome("Aparecido");
			contato.setEmail("Aparecido@gmail.com");
			contato.setFavorito(true);
			repository.save(contato);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(AgendaApiApplication.class, args);
	}

}
