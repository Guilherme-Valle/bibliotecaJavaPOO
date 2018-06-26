/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.vo;

/**
 *
 * @author guilherme
 */
public class Main {
    public static void main(String[] args){
        Biblioteca b1 = new Biblioteca("Teste da Main", new Administrador("joao", "123", "joao galdino"));
        b1.cadastrarAluno("Joao", "123457", "12/07/1200", "123", 3);
        b1.cadastrarLivro("O livro legal", "Quem souber morre", "UFBA comunista", "12/05/1990", "2" , "2.5", 5);
        
        
        
    }
}
