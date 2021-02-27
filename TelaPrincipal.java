package minefield.project.vision;

import javax.swing.JFrame;

import minefield.project.model.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {
	
	public TelaPrincipal() {
		
		Tabuleiro tabuleiro = new Tabuleiro(16, 30, 20);
		
		add(new PainelTabuleiro(tabuleiro));
		
		setTitle("Minefield");
		setSize(690, 438);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		
	
		
		
	}
	
	public static void main(String[] args) {
		
		new TelaPrincipal();
		
	}
	
	

}
