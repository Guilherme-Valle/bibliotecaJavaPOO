package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Image;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaLogin extends JFrame {
	private JTextField txtLogin;
	private JTextField txtSenha;
	public TelaLogin() {
		setTitle("Biblioteca");
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 24, 450, 276);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(126, 150, 70, 15);
		panel.add(lblNewLabel);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(179, 148, 114, 19);
		panel.add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(126, 177, 70, 15);
		panel.add(lblSenha);
		
		txtSenha = new JTextField();
		txtSenha.setBounds(179, 175, 114, 19);
		panel.add(txtSenha);
		txtSenha.setColumns(10);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setBounds(179, 204, 117, 25);
		panel.add(btnNewButton);
		
		JLabel lblImg = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/libraryicon.png")).getImage();
		lblImg.setIcon(new ImageIcon(img));
		lblImg.setBounds(126, 0, 200, 126);
		panel.add(lblImg);
		
		
		
		
		
	}
	public String getLogin(){
		return txtLogin.getText().toString();
	}
	
	
	public String getSenha(){
		return txtSenha.getText().toString();
	}
}
