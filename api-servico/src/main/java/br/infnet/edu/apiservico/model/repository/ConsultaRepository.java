package br.infnet.edu.apiservico.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.infnet.edu.apiservico.model.domain.Consulta;

@Repository
public interface ConsultaRepository extends CrudRepository<Consulta, Integer> {

	@Query("from Consulta c where c.id = :consultaId")
	Consulta buscaConsultaPorId(Integer consultaId);
}
