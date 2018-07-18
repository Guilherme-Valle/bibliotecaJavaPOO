package view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaCadastroLivro extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	public TelaCadastroLivro() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 25, 443, 272);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Título:");
		lblNewLabel.setBounds(12, 25, 70, 15);
		panel.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Autor:");
		lblNome.setBounds(12, 52, 70, 15);
		panel.add(lblNome);
		
		JLabel label_1 = new JLabel("Editora: ");
		label_1.setBounds(12, 79, 70, 15);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Data lançamento: ");
		label_2.setBounds(12, 104, 169, 15);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Volume: ");
		label_3.setBounds(12, 131, 70, 15);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Edição: ");
		label_4.setBounds(12, 158, 70, 15);
		panel.add(label_4);
		
		JTextField txtTit = new JTextField();
		txtTit.setBounds(65, 23, 180, 19);
		panel.add(txtTit);
		txtTit.setColumns(10);
		
		JTextField txtAut = new JTextField();
		txtAut.setColumns(10);
		txtAut.setBounds(75, 50, 172, 19);
		panel.add(txtAut);
		
		JTextField txtEdit = new JTextField();
		txtEdit.setColumns(10);
		txtEdit.setBounds(85, 77, 162, 19);
		panel.add(txtEdit);
		
		JTextField txtDat = new JTextField();
		txtDat.setColumns(10);
		txtDat.setBounds(143, 102, 121, 19);
		panel.add(txtDat);
		
		JTextField txtVol = new JTextField();
		txtVol.setColumns(10);
		txtVol.setBounds(75, 129, 96, 19);
		panel.add(txtVol);
		
		JTextField txtEdic = new JTextField();
		txtEdic.setColumns(10);
		txtEdic.setBounds(75, 156, 96, 19);
		panel.add(txtEdic);
		
		JLabel lblQuantosExemplares = new JLabel("Quantos exemplares?");
		lblQuantosExemplares.setBounds(12, 185, 195, 15);
		panel.add(lblQuantosExemplares);
		
		JTextField txtQtd = new JTextField();
		txtQtd.setBounds(184, 183, 48, 19);
		panel.add(txtQtd);
		txtQtd.setColumns(10);
		
		JLabel labelIcon = new JLabel("");
		Image icon = new ImageIcon(this.getClass().getResource("/iconBook.png")).getImage();
		labelIcon.setIcon(new ImageIcon(icon));
		labelIcon.setBounds(282, 0, 143, 134);
		panel.add(labelIcon);
		
		JButton btnCada = new JButton("Cadastrar");
		btnCada.setBounds(12, 212, 233, 25);
		panel.add(btnCada);
		
		JLabel lblCadastroDeLivro = new JLabel("Cadastro de Livro:");
		lblCadastroDeLivro.setBounds(12, 12, 130, 15);
		getContentPane().add(lblCadastroDeLivro);
	}
	

}
