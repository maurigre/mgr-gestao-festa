package br.com.mgr.gestao.festa.dataprovider.services;

import java.util.List;

public interface GestaoService<T> {
	
	void save(T obj);
	List<T> findAll();

}
