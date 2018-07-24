package view;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class TelaFinalizaEmprestimo extends JFrame {
	
	
	JComboBox comboBoxEmprestimos = new JComboBox();
	JButton btnRemover = new JButton("Devolver livro");
	
	public TelaFinalizaEmprestimo() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 12, 450, 360);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEmprstimos = new JLabel("Empréstimos");
		lblEmprstimos.setBounds(151, 77, 133, 15);
		panel.add(lblEmprstimos);
		
		
		comboBoxEmprestimos.setBounds(119, 128, 172, 24);
		panel.add(comboBoxEmprestimos);
		
		
		btnRemover.setBounds(119, 176, 172, 67);
		panel.add(btnRemover);
	}

	public JComboBox getComboBoxEmprestimos() {
		return comboBoxEmprestimos;
	}

	public void setComboBoxEmprestimos(JComboBox comboBoxEmprestimos) {
		this.comboBoxEmprestimos = comboBoxEmprestimos;
	}

	public JButton getBtnRemover() {
		return btnRemover;
	}

	public void setBtnRemover(JButton btnRemover) {
		this.btnRemover = btnRemover;
	}
	
	public void addActionListenerBtnRemover (ActionListener e){
		this.btnRemover.addActionListener(e);
	
		
		
	}
	

}
