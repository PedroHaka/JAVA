package aulajonasss;

public class Turma {
	private String semestre;
	private String curso;
	
	public Turma(String sigla, String curso) {
	this.semestre = sigla;
	this.curso = curso;
	}
	
	public String toString() {
		return curso + semestre;
	}
	
	public void setsigla(String sigla) {
		this.semestre = sigla;
	}
	
	public String getsigla() {
		return semestre;
	}
	
	public void setcurso(String curso) {
		this.curso = curso;
	}
	
	public String getcurso() {
		return curso;
	}
	
}

