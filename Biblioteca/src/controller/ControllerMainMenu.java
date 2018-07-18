package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
			tela.setVisible(true);
		}
		
		
	}
	
	class listenerCadastrarLivro implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			TelaCadastroLivro tela = new TelaCadastroLivro();
			tela.setVisible(true);
		}
		
		
	}
	
	
	
	

}