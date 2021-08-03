package projeto_LP1A3_PedroHaka;

public class Aviao extends Aeronave{
	//private int id_aviao;
	public Passageiro lugares[][];
	private int fileira, assento;
	
	public Aviao() {
		
	}
	
	public Aviao(String modelo, int fileira, int assento) {
		super(modelo);
		lugares = new Passageiro[fileira][assento];
		this.fileira = fileira;
		this.assento = assento;
	}
	
	public boolean verificaLugarOcupado(int fileira, int assento) {
		if(lugares[fileira][assento] != null) 
			return true;
		else 
			return false;
	}

	public Passageiro getPassageiro(int fileira, int assento) {
		if(lugares[fileira][assento]!=null)
		return lugares[fileira][assento];
		else
			return null;
	}

	public void setPassageiro(int fileira,int assento, Passageiro passageiro) {
		lugares[fileira][assento] = passageiro;
	}

	@Override
	public String toString() {
		return "Aviao:\nModelo:"+modelo+"\nFileira:"+fileira+"\nAssentos:"+assento;
	}
}
