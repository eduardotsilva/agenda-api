package br.com.eduardo.agendaapi.model.repository;

import br.com.eduardo.agendaapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
