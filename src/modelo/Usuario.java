/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author gabrielsa
 */
public class Usuario {
    
    private String usuario;
    private char[] senha;

    public Usuario(String usuario, char[] senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public boolean validaLogin()
    {
        return true;
    }
    
}
