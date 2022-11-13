package br.infnet.edu.apidono.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.infnet.edu.apidono.model.domain.Dono;

@Repository
public interface DonoRepository extends CrudRepository<Dono, Integer> {
	
	// TODO excluir endereco quando dono for excluido
	//@Query("from Endereco e where e.id =: dono.endereco.id")
	//void excluiEnderecoDono(Integer id);
	
	@Query("from Dono d where d.id  = :donoId")
	Dono buscarDonoPorId(Integer donoId);
}
