package com.algoritmosoop.main;

import com.algoritmosopp.misclases.GatoDomenstico;
import com.algoritmosopp.misclases.GatoSalvaje;
import com.algoritmosopp.misclases.Mascota;

public class AppHerenciaMascotas {

	public static void main(String[] args){
		Mascota objMascota = new Mascota();
		
		objMascota.setNombre("Alligator");
		System.out.println("El nombre es: " + objMascota.getNombre());

		GatoSalvaje objGatoSalvaje = new GatoSalvaje();
		GatoDomenstico objGatoDomestico = new GatoDomenstico();
		GatoDomenstico objGatoDomestico2 = new GatoDomenstico();
		GatoDomenstico objGatoDomestico3 = new GatoDomenstico();
		
		objGatoSalvaje.setNombre("Gato Tom");
		objGatoDomestico.setNombre("Gato Silvestre");
		objGatoDomestico2.setNombre("Gato Felix");
		objGatoDomestico3.setNombre("Gato Pelusa");
		
		System.out.println("El gato uno se llama: " + objGatoSalvaje.getNombre());
		
		System.out.println("El gato dos se llama: " + objGatoDomestico.getNombre());
		System.out.println("La edad maxima es: " + objGatoDomestico.EdadMaxima);
		
		System.out.println("El gato tres se llama: " + objGatoDomestico2.getNombre());
		System.out.println("La edad maxima es: " + objGatoDomestico2.EdadMaxima);
		
		System.out.println("El gato cuatro se llama: " + objGatoDomestico3.getNombre());
		System.out.println("La edad maxima es: " + objGatoDomestico3.EdadMaxima);
		
		GatoDomenstico.EdadMaxima = 40;
		
		System.out.println("El gato dos se llama: " + objGatoDomestico.getNombre());
		System.out.println("La edad maxima es: " + objGatoDomestico.EdadMaxima);
		
		System.out.println("El gato tres se llama: " + objGatoDomestico2.getNombre());
		System.out.println("La edad maxima es: " + objGatoDomestico2.EdadMaxima);
		
		System.out.println("El gato cuatro se llama: " + objGatoDomestico3.getNombre());
		System.out.println("La edad maxima es: " + objGatoDomestico3.EdadMaxima);
		
		objGatoDomestico.EdadMaxima = 60;	
		
		System.out.println("El gato dos se llama: " + objGatoDomestico.getNombre());
		System.out.println("La edad maxima es: " + objGatoDomestico.EdadMaxima);
		
		System.out.println("El gato tres se llama: " + objGatoDomestico2.getNombre());
		System.out.println("La edad maxima es: " + objGatoDomestico2.EdadMaxima);
		
		System.out.println("El gato cuatro se llama: " + objGatoDomestico3.getNombre());
		System.out.println("La edad maxima es: " + objGatoDomestico3.EdadMaxima);
		

		}
}
