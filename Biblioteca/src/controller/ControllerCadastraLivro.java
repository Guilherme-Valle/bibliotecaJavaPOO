package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.TelaCadastroLivro;

public class ControllerCadastraLivro {
	
	private TelaCadastroLivro the_view;

	
	public ControllerCadastraLivro (TelaCadastroLivro view){
		this.the_view = view;
		the_view.addListenerBtnCadastrar(new listenerBtnCadastrar());
	}
	
	class listenerBtnCadastrar implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "aaaa");
			String userInput = "";
            try {
                userInput = the_view.getTxtAut();
                  
            } catch (NumberFormatException nfex) {
                JOptionPane.showMessageDialog(null, "deu merda");
            }
        
			
		}
		
		
	}
}
