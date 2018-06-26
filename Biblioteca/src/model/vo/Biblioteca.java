/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.vo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
    private Date diaSistema;
    

    public Biblioteca(String nome, Administrador adm) {
        this.nome = nome;
        this.adm = adm;
        this.usuarios = new HashSet<Usuario>();
        this.livros = new HashSet<Livro>();
        this.emprestimos = new ArrayList<Emprestimo>();
        Calendar c = Calendar.getInstance();
        this.diaSistema =  c.getTime();
    }

    public Date getDiaSistema() {
        return diaSistema;
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
        if (liv != null && user != null && liv.getQtdVolumes() > 0){           
            Random gerador = new Random();
            Emprestimo emprestimo = new Emprestimo(gerador.nextInt(2500), liv, user);
            this.emprestimos.add(emprestimo);
            System.out.println("Empréstimo realizado com sucesso.");
        } else {    
            System.out.println("Empresto não pode ser realizado. Chegue o usuário, o livro e a quantidade de volumes"
                    + " disponíveis.");
        }
    } 
    
  public void cadastrarProfessor (String nome, String telefone, String dataNascimento, String codigo, String dpt){
      Random gerador = new Random();
      Usuario p = new Professor(gerador.nextInt(25000), nome, telefone, dataNascimento, 0, codigo, dpt);
      
      try {
        this.usuarios.add(p);
      } catch (Exception e){
          e.printStackTrace();
      }
  }
  
   public void cadastrarAluno (String nome, String telefone, String dataNascimento, String matriculaAluno, int anoAluno){
      Random gerador = new Random();
      Usuario p = new Aluno(gerador.nextInt(25000), nome, telefone, dataNascimento, 0, matriculaAluno, anoAluno);
      
      try {
        this.usuarios.add(p);
      } catch (Exception e){
          e.printStackTrace();
      }
  }
   
    public void cadastrarExterno (String nome, String telefone, String dataNascimento, String tipoUsuario){
      Random gerador = new Random();
      Usuario p = new Externo(gerador.nextInt(25000), nome, telefone, dataNascimento, 0, tipoUsuario);
      
      try {
        this.usuarios.add(p);
      } catch (Exception e){
          e.printStackTrace();
      }
  }
    
    public void cadastrarLivro (String titulo, String autor, String editora, String dataLancamento, String volume, String edicao, int qtdVolumes){
       Random gerador = new Random();
       Livro l = new Livro(gerador.nextInt(2500), titulo, autor, editora, dataLancamento, volume, edicao, qtdVolumes);
       
       try {
           this.livros.add(l);
       } catch (Exception e){
           e.printStackTrace();
       }
    }
    
    public void verificarEmprestimo (){
        for (Emprestimo e : this.emprestimos){
            if (e.getDiaDevolucao().before(this.diaSistema)){
                if (e.getUsuarioEmprestimo() instanceof Aluno){
                    e.getUsuarioEmprestimo().setDebitos(e.getUsuarioEmprestimo().getDebitos()+5);
                } else if (e.getUsuarioEmprestimo() instanceof Professor){
                    e.getUsuarioEmprestimo().setDebitos(e.getUsuarioEmprestimo().getDebitos()+2);
                } else if (e.getUsuarioEmprestimo() instanceof Externo){
                    e.getUsuarioEmprestimo().setDebitos(e.getUsuarioEmprestimo().getDebitos()+10);
                }
            }
        }
    }
    
    @Override
    public String toString() {
        return "Biblioteca{" + "usuarios=" + usuarios + ", livros=" + livros + ", emprestimos=" + emprestimos + '}';
    }
    
    
}


