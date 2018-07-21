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
public class Externo extends Usuario {
    
    private String tipoDeUsuario;
    private String codigoIdentificafor;
    
    
    public Externo(int id, String nome, String telefone, String dataNascimento, double debitos, String tipoDeUsuario, String codigoId, int FK) {
        super(id, nome, telefone, dataNascimento, debitos, FK);
        this.tipoDeUsuario = tipoDeUsuario;
        this.codigoIdentificafor = codigoId;
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
