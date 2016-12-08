/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import modelo.*;
import visao.*;

/**
 *
 * @author marcosvlp
 */
public class ControleCadastroFicha implements ActionListener{
    public static int NUM_TELAS = 6;
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
        //jc[3] = new TelaIVDadosBioquimicos();
        //jc[4] = new TelaVAtividadeFisica();
        //jc[5] = new TelaVIAnamneseAlimentar();
        jc[3] = new TelaVIIDiagnosticoImpressaoNutricional();
        jc[4] = new TelaVIIIGastoEnergetico();
        jc[5] = new TelaIXCondutaNutricional();
        
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
        
        //
        
        TelaVIIDiagnosticoImpressaoNutricional tmp4 = (TelaVIIDiagnosticoImpressaoNutricional) jc[3];
        tmp4.getJbProximo().addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt) {    
                    avancaPagina();
            }
        });
        
        tmp4.getJbAnterior().addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt) {    
                    retornaPagina();
            }
        });
        //
        TelaVIIIGastoEnergetico tmp5 = (TelaVIIIGastoEnergetico) jc[4];
        tmp5.getJbProximo().addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt) {    
                    avancaPagina();
            }
        });
        
        tmp5.getJbAnterior().addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt) {    
                    retornaPagina();
            }
        });
        
        //
        TelaIXCondutaNutricional tmp6 = (TelaIXCondutaNutricional) jc[5];
        tmp6.getJbFinalizar().addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt) {    
                    finalizaCadastro();
            }
        });
        
        tmp6.getJbAnterior().addActionListener(new java.awt.event.ActionListener(){
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
    
    private void finalizaCadastro(){
        //DADOS PESSOAIS
        
        TelaIDadosPessoais t1 = (TelaIDadosPessoais)jc[0];
        
        String cpf = t1.getJftfCPF().getText();
        String nome = t1.getJtfNome().getText();
        char sexo = t1.getJcbSexo().getSelectedItem().toString().charAt(0);
        String dataNasc = t1.getJtftDataNasc().getText();
        String naturalidade = t1.getJtfNaturalidade().getText(); 
        String profissao = t1.getJtfProfissao().getText();
        String trabalho = t1.getJtfLocalTrabalho().getText();
        String turnoTrabalho = t1.getJtfHorarioTrabalho().getText();
        float peso = Float.valueOf(t1.getJtftPeso().getText());
        float altura = Float.valueOf(t1.getJtftPeso().getText());
        float bia = Float.valueOf(t1.getJtftBia().getText());
        float imc = Float.valueOf(t1.getJtftIMC().getText());
        float pu = Float.valueOf(t1.getJtftPU().getText());
        float pp = Float.valueOf(t1.getJtftPP().getText());
        float cb = Float.valueOf(t1.getJtftCB().getText());
        float dcs = Float.valueOf(t1.getJftfDCS().getText());
        float dct = Float.valueOf(t1.getJtftDCT().getText()); 
        
        //DADOS CLINICOS
        
        TelaIIDadosClinicos t2 = (TelaIIDadosClinicos)jc[1];
        
        ArrayList<String> alteracoesGastrointestinais = new ArrayList<String>();
        for(Component c: t2.getComponents()){
            if(c instanceof JCheckBox){
                if(((JCheckBox) c).isSelected())
                    alteracoesGastrointestinais.add(((JCheckBox) c).getText());
            }
        }
        
        boolean consistencia = false;
        if(t2.getBgConsistenciaAlimentacao().getSelection().equals(t2.getJrbSim())){
            consistencia = true;
        }else if(t2.getBgConsistenciaAlimentacao().getSelection().equals(t2.getJrbNao())){
            consistencia = false;
        }
        
        String apetite = "";
        if(t2.getBgApetite().getSelection().equals(t2.getJrbAbaixoNormal())){
            apetite = "Abaixo do normal";
        }else if(t2.getBgApetite().getSelection().equals(t2.getJrbNormal())){
            apetite = "Normal";
        }else if(t2.getBgApetite().getSelection().equals(t2.getJrbAcimaNormal())){
            apetite = "Acima do normal";
        }
        
        DadosClinicos dadosClinicos = new DadosClinicos(
            t2.getJtaHistoria().getText(), 
            t2.getJtaInterferencias().getText(), 
            t2.getJtaAtitudes().getText(), 
            t2.getJtaHistorico().getText(), 
            alteracoesGastrointestinais, 
            t2.getJtfObs().getText(), 
            consistencia, 
            t2.getJtfMudancas().getText(), 
            apetite, 
            t2.getJtfPorque().getText()
        );
        
        //HABITOS ALIMENTARES E SOCIAIS
        TelaIIIHabitosAlimentareseSociais t3 = (TelaIIIHabitosAlimentareseSociais) jc[2];
        
        boolean etilismo = false;
        if(t3.getBgEtilismo().getSelection().equals(t3.getJrbSimEtilismo())){
            etilismo = true;
        }else if(t3.getBgEtilismo().getSelection().equals(t3.getJrbNaoEtilismo())){
            etilismo = false;
        }
        
        boolean fumante = false;
        if(t3.getBgFumante().getSelection().equals(t3.getJrbSimFumante())){
            fumante = true;
        }else if(t3.getBgFumante().getSelection().equals(t3.getJrbNaoFumante())){
            fumante = false;
        }
        
        boolean exFumante = false;
        if(t3.getBgFumante().getSelection().equals(t3.getJrbExFumante()))
            exFumante = true;
        
        Habitos habitos = new Habitos(
            t3.getJtfAlergia().getText(), 
            Integer.parseInt(t3.getJtfAgua().getText()), 
            etilismo, 
            t3.getJtfElitismo().getText(), 
            fumante, 
            exFumante, 
            Integer.parseInt(t3.getJtfAnosCigarros().getText())
        );
        
        //DIAGNOSTICO IMPRESSAO NUTRICIONAL
        TelaVIIDiagnosticoImpressaoNutricional t7 = (TelaVIIDiagnosticoImpressaoNutricional) jc[3];
        
        Diagnostico diagnostico = new Diagnostico(
            t7.getJtaDiagnostico().getText(), 
            t7.getJcbVerduras().getSelectedItem().toString().charAt(0), 
            t7.getJcbFrutas().getSelectedItem().toString().charAt(0), 
            t7.getJcbRefrigerantes().getSelectedItem().toString().charAt(0),
            t7.getJcbDoces().getSelectedItem().toString().charAt(0), 
            t7.getJcbFrituras().getSelectedItem().toString().charAt(0) ,
            t7.getJcbPaes().getSelectedItem().toString().charAt(0), 
            t7.getJcbFastFood().getSelectedItem().toString().charAt(0)
        );
        
        TelaVIIIGastoEnergetico t8 = (TelaVIIIGastoEnergetico) jc[4];
        
        GastoEnergetico gastoEnergetico = new GastoEnergetico (
            Float.valueOf(t8.getJftfGEB().getText()),
            Float.valueOf(t8.getJftfGET().getText())
        );
        
        /*Alimentacao alimentacao, 
        AtividadeFísica atividadeFísica, 
        DadosBioquimicos dadosBioquimicos, 
        DadosClinicos dadosClinicos, 
        Habitos habitos, 
        Diagnostico diagnostico, 
        GastoEnergetico gastoEnergetico, 
        CondutaNutricional condutaNutricional*/
        
        Paciente p = new Paciente(
            cpf, 
            nome, 
            sexo, 
            dataNasc, 
            naturalidade, 
            profissao, 
            trabalho, 
            turnoTrabalho, 
            peso, 
            altura,
            bia, 
            imc,
            pu, 
            pp, 
            cb, 
            dcs, 
            dct, 
            null, //TODO Alimentacao
            null, //TODO AtividadeFísica
            null, //TODO DadosBioquimicos
            dadosClinicos, 
            habitos, //TODO Habitos
            diagnostico, 
            gastoEnergetico, 
            null  //TODO CondutaNutricional
        );
        
        System.out.println(p.getNome());
        System.out.println(p.getDataNasc());
        System.out.println(p.getDiagnostico().getFrituras());
            
    }


    public void actionPerformed(ActionEvent e) {
    }
}
