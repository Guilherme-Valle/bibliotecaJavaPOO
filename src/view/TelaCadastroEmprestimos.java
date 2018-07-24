package view;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class TelaCadastroEmprestimos extends JFrame {
	JComboBox comboBoxUsers = new JComboBox();
	JComboBox comboBoxBooks = new JComboBox();
	JButton btnCadastrar = new JButton("Cadastrar");

	public TelaCadastroEmprestimos() {
		getContentPane().setLayout(null);
		
		JLabel lblCadastroDeEmprestimo = new JLabel("Cadastro de empréstimo");
		lblCadastroDeEmprestimo.setBounds(143, 0, 212, 28);
		getContentPane().add(lblCadastroDeEmprestimo);
		
		JLabel label = new JLabel("Usuário");
		label.setBounds(52, 90, 70, 15);
		getContentPane().add(label);
		
		JLabel lblLivro = new JLabel("Livro");
		lblLivro.setBounds(356, 90, 70, 15);
		getContentPane().add(lblLivro);
		
		
		btnCadastrar.setBounds(153, 220, 148, 55);
		getContentPane().add(btnCadastrar);
		
		
		comboBoxUsers.setBounds(12, 117, 155, 24);
		getContentPane().add(comboBoxUsers);
		
		comboBoxBooks.setBounds(298, 117, 155, 24);
		getContentPane().add(comboBoxBooks);
	}
	
	public void addListenerBtnCadastrar (ActionListener e){
		this.btnCadastrar.addActionListener(e);
	}

	public JComboBox getComboBoxUsers() {
		return comboBoxUsers;
	}

	public void setComboBoxUsers(JComboBox comboBoxUsers) {
		this.comboBoxUsers = comboBoxUsers;
	}

	public JComboBox getComboBoxBooks() {
		return comboBoxBooks;
	}

	public void setComboBoxBooks(JComboBox comboBoxBooks) {
		this.comboBoxBooks = comboBoxBooks;
	}

	public JButton getBtnCadastrar() {
		return btnCadastrar;
	}

	public void setBtnCadastrar(JButton btnCadastrar) {
		this.btnCadastrar = btnCadastrar;
	}
	
	
	
	
}
