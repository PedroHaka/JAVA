package Oficina;

public class Mecanico extends Pessoa {
	private String especialidade;
	
	Mecanico(String nome, String cpf, String especialidade){
		super(nome,cpf);
		this.especialidade = especialidade;
	}
	
	public void setespecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public String getespecialidade() {
		return especialidade;
	}
	
	public String toString() {
		return "Nome: " + nome + " CPF: " + cpf + " Especialidade: " + especialidade;
	}
}
