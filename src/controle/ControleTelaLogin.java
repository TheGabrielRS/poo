/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import visao.TelaPrincipal;
import visao.TelaLogin;
import modelo.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ControleTelaLogin implements ActionListener{
    private TelaLogin tl;
    private TelaPrincipal tp;
    
    public ControleTelaLogin(){
        tl = new TelaLogin();
        tp = new TelaPrincipal();
        this.adicionaActionListeners();
    }
    
    private void adicionaActionListeners(){
        this.tl.getJbValidar().addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {    
                validarCampos();                     
            }
        });

        this.tl.getJbLimpar().addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparCampos();
            }
        });
        
        this.tp.getJbCriarProntuario().addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarProntuario();
            }
        });
        
        this.tp.getJbConsultar().addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //criarProntuario();
            }
        });
    }

    private void validarCampos(){
        Usuario usuario = new Usuario(tl.getJtfUsuario().getText(), tl.getJpfSenha().getPassword());
        
        
        if(usuario.validaLogin()){
            //Mostra tela principal e destroi tela de login
            this.tp.setVisible(true);
            this.tl.dispose();
        }
    }
    
    private void limparCampos(){
        tl.getJtfUsuario().setText("");
        tl.getJpfSenha().setText("");
    }
    
    private void criarProntuario(){
        tp.dispose();
        ControleCadastroFicha ccd = new ControleCadastroFicha();
    }
    
    public TelaLogin getTl() {
        return tl;
    }

    public void setTl(TelaLogin tl) {
        this.tl = tl;
    }

    public TelaPrincipal getTp() {
        return tp;
    }

    public void setTp(TelaPrincipal tp) {
        this.tp = tp;
    }

    public void actionPerformed(ActionEvent e) {
        
    }
}
