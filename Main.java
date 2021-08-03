package projeto_LP1A3_PedroHaka;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		String ler_main;
		Aviao lista_avioes[] = new Aviao[3];
		Voo lista_voos[] = new Voo[10];
		Passageiro lista_pass[] = new Passageiro[10];
		//Passageiro lista_pos[][] = new Passageiro [40][6];
		
		try {
			do {
				ler_main = JOptionPane.showInputDialog("Este � o Menu Principal do Sistema da "
						+ "Companhia A�rea \nFict�cia Voa_MLK"
					+ "\nSelecione uma op��o digitando o n�mero correspondente:"
					+ "\n-------->>"
					+ "\n1 -> Par�metros do Sistema"
					+ "\n2 -> Reserva de Passagens"
					+ "\n3 -> Sair do Sistema");
			
				switch(ler_main) {
				case "1": 
				//try { 1
				try { 
					String main_opc_1 = JOptionPane.showInputDialog("Menu 1 -> Par�metros do Sistema:"
					+ "\n-------->>"
					+ "\n1 -> Cadastrar Aeronave"//Instanciar os avi�es
					+ "\n2 -> Cadastrar V�o"//Instanciar os (10) v�os
					+ "\n3 -> Voltar");//retorna ao menu principal
					switch(main_opc_1) {
					case "1"://Cadastrar 3 aeronaves
					//try { 1.1
					try {
						for(int i=0; i<lista_avioes.length; i++) {
							String modelo = JOptionPane.showInputDialog("Digite o modelo da aeronave.");
							int fileira = Integer.parseInt(JOptionPane.showInputDialog(""
							+ "Digite o n�mero de fileiras de assentos do avi�o."));
							int assento = Integer.parseInt(JOptionPane.showInputDialog(""
							+ "Digite o n�mero de assentos por fileira do avi�o."));
							lista_avioes[i] = new Aviao(modelo,fileira,assento);
							JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!\n" + 
							lista_avioes[i].toString());
						}
					//} catch(){} 1.1
					} catch(Exception erro_opc1_1) {
						JOptionPane.showMessageDialog(null, "Erro na digita��o dos dados!"
								+ "\nUse apenas letras ou n�meros.");
					}break;
					case "2"://Cadastrar 10 V�os
					//try { 1.2
					try {
						for(int i = 0; i<lista_voos.length; i++) {
							int numero = Integer.parseInt(JOptionPane.showInputDialog(""
							+ "Digite o n�mero do v�o."));
							String data = JOptionPane.showInputDialog("Digite a data do V�o [aa-mm-dd]");
							String hora = JOptionPane.showInputDialog("Digite o hor�rio do V�o [HH:MM]");
							//melhorar caixa de dialogo
							int aviao = Integer.parseInt(JOptionPane.showInputDialog("Escolha o avi�o do V�o:" 
							+"\n0: " + lista_avioes[0].getModelo() + 
							"\n1: " + lista_avioes[1].getModelo() + 
							"\n2: " + lista_avioes[2].getModelo()));
							
							lista_voos[i] = new Voo(lista_avioes[aviao], numero, data, hora);
							JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!\n" + 
							lista_voos[i].toString());
						}
					//catch() { 1.2
					} catch(Exception erro_opc1_2) {
						JOptionPane.showMessageDialog(null, "Erro na digita��o dos dados!"
								+ "\nUse apenas letras ou n�meros."
								+ "\nSiga o padr�o orientado pelos colchetes [ ].");
					}
					break;
					case "3": break;
					}
					//catch() { 1
					} catch(Exception erro_opc1) {
						JOptionPane.showMessageDialog(null, "Op��o Inv�lida! Utilize apenas "
								+ "os n�meros indicados: [1,2 ou 3]");
					}
					break;
					case "2":
					//try { 2	
						String main_opc_2 = JOptionPane.showInputDialog("Menu 1 -> Reserva de Passagens:"
						+ "\n-------->>"
						+ "\n1 -> Cadastrar Reserva"//Instanciar um passageiro e sua posi��o
						+ "\n2 -> Consultar lugares dispon�veis"//Verifica e todas as posi��es dispon�veis
						+ "\n3 -> Consultar Reservas"//getReserva() que retorna os dados da reserva
						+ "\n4 -> Voltar ao Menu Principal");//retorna ao menu principal
						switch(main_opc_2) {
						case "1"://Cadastrar 10 Reservas - Incompleto;
								 //Falta inserir os passageiros nas posi��es.
								 //Possivelmente uma matriz para cada v�o(l�gico?)
						//try { 2.1
						try {	
							for(int i = 0; i<lista_pass.length; i++) {
								String nome = JOptionPane.showInputDialog("Digite o nome do passageiro:");
								String cpf = JOptionPane.showInputDialog("Digite o CPF do passageiro:");
								lista_pass[i] = new Passageiro(nome,cpf);
								JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!\n" + 
								lista_pass[i].toString());
							}
						//catch() { 2.1
						} catch(Exception erro_opc2_1) {
							JOptionPane.showMessageDialog(null, "Erro na digita��o dos dados!"
								+ "\nUse apenas letras ou n�meros.");
						}
						break;
						case "2"://Consultar lugares dispon�veis
						//try { 2.2
							
						//catch() { 2.2
						break;
						case "3"://Consultar reservas realizadas
						//try { 2.3
							
						//catch() { 2.3
						break;
						case "4"://retorna ao menu principal
						break;
						}
					break;
					case "3":
					//try { 3
					JOptionPane.showMessageDialog(null, "-------->>"
					+ "\nSess�o encerrada!");
					System.exit(0);
					//catch() { 3
					break;
				default:
					throw new Exception("Op��o inv�lida!");
				//catch - switch ??
				} 
					
				
			}while (ler_main != "3");//do while
		} catch(Exception erro_root) {//try catch
			JOptionPane.showMessageDialog(null, "Op��o Inv�lida! Utilize apenas "
					+ "os n�meros indicados: [1,2 ou 3]");
		}
	}
}
			
