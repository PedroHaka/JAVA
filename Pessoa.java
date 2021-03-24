package aulajonasss;

public abstract class Pessoa {
	private String nome;
	
	public abstract double calcRefeição();
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public String getnome() {
		return nome;
	}
	
	public String toString() {
		return "Pessoa [Nome=" + nome + "]";
	}
	
}
