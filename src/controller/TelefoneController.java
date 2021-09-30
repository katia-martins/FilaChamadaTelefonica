package controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.katia.filastring.*;

public class TelefoneController {

	public TelefoneController() {
		super();
	}

	public void insereLigacao(FilaString f, String numeroTelefone) {
		f.insert(numeroTelefone);
	}

	public void consultaLigacoes(FilaString f) {
		if (f.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Não há chamadas perdidas");
		} else {
			try {
				String chamada = f.remove();
				JOptionPane.showMessageDialog(null, chamada);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Não há chamadas perdidas");
			}
		}
	}

}

