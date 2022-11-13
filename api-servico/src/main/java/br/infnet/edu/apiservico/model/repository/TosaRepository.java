package br.infnet.edu.apiservico.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.infnet.edu.apiservico.model.domain.Tosa;

@Repository
public interface TosaRepository extends CrudRepository<Tosa, Integer> {

	@Query("from Tosa t where t.id = :tosaId")
	Tosa buscaTosaPorId(Integer tosaId);
}
