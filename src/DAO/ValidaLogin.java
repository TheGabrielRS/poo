/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import modelo.outros.Usuario;

/**
 *
 * @author GabrielRS
 */
public class ValidaLogin {
    
    public boolean validaLogin(String usuario, String senha)
    {
        URL location = ValidaLogin.class.getProtectionDomain().getCodeSource().getLocation();

        BuscaArquivo arquivo = new BuscaArquivo();
        LinkedList<ArrayList> usuarios = new LinkedList<ArrayList>();
        ArrayList<String> dadosUsuario;
        
        usuarios = (LinkedList<ArrayList>)arquivo.leArquivo(location.getFile()+"/DAO/usuarios.csv");
        
        for(int x=0; x < usuarios.size(); x++)
        {
            dadosUsuario = (ArrayList<String>)usuarios.get(x);
            if(new Usuario(usuario, senha).login(dadosUsuario.get(0), dadosUsuario.get(1)))
                return true;
        }
        
        return false;
    }
    
}
