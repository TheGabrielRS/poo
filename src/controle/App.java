/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author marcosvlp
 */
public class App {
    public static void main(String args[]){
        
    try {
        UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
    } 
    catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
        System.out.println(e.getMessage());
    }
        
        ControleTelaLogin ctl = new ControleTelaLogin();
        ctl.getTl().setVisible(true);
    }
}