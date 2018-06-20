/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.vo;

/**
 *
 * @author guido
 */
public class Professor extends Usuario{
    
    private String codigoProfessor;
    private String departamentoProfessor;

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
    
    public Professor(int id, String nome, String telefone, String dataNascimento, double debitos, String codigo, String dpt) {
        super(id, nome, telefone, dataNascimento, debitos);
        this.codigoProfessor = codigo;
        this.departamentoProfessor = dpt;
    }
    
}
