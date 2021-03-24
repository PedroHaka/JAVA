package aulajonasss;

public class Professor extends Pessoa implements Autenticação{
	private String titulação;
	private int siap;

	public Professor(String nome, String titulação, int siap) {
		super.setnome(nome);
		this.titulação = titulação;
		this.siap = siap;
		
	}
	
	public void settitulação(String titulação) {
		this.titulação = titulação;
	}
	
	public String gettitulação() {
		return titulação;
	}
	
	public void setsiap(int siap) {
		this.siap = siap;
	}
	
	public int getsiap() {
		return siap;
	}
	
	//anotações
	@Override
	public String toString() {
		return "Professor: Nome = " + getnome() + ", Titulação = " + titulação + ", SIAP = " + siap;
	}
	
	@Override
	public double calcRefeição() {
		return 10;
	}
	
	@Override
	public void login(String user, String senha) {
	System.out.println("Bem-vindo professor "+user);
	}
}

