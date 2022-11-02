package br.edu.infnet.apppetshop.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apppetshop.model.domain.Tosa;

@Repository
public interface TosaRepository extends CrudRepository<Tosa, Integer> {

}
