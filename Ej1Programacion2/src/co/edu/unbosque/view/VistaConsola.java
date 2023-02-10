package co.edu.unbosque.view;

import java.util.Scanner;

public class VistaConsola {
	
	private Scanner leer;
	
	public VistaConsola() {
		leer = new Scanner(System.in);
	}
	
	public String leerDato(String mensaje) {
		String dato = "";
		System.out.println(mensaje);
		dato = leer.nextLine();
		return dato;
	}
	public int leerEntero() {
		int dato = 0;
		dato = leer.nextInt();
		leer.nextLine();
		return dato;
	}
	
	public int leerEntero(String mensaje) {
		System.out.println(mensaje);
		int dato = 0;
		dato = leer.nextInt();
		leer.nextLine();
		return dato;
	}
	public void mostrarInformación(String mensaje) {
		System.out.println(mensaje);
	}
}