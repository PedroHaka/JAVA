package aulajonasss;

public class Professor extends Pessoa implements Autentica��o{
	private String titula��o;
	private int siap;

	public Professor(String nome, String titula��o, int siap) {
		super.setnome(nome);
		this.titula��o = titula��o;
		this.siap = siap;
		
	}
	
	public void settitula��o(String titula��o) {
		this.titula��o = titula��o;
	}
	
	public String gettitula��o() {
		return titula��o;
	}
	
	public void setsiap(int siap) {
		this.siap = siap;
	}
	
	public int getsiap() {
		return siap;
	}
	
	//anota��es
	@Override
	public String toString() {
		return "Professor: Nome = " + getnome() + ", Titula��o = " + titula��o + ", SIAP = " + siap;
	}
	
	@Override
	public double calcRefei��o() {
		return 10;
	}
	
	@Override
	public void login(String user, String senha) {
	System.out.println("Bem-vindo professor "+user);
	}
}

