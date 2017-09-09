package br.com.valdeir.springBoot.dao;

import java.util.List;

import br.com.valdeir.springBoot.modelo.Livro;

public interface LivroDao {

	public List<Livro> consultarTodos();
	
}
