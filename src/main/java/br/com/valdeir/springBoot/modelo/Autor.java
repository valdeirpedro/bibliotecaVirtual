package br.com.valdeir.springBoot.modelo;

public class Autor {

	private Integer idAutor;
	private String autores;
	public Integer getIdAutor() {
		return idAutor;
	}
	public void setIdAutor(Integer idAutor) {
		this.idAutor = idAutor;
	}
	public String getAutores() {
		return autores;
	}
	public void setAutores(String autores) {
		this.autores = autores;
	}
	public Autor(Integer idAutor, String autores) {
		super();
		this.idAutor = idAutor;
		this.autores = autores;
	}
	
	public Autor() {
	}
}
