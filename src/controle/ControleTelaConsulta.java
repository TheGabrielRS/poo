/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visao.telasIniciais.TelaConsulta;
import modelo.Validacao;
import modelo.outros.Paciente;
import DAO.PacienteDAO;
import java.awt.Color;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.border.LineBorder;
import visao.telasIniciais.TelaPrincipal;
/**
 *
 * @author GabrielRS
 */
public class ControleTelaConsulta implements ActionListener{
    private TelaPrincipal tp;
    private TelaConsulta tc;

    public ControleTelaConsulta(TelaPrincipal tp) {
        this.tp = tp;
        this.tc = new TelaConsulta();
        this.adicionaActionListeners();
        this.adicionaVerificador();
        this.tc.setLocationRelativeTo(null);
        this.tc.setVisible(true);
        this.tc.getCpfTxt().requestFocus();
    }
    
    public void adicionaActionListeners()
    {
        this.tc.getBuscarBtn().addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {    
                buscaPaciente();                     
            }
        });
        
        this.tc.getJbVoltar().addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {    
                tc.dispose();
                tp.setVisible(true);
            }
        });
        
    }
    
    public void adicionaVerificador()
    {
        this.tc.getCpfTxt().setInputVerifier(new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                if(Validacao.isValidCPF(tc.getCpfTxt().getText()))
                {
                    tc.getCpfTxt().setBorder(new LineBorder(Color.GREEN));
                    tc.getMsgCpfLbl().setText("CPF válido");
                    tc.getMsgCpfLbl().setForeground(Color.GREEN);
                    return true;
                }
                else
                {

                    tc.getMsgCpfLbl().setText("CPF inválido (use somente números)");
                    tc.getCpfTxt().setBorder(new LineBorder(Color.RED));
                    tc.getMsgCpfLbl().setForeground(Color.RED);
                    return false;
                }
            }
        });
    }
    
    public void buscaPaciente()
    {
        PacienteDAO p = new PacienteDAO();
        Paciente pac = p.buscaPaciente(this.tc.getCpfTxt().getText());
        if(pac != null)
            this.tc.getResultadoTxtArea().setText(pac.toConsulta());
        else{
            this.tc.getResultadoTxtArea().setText("CPF não encontrado");
        }
    }
    
    
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
    
}
