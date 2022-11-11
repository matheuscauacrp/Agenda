package com.projeto.agenda.repositorio;

import com.projeto.agenda.modelo.Contato;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContatoRepositorio extends JpaRepository<Contato, Long>{
	
	public Contato findByEmail(String email);
	public List<Contato> findByNome(String nome);
	
}
