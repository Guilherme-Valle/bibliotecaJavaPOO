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
		view.addListenerCadAluno(new listenerBtnCadAluno());
		view.addListenerCadProf(new listenerBtnCadProf());
		view.addListenerCadExt(new listenerBtnCadExt());
		
	}
	
	class listenerBtnAluno implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			
			JPanel paneprof = the_view.getPanel_Prof();
			paneprof.setVisible(false);
			the_view.setPanel_Prof(paneprof);
			
			JPanel paneext = the_view.getPanel_Ext();
			paneext.setVisible(false);
			the_view.setPanel_Ext(paneext);
			
			JPanel pane = the_view.getPanel_Aluno();
			pane.setVisible(true);
			the_view.setPanel_Aluno(pane);
			
			
			
			
		}
		
	}
	
	class listenerBtnProfessor implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			JPanel paneext = the_view.getPanel_Ext();
			paneext.setVisible(false);
			the_view.setPanel_Ext(paneext);
			
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
			
			JPanel panealuno = the_view.getPanel_Aluno();
			panealuno.setVisible(false);
			the_view.setPanel_Aluno(panealuno);
			
			JPanel paneprof = the_view.getPanel_Prof();
			paneprof.setVisible(false);
			the_view.setPanel_Prof(paneprof);
			
			JPanel paneext = the_view.getPanel_Ext();
			paneext.setVisible(true);
			the_view.setPanel_Ext(paneext);
			
		}
		
	}
	
	class listenerBtnCadAluno implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			int id;
			String nome = "";
			String telefone = "";
			String dataNasc = "";
			String matricula = "";
			int anoAluno;	
			
		}
		
	}
	
	class listenerBtnCadProf implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			int id;
			String nome = "";
			String telefone = "";
			String dataNasc = "";
			String deptProf = "";
			String codProf = "";
			
		}
		
	}
	
	class listenerBtnCadExt implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			int id;
			String nome = "";
			String telefone = "";
			String dataNasc = "";
			String tipoUsuario = "";
			String codId = "";
			
			
		}
		
	}
	
	
	
	

}
