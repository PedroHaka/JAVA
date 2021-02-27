package Oficina;

public class Cliente extends Pessoa {
	private String telefone;
	
	Cliente(String nome, String cpf, String telefone){
		super(nome, cpf);
		this.telefone = telefone;
	}
	
	public void settelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String gettelefone() {
		return telefone;
	}
	
	public String toString() {
		return "Nome: " + nome + " CPF: " + cpf + " Telefone: " + telefone;
	}
}
