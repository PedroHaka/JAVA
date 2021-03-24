package aulajonasss;

public class Aluno extends Pessoa implements Autentica��o{
	public static int qtdAluno = 0;
	private String rne;
	private int matricula;
	private Turma turma;
	private Situacao situacaoacademica;
	
	//Aluno estrangeiro
	public Aluno(String nome, String rne, Turma turma) {
		super.setnome(nome);
		this.rne = rne;
		this.matricula = ++qtdAluno;
		this.turma = turma;
		this.situacaoacademica = Situacao.MATRICULADO;
	}
	
	public Aluno(String nome, Turma turma) {
		super.setnome(nome);
		this.matricula = ++qtdAluno;
		this.turma = turma;
	}
	
	//Anota��o
	@Override
	public double calcRefei��o() {
		return 5;
	}
	
	@Override
	public String toString() {
		return "Aluno: Nome = " + super.getnome() + ", RNE = " + rne + ", Matricula = " + matricula + ", Turma = " + turma + ", Situa��o = " + situacaoacademica;
	}
	
	@Override
	public void login(String user, String senha) {
	System.out.println("Bem-vindo aluno "+user);
	}

}
