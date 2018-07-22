package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.dao.BibliotecaDAO;

import view.TelaCadastroEmprestimos;
import view.TelaCadastroLivro;
import view.TelaCadastroUsuario;
import view.TelaMenuPrincipal;

public class ControllerMainMenu {
	private TelaMenuPrincipal view;
	
	public ControllerMainMenu (TelaMenuPrincipal the_view){
		this.view = the_view;
		view.addListenerCadastrarUsuario(new listenerCadastrarUsuario());
		view.addListenerCadastrarLivro(new listenerCadastrarLivro());
		view.addListenerListarLivros(new listenerListarLivros());
		view.addListenerCadastrarEmprestimo(new listenerCadastrarEmprestimo());
		view.addListenerListarEmprestimos(new listenerListarEmprestimos());
		
		BibliotecaDAO b = new BibliotecaDAO();
		if (b.criaBiblioteca())
			JOptionPane.showMessageDialog(null, "Biblioteca já inicializada");
		else
			JOptionPane.showMessageDialog(null, "Nova biblioteca criada");

		
		
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
	
	class listenerListarLivros implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			BibliotecaDAO b = new BibliotecaDAO();
			b.listarLivros();
			
		}
		
		
	}
	
	class listenerListarEmprestimos implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			BibliotecaDAO b = new BibliotecaDAO();
			b.listarEmprestimos();
			
		}}
	
	
	
	class listenerCadastrarEmprestimo implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			TelaCadastroEmprestimos tela = new TelaCadastroEmprestimos();
			ControllerCadastraEmprestimo contEmp = new ControllerCadastraEmprestimo(tela);
			tela.setExtendedState(tela.MAXIMIZED_BOTH);
			tela.setLocationRelativeTo(null);
			tela.setVisible(true);
			
		}}
	
	
	
	

}