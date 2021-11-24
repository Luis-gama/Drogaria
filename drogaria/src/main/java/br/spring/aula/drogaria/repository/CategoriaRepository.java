package br.spring.aula.drogaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.spring.aula.drogaria.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Short> {

}
