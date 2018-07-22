package controller;

import model.dao.BibliotecaDAO;
import model.vo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.TelaCadastroLivro;

public class ControllerCadastraLivro {
	
	private TelaCadastroLivro the_view;

	
	public ControllerCadastraLivro (TelaCadastroLivro view){
		this.the_view = view;
		the_view.addListenerBtnCadastrar(new listenerBtnCadastrar());
	}
	
	class listenerBtnCadastrar implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			String txtTit = "";
			String txtAut = "";
			String txtEdit = "";
			String txtDat = "";
			String txtVol = "";
			String txtEdic = "";
			int qtdExemp;
					
            try {
            	
                txtTit = the_view.getTxtTit().getText();
                txtAut = the_view.getTxtAut().getText();
                txtEdit = the_view.getTxtEdit().getText();
                txtDat = the_view.getTxtDat().getText();
                txtVol = the_view.getTxtVol().getText();
                txtEdic = the_view.getTxtEdic().getText();
                qtdExemp = Integer.parseInt(the_view.getTxtQtd().getText());
                BibliotecaDAO biblioteca = new BibliotecaDAO();
                
                biblioteca.cadastraLivro(txtTit, txtAut, txtEdit, txtDat, txtVol, txtEdic, qtdExemp);
                
                
                
                  	
            } catch (Exception nfex) {
                JOptionPane.showMessageDialog(null, "deu merda");
            }
        
			
		}
		
		
	}
}
