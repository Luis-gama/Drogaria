package br.spring.aula.drogaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.spring.aula.drogaria.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
