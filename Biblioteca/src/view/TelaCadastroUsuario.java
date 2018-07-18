package view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaCadastroUsuario extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public TelaCadastroUsuario() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 24, 450, 392);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTipoDeUsurio = new JLabel("Tipo de usuário:");
		lblTipoDeUsurio.setBounds(12, 24, 115, 15);
		panel.add(lblTipoDeUsurio);
		
		JRadioButton rdbtnProfessor = new JRadioButton("Professor");
		rdbtnProfessor.setBounds(12, 47, 149, 23);
		panel.add(rdbtnProfessor);
		
		JRadioButton rdbtnAluno = new JRadioButton("Aluno");
		rdbtnAluno.setBounds(12, 74, 149, 23);
		panel.add(rdbtnAluno);
		
		JRadioButton rdbtnExterno = new JRadioButton("Usuário externo");
		rdbtnExterno.setBounds(12, 101, 149, 23);
		panel.add(rdbtnExterno);
		
		JLabel lblNewLabel = new JLabel("Nome: ");
		lblNewLabel.setBounds(12, 157, 75, 17);
		panel.add(lblNewLabel);
		
		JTextField txtNome = new JTextField();
		txtNome.setBounds(63, 156, 219, 19);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Telefone: ");
		lblNewLabel_1.setBounds(12, 186, 75, 15);
		panel.add(lblNewLabel_1);
		
		JTextField txtTel = new JTextField();
		txtTel.setColumns(10);
		txtTel.setBounds(83, 186, 219, 19);
		panel.add(txtTel);
		
		JLabel lblDataDeNascimento = new JLabel("Data de nascimento: ");
		lblDataDeNascimento.setBounds(12, 213, 179, 15);
		panel.add(lblDataDeNascimento);
		
		JTextField txtNasc = new JTextField();
		txtNasc.setBounds(171, 211, 114, 19);
		panel.add(txtNasc);
		txtNasc.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(12, 331, 317, 25);
		panel.add(btnCadastrar);
		
		JLabel labelIcon = new JLabel("");
		Image icon = new ImageIcon(this.getClass().getResource("/iconUser.png")).getImage();
		labelIcon.setIcon(new ImageIcon(icon));
		labelIcon.setBounds(228, 12, 149, 110);
		panel.add(labelIcon);
		
		
		
		JLabel lblCadastroDeUsurio = new JLabel("Cadastro de Usuário");
		lblCadastroDeUsurio.setBounds(12, 0, 154, 29);
		getContentPane().add(lblCadastroDeUsurio);
	}
}
