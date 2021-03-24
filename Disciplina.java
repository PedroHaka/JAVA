package aulajonasss;

public class Disciplina {
	private String nome;
	private Professor professor;
	
	public Disciplina(String nome, Professor professor) {
		this.nome = nome;
		this.professor = professor;
	}
	
	public String toString() {
		return getnome() + ", " + getprofessor();
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public String getnome() {
		return nome;
	}
	
	public void setprofessor(Professor professor) {
		this.professor = professor;
	}
	
	public Professor getprofessor() {
		return professor;
	}
}
