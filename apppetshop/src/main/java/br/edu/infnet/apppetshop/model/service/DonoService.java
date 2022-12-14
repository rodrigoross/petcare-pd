package br.edu.infnet.apppetshop.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppetshop.clients.IDonoClient;
import br.edu.infnet.apppetshop.model.domain.Dono;

@Service
public class DonoService {
	
	@Autowired
	private IDonoClient donoClient;
	
	public void incluir(Dono dono) {
		donoClient.incluir(dono);
	}

	public void remover(Integer id) {
		donoClient.excluir(id);
	}
	
	public Collection<Dono> obterLista(){
		return (Collection<Dono>) donoClient.obterLista();
	}
	
	//public Collection<Dono> obterListaUsuario(Usuario usuario){
	//	return (Collection<Dono>) donoRepository.obterLista(usuario.getId());
	//}
	
	//public Collection<Solicitacao> obterListaSolicitacao(Dono dono){
	//	return (Collection<Solicitacao>) donoRepository.obterSolicitacoesDono(dono.getId());
	//}
}
