package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.katia.filastring.*;

import controller.TelefoneController;

public class Principal {

	public static void main(String[] args) {
		
		TelefoneController telefone = new TelefoneController();
		FilaString f = new FilaString();
		
		String[] botao = { " - Incluir Chamada - ", " - Consultar Chamada - ", " - Encerrar - " };
		
		int opcao = 0;

		do {
			opcao = JOptionPane.showOptionDialog(null, "\n Escolha uma opcao \n\n", " >>> MENU <<< ", JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, botao, botao[0]);
			
			switch (opcao) {
				case 0:
					String chamada = JOptionPane.showInputDialog(null, "Qual o número do Telefone? \n");
					telefone.insereLigacao(f, chamada);
					break;
				case 1:
					telefone.consultaLigacoes(f);
					break;
			}

		} while (opcao != 2); // Encerra caso selecionado o botao Encerrar
		
	}

}
