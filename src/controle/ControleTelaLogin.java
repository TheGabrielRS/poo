/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import visao.TelaPrincipal;
import visao.TelaLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ControleTelaLogin implements ActionListener{
    private TelaLogin tl;
    private TelaPrincipal tp;
    
    public ControleTelaLogin(){
        tl = new TelaLogin();
        tp = new TelaPrincipal();
    }
    
    public static void main(String args[]){
        ControleTelaLogin ctl = new ControleTelaLogin();
        ctl.adicionaActionListeners();
        ctl.getTl().setVisible(true);
    }  
    
    private void adicionaActionListeners(){
        JButton jbValidar = this.getTl().getJbValidar();
        jbValidar.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarCampos();
            }
        });

        JButton jbLimpar = this.getTl().getJbLimpar();
        jbLimpar.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparCampos();
            }
        });
        
        JButton jbCriarProntuario = this.getTp().getJbCriarProntuario();
        jbCriarProntuario.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarProntuario();
            }
        });
        
        JButton jbConsultarProntuario = this.getTp().getJbConsultar();
        jbCriarProntuario.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //criarProntuario();
            }
        });
    }

    private void validarCampos(){
        //Pegar do csv
        
        if(true){
            //Mostra tela principal e destroi tela de login
            tp.setVisible(true);
            tl.dispose();
        }
    }
    
    private void limparCampos(){
        this.getTl().getJtfUsuario().setText("");
        this.getTl().getJpfSenha().setText("");
    }
    
    private void criarProntuario(){
        tp.dispose();
       // ControleCadastroFicha ccd = new ControleCadastroFicha();
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
