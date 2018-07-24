package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.JComboBox;

import model.dao.BibliotecaDAO;
import model.vo.Livro;
import model.vo.Usuario;

import view.TelaCadastroEmprestimos;

public class ControllerCadastraEmprestimo {
	
	/**
	 * Controller para cadastrar empréstimos
	 * 
	 * @param args
	 * 
	 * @throws Exception lancada
	 */
	
	
	private TelaCadastroEmprestimos the_view;
	
	public ControllerCadastraEmprestimo (TelaCadastroEmprestimos view){	
		this.the_view = view;
		the_view.addListenerBtnCadastrar(new listenerBtnCadastrar());
		this.setBoxBooks();
		this.setBoxUsers();
	}
	
	class listenerBtnCadastrar implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			Usuario user = (Usuario)the_view.getComboBoxUsers().getSelectedItem();
			Livro livro = (Livro)the_view.getComboBoxBooks().getSelectedItem();
			
			BibliotecaDAO b = new BibliotecaDAO();
			b.cadastrarEmprestimo(livro.getId(), user.getId());
			the_view.dispose();
			}
		}
	
	public void setBoxBooks (){
		BibliotecaDAO b = new BibliotecaDAO();
		
		HashSet<Livro> list = b.retornaLivrosEmprestaveis();
		
		JComboBox books = the_view.getComboBoxBooks();
		
		for (Livro i : list){
			books.addItem(i);
		}
		
		the_view.setComboBoxBooks(books);
		
	}
	
	public void setBoxUsers (){
		BibliotecaDAO b = new BibliotecaDAO();
		
		HashSet<Usuario> list = b.retornaUsuariosEmprestaveis();
		
		JComboBox users = the_view.getComboBoxUsers();
		
		for (Usuario i : list){
			users.addItem(i);
		}
		
		the_view.setComboBoxUsers(users);
		
	}
	
	
	
	
	
	
}
