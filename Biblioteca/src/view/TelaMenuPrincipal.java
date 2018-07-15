package view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class TelaMenuPrincipal extends JFrame {
	public TelaMenuPrincipal() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 23, 514, 405);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnCadastrarUsuario = new JButton("Cadastrar usuário");
		btnCadastrarUsuario.setBounds(12, 304, 215, 25);
		panel.add(btnCadastrarUsuario);
		
		JButton btnCadastrarLivro = new JButton("Cadastrar livro");
		btnCadastrarLivro.setBounds(255, 304, 215, 25);
		panel.add(btnCadastrarLivro);
		
		JButton btnReserva = new JButton("Realizar reserva");
		btnReserva.setBounds(255, 257, 215, 25);
		panel.add(btnReserva);
		
		JButton btnCadastrarEmprestimo = new JButton("Cadastrar empréstimo");
		btnCadastrarEmprestimo.setBounds(12, 346, 215, 25);
		panel.add(btnCadastrarEmprestimo);
		
		JButton btnListaEmprestimos = new JButton("Exibir empréstimos");
		btnListaEmprestimos.setBounds(255, 346, 215, 25);
		panel.add(btnListaEmprestimos);
		
		JButton btnListaLivros = new JButton("Exibir livros");
		btnListaLivros.setBounds(12, 257, 215, 25);
		panel.add(btnListaLivros);
		
		JLabel lblBemvindoAoMenu = new JLabel("Bem-vindo ao Menu Principal");
		lblBemvindoAoMenu.setBounds(123, 12, 223, 25);
		panel.add(lblBemvindoAoMenu);
		
		JButton btnLogoff = new JButton("Logoff");
		btnLogoff.setBounds(353, 12, 117, 25);
		panel.add(btnLogoff);
		
		JLabel labelImg = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/biblioteca-dom-bosco-piracicaba.png")).getImage();
		labelImg.setIcon(new ImageIcon(img));
		labelImg.setBounds(27, 51, 443, 179);
		panel.add(labelImg);
	}
}
