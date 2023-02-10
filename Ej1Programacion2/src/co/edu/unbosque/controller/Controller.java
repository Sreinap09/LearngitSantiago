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
		String opcion = vista.leerDato("\n \nIngresa la opci�n: "
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
			String nombreAReemplazar = vista.leerDato("Ingrese nuevo nombre: ");
			
			Candidato[] nuevoArrayActualizado = null;
			nuevoArrayActualizado = empresa.getCandidatoDAO().modificarCandidato(cedulaCandidato, cedulaAreemplazar, nombreAReemplazar, empresa.getArrayCandidato());
			empresa.setArrayCandidato(nuevoArrayActualizado);
			menu();
			
		case "5":
			String cedulaABuscar = vista.leerDato("\nIngrese la cedula del candidato a buscar: ");
			
			if(empresa.getCandidatoDAO().buscarCandidato(cedulaABuscar, empresa.getArrayCandidato())==true) {
				 
			}
			
		break;
		case "0":
			vista.leerDato("Adios!!");
			break;
		default:
			vista.leerDato("N�mero no reconocido!!");
			menu();
			break;
	}
		
		
		
	}

	private void funcionar() {
		menu();
		
	}

	
		
		
	}
	

