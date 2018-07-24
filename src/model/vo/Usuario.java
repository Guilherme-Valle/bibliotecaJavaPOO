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
public abstract class Usuario implements Serializable {
    protected int id;
    protected String nome;
    protected String telefone;
    protected String dataNascimento;
    protected double debitos;
    protected int idBiblioteca;

    public int getIdBiblioteca() {
		return idBiblioteca;
	}

	public void setIdBiblioteca(int idBiblioteca) {
		this.idBiblioteca = idBiblioteca;
	}

	public Usuario(int id, String nome, String telefone, String dataNascimento, double debitos, int idBiblioteca) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.debitos = 0;
        this.idBiblioteca = idBiblioteca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getDebitos() {
        return debitos;
    }

    public void setDebitos(double debitos) {
        this.debitos = debitos;
    }
    
    public void pagarDebitos (){
        this.setDebitos(0);
        System.out.println("Débitos pagos");
    }

	@Override
	public String toString() {
		return " "+this.getNome()+" ";
	}
    
    
    
}
