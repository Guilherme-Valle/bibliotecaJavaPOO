package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;

import model.dao.BibliotecaDAO;
import model.vo.Emprestimo;
import view.TelaRenovaEmprestimo;

public class ControllerRenovaEmprestimo {
	
	private TelaRenovaEmprestimo the_view;
	
	public ControllerRenovaEmprestimo (TelaRenovaEmprestimo view){
		the_view = view;
		this.the_view.addListenerBtnRenovar(new listenerBtnRenovar());
		this.setBoxEmprestimos();
		
		
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
	
	public class listenerBtnRenovar implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			Emprestimo emprestimo = (Emprestimo)the_view.getComboBoxEmprestimos().getSelectedItem();
			int diasRenovacao = Integer.parseInt(the_view.getTextFieldDiasRenovacao().getText());
			
			BibliotecaDAO b = new BibliotecaDAO();
			b.renovaEmprestimo(emprestimo, diasRenovacao);
			the_view.dispose();
			
		}}

}
