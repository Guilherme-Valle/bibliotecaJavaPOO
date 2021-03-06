package view;

import java.awt.GridBagLayout;
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
	private JButton btnRenovarEmprestimo = new JButton("Renovar empréstimo");
	private JButton btnCadastrarEmprestimo = new JButton("Cadastrar empréstimo");
	private JButton btnListaEmprestimos = new JButton("Exibir empréstimos");
	private JButton btnListaLivros = new JButton("Exibir livros");
	private JButton btnRelatorio = new JButton("Relatório do sistema");
	private JButton btnFinalizarEmprestimos = new JButton("Registrar devolução");
	private JButton btnPagarDebitos = new JButton("Pagamento de débitos");

	
	public TelaMenuPrincipal() {
		getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 23, 514, 514);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		
		btnCadastrarUsuario.setBounds(12, 304, 215, 25);
	
		panel.add(btnCadastrarUsuario);
		
		
		btnCadastrarLivro.setBounds(255, 304, 215, 25);
		
		panel.add(btnCadastrarLivro);
		
		
		btnRenovarEmprestimo.setBounds(255, 257, 215, 25);
		
		panel.add(btnRenovarEmprestimo);
		
		
		btnCadastrarEmprestimo.setBounds(12, 346, 215, 25);
		
		panel.add(btnCadastrarEmprestimo);
		
		
		btnListaEmprestimos.setBounds(255, 346, 215, 25);
		
		panel.add(btnListaEmprestimos);
		
		
		btnListaLivros.setBounds(12, 257, 215, 25);
		
		panel.add(btnListaLivros);
		
		JLabel lblBemvindoAoMenu = new JLabel("Bem-vindo ao Menu Principal");
		lblBemvindoAoMenu.setBounds(123, 12, 223, 25);
		panel.add(lblBemvindoAoMenu);
		
		JLabel labelImg = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/biblioteca-dom-bosco-piracicaba.png")).getImage();
		labelImg.setIcon(new ImageIcon(img));
		labelImg.setBounds(27, 51, 443, 179);
		
		
		panel.add(labelImg);
		
		btnRelatorio.setBounds(12, 427, 458, 40);
		panel.add(btnRelatorio);
		btnFinalizarEmprestimos.setBounds(12, 383, 215, 25);
		
		panel.add(btnFinalizarEmprestimos);
		btnPagarDebitos.setBounds(255, 383, 215, 25);
		
		panel.add(btnPagarDebitos);
		
		
		
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
	
	public void addListenerRenovarEmprestimo (ActionListener e){
		btnRenovarEmprestimo.addActionListener(e);
		
	}
	
	public void addListenerListarLivros(ActionListener e){
		btnListaLivros.addActionListener(e);
		
	}
	
	public void addListenerListarEmprestimos(ActionListener e){
		btnListaEmprestimos.addActionListener(e);
		
	}
	
	public void addListenerFinalizarEmprestimo (ActionListener e){
		btnFinalizarEmprestimos.addActionListener(e);
		
	}
	
	public void addListenerRelatorio (ActionListener e){
		btnRelatorio.addActionListener(e);
	}
	
	public void addListenerPagar (ActionListener e){
		btnPagarDebitos.addActionListener(e);
		
	}
}
