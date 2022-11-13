package br.infnet.edu.apidono.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.infnet.edu.apidono.model.domain.Dono;
import br.infnet.edu.apidono.model.repository.DonoRepository;

@Service
public class DonoService {
	
	@Autowired
	private DonoRepository donoRepository;
	
	public void incluir(Dono dono) {
		donoRepository.save(dono);
	}

	public void remover(Integer id) {
		donoRepository.deleteById(id);
	}
	
	public List<Dono> obterLista(){
		return (List<Dono>) donoRepository.findAll();
	}
	
	public Dono carregarDono(Integer id){
		return donoRepository.buscarDonoPorId(id);
	}
	
	//public Collection<Dono> obterListaUsuario(Usuario usuario){
	//	return (Collection<Dono>) donoRepository.obterLista(usuario.getId());
	//}
	
	//public Collection<Solicitacao> obterListaSolicitacao(Dono dono){
	//	return (Collection<Solicitacao>) donoRepository.obterSolicitacoesDono(dono.getId());
	//}
}
