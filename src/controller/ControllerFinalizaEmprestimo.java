package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;

import model.dao.BibliotecaDAO;
import model.vo.Emprestimo;
import view.TelaCadastroEmprestimos;
import view.TelaFinalizaEmprestimo;

public class ControllerFinalizaEmprestimo {
	
	/**
	 * Controller para finalizar empréstimos
	 * 
	 * @param args
	 * 
	 * @throws Exception lancada
	 */
	
	
	
	private TelaFinalizaEmprestimo the_view;
	
	
	public ControllerFinalizaEmprestimo (TelaFinalizaEmprestimo view){
		
		the_view = view;
		this.setBoxEmprestimos();
		the_view.addActionListenerBtnRemover(new listenerBtnRemover());
		
	}
	

	
	public void setBoxEmprestimos (){
		
		BibliotecaDAO b = new BibliotecaDAO();
		
		ArrayList<Emprestimo> emprestimos = b.retornaEmprestimos();
		JComboBox emprestimosBox = the_view.getComboBoxEmprestimos();
		
		for (Emprestimo i : emprestimos){
			emprestimosBox.addItem(i);
		}
		
		this.the_view.setComboBoxEmprestimos(emprestimosBox);
		
	}
	
	public class listenerBtnRemover implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			Emprestimo emp = (Emprestimo)the_view.getComboBoxEmprestimos().getSelectedItem();
			BibliotecaDAO b = new BibliotecaDAO();
			b.removeEmprestimo(emp);
			the_view.dispose();
			
		}}
	
	

}
