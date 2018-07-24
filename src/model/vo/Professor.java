/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.vo;

import java.io.Serializable;

/**
 *
 * @author guido
 */
public class Professor extends Usuario implements Serializable {
    
   

	private String codigoProfessor;
    private String departamentoProfessor;
    
     public Professor(int id, String nome, String telefone,
			String dataNascimento, double debitos, int idBiblioteca, String cod, String dpto) {
		super(id, nome, telefone, dataNascimento, debitos, idBiblioteca);
		this.codigoProfessor = cod;
		this.departamentoProfessor = dpto;
	}

    public String getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(String codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    public String getDepartamentoProfessor() {
        return departamentoProfessor;
    }

    public void setDepartamentoProfessor(String departamentoProfessor) {
        this.departamentoProfessor = departamentoProfessor;
    }
    
   
}
