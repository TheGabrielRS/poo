/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author gabrielsa
 */
public class Usuario {
    
    private String usuario;
    private String senha;

    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public boolean login(String u, String s)
    {
        if(u.equals(this.usuario) && s.equals(this.senha))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", senha=" + senha + '}';
    }
}
