package br.infnet.edu.apiservico.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.infnet.edu.apiservico.model.domain.Banho;

@Repository
public interface BanhoRepository extends CrudRepository<Banho, Integer> {

	@Query("from Banho b where b.id = :banhoId")
	Banho buscaBanhoPorId(Integer banhoId);
}
