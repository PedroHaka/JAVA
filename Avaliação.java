package aulajonasss;

public class Avalia��o {
	private double nota;
	private Disciplina disciplina;
	private Aluno aluno;
	
	public Avalia��o(double nota, Disciplina disciplina, Aluno aluno) {
		this.nota = nota;
		this.disciplina = disciplina;
		this.aluno = aluno;
	}
	
	public void setnota(double nota) {
		this.nota = nota;
	}
	
	public double getnota() {
		return nota;
	}
	
	public void setdisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public Disciplina getdisciplina() {
		return disciplina;
	}
	
	public void setaluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public Aluno getaluno() {
		return aluno;
	}
	
	public String toString() {
		return "Avalia��o-> nota = " + getnota() + ", disciplina = " + getdisciplina() + ", \n" + getaluno();
	}
	
}
