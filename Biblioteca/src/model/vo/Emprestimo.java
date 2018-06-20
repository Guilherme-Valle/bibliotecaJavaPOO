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
    private int diasRestantes;  
    private Date dataEmprestimo;
    private Date diaDevolucao;
    private boolean jaFoiRenovado;

    public Emprestimo(int id, Livro livroEmprestimo, Usuario usuarioEmprestimo, int diasRestantes) {
        this.id = id;
        this.livroEmprestimo = livroEmprestimo;
        this.usuarioEmprestimo = usuarioEmprestimo;
        this.diasRestantes = diasRestantes;
        Calendar c = Calendar.getInstance();
        this.dataEmprestimo = c.getTime();
        this.diaDevolucao = this.dataEmprestimo;
        this.diaDevolucao.setDate(this.diaDevolucao.getDate()+diasRestantes);     
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

    public int getDiasRestantes() {
        return diasRestantes;
    }

    public void setDiasRestantes(int diasRestantes) {
        this.diasRestantes = diasRestantes;
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
            this.diasRestantes+= diasRenovados;
            this.setJaFoiRenovado(true);
        }
    }    
}
