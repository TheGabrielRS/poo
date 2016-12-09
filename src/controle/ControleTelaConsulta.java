/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visao.TelaConsulta;
import modelo.Validacao;
import modelo.Paciente;
import DAO.PacienteDAO;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
/**
 *
 * @author GabrielRS
 */
public class ControleTelaConsulta implements ActionListener{
    
    private TelaConsulta tc;

    public ControleTelaConsulta() {
        this.tc = new TelaConsulta();
        this.adicionaActionListeners();
        this.adicionaVerificador();
    }
    
    public void adicionaActionListeners()
    {
        this.tc.getBuscarBtn().addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {    
                buscaPaciente();                     
            }
        });
        
    }
    
    public void adicionaVerificador()
    {
        this.tc.getCpfTxt().setInputVerifier(new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                return Validacao.isValidCPF(tc.getCpfTxt().getText());
            }
        });
    }
    
    public void buscaPaciente()
    {
        PacienteDAO p = new PacienteDAO();
        Paciente pac = p.buscaPaciente(this.tc.getCpfTxt().getText());
        if(pac != null)
            this.tc.getResultadoTxtArea().setText(pac.toConsulta());
    }
    
    
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
    
}
