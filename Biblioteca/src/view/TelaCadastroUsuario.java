package view;

import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;

public class TelaCadastroUsuario extends JFrame {
	private JTextField txtNome = new JTextField();
	private JTextField txtTel = new JTextField();
	private JTextField txtNasc = new JTextField();
	private JRadioButton rdbtnProfessor = new JRadioButton("Professor");
	private JRadioButton rdbtnAluno = new JRadioButton("Aluno"); 
	private JRadioButton rdbtnExterno = new JRadioButton("Usuário externo");
	
	
	private JPanel panel = new JPanel();
	
	
	private JButton btnCadastrar = new JButton("Cadastrar");
	
	
	private final JTextField txtMatAluno = new JTextField();
	private final JTextField txtAnoAluno = new JTextField();
	private final JLabel lblMatAluno = new JLabel("Matricula: ");
	private final JLabel lblAnoAluno = new JLabel("Ano: ");
	private final JTextField txtCodigoProf = new JTextField();
	private final JTextField txtDeptProf = new JTextField();
	private final JLabel lblCodProf = new JLabel("Codigo: ");
	private final JLabel lblDptProf = new JLabel("Dpto: ");
	private final JLabel lblTipoExt = new JLabel ("Tipo:");
	private final JLabel lblCodExt = new JLabel("Codigo:");
	private final JTextField txtTipoExt = new JTextField();
	private final JTextField txtCodExt = new JTextField();

	
	
	private JTextField textField;
	private JPanel panel_aluno = new JPanel();
	private JPanel panel_prof = new JPanel();
	private JPanel panel_ext = new JPanel();
	
	
	private final JTextField textField_1 = new JTextField();
	private final JLabel lblNewLabel_2 = new JLabel("New label");
	private final JTextField textField_2 = new JTextField();
	
	
	public TelaCadastroUsuario() {
		
		
		getContentPane().setLayout(null);
		
		
		panel.setBounds(0, 24, 420, 232);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTipoDeUsurio = new JLabel("Tipo de usuário:");
		lblTipoDeUsurio.setBounds(12, 24, 115, 15);
		panel.add(lblTipoDeUsurio);
		
		
		ButtonGroup bt1 = new ButtonGroup();
		rdbtnProfessor.setBounds(12, 47, 149, 23);
		panel.add(rdbtnProfessor);
		rdbtnAluno.setBounds(12, 74, 149, 23);
		panel.add(rdbtnAluno);
		rdbtnExterno.setBounds(12, 101, 149, 23);
		panel.add(rdbtnExterno);
		
		bt1.add(rdbtnAluno);
		bt1.add(rdbtnExterno);
		bt1.add(rdbtnProfessor);
		
		
		JLabel lblNewLabel = new JLabel("Nome: ");
		lblNewLabel.setBounds(12, 157, 75, 17);
		panel.add(lblNewLabel);
		
		txtNome.setBounds(63, 156, 219, 19);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Telefone: ");
		lblNewLabel_1.setBounds(12, 186, 75, 15);
		panel.add(lblNewLabel_1);
		
		
		txtTel.setColumns(10);
		txtTel.setBounds(83, 186, 219, 19);
		panel.add(txtTel);
		
		JLabel lblDataDeNascimento = new JLabel("Data de nascimento: ");
		lblDataDeNascimento.setBounds(12, 213, 179, 15);
		panel.add(lblDataDeNascimento);
		
		
		txtNasc.setBounds(171, 211, 114, 19);
		panel.add(txtNasc);
		txtNasc.setColumns(10);
		
		
		btnCadastrar.setBounds(12, 330, 317, 25);
		
		
		JLabel labelIcon = new JLabel("");
		Image icon = new ImageIcon(this.getClass().getResource("/iconUser.png")).getImage();
		labelIcon.setIcon(new ImageIcon(icon));
		labelIcon.setBounds(228, 12, 149, 110);
		panel.add(labelIcon);
		
		
		
	
		
		JLabel lblCadastroDeUsurio = new JLabel("Cadastro de Usuário");
		lblCadastroDeUsurio.setBounds(12, 0, 154, 29);
		getContentPane().add(lblCadastroDeUsurio);
		
		
		getContentPane().add(panel_aluno);
		panel_aluno.setBounds(10, 268, 398, 116);	
		txtAnoAluno.setBounds(80, 25, 114, 19);
		txtAnoAluno.setColumns(10);
		txtMatAluno.setBounds(80, -2, 114, 19);
		txtMatAluno.setColumns(10);
		lblMatAluno.setBounds(0, 0, 85, 15);
		lblAnoAluno.setBounds(0, 27, 70, 15);
		panel_aluno.add(lblMatAluno);
		panel_aluno.add(txtMatAluno);
		panel_aluno.add(lblAnoAluno);
		panel_aluno.add(txtAnoAluno);
		
		panel_aluno.setVisible(false);
		panel_aluno.setLayout(null);
		
		txtCodigoProf.setBounds(80, 25, 114, 19);
		txtCodigoProf.setColumns(10);
		txtDeptProf.setBounds(80, -2, 114, 19);
		txtDeptProf.setColumns(10);
		panel_prof.setBounds(10, 268, 398, 116);
		getContentPane().add(panel_prof);
		panel_prof.setVisible(false);
		panel_prof.setLayout(null);
		lblCodProf.setBounds(0, 0, 85, 15);
		panel_prof.add(lblCodProf);
		panel_prof.add(txtCodigoProf);
		lblDptProf.setBounds(0, 27, 70, 15);
		panel_prof.add(lblDptProf);
		panel_prof.add(txtDeptProf);
		
		
		
		txtCodExt.setBounds(80, 25, 114, 19);
		txtCodExt.setColumns(10);
		txtTipoExt.setBounds(80, -2, 114, 19);
		txtTipoExt.setColumns(10);
		panel_ext.setBounds(10, 268, 398, 116);
		getContentPane().add(panel_ext);
		panel_ext.setVisible(false);
		panel_ext.setLayout(null);
		lblCodExt.setBounds(0, 0, 85, 15);
		panel_ext.add(lblCodExt);
		panel_ext.add(txtCodExt);
		lblTipoExt.setBounds(0, 27, 70, 15);
		panel_ext.add(lblTipoExt);
		panel_ext.add(txtTipoExt);
		
		
		
		
		
		
		
		
	}
	
	public void addListenerBtnAluno (ActionListener e){
		rdbtnAluno.addActionListener(e);
		
	}
	
	public void addListenerBtnProfessor (ActionListener e){
		rdbtnProfessor.addActionListener(e);
		
	}
	
	public void addListenerBtnExterno (ActionListener e){
		rdbtnExterno.addActionListener(e);
		
	}

	public JTextField getTxtNome() {
		return txtNome;
	}

	public void setTxtNome(JTextField txtNome) {
		this.txtNome = txtNome;
	}

	public JTextField getTxtTel() {
		return txtTel;
	}

	public void setTxtTel(JTextField txtTel) {
		this.txtTel = txtTel;
	}

	public JTextField getTxtNasc() {
		return txtNasc;
	}

	public void setTxtNasc(JTextField txtNasc) {
		this.txtNasc = txtNasc;
	}

	public JRadioButton getRdbtnProfessor() {
		return rdbtnProfessor;
	}

	public void setRdbtnProfessor(JRadioButton rdbtnProfessor) {
		this.rdbtnProfessor = rdbtnProfessor;
	}

	public JRadioButton getRdbtnAluno() {
		return rdbtnAluno;
	}

	public void setRdbtnAluno(JRadioButton rdbtnAluno) {
		this.rdbtnAluno = rdbtnAluno;
	}

	public JRadioButton getRdbtnExterno() {
		return rdbtnExterno;
	}

	public void setRdbtnExterno(JRadioButton rdbtnExterno) {
		this.rdbtnExterno = rdbtnExterno;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JButton getBtnCadastrar() {
		return btnCadastrar;
	}

	public void setBtnCadastrar(JButton btnCadastrar) {
		this.btnCadastrar = btnCadastrar;
	}

	
	
	public JPanel getPanel_Aluno (){
		return this.panel_aluno;
		
	}
	
	public void setPanel_Aluno(JPanel panel){
		this.panel_aluno = panel;
		
	}
	
	public JPanel getPanel_Prof (){
		return this.panel_prof;
		
	}
	
	public void setPanel_Prof(JPanel panel){
		this.panel_prof = panel;
		
	}
	
	public JPanel getPanel_Ext (){
		return this.panel_ext;
		
	}
	
	public void setPanel_Ext(JPanel panel){
		this.panel_ext = panel;
		
	}



	public JLabel getLblAnoAluno() {
		return lblAnoAluno;
	}

	

	public JTextField getTxtAnoAluno() {
		return txtAnoAluno;
	}
}
