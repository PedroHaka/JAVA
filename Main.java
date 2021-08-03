package projeto_LP1A3_PedroHaka;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		String ler_main;
		Aviao lista_avioes[] = new Aviao[3];
		Voo lista_voos[] = new Voo[10];
		
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
					String main_opc_1 = JOptionPane.showInputDialog("Menu 1 -> Par�metros do Sistema:"
					+ "\n-------->>"
					+ "\n1 -> Cadastrar Aeronave"//Instanciar os avi�es
					+ "\n2 -> Cadastrar V�o"//Instanciar os (10) v�os
					+ "\n3 -> Voltar");//retorna ao menu principal
					switch(main_opc_1) {
					case "1"://Cadastrar 3 aeronaves
					//try { 1.1
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
					break;
					//} catch(){} 1.1
					case "2"://Cadastrar V�o
					//try { 1.2
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
					break;
					//catch() { 1.2
					case "3": break;
					}
					break;
					case "2":
					//try {	
						String main_opc_2 = JOptionPane.showInputDialog("Menu 1 -> Reserva de Passagens:"
						+ "\n-------->>"
						+ "\n1 -> Cadastrar Reserva"//Instanciar um passageiro e sua posi��o
						+ "\n2 -> Consultar lugares dispon�veis"//Verifica e todas as posi��es dispon�veis
						+ "\n3 -> Consultar Reservas"//getReserva() que retorna os dados da reserva
						+ "\n4 -> Voltar");
					break;
					case "3":
					//try {
					JOptionPane.showMessageDialog(null, "-------->>"
					+ "\nSess�o encerrada!");
					System.exit(0);
					break;
				default:
					throw new Exception("Op��o inv�lida!");
				}//switch
			}while (ler_main != "3");//do while
		} catch(Exception erro) {//try catch
			JOptionPane.showMessageDialog(null, "Op��o Inv�lida! Utilize apenas "
					+ "os n�meros indicados: [1,2 ou 3]");
		}
	}	
}
