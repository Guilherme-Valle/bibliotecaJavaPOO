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
public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private String editora;
    private String dataLancamento;
    private String volume;
    private String edicao;
    private int qtdVolumes;

    public Livro(int id, String titulo, String autor, String editora, String dataLancamento, String volume, String edicao, int qtdVolumes) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.dataLancamento = dataLancamento;
        this.volume = volume;
        this.edicao = edicao;
        this.qtdVolumes = qtdVolumes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public int getQtdVolumes() {
        return qtdVolumes;
    }

    public void setQtdVolumes(int qtdVolumes) {
        this.qtdVolumes = qtdVolumes;
    }
    
    
}
