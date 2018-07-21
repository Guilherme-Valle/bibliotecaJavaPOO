package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.TelaCadastroLivro;
import view.TelaCadastroUsuario;
import view.TelaMenuPrincipal;

public class ControllerMainMenu {
	private TelaMenuPrincipal view;
	
	public ControllerMainMenu (TelaMenuPrincipal the_view){
		this.view = the_view;
		view.addListenerCadastrarUsuario(new listenerCadastrarUsuario());
		view.addListenerCadastrarLivro(new listenerCadastrarLivro());
		
		
		
		
	}
	
	class listenerCadastrarUsuario implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			TelaCadastroUsuario tela = new TelaCadastroUsuario();
			ControllerCadastraUsuario contCad = new ControllerCadastraUsuario (tela);
			tela.setExtendedState(tela.MAXIMIZED_BOTH);
		    tela.setLocationRelativeTo(null);
			tela.setVisible(true);
		
		}
		
		
	}
	
	class listenerCadastrarLivro implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			TelaCadastroLivro tela = new TelaCadastroLivro();
			ControllerCadastraLivro contLiv = new ControllerCadastraLivro(tela);
			tela.setExtendedState(tela.MAXIMIZED_BOTH);
		    tela.setLocationRelativeTo(null);
			tela.setVisible(true);
		}
		
		
	}
	
	
	
	

}