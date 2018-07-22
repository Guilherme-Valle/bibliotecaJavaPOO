/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

/**
 *
 * @author guido
 */
public class Biblioteca implements Serializable {
	
	private static final long serialVersionUID = 6529685098267757690L;
	private int id;
    private HashSet<Usuario> usuarios;
    private HashSet<Livro> livros;
    private ArrayList<Emprestimo> emprestimos;
    private String nome;

    

    public Biblioteca(String nome, int id) {
    	this.id = id;
        this.nome = nome;
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
    
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario retornaUsuario (int id){
        for (Usuario i : this.usuarios){
            if (i.getId()==id){
                return i;
            }
        }
        return null;
    }
    
    public Integer pesquisaIdUsuarioPorNome (String nome){
        for (Usuario i : this.usuarios){
            if (i.getNome().equals(nome)){
                return i.getId();
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
     
     public HashSet<Livro> retornaLivrosEmprestaveis() {
    	 
    	 HashSet<Livro> livros = new HashSet();
    	 for (Livro i : this.livros){
    		 if (i.getQtdVolumes() > 0 && i.getVolumesReservados() < i.getQtdVolumes()){
    			 livros.add(i);
    		 } 
    	 }
    	 return livros;
     }
     
public HashSet<Usuario> retornaUsuariosEmprestaveis() {
    	 
    	 HashSet<Usuario> usuarios = new HashSet();
    	 for (Usuario i : this.usuarios){
    		if (i.debitos == 0){
    			usuarios.add(i);
    			
    		}
    		  
    	 }
    	 return usuarios;
     }
     
     
     
     public Integer pesquisaIdLivroPorNome (String nome){
        for (Livro i : this.livros){
            if (i.getTitulo().equals(nome)){
                return i.getId();
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
    
    public void livroEmprestado (int idLivro){
    	for (Livro i : this.livros){
    		if (i.getId() == idLivro){
    			int qtdAtual = i.getQtdVolumes();
    			qtdAtual--;
    			i.setQtdVolumes(qtdAtual);
    			
    		}
    		
    	}
    	
    }
    
    public void cadastraEmprestimo (int idUsuario, int idLivro){
        Usuario user = retornaUsuario(idUsuario);
        Livro liv = retornaLivro(idLivro);
        if (liv != null && user != null && liv.getQtdVolumes() > 0){           
            Random gerador = new Random();
            Emprestimo emprestimo = new Emprestimo(gerador.nextInt(2500), liv, user);
            this.livroEmprestado(idLivro);
            this.emprestimos.add(emprestimo);
            System.out.println("Empréstimo realizado com sucesso.");
        } else {    
            System.out.println("Empresto não pode ser realizado. Chegue o usuário, o livro e a quantidade de volumes"
                    + " disponíveis.");
        }
    } 
    
  public void cadastrarProfessor (String nome, String telefone, String dataNascimento, String codigo, String dpt){
      Random gerador = new Random();
      Usuario p = new Professor(gerador.nextInt(25000), nome, telefone, dataNascimento, 0, this.getId(), dpt, codigo);
      
      try {
        this.usuarios.add(p);
      } catch (Exception e){
          e.printStackTrace();
      }
  }
  
   public void cadastrarAluno (String nome, String telefone, String dataNascimento, String matriculaAluno, int anoAluno){
      Random gerador = new Random();
      Usuario p = new Aluno(gerador.nextInt(25000), nome, telefone, dataNascimento, 0, this.getId(), matriculaAluno, anoAluno);
      
      try {
        this.usuarios.add(p);
      } catch (Exception e){
          e.printStackTrace();
      }
  }
   
    public void cadastrarExterno (String nome, String telefone, String dataNascimento, String tipoUsuario, String cod){
      Random gerador = new Random();
      Usuario p = new Externo(gerador.nextInt(25000), nome, telefone, dataNascimento, 0, this.getId(), cod, tipoUsuario);
      
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
    	Date d = new Date(System.currentTimeMillis());
        for (Emprestimo e : this.emprestimos){
            if (e.getDiaDevolucao().before(d)){
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
    
    public void listarLivros (){
    	for (Livro e : this.livros){
    		JOptionPane.showMessageDialog(null, e.getTitulo());
    		
    	}
    	
    }
    
    public void listarEmprestimos (){
    	for (Emprestimo e : this.emprestimos){
    		
    		Date hoje = new Date(System.currentTimeMillis());
    		long diasRestantes = e.getDiaDevolucao().getTime() - hoje.getTime();
    		JOptionPane.showMessageDialog(null, "Usuário: "+e.getUsuarioEmprestimo().getNome()+"\nLivro: "+e.getLivroEmprestimo().getTitulo()+
    				"\n ID do empréstimo: "+e.getId()+"\n Dias restantes: " +TimeUnit.MILLISECONDS.toDays(diasRestantes));
    		
    	}
    	
    }
    
    
    @Override
    public String toString() {
        return "Biblioteca{" + "usuarios=" + usuarios + ", livros=" + livros + ", emprestimos=" + emprestimos + '}';
    }
    		    
    
    
}


