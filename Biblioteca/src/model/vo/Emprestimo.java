/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.vo;

import java.util.Date;

/**
 *
 * @author guido
 */
public class Emprestimo {
    private Livro livroEmprestimo;
    private Usuario usuarioEmprestimo;
    private int diasRestantes;  
    private Date dataEmprestimo;
    private boolean jaFoiRenovado;

    public Emprestimo(Livro livroEmprestimo, Usuario usuarioEmprestimo, int diasRestantes, Date dataEmprestimo) {
        this.livroEmprestimo = livroEmprestimo;
        this.usuarioEmprestimo = usuarioEmprestimo;
        this.diasRestantes = diasRestantes;
        this.dataEmprestimo = dataEmprestimo;
        this.jaFoiRenovado = false;
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
