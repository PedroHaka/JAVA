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
				ler_main = JOptionPane.showInputDialog("Este é o Menu Principal do Sistema da "
						+ "Companhia Aérea \nFictícia Voa_MLK"
					+ "\nSelecione uma opção digitando o número correspondente:"
					+ "\n-------->>"
					+ "\n1 -> Parâmetros do Sistema"
					+ "\n2 -> Reserva de Passagens"
					+ "\n3 -> Sair do Sistema");
			
				switch(ler_main) {
				case "1": 
				//try { 1
				try { 
					String main_opc_1 = JOptionPane.showInputDialog("Menu 1 -> Parâmetros do Sistema:"
					+ "\n-------->>"
					+ "\n1 -> Cadastrar Aeronave"//Instanciar os aviões
					+ "\n2 -> Cadastrar Vôo"//Instanciar os (10) vôos
					+ "\n3 -> Voltar");//retorna ao menu principal
					switch(main_opc_1) {
					case "1"://Cadastrar 3 aeronaves
					//try { 1.1
					try {
						for(int i=0; i<lista_avioes.length; i++) {
							String modelo = JOptionPane.showInputDialog("Digite o modelo da aeronave.");
							int fileira = Integer.parseInt(JOptionPane.showInputDialog(""
							+ "Digite o número de fileiras de assentos do avião."));
							int assento = Integer.parseInt(JOptionPane.showInputDialog(""
							+ "Digite o número de assentos por fileira do avião."));
							lista_avioes[i] = new Aviao(modelo,fileira,assento);
							JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!\n" + 
							lista_avioes[i].toString());
						}
					//} catch(){} 1.1
					} catch(Exception erro_opc1_1) {
						JOptionPane.showMessageDialog(null, "Erro na digitação dos dados!"
								+ "\nUse apenas letras ou números.");
					}break;
					case "2"://Cadastrar 10 Vôos
					//try { 1.2
					try {
						for(int i = 0; i<lista_voos.length; i++) {
							int numero = Integer.parseInt(JOptionPane.showInputDialog(""
							+ "Digite o número do vôo."));
							String data = JOptionPane.showInputDialog("Digite a data do Vôo [aa-mm-dd]");
							String hora = JOptionPane.showInputDialog("Digite o horário do Vôo [HH:MM]");
							//melhorar caixa de dialogo
							int aviao = Integer.parseInt(JOptionPane.showInputDialog("Escolha o avião do Vôo:" 
							+"\n0: " + lista_avioes[0].getModelo() + 
							"\n1: " + lista_avioes[1].getModelo() + 
							"\n2: " + lista_avioes[2].getModelo()));
							
							lista_voos[i] = new Voo(lista_avioes[aviao], numero, data, hora);
							JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!\n" + 
							lista_voos[i].toString());
						}
					//catch() { 1.2
					} catch(Exception erro_opc1_2) {
						JOptionPane.showMessageDialog(null, "Erro na digitação dos dados!"
								+ "\nUse apenas letras ou números."
								+ "\nSiga o padrão orientado pelos colchetes [ ].");
					}
					break;
					case "3": break;
					}
					//catch() { 1
					} catch(Exception erro_opc1) {
						JOptionPane.showMessageDialog(null, "Opção Inválida! Utilize apenas "
								+ "os números indicados: [1,2 ou 3]");
					}
					break;
					case "2":
					//try { 2	
						String main_opc_2 = JOptionPane.showInputDialog("Menu 1 -> Reserva de Passagens:"
						+ "\n-------->>"
						+ "\n1 -> Cadastrar Reserva"//Instanciar um passageiro e sua posição
						+ "\n2 -> Consultar lugares disponíveis"//Verifica e todas as posições disponíveis
						+ "\n3 -> Consultar Reservas"//getReserva() que retorna os dados da reserva
						+ "\n4 -> Voltar ao Menu Principal");//retorna ao menu principal
						switch(main_opc_2) {
						case "1"://Cadastrar 10 Reservas - Incompleto;
								 //Falta inserir os passageiros nas posições.
								 //Possivelmente uma matriz para cada vôo(lógico?)
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
							JOptionPane.showMessageDialog(null, "Erro na digitação dos dados!"
								+ "\nUse apenas letras ou números.");
						}
						break;
						case "2"://Consultar lugares disponíveis
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
					+ "\nSessão encerrada!");
					System.exit(0);
					//catch() { 3
					break;
				default:
					throw new Exception("Opção inválida!");
				//catch - switch ??
				} 
					
				
			}while (ler_main != "3");//do while
		} catch(Exception erro_root) {//try catch
			JOptionPane.showMessageDialog(null, "Opção Inválida! Utilize apenas "
					+ "os números indicados: [1,2 ou 3]");
		}
	}
}
			
