package Oficina;

public class OrdemDeServico {
	protected int codigo;
	protected Cliente cliente;
	
	OrdemDeServico(int codigo, Cliente cliente){
		this.codigo = codigo;
		this.cliente = cliente;
	}

/*	
	public void adicionaServico(Servico servico) {
		
	}
	
	public void adicionaMecanico(Mecanico mecanico) {
		
	}
	
	public double calculaValorTotal() {
		
	}
	
	public boolean possuiServico(int codigo) {
		
	}
	
	public boolean possuiMecanico(String cpf) {
		
	}
*/
	public String toString() {
		return " Código: " + codigo + " Cliente: " + cliente;
	}
}
*/