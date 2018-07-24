package view;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class TelaPagamentoDebito extends JFrame {
	private JButton btnPagamento = new JButton("Registrar pagamento");
	private JComboBox comboBoxDevedores = new JComboBox();
	public TelaPagamentoDebito() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 22, 450, 278);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblUsuriosDevedores = new JLabel("Usuários devedores");
		lblUsuriosDevedores.setBounds(125, 66, 168, 15);
		panel.add(lblUsuriosDevedores);
		
		
		comboBoxDevedores.setBounds(114, 102, 176, 24);
		panel.add(comboBoxDevedores);
		
		
		btnPagamento.setBounds(108, 146, 185, 51);
		panel.add(btnPagamento);
	}
	public JButton getBtnPagamento() {
		return btnPagamento;
	}
	public void setBtnPagamento(JButton btnPagamento) {
		this.btnPagamento = btnPagamento;
	}
	public JComboBox getComboBoxDevedores() {
		return comboBoxDevedores;
	}
	public void setComboBoxDevedores(JComboBox comboBoxDevedores) {
		this.comboBoxDevedores = comboBoxDevedores;
	}
	
	public void addListenerPagamento (ActionListener e){
		btnPagamento.addActionListener(e);
	}
	
	
	
	

}
