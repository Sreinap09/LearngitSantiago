package co.edu.unbosque.model;

public class Candidato {

	private String nombre;
	private String apellido;
	private String cedula;
	private int edad;
	private String cargo;
	public Candidato(String nombre, String apellido, String cedula, int edad, String cargo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.edad = edad;
		this.cargo = cargo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	@Override
	public String toString() {
		return "\nNombre:" + nombre 
				+ "\nApellido:" + apellido 
				+ "\nCedula:" + cedula 
				+ "\nEdad:" + edad
				+ "\nCargo:" + cargo;
	}
}
