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
public class Aluno extends Usuario implements Serializable {
    

	private String matriculaAluno;
    private int anoAluno;
    
    
    public Aluno(int id, String nome, String telefone, String dataNascimento,
			double debitos, int idBiblioteca, String mat, int ano) {
		super(id, nome, telefone, dataNascimento, debitos, idBiblioteca);
		this.matriculaAluno = mat;
		this.anoAluno = ano;
	}

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public int getAnoAluno() {
        return anoAluno;
    }

    public void setAnoAluno(int anoAluno) {
        this.anoAluno = anoAluno;
    }
    
}
