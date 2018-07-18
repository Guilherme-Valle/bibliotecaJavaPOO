package view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class TelaMenuPrincipal extends JFrame {
	
	private JButton btnCadastrarUsuario = new JButton("Cadastrar usuário");
	private JButton btnCadastrarLivro = new JButton("Cadastrar livro");
	private JButton btnReserva = new JButton("Realizar reserva");
	private JButton btnCadastrarEmprestimo = new JButton("Cadastrar empréstimo");
	private JButton btnListaEmprestimos = new JButton("Exibir empréstimos");
	private JButton btnListaLivros = new JButton("Exibir livros");
	private JButton btnLogoff = new JButton("Logoff");
	
	public TelaMenuPrincipal() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 23, 514, 405);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		
		btnCadastrarUsuario.setBounds(12, 304, 215, 25);
	
		panel.add(btnCadastrarUsuario);
		
		
		btnCadastrarLivro.setBounds(255, 304, 215, 25);
		
		panel.add(btnCadastrarLivro);
		
		
		btnReserva.setBounds(255, 257, 215, 25);
		
		panel.add(btnReserva);
		
		
		btnCadastrarEmprestimo.setBounds(12, 346, 215, 25);
		
		panel.add(btnCadastrarEmprestimo);
		
		
		btnListaEmprestimos.setBounds(255, 346, 215, 25);
		
		panel.add(btnListaEmprestimos);
		
		
		btnListaLivros.setBounds(12, 257, 215, 25);
		
		panel.add(btnListaLivros);
		
		JLabel lblBemvindoAoMenu = new JLabel("Bem-vindo ao Menu Principal");
		lblBemvindoAoMenu.setBounds(123, 12, 223, 25);
		panel.add(lblBemvindoAoMenu);
		
		
		btnLogoff.setBounds(353, 12, 117, 25);
		
		panel.add(btnLogoff);
		
		JLabel labelImg = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/biblioteca-dom-bosco-piracicaba.png")).getImage();
		labelImg.setIcon(new ImageIcon(img));
		labelImg.setBounds(27, 51, 443, 179);
		panel.add(labelImg);
		
	}
	
	public void addListenerCadastrarUsuario(ActionListener e){
		btnCadastrarUsuario.addActionListener(e);
		
	}
	
	public void addListenerCadastrarEmprestimo(ActionListener e){
		btnCadastrarEmprestimo.addActionListener(e);
		
	}
	
	public void addListenerCadastrarLivro(ActionListener e){
		btnCadastrarLivro.addActionListener(e);
		
	}
	
	public void addListenerReserva (ActionListener e){
		btnReserva.addActionListener(e);
		
	}
	
	public void addListenerListarLivros(ActionListener e){
		btnListaLivros.addActionListener(e);
		
	}
	
	public void addListenerListarEmprestimos(ActionListener e){
		btnListaEmprestimos.addActionListener(e);
		
	}
	
	public void addListenerLogoff(ActionListener e){
		btnLogoff.addActionListener(e);
		
	}
	
	
	
	

	
}
