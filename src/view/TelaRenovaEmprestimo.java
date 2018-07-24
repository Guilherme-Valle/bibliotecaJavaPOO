package view;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;

public class TelaRenovaEmprestimo extends JFrame {
	private JComboBox comboBoxEmprestimos = new JComboBox();
	JButton btnRenovar = new JButton("Renovar");
	private final JLabel lblNewLabel = new JLabel("Por quantos dias?");
	private JTextField textFieldDiasRenovacao;
	public TelaRenovaEmprestimo() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 23, 462, 386);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEmprstimosRenovveis = new JLabel("Empréstimos registrados");
		lblEmprstimosRenovveis.setBounds(124, 79, 199, 41);
		panel.add(lblEmprstimosRenovveis);
		
		
		comboBoxEmprestimos.setBounds(124, 132, 179, 24);
		panel.add(comboBoxEmprestimos);
		
		
		btnRenovar.setBounds(124, 292, 177, 55);
		panel.add(btnRenovar);
		lblNewLabel.setBounds(151, 180, 152, 15);
		
		panel.add(lblNewLabel);
		
		textFieldDiasRenovacao = new JTextField();
		textFieldDiasRenovacao.setBounds(182, 207, 61, 19);
		panel.add(textFieldDiasRenovacao);
		textFieldDiasRenovacao.setColumns(10);
	}
	
	
	public void addListenerBtnRenovar (ActionListener e){
		this.btnRenovar.addActionListener(e);
	}


	public JTextField getTextFieldDiasRenovacao() {
		return textFieldDiasRenovacao;
	}


	public void setTextFieldDiasRenovacao(JTextField textFieldDiasRenovacao) {
		this.textFieldDiasRenovacao = textFieldDiasRenovacao;
	}


	public JComboBox getComboBoxEmprestimos() {
		return comboBoxEmprestimos;
	}


	public void setComboBoxEmprestimos(JComboBox comboBoxEmprestimos) {
		this.comboBoxEmprestimos = comboBoxEmprestimos;
	}


	public JButton getBtnRenovar() {
		return btnRenovar;
	}


	public void setBtnRenovar(JButton btnRenovar) {
		this.btnRenovar = btnRenovar;
	}
}
