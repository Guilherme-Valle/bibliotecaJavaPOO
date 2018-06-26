/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.vo;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author guido
 */
public class Emprestimo {
    private int id;
    private Livro livroEmprestimo;
    private Usuario usuarioEmprestimo; 
    private Date dataEmprestimo;
    private Date diaDevolucao;
    private boolean jaFoiRenovado;
    
    public final static int diasEmprestimoProfessor = 30;
    public final static int diasEmprestimoAluno = 15;
    public final static int diasEmprestimoExterno = 7;


        
    

    public Emprestimo(int id, Livro livroEmprestimo, Usuario usuarioEmprestimo) {
        this.id = id;
        this.livroEmprestimo = livroEmprestimo;
        this.usuarioEmprestimo = usuarioEmprestimo;
        Calendar c = Calendar.getInstance();
        this.dataEmprestimo = c.getTime();
        this.diaDevolucao = this.dataEmprestimo;
        if (usuarioEmprestimo instanceof Externo){
            this.diaDevolucao.setDate(this.diaDevolucao.getDate()+diasEmprestimoExterno);     
        } else if (usuarioEmprestimo instanceof Aluno){
            this.diaDevolucao.setDate(this.diaDevolucao.getDate()+diasEmprestimoAluno);     
        } else if (usuarioEmprestimo instanceof Professor){
            this.diaDevolucao.setDate(this.diaDevolucao.getDate()+diasEmprestimoProfessor);     
        }
        this.jaFoiRenovado = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDiaDevolucao() {
        return diaDevolucao;
    }

    public void setDiaDevolucao(Date diaDevolucao) {
        this.diaDevolucao = diaDevolucao;
    }
    
    
    public Livro getLivroEmprestimo() {
        return livroEmprestimo;
    }

    public void setLivroEmprestimo(Livro livroEmprestimo) {
        this.livroEmprestimo = livroEmprestimo;
    }

    public Usuario getUsuarioEmprestimo() {
        return usuarioEmprestimo;
    }

    public void setUsuarioEmprestimo(Usuario usuarioEmprestimo) {
        this.usuarioEmprestimo = usuarioEmprestimo;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public boolean isJaFoiRenovado() {
        return jaFoiRenovado;
    }

    public void setJaFoiRenovado(boolean jaFoiRenovado) {
        this.jaFoiRenovado = jaFoiRenovado;
    }
    
    public void renovarEmprestimo (int diasRenovados){
        if (this.jaFoiRenovado){
            System.out.println("Este empréstimo já foi renovado.");
        } else {
            this.diaDevolucao.setDate(this.diaDevolucao.getDate()+diasRenovados);
            this.setJaFoiRenovado(true);
        }
    }

}
