package com.projeto.agenda.servico;

import com.projeto.agenda.modelo.Contato;
import com.projeto.agenda.repositorio.ContatoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContatoServico {

    @Autowired
    private ContatoRepositorio contatoRepositorio;


    //Salva um contato na Agenda
    public Contato salvarContato(Contato contato){
        return contatoRepositorio.save(contato);
    }

    public Contato atualizarContato(Contato contato){
        return contatoRepositorio.save(contato);
    }

    public void deletarContato(Long id){
        contatoRepositorio.deleteById(id);
    }
}