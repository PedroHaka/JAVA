package aulajonasss;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		//Objeto Scanner
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número do semestre:");
		String sigla = entrada.next();
		Turma t1 = new Turma(sigla, "ADS");
		System.out.println(t1.toString());
		
		//Instanciação de Professor, Pessoa
		Professor p = new Professor("Johnata", "Mestre", 111);
		System.out.println(p.toString());
		
		//Instanciação de Objetos Aluno
		//System.out.println("Qtd de Alunos="+Aluno.qtdAluno);
		Aluno a = new Aluno("Maria", t1);
		Aluno b = new Aluno("Pedro", t1);
		Aluno c = new Aluno("Pjotrek", "Poland", t1);
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		System.out.println("Qtd de Alunos="+Aluno.qtdAluno);
	
		//Disciplina 
		Disciplina d = new Disciplina("LG2A2", p);
		System.out.println(d.toString());
		
		//Avaliação
		Avaliação av1 = new Avaliação(10, d, b);
		System.out.println("================================================================\n"
				+ av1.toString());
	}
	
}
