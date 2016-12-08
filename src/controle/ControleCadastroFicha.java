/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import visao.*;

/**
 *
 * @author marcosvlp
 */
public class ControleCadastroFicha implements ActionListener{
    public static int NUM_TELAS = 3;
    private JFrame janelaMestre;
    private JFrame jc[];
    private int contTela = 0;
    
    public ControleCadastroFicha(){
        //DEFINE JANELA MESTRE
        janelaMestre = new JFrame();
        
        //DEFINE O ARRAY COM AS TELAS DE PREENCHIMENTO
        jc = new JFrame[NUM_TELAS];
        jc[0] = new TelaIDadosPessoais();
        jc[1] = new TelaIIDadosClinicos();
        jc[2] = new TelaIIIHabitosAlimentareseSociais();
        //jc[4] = new TelaIVDadosBioquimicos();
        //jc[5] = new TelaVAtividadeFisica();
        //jc[6] = new TelaVIAnamneseAlimentar();
        //jc[7] = new TelaVIIDiagnosticoImpressaoNutricional:();
        //jc[7] = new TelaVIIIGastoEnergetico();
        //jc[7] = new TelaIXCondutaNutricional();
        
        //DEFINE O TAMANHO DA JANELA MESTRE COMO O TAMANHO DO CONTENT PANE DA PRIMEIRA TELA DE PREENCHIMENTO
        janelaMestre.setSize((int)jc[0].getSize().getWidth(), (int)jc[0].getSize().getHeight());
        
        this.adicionaActionListeners();
        
        //DEFINE O CONTENTPANE DA JANELA MESTRE COMO O CONTENTPANE DA PRIMEIRA TELA DE PREENCHIMENTO, E MOSTRA
        janelaMestre.setContentPane(jc[0].getContentPane());
        janelaMestre.setLocationRelativeTo(null);
        janelaMestre.setVisible(true);
    }
    
    private void adicionaActionListeners(){
        //TELA 1
        TelaIDadosPessoais tmp1 = (TelaIDadosPessoais) jc[0];
        tmp1.getJbProximo().addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt) {    
                    avancaPagina();
            }
        });
        
        tmp1.getJbAnterior().addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt) {    
                    retornaPagina();
            }
        });
        
        //TELA 2
        
        TelaIIDadosClinicos tmp2 = (TelaIIDadosClinicos) jc[1];
        tmp2.getJbProximo().addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt) {    
                    avancaPagina();
            }
        });
        
        tmp2.getJbAnterior().addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt) {    
                    retornaPagina();
            }
        });
        
        //TELA 3
        
        TelaIIIHabitosAlimentareseSociais tmp3 = (TelaIIIHabitosAlimentareseSociais) jc[2];
        tmp3.getJbProximo().addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt) {    
                    avancaPagina();
            }
        });
        
        tmp3.getJbAnterior().addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt) {    
                    retornaPagina();
            }
        });
    }
    
    private void avancaPagina(){
        if(contTela + 1 >= NUM_TELAS){
            //nao mais telas
        }else{
            contTela ++;
            
            janelaMestre.setSize((int)jc[contTela].getSize().getWidth(), (int)jc[contTela].getSize().getHeight());
            janelaMestre.setContentPane(jc[contTela].getContentPane());
            janelaMestre.setLocationRelativeTo(null);
        }
    }
    
    private void retornaPagina(){
        if(contTela - 1 < 0){
            //nao mais telas
        }else{
            contTela --;
            
            janelaMestre.setSize((int)jc[contTela].getSize().getWidth(), (int)jc[contTela].getSize().getHeight());
            janelaMestre.setContentPane(jc[contTela].getContentPane());
            janelaMestre.setLocationRelativeTo(null);
            
        }
    }


    public void actionPerformed(ActionEvent e) {
    }
}
