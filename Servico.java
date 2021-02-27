package Oficina;

public class Servico {
	private int codigo;
	private String nome;
	private double valor;
	
	Servico(int codigo, String nome, double valor){
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
	}
	
	public void setcodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getcodigo() {
		return codigo;
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public String getnome() {
		return nome;
	}
	
	public void setvalor(double valor) {
		this.valor = valor;
	}
	
	public double getvalor() {
		return valor;
	}
	
	public String toString() {
		return "Código:" + codigo + " Nome:" + nome + " Valor:" + valor;
	}
}

