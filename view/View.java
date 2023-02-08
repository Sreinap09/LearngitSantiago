package co.edu.unbosque.view;

import java.util.Scanner;
/**
 * Clase view, que se encarga de leer y mostrar información por medio de la consola
 * @author JUAN, CAMILO, SANTIAGO
 *
 */
public class View {
	/**
	 * Se crea una variable de tipo Scanner 
	 */
	Scanner cn = new Scanner(System.in);
	/**
	 * Construye las variables de . <br>
	 * <b>post: </b> Se inicializaron los componentes gr�ficos de la aplicaci�n.
	 */
	public View() {

	}
	/**
	 *Metodo que se encarga de mostrar un mensaje
	 *<b>pre<b>Que en el controlador nos de el mensaje que quiere mostrar
	 *<b>post<b>Se muestra el mensaje seleccionadao
	 * @param mensaje es el mensaje a mostrar
	 */
	public void mostrarmensaje(String mensaje) {
		System.out.println(mensaje);
	}
	/**
	 * Metodo que se encarga de leer los valores tipo entero
	 * <b>pre<b>que en el controlador nos de el mensaje que quiere mostrar
	 * <b>post<b>Se muestra el mensaje de tipo String
	 * @param mensaje es el mensaje a mostrar
	 * @return Regresa el valor de tipo inte, convertido en String en la consola
	 */

	public int leerint(String mensaje) {

		System.out.println(mensaje);
		int i = cn.nextInt();
		cn.nextLine();
		return i;

	}
	/**
	 * Metodo que se encarga de leer los valores tipo String
	 * <b>pre<b>que en el controlador nos de el mensaje que quiere mostrar
	 * <b>post<b>Se muestra el mensaje de tipo String
	 * @param mensaje es el mensaje que se desea mostrar
	 * @return Regresa el dato de tipo String en la consola 
	 */
	public String leerString(String mensaje) {
		System.out.println(mensaje);
		String a = cn.nextLine();
		return a;
	}

}
