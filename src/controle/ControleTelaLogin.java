/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import DAO.ValidaLogin;
import visao.telasIniciais.TelaPrincipal;
import visao.telasIniciais.TelaLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControleTelaLogin implements ActionListener, KeyListener{
    private TelaLogin tl;
    private TelaPrincipal tp;
    
    public ControleTelaLogin(){
        tl = new TelaLogin();
        tp = new TelaPrincipal();
        
        this.adicionaListeners();
    }
    
    private void adicionaListeners(){
        //KEY LISTENERS
        
        this.tl.getJtfUsuario().addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) { 
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    validarCampos();
                }
            }

            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            public void keyReleased(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        this.tl.getJpfSenha().addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) { 
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    validarCampos();
                }
            }

            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            public void keyReleased(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        //ACTION LISTENERS
        
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
                consultarPaciente();
            }
        });
    }

    private void validarCampos(){
        
        ValidaLogin validaLogin = new ValidaLogin();
        
        if(validaLogin.validaLogin(tl.getJtfUsuario().getText(), new String(tl.getJpfSenha().getPassword()))){
            //Mostra tela principal e destroi tela de login
            this.tp.setVisible(true);
            this.tl.dispose();
        }else
        {
            tl.getJlErro().setText("Usuário ou senha incorretos");
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
    
    private void consultarPaciente(){
        tp.setVisible(false);
        ControleTelaConsulta ctc = new ControleTelaConsulta(tp);
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

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("bogtao");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
