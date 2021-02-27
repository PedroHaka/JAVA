package Dogs;

public class Cachorro {
	public String nome;
	public int peso;
	public String corOlhos;
	public int idade;
	public int tamanho;

	public Cachorro(String nome, int peso, String corOlhos, int idade, int tamanho) {
		this.nome = nome;
		this.peso = peso;
		this.corOlhos = corOlhos;
		this.idade = idade;
		this.tamanho = tamanho;
	}
	
	public String getnome() {
		return nome;
	}
	
	public int gettamanho() {
		return tamanho;
	}

	public void latir() {
		if(tamanho > 60)
			System.out.println("latido forte!");
		else if(tamanho > 25)
			System.out.println("latido médio!");
		else
			System.out.println("não assusta!");
	}
}