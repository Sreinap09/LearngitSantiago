package co.edu.unbosque.controller;
import co.edu.unbosque.model.Candidato;
import co.edu.unbosque.model.EmpresaDTO;
import co.edu.unbosque.view.VistaConsola;

public class Controller {
	
	private EmpresaDTO empresa;
	private VistaConsola vista;
	
	public Controller() {
		empresa = new EmpresaDTO();
		vista = new VistaConsola();
		funcionar();
	}
	private void menu() {
		String opcion = vista.leerDato("\n \nIngresa la opción: "
									 + "\n1. Agregar Candidato "
									 + "\n2. Eliminar Candidato "
									 + "\n3. Ver arreglo "
									 + "\n4. Actualizar cedula candidato "
									 + "\n0.Salir");
		
		switch (opcion) {
		case "1":
			//String nombre, String apellido, String cedula, int edad, String cargo
			String aux_n = vista.leerDato("\nIngrese nombre del candidato: ");
			String aux_a = vista.leerDato("\nIngrese apellido del cantidato: ");
			String aux_c = vista.leerDato("\nIngrese cedula del candidato: ");
			int aux_e = vista.leerEntero("\nIngrese edad del candidato: ");
			String aux_cA = vista.leerDato("\nIngrese cargo del candidato: ");
			
			Candidato[] nuevo = null;
			
			nuevo = empresa.getCandidatoDAO().agregarCandidato(aux_n, aux_a, aux_c, aux_e, aux_cA, empresa.getArrayCandidato());
			empresa.setArrayCandidato(nuevo);
			menu();
		break;
		case "2":
			String cedulaEliminarCandidato = vista.leerDato("\nIngrese el numero de cedula del candidato que desea eliminar: ");
			
			Candidato[] nuevoEliminar = null;
			
			nuevoEliminar = empresa.getCandidatoDAO().eliminarCandidato(cedulaEliminarCandidato, empresa.getArrayCandidato());
			empresa.setArrayCandidato(nuevoEliminar);
			menu();
		break;
		case "3":
			empresa.getCandidatoDAO().mostrarArray(empresa.getArrayCandidato());
			menu();
		break;
		case "4":
			String cedulaCandidato = vista.leerDato("\nIngrese la cedula del candidato a buscar: ");
			String cedulaAreemplazar = vista.leerDato("Ingrese el nuevo numero de cedula: ");
			
			Candidato[] nuevoArrayActualizado = null;
			nuevoArrayActualizado = empresa.getCandidatoDAO().modificarCandidato(cedulaCandidato, cedulaAreemplazar,empresa.getArrayCandidato());
			empresa.setArrayCandidato(nuevoArrayActualizado);
			menu();
		break;
		case "0":
			vista.leerDato("Adios!!");
			break;
		default:
			vista.leerDato("Número no reconocido!!");
			menu();
			break;
	}
		
		
		
	}

	private void funcionar() {
		menu();
		
	}

	
		
		
	}
	

