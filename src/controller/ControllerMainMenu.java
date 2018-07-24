package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.dao.BibliotecaDAO;

import view.TelaCadastroEmprestimos;
import view.TelaCadastroLivro;
import view.TelaCadastroUsuario;
import view.TelaFinalizaEmprestimo;
import view.TelaMenuPrincipal;
import view.TelaPagamentoDebito;
import view.TelaRenovaEmprestimo;

public class ControllerMainMenu {
	private TelaMenuPrincipal view;
	
	public ControllerMainMenu (TelaMenuPrincipal the_view){
		this.view = the_view;
		view.addListenerCadastrarUsuario(new listenerCadastrarUsuario());
		view.addListenerCadastrarLivro(new listenerCadastrarLivro());
		view.addListenerListarLivros(new listenerListarLivros());
		view.addListenerCadastrarEmprestimo(new listenerCadastrarEmprestimo());
		view.addListenerListarEmprestimos(new listenerListarEmprestimos());
		view.addListenerRenovarEmprestimo(new listenerRenovarEmprestimo());
		view.addListenerRelatorio(new listenerRelatorio());
		view.addListenerFinalizarEmprestimo(new listenerBtnFinalizarEmprestimo());
		view.addListenerPagar(new listenerBtnPagar());
		
		BibliotecaDAO b = new BibliotecaDAO();
		if (b.criaBiblioteca()){
			b.checaEmprestimos();
			JOptionPane.showMessageDialog(null, "Biblioteca já inicializada. Empréstimos checados.");
		} else
			JOptionPane.showMessageDialog(null, "Nova biblioteca criada.");
		
		
		
	}
	
	class listenerBtnPagar implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			TelaPagamentoDebito tela = new TelaPagamentoDebito();
			ControllerPagamentoDebito controller = new ControllerPagamentoDebito(tela);
			tela.setExtendedState(tela.MAXIMIZED_BOTH);
			tela.setLocationRelativeTo(null);
			tela.setVisible(true);
			
		}
		
		
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
	
	class listenerRenovarEmprestimo implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			TelaRenovaEmprestimo tela = new TelaRenovaEmprestimo();
			ControllerRenovaEmprestimo controller = new ControllerRenovaEmprestimo(tela);
			tela.setExtendedState(tela.MAXIMIZED_BOTH);
			tela.setLocationRelativeTo(null);
			tela.setVisible(true);
			
			
		}}
	
	class listenerRelatorio implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			BibliotecaDAO b = new BibliotecaDAO();
			b.relatorio();
			
		}
		
		
	}
	
	class listenerBtnFinalizarEmprestimo implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			TelaFinalizaEmprestimo tela = new TelaFinalizaEmprestimo();
			ControllerFinalizaEmprestimo controller = new ControllerFinalizaEmprestimo(tela);
			tela.setExtendedState(tela.MAXIMIZED_BOTH);
			tela.setLocationRelativeTo(null);
			tela.setVisible(true);
			
			
			
			
		}}
	
	
	
	

}