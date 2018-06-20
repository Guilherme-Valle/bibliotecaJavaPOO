/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.vo;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author guido
 */
public class Biblioteca {
    
    private HashSet<Usuario> usuarios;
    private HashSet<Livro> livros;
    private ArrayList<Emprestimo> emprestimos;
    private String nome;
    private Administrador adm;

    public Biblioteca(String nome, Administrador adm) {
        this.nome = nome;
        this.adm = adm;
        this.usuarios = new HashSet<Usuario>();
        this.livros = new HashSet<Livro>();
        this.emprestimos = new ArrayList<Emprestimo>();
    }

    public HashSet<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(HashSet<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public HashSet<Livro> getLivros() {
        return livros;
    }

    public void setLivros(HashSet<Livro> livros) {
        this.livros = livros;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Administrador getAdm() {
        return adm;
    }

    public void setAdm(Administrador adm) {
        this.adm = adm;
    }
    
    
    
    
}
