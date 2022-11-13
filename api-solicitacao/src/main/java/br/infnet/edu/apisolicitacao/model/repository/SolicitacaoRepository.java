package br.infnet.edu.apisolicitacao.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.infnet.edu.apisolicitacao.model.domain.Solicitacao;

@Repository
public interface SolicitacaoRepository extends CrudRepository<Solicitacao, Integer> {

	@Query("from Solicitacao s where s.id = :solicitacaoId")
	Solicitacao buscarSolicitacaoPorId(Integer solicitacaoId);
}
