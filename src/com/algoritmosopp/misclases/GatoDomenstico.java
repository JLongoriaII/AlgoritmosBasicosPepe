package com.algoritmosopp.misclases;

public class GatoDomenstico extends Felino {
	private String nombreDueño;
	public static int EdadMaxima = 20; //punto unico en memoria y le pertenece a la clase
	
	public String getNombreDueño() {
		return nombreDueño;
	}
	
	public void setNombreDueño(String nombreDueño) {
		this.nombreDueño = nombreDueño;
	}
	
}
