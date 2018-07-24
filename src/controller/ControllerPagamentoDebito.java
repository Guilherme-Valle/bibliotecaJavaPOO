package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.JComboBox;

import model.dao.BibliotecaDAO;
import model.vo.Emprestimo;
import model.vo.Usuario;
import view.TelaPagamentoDebito;


public class ControllerPagamentoDebito {
	
	private TelaPagamentoDebito the_view;
	
	
	
	public ControllerPagamentoDebito (TelaPagamentoDebito view){
		
		the_view = view;
		the_view.addListenerPagamento(new listenerPagaDebito());
		this.setBoxDevedores();
	}
	
	
public void setBoxDevedores (){
		
		BibliotecaDAO b = new BibliotecaDAO();
		
		HashSet<Usuario> usersDevendo = b.retornaUsuariosDevedores();
		JComboBox devedoresBox = the_view.getComboBoxDevedores();
		
		for (Usuario e : usersDevendo){
			
			devedoresBox.addItem(e);
			
		}
		
		this.the_view.setComboBoxDevedores(devedoresBox);
		
	}

	public class listenerPagaDebito implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			BibliotecaDAO b = new BibliotecaDAO();
			
			Usuario user = (Usuario)the_view.getComboBoxDevedores().getSelectedItem();
			
			b.devolve(user);
			
			the_view.dispose();
			
			
			
		
	}}
	
	
	

}
