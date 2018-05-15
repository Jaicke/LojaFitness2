/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author EDVALDO
 */
public class Login {
    private String usuario;
    private String senha;
    private boolean Adm;//atributo para verificar se é adm
    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdm() {
        return Adm;
    }

    public void setAdm(boolean isAdm) {
        this.Adm = isAdm;
    }
    
    
}
