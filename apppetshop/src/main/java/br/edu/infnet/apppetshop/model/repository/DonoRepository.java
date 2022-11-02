package br.edu.infnet.apppetshop.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apppetshop.model.domain.Dono;

@Repository
public interface DonoRepository extends CrudRepository<Dono, Integer> {

}
