package br.com.valdeir.springBoot.modelo.builder;

import java.util.ArrayList;
import java.util.List;

import br.com.valdeir.springBoot.modelo.Autor;
import br.com.valdeir.springBoot.modelo.Classificacao;
import br.com.valdeir.springBoot.modelo.Livro;
import br.com.valdeir.springBoot.modelo.Tipo;

public class LivroBuilder {
	
	private Integer idLivro;
	private String titulo;
	private String edicao;
	private Integer ano;
	private String ISBN;
	private Classificacao classificacao;
	private Tipo tipo;
	private String capa;
	private List<Autor> autores;
	private String comentarioLivro;
	private String comentarioPessoal;
	
	public LivroBuilder comId(Integer id) {
		this.idLivro = id;
		return this;
	}
	
	public LivroBuilder comTitulo(String titulo) {
		this.titulo = titulo;
		return this;
	}

	public LivroBuilder paraEdicao(String edicao) {
		this.edicao = edicao;
		return this;
	}
	
	public LivroBuilder deTipo(Tipo tipo) {
		this.tipo = tipo;
		return this;
	}
	
	public LivroBuilder adicionaAutor(Integer id, String nome) {
		if(autores==null) {
			this.autores = new ArrayList<Autor>();
		}
		else {
			this.autores.add(new Autor(id,nome));
		}
		return this;
	}
	
	public Livro build() {
		return new Livro( idLivro, titulo, edicao,  ano,  ISBN,  classificacao,
				 tipo,  capa,  autores,  comentarioLivro,  comentarioPessoal);		
	}
	
	
}
