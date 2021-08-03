package projeto_LP1A3_PedroHaka;

public class Passageiro {
	private String nome;
	private String cpf;
	
	public Passageiro(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return "\nNome:" + nome + "\nCpf:" + cpf;
	}
	
	
}
