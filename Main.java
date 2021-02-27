package Dogs;

public class Main {

	public static void main(String[] args) {
		Cachorro Viralata = new Cachorro("Bidu", 20, "Castanhos", 5, 65);
		System.out.print("Nome:  ");
		System.out.println(Viralata.getnome());
		System.out.print("Tamanho:  ");
		System.out.println(Viralata.gettamanho());
		Viralata.latir();
	}

}
