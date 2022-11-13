package br.infnet.edu.apiservico.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.infnet.edu.apiservico.model.domain.Servico;

@Repository
public interface ServicoRepository extends CrudRepository<Servico, Integer> {

	@Query("from Servico s where s.id  = :servicoId")
	Servico buscaServicoPorId(Integer servicoId);
}
