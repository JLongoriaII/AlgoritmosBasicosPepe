package com.algoritmosopp.misclases;

public class Libro {
	public String ISBN;
	public String Titulo;
	public String Autor;
	public int anio;
	public int noHojas;
	public double precio;
	public boolean isPastaDura;
	
	public Libro(){
		
	}
	
	public Libro(String ISBN){
		this.ISBN=ISBN;
	}
	
	public Libro(String ISBN, String Titulo){
		this.ISBN = ISBN;
		this.Titulo = Titulo;
	}
	
	public Libro(String ISBN, String Titulo, String Autor){    //Metodo constructor
		this.ISBN = ISBN;
		this.Titulo = Titulo;
		this.Autor = Autor;
	}
	
	public Libro(String ISBN, String Titulo, String Autor, int anio){
		this.ISBN = ISBN;
		this.Titulo = Titulo;
		this.Autor = Autor;
		this.anio = anio;
	}
	
	public boolean prestarLibro() {
		return false;
	}
	
	public void agregarLibro() {
		
	}
	
	public int contarLibros(){
		return 0;
	}
	
	public void eliminarLibro(){
		
	}
	
	public double verPrecio(String ISBN){
		return precio;
	}
}
