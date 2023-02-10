package co.edu.unbosque.model;

public class CandidatoDAO {

	
	public CandidatoDAO() {
		
	}
	public boolean buscarCandidato(String cedula, Candidato[] ArrayCandidato) {
		for(int i = 0; i < ArrayCandidato.length; i++) {
			if(ArrayCandidato[i]!=null) {
				if(ArrayCandidato[i].getCedula().equals(cedula)) {
					return true;
				}
			}			
		}
		return false;
	}
	public Candidato[] agregarCandidato(String nombre, String apellido, String cedula, int edad, String cargo, Candidato[] ArrayCandidato) {
		ArrayCandidato = verificarArray(ArrayCandidato);
		boolean existe = buscarCandidato(cedula, ArrayCandidato);
		if(existe == false) {
			Candidato candidato = new Candidato(nombre,apellido,cedula,edad,cargo);
			for(int i = 0; i < ArrayCandidato.length; i++){
				if(ArrayCandidato[i]==null) {
					ArrayCandidato[i] = candidato;
					System.out.println("El candidato "+nombre+" identificado con cedula "+cedula+"se agrego exitosamente!");
					break;
				}
			}
		}
		else {
			System.out.println("El candidato con nombre "+nombre+" ya existe");
		}
		return ArrayCandidato;
	}
	public Candidato[] eliminarCandidato(String cedula, Candidato[] ArrayCandidato) {
		
		boolean existe = buscarCandidato(cedula, ArrayCandidato);
		if(existe == true){
			for(int i = 0; i < ArrayCandidato.length; i++) {
				if(ArrayCandidato[i]!= null){
					if(ArrayCandidato[i].getCedula().equals(cedula)){
						ArrayCandidato[i]=null;
						ArrayCandidato = reorganizarArreglo(i, ArrayCandidato);
						System.out.println("Se elimino correctamente el candidato");
					}					
				}
			}			
		}
		else {
			System.out.println("El candidato con cedula "+cedula+" no existe");
		}
		return ArrayCandidato;
	}
	public Candidato[] modificarCandidato(String cedula, String nuevaCedula, Candidato[] ArrayCandidato) {
		boolean existe = buscarCandidato(cedula, ArrayCandidato);
		if(existe == true){
			for(int i = 0; i < ArrayCandidato.length; i++) {
				if(ArrayCandidato[i]!= null){
					if(ArrayCandidato[i].getCedula().equals(cedula)){
						ArrayCandidato[i].setCedula(nuevaCedula);
						System.out.println("El numero de cedula"+nuevaCedula+" se actualizo correctamente!");
					}
				}
			}
			
		}		
		return ArrayCandidato;
	}
	public Candidato[] verificarArray(Candidato[] ArrayCandidato) {
		if(ArrayCandidato[ArrayCandidato.length-1]!= null) {
			int nuevoTamano = ArrayCandidato.length * 2;
			Candidato[] nuevoCandidatoArray = new Candidato[nuevoTamano]; 
			for(int i = 0; i < ArrayCandidato.length; i++) {
				nuevoCandidatoArray[i] = ArrayCandidato[i];
			}
			return nuevoCandidatoArray;
		}
		else {
			return ArrayCandidato;
		}
	}
	public void mostrarArray(Candidato[] ArrayCandidato) {
		System.out.println("\nLos candidatos de la lista son:\n");
		for(int i = 0; i < ArrayCandidato.length; i++){
			if(ArrayCandidato[i]!=null) {
				System.out.println("\nCandidato\n"+"Nombre: " 
						+ArrayCandidato[i].getNombre()+" "
						+ArrayCandidato[i].getApellido()+"\nCedula: "
						+ArrayCandidato[i].getCedula()+"\nEdad: "
						+ArrayCandidato[i].getEdad()+"\nCargo "
						+ArrayCandidato[i].getCargo());
			}
			else {
				System.out.println("El candidato en la posición "+ i + " no existe!");
			}
		}		
	}
	public Candidato[] reorganizarArreglo(int posicion, Candidato[] ArrayCandidato) {
		int tamano = ArrayCandidato.length;
		if(tamano-1 > posicion){
			ArrayCandidato[posicion]=ArrayCandidato[posicion+1];
			ArrayCandidato=reorganizarArreglo(posicion+1, ArrayCandidato);
		}		
		return ArrayCandidato;
	}
}
