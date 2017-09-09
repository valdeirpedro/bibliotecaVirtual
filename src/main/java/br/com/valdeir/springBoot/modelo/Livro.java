package br.com.valdeir.springBoot.modelo;

import java.util.List;

public class Livro {
	
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
	
	
	public Livro(Integer idLivro, String titulo, String edicao, Integer ano, String iSBN, Classificacao classificacao,
			Tipo tipo, String capa, List<Autor> autores, String comentarioLivro, String comentarioPessoal) {
		super();
		this.idLivro = idLivro;
		this.titulo = titulo;
		this.edicao = edicao;
		this.ano = ano;
		ISBN = iSBN;
		this.classificacao = classificacao;
		this.tipo = tipo;
		this.capa = capa;
		this.autores = autores;
		this.comentarioLivro = comentarioLivro;
		this.comentarioPessoal = comentarioPessoal;
	}
	
	public Livro() {
		
	}
	
	
	public Integer getIdLivro() {
		return idLivro;
	}
	public void setIdLivro(Integer idLivro) {
		this.idLivro = idLivro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public Classificacao getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(Classificacao classificacao) {
		this.classificacao = classificacao;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public String getCapa() {
		return capa;
	}
	public void setCapa(String capa) {
		this.capa = capa;
	}
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	public String getComentarioLivro() {
		return comentarioLivro;
	}
	public void setComentarioLivro(String comentarioLivro) {
		this.comentarioLivro = comentarioLivro;
	}
	public String getComentarioPessoal() {
		return comentarioPessoal;
	}
	public void setComentarioPessoal(String comentarioPessoal) {
		this.comentarioPessoal = comentarioPessoal;
	}
	

}
