/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.vo;

import java.awt.Toolkit;

import controller.ControllerMainMenu;
import view.TelaMenuPrincipal;

/**
 *
 * @author guilherme
 */
public class Main {
    public static void main(String[] args){
    	
    	/**
    	 * Classe Main para instanciar o menu
    	 * 
    	 * @param args
    	 * 
    	 * @throws nothing
    	 */
    	
        TelaMenuPrincipal theView = new TelaMenuPrincipal();
        ControllerMainMenu theController = new ControllerMainMenu(theView);
        
        theView.setExtendedState(theView.MAXIMIZED_BOTH);	
        theView.setVisible(true);
  


        
       
    }
}
