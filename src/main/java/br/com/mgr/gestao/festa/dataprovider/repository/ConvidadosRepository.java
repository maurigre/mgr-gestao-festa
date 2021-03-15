package br.com.mgr.gestao.festa.dataprovider.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mgr.gestao.festa.dataprovider.model.Convidado;

public interface ConvidadosRepository extends JpaRepository<Convidado, Long>{

}
