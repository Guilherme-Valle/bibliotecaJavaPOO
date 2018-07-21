package view;

import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaCadastroLivro extends JFrame {
	JTextField txtTit = new JTextField();
	JTextField txtAut = new JTextField();
	JTextField txtEdit = new JTextField();
	JTextField txtDat = new JTextField();
	JTextField txtVol = new JTextField();
	JTextField txtEdic = new JTextField();
	JTextField txtQtd = new JTextField();
	JButton btnCadastrar = new JButton("Cadastrar");
	
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
		
		
		txtTit.setBounds(65, 23, 180, 19);
		panel.add(txtTit);
		txtTit.setColumns(10);
		
		
		txtAut.setColumns(10);
		txtAut.setBounds(75, 50, 172, 19);
		panel.add(txtAut);
		
		
		txtEdit.setColumns(10);
		txtEdit.setBounds(85, 77, 162, 19);
		panel.add(txtEdit);
		
		
		txtDat.setColumns(10);
		txtDat.setBounds(143, 102, 121, 19);
		panel.add(txtDat);
		
		
		txtVol.setColumns(10);
		txtVol.setBounds(75, 129, 96, 19);
		panel.add(txtVol);
		
		
		txtEdic.setColumns(10);
		txtEdic.setBounds(75, 156, 96, 19);
		panel.add(txtEdic);
		
		JLabel lblQuantosExemplares = new JLabel("Quantos exemplares?");
		lblQuantosExemplares.setBounds(12, 185, 195, 15);
		panel.add(lblQuantosExemplares);
		
		
		txtQtd.setBounds(184, 183, 48, 19);
		panel.add(txtQtd);
		txtQtd.setColumns(10);
		
		JLabel labelIcon = new JLabel("");
		Image icon = new ImageIcon(this.getClass().getResource("/iconBook.png")).getImage();
		labelIcon.setIcon(new ImageIcon(icon));
		labelIcon.setBounds(282, 0, 143, 134);
		panel.add(labelIcon);
		
		
		btnCadastrar.setBounds(12, 212, 233, 25);
		panel.add(btnCadastrar);
		
		JLabel lblCadastroDeLivro = new JLabel("Cadastro de Livro:");
		lblCadastroDeLivro.setBounds(12, 12, 130, 15);
		getContentPane().add(lblCadastroDeLivro);
	}


	public JTextField getTxtTit() {
		return txtTit;
	}


	public void setTxtTit(JTextField txtTit) {
		this.txtTit = txtTit;
	}


	public JTextField getTxtAut() {
		return txtAut;
	}


	public void setTxtAut(JTextField txtAut) {
		this.txtAut = txtAut;
	}


	public JTextField getTxtEdit() {
		return txtEdit;
	}


	public void setTxtEdit(JTextField txtEdit) {
		this.txtEdit = txtEdit;
	}


	public JTextField getTxtDat() {
		return txtDat;
	}


	public void setTxtDat(JTextField txtDat) {
		this.txtDat = txtDat;
	}


	public JTextField getTxtVol() {
		return txtVol;
	}


	public void setTxtVol(JTextField txtVol) {
		this.txtVol = txtVol;
	}


	public JTextField getTxtEdic() {
		return txtEdic;
	}


	public void setTxtEdic(JTextField txtEdic) {
		this.txtEdic = txtEdic;
	}


	public JTextField getTxtQtd() {
		return txtQtd;
	}


	public void setTxtQtd(JTextField txtQtd) {
		this.txtQtd = txtQtd;
	}
	
	public void addListenerBtnCadastrar (ActionListener e){
		btnCadastrar.addActionListener(e);
		
	}
	
	
	

}
