package br.edu.infnet.apppetshop.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apppetshop.model.domain.Dono;

@Repository
public interface DonoRepository extends CrudRepository<Dono, Integer> {
	
	@Query("from Dono d where d.usuario.id =:id")
	List<Dono> obterLista(int id);
}
