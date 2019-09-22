package br.edu.ifpb.pweb2.model;

public class Livro {
	private Long Id;
	private String Titulo;
	private String Autor;
	private String Estilo;
	
	
	public Long getId() {
		return Id;
	}
	
	public void setId(Long id) {
		Id = id;
	}
	
	public String getTitulo() {
		return Titulo;
	}
	
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	
	public String getAutor() {
		return Autor;
	}
	
	public void setAutor(String autor) {
		Autor = autor;
	}
	
	public String getEstilo() {
		return Estilo;
	}
	
	public void setEstilo(String estilo) {
		Estilo = estilo;
	}
	
	

}
