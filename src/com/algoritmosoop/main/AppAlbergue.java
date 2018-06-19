package com.algoritmosoop.main;

import java.util.Scanner;

import com.algoritmosopp.misclases.Mascota;

public class AppAlbergue {

	public static void main(String[] args) {
		Mascota firulais;
		firulais = new Mascota();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa el Id de la mascota: ");
		firulais.setId(scanner.nextLine());
		
		System.out.println("Ingresa el Nombre de la mascota: ");
		firulais.setNombre(scanner.nextLine());
		
		System.out.println("Ingresa la Especie de la mascota: ");
		firulais.setEspecie(scanner.nextLine());
		
		System.out.println("Ingresa el estado de la mascota: ");
		firulais.setEstado(scanner.nextLine());
		
		System.out.println("Ingresa la fecha de Ingreso de la mascota: ");
		//firulais.getFechaIngreso(scanner.nextLine());
		
		System.out.println("Los datos son: " + firulais.toString());
	}
}
