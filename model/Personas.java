package co.edu.unbosque.model;



import util.datos;

/**
 * 
 * @author Pablo, Camilo, Santiago
 *Este clase se encarga de definir el objeto persona.
 *por lo cual nos beneficiara para crearla y hacer los ajustes que sean nesesarios
 */
public class Personas {
	/**
	 * Variable de tipo cadena para el nombre.
	 */
	private String nombre;
	/**
	 * Variable de tipo entero para la edad.
	 */
	private int edad;
	/**
	 * Variable de tipo entero para el documento.
	 */
	private int documento;
	/**
	 * Variable de tipo entero para el genero.
	 */
	private String genero;

	/**
	 * Este metodo constructor es aquel que inicializa y da el valor a las variables.
	 * <b>pre<b> Deben estar previamentar creadas las variables
	 * <b>post<b>Las variables son inicializadas
	 * @param nombre es el nombre de la persona
	 * @param edad es la edad de la persona.
	 * @param documento Es el documento cc de la persona.
	 * @param genero El sexo de la persona masculino, femenino y no identificado
	 */
	public Personas(String nombre, int edad, int documento, String genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.documento = documento;
		this.genero = genero;
	}
	
	/**
	 * Obtener la varible del nombre
	 * <b>pre<b>La variable debe estar creada e inicializada
	 * <b>post<b>Se obtiene el contenido de la variable
	 * @return Regresa el nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Cambiar el valor de la variable nombre
	 * <b>pre<b>La variable debe estar creada e inicializada
	 * <b>post<b>Se cambia el contenido de la variable
	 * @param nombre es el nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Obtener la varible de la edad
	 * <b>pre<b>La variable debe estar creada e inicializada
	 * <b>post<b>Se obtiene el contenido de la variable
	 * @return Regresa la edad de la persona
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * Cambiar el valor de la variable edad
	 * <b>pre<b>La variable debe estar creada e inicializada
	 * <b>post<b>Se cambia el contenido de la variable
	 * @param edad es la edad de la persona
	 */
	public void setEdad(int edad) {
		
		this.edad = edad;
	}
	/**
	 * Obtener la varible del documento
	 * <b>pre<b>La variable debe estar creada e inicializada
	 * <b>post<b>Se obtiene el contenido de la variable
	 * @return Regresa el nombre de las personas
	 */
	public int getDocumento() {
		return documento;
	}
	/**
	 * Cambiar el valor de la variable documento
	 * <b>pre<b>La variable debe estar creada e inicializada
	 * <b>post<b>Se cambia el contenido de la variable
	 * @param documento es el documento de la persona
	 */
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	/**
	 * Obtener la varible del genero
	 * <b>pre<b>La variable debe estar creada e inicializada
	 * <b>post<b>Se obtiene el contenido de la variable
	 * @return Regresa el nombre de la persona
	 */
	public String getGenero() {
		return genero;
	}
	/**
	 * Cambiar el valor de la variable genero
	 * <b>pre<b>La variable debe estar creada e inicializada
	 * <b>post<b>Se cambia el contenido de la variable
	 * @param genero es el genero de la persona
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	/**
	 * Metodo que se encagra de agregar a la persona al arreglo
	 * <b>pre<b>La información del objeto persona tiene que estar ya declarada
	 * <b>post<b>La persona es agregada a la lista con su respectiva información
	 * @param nombre2 es el nombre de la persona
	 * @param edad2 es la edad de la persona
	 * @param documento2 es el documento de la persona
	 * @param genero2 es el genero dee la persona
	 */
	public void add(String nombre2, int edad2, int documento2, String genero2) {
		this.nombre = nombre2;
		this.edad = edad2;
		this.documento = documento2;
		this.genero = genero2;
	}

	@Override
	/**
	 * Metodo toString
	 * <b>pre<b>Todas las vairables debieron ser previamente creadas e inicializadas
	 * <b>post<b>Se muestra la informaci�n de todas las variables
	 * @return Regresa todas las variables pero como tipo String
	 */
	public String toString() {
		return "Personas [nombre=" + nombre + ", edad=" + edad + ", documento=" + documento + ", genero=" + genero
				+ "]";
	}

}