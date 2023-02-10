package co.edu.unbosque.model;

public class EmpresaDTO {

	public Candidato ArrayCandidato[];
	private CandidatoDAO candidatoDAO;
	
	public EmpresaDTO() {
		ArrayCandidato = new Candidato[10];
		candidatoDAO = new CandidatoDAO();
	}

	public Candidato[] getArrayCandidato() {
		return ArrayCandidato;
	}

	public void setArrayCandidato(Candidato[] arrayCandidato) {
		ArrayCandidato = arrayCandidato;
	}

	public CandidatoDAO getCandidatoDAO() {
		return candidatoDAO;
	}

	public void setCandidatoDAO(CandidatoDAO candidatoDAO) {
		this.candidatoDAO = candidatoDAO;
	}
}
