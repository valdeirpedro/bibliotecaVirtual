package br.com.valdeir.springBoot.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.valdeir.springBoot.dao.LivroDao;
import br.com.valdeir.springBoot.modelo.Livro;

@RestController
public class LivroServiceRest implements LivroService {

	@Autowired(required=false)
	private LivroDao livroDao;
	
	@RequestMapping("/livro")
	public List<Livro> consultarTodos() {
		// TODO Auto-generated method stub
		List<Livro> livros = this.livroDao.consultarTodos();
		if(livros==null || livros.size()==0) {
			throw new LivroNaoEcontradoException();
		}
		return livros;
	}

}
