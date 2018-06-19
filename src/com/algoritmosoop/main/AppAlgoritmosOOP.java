package com.algoritmosoop.main;

import java.util.Scanner;
import com.algoritmosopp.misclases.Libro;

public class AppAlgoritmosOOP {

	public static void main(String[] args) {
		char cPastaDura = ' ';
		Libro objLibro;             //Creas objeto de la clase libro
		objLibro = new Libro();		//Instanciacion del objeto
		Libro objLibro2;
		objLibro2 = new Libro();
		Libro objLibro3;
		objLibro3 = new Libro();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(objLibro.getClass());
		
		objLibro.ISBN = "101B";		//Asignación
		objLibro.Titulo = "Blanca Nieves";
		objLibro.Autor = "José Longoria";
		objLibro.noHojas = 250;
		objLibro.anio = 2006;
		objLibro.precio = 229.50;
		objLibro.isPastaDura = true;
		
		System.out.println("El libro es: " + objLibro.Titulo + " ,con ISBN: " + objLibro.ISBN + 
				" ,del autor: " + objLibro.Autor + " ,del año: " + objLibro.anio + 
				", con " + objLibro.noHojas + " hojas y el cual tiene pasta dura: " + 
				objLibro.isPastaDura + " Tiene un precio de: " + objLibro.precio + " pesos");
		
		System.out.println("Introduce el nombre del libro: ");
		objLibro2.Titulo = scanner.nextLine();
		
		System.out.println("Introduce el autor del libro: ");
		objLibro2.Autor = scanner.nextLine();

		System.out.println("Introduce el ISBN del libro: ");
		objLibro2.ISBN = scanner.next();  //Si se pone un nextLine despues de un NextInt se atronca
		
		System.out.println("Introduce el año del libro: ");
		objLibro2.anio = scanner.nextInt();
		
		System.out.println("Introduce el numero de hojas del libro: ");
		objLibro2.noHojas = scanner.nextInt();
		
		System.out.println("Introduce el valor del libro: ");
		objLibro2.precio = scanner.nextDouble();
		
		System.out.println("Introduce si el libro es pasta dura o no (S/N): ");
		cPastaDura = scanner.next().charAt(0);
		
		if(cPastaDura == 'S' || cPastaDura == 's') {
			objLibro2.isPastaDura = true;
		}else {
			objLibro2.isPastaDura = false;
		}
		
		System.out.println("El libro es: " + objLibro2.Titulo + " ,con ISBN: " + objLibro2.ISBN + 
				" ,del autor: " + objLibro2.Autor + " ,del año: " + objLibro2.anio + 
				", con " + objLibro2.noHojas + " hojas y el cual tiene pasta dura: " + 
				objLibro2.isPastaDura + ", Tiene un precio de: " + objLibro2.precio + " pesos");
	
		System.out.println("El libro fue prestado? " + objLibro3.verPrecio("101B"));
		
		}
}
