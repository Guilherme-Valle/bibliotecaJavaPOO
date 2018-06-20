/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.vo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

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
    
    public Usuario retornaUsuario (int id){
        for (Usuario i : this.usuarios){
            if (i.getId()==id){
                return i;
            }
        }
        return null;
    }
    
     public Livro retornaLivro (int id){
        for (Livro i : this.livros){
            if (i.getId()==id){
                return i;
            }
        }
        return null;
    }
     
    public Emprestimo retornaEmprestimo (int id){
        for (Emprestimo i : this.emprestimos){
            if (i.getId()==id){
                return i;
            }
        }
        return null;
    }
    
    public void cadastraEmprestimo (int idUsuario, int idLivro){
        Usuario user = retornaUsuario(idUsuario);
        Livro liv = retornaLivro(idLivro);
        if (liv != null && user != null){
            Emprestimo e;
            Random gerador = new Random();
            if (user instanceof Aluno){
                e = new Emprestimo(gerador.nextInt(250), liv, user, 15);
                this.emprestimos.add(e);
            } else if (user instanceof Professor){
                e = new Emprestimo(gerador.nextInt(250), liv, user, 30);
                this.emprestimos.add(e);
            } else if(user instanceof Externo){     
                e = new Emprestimo(gerador.nextInt(250), liv, user, 7);
                this.emprestimos.add(e);
            }
            System.out.println("Empréstimo realizado com sucesso.");
        } else {
            System.out.println("Empresto não pode ser realizado. Chegue o usuário e o livro.");
        }
    }
    
  
    
    
    
    
    

    @Override
    public String toString() {
        return "Biblioteca{" + "usuarios=" + usuarios + ", livros=" + livros + ", emprestimos=" + emprestimos + '}';
    }
    
    
}
