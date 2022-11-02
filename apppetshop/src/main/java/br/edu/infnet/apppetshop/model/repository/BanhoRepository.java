package br.edu.infnet.apppetshop.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apppetshop.model.domain.Banho;

@Repository
public interface BanhoRepository extends CrudRepository<Banho, Integer> {

}
