package com.projeto.agenda.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projeto.agenda.modelo.Contato;


@Repository
public interface ContatoRepositorio extends JpaRepository<Contato, Long>{
	
	Contato getByEmail(String email);
	
	@Query(value = "SELECT * FROM tb_contato WHERE nome LIKE %?1%", nativeQuery = true)
	List<Contato> buscarPorNome(String nome);
	
	@Query(value = "SELECT * FROM tb_contato WHERE email = ?1", nativeQuery = true)
	Contato buscarPorEmail(String nome);
	
	
}
