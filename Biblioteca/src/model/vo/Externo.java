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
public class Externo extends Usuario implements Serializable {
    
   

	private String tipoDeUsuario;
    private String codigoIdentificafor;
    
    
     public Externo(int id, String nome, String telefone, String dataNascimento,
			double debitos, int idBiblioteca, String tipo, String cod) {
		super(id, nome, telefone, dataNascimento, debitos, idBiblioteca);
		this.tipoDeUsuario = tipo;
		this.codigoIdentificafor = cod;
	}

    public String getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(String tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }

	public String getCodigoIdentificafor() {
		return codigoIdentificafor;
	}

	public void setCodigoIdentificafor(String codigoIdentificafor) {
		this.codigoIdentificafor = codigoIdentificafor;
	}
    
    
    
    
}
