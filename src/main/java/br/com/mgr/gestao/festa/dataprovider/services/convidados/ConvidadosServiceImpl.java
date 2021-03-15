package br.com.mgr.gestao.festa.dataprovider.services.convidados;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mgr.gestao.festa.dataprovider.model.Convidado;
import br.com.mgr.gestao.festa.dataprovider.repository.ConvidadosRepository;

@Service
public class ConvidadosServiceImpl implements ConvidadosService {

	@Autowired
	private ConvidadosRepository repository;
	
	@Override
	public void save(Convidado convidado) {
		repository.save(convidado);
	}

	@Override
	public List<Convidado> findAll() {
		return repository.findAll();
	}

}
