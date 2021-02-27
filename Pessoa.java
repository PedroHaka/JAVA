package Oficina;

public class Pessoa {
	protected String nome;
	protected String cpf;
	
	Pessoa(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public String getnome() {
		return nome;
	}
	
	public void setcpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getcpf() {
		return cpf;
	}
	
	public String toString() {
		return "Nome:" + nome + " CPF:" + cpf;
	}
}
