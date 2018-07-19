package controller;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import view.TelaCadastroUsuario;

public class ControllerCadastraUsuario {
	private TelaCadastroUsuario the_view;
	
	public ControllerCadastraUsuario (TelaCadastroUsuario view){
		this.the_view = view;
		view.addListenerBtnAluno(new listenerBtnAluno());
		view.addListenerBtnProfessor(new listenerBtnProfessor());
		view.addListenerBtnExterno(new listenerBtnExterno());
	}
	
	class listenerBtnAluno implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			JPanel pane = the_view.getPanel_Aluno();
			pane.setVisible(true);
			the_view.setPanel_Aluno(pane);
			
			
			
			
		}
		
	}
	
	class listenerBtnProfessor implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			JPanel pane = the_view.getPanel_Aluno();
			pane.setVisible(false);
			the_view.setPanel_Aluno(pane);
			
			JPanel paneprof = the_view.getPanel_Prof();
			paneprof.setVisible(true);
			the_view.setPanel_Prof(paneprof);
			
		}
		
	}
	
	class listenerBtnExterno implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
	
	

}