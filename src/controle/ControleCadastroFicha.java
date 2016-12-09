/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import DAO.PacienteDAO;
import modelo.outros.*;
import modelo.telas.*;
import visao.telasProntuario.*;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import visao.telasIniciais.TelaLogin;
import visao.telasIniciais.TelaPrincipal;

/**
 *
 * @author marcosvlp
 */
public class ControleCadastroFicha implements ActionListener, KeyListener{
    public static int NUM_TELAS = 9;
    private JFrame janelaMestre;
    private JFrame jc[];
    private int contTela = 0;
    private TelaPrincipal tp;
    
    public ControleCadastroFicha(TelaPrincipal tp){
        //DEFINE JANELA MESTRE
        this.tp = tp;
        janelaMestre = new JFrame("Cadastro do Prontuário");
        
        //DEFINE O ARRAY COM AS TELAS DE PREENCHIMENTO
        jc = new JFrame[NUM_TELAS];
        jc[0] = new TelaIDadosPessoais();
        jc[1] = new TelaIIDadosClinicos();
        jc[2] = new TelaIIIHabitosAlimentareseSociais();
        jc[3] = new TelaIVDadosBioquimicos();
        jc[4] = new TelaVAtividadeFisica();
        jc[5] = new TelaVIAnamneseAlimentar();
        jc[6] = new TelaVIIDiagnosticoImpressaoNutricional();
        jc[7] = new TelaVIIIGastoEnergetico();
        jc[8] = new TelaIXCondutaNutricional();
        
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
        
        //TELA 4
        TelaIVDadosBioquimicos tmp4 = (TelaIVDadosBioquimicos) jc[3];
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
        
        tmp4.getJbAdicionarLinha().addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt) {  
                    DefaultTableModel model = (DefaultTableModel)tmp4.getJtDados().getModel();
                    model.addRow(new Object[]{"","",""});
            }
        });
        
        tmp4.getJbRemoverLinha().addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt) {    
                    DefaultTableModel model = (DefaultTableModel)tmp4.getJtDados().getModel();
                    model.removeRow(model.getRowCount()-1);
            }
        });
        
        //TELA 5
        TelaVAtividadeFisica tmp5 = (TelaVAtividadeFisica) jc[4];
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
        
        tmp5.getJbAdicionarLinha().addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt) {  
                    DefaultTableModel model = (DefaultTableModel)tmp5.getJtDados().getModel();
                    model.addRow(new Object[]{"","","",""});
            }
        });
        
        tmp5.getJbRemoverLinha().addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt) {    
                    DefaultTableModel model = (DefaultTableModel)tmp5.getJtDados().getModel();
                    model.removeRow(model.getRowCount()-1);
            }
        });
        
        //TELA 6
        
        TelaVIAnamneseAlimentar tmp6 = (TelaVIAnamneseAlimentar) jc[5];
        tmp6.getJbProximo().addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt) {    
                    avancaPagina();
            }
        });
        
        tmp6.getJbAnterior().addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt) {    
                    retornaPagina();
            }
        });
        
        //TELA 7
        
        TelaVIIDiagnosticoImpressaoNutricional tmp7 = (TelaVIIDiagnosticoImpressaoNutricional) jc[6];
        tmp7.getJbProximo().addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt) {    
                    avancaPagina();
            }
        });
        
        tmp7.getJbAnterior().addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt) {    
                    retornaPagina();
            }
        });
        
        //TELA 8
        
        TelaVIIIGastoEnergetico tmp8 = (TelaVIIIGastoEnergetico) jc[7];
        tmp8.getJbProximo().addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt) {    
                    avancaPagina();
            }
        });
        
        tmp8.getJbAnterior().addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt) {    
                    retornaPagina();
            }
        });
        
        //TELA 9
        
        TelaIXCondutaNutricional tmp9 = (TelaIXCondutaNutricional) jc[8];
        tmp9.getJbFinalizar().addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt) {  
                    try{
                        finalizaCadastro();
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "Algum dado inserido incorretamente", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
            }
        });
        
        tmp9.getJbAnterior().addActionListener(new java.awt.event.ActionListener(){
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
        float peso = -1;
        float altura = -1;
        float bia = -1;
        float imc = -1;
        float pu = -1;
        float pp = -1;
        float cb = -1;
        float dcs = -1;
        float dct = -1;
        
        if(t1.getJtftPeso().getText() != null)
            peso = Float.valueOf(t1.getJtftPeso().getText());
        
        if(t1.getJtftAltura().getText() != null)
            altura = Float.valueOf(t1.getJtftAltura().getText());
        if(t1.getJtftBia().getText() != null)
            bia = Float.valueOf(t1.getJtftBia().getText());
        if(t1.getJtftIMC().getText()!= null)
            imc = Float.valueOf(t1.getJtftIMC().getText());
        if(t1.getJtftPU().getText()!=null)
            pu = Float.valueOf(t1.getJtftPU().getText());
        if(t1.getJtftPP().getText()!= null)
            pp = Float.valueOf(t1.getJtftPP().getText());
        if(t1.getJtftCB().getText()!=null)
            cb = Float.valueOf(t1.getJtftCB().getText());
        if(t1.getJftfDCS().getText()!=null)
            dcs = Float.valueOf(t1.getJftfDCS().getText());
        if(t1.getJtftDCT().getText()!=null)
            dct  = Float.valueOf(t1.getJtftDCT().getText());
        
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
        
        int qtdAgua = -1;
        if(t3.getJtfAgua().getText() == null)
            qtdAgua = Integer.parseInt(t3.getJtfAgua().getText());
        
        int anosCigarro = -1;
        if(t3.getJtfAnosCigarros().getText() == null)
            anosCigarro = Integer.parseInt(t3.getJtfAnosCigarros().getText());
        
        Habitos habitos = new Habitos(
            t3.getJtfAlergia().getText(), 
            qtdAgua, 
            etilismo, 
            t3.getJtfElitismo().getText(), 
            fumante, 
            exFumante, 
            anosCigarro,
            t3.getJtfSono().getText()
        );
        
        //DIAGNOSTICO IMPRESSAO NUTRICIONAL
        TelaVIIDiagnosticoImpressaoNutricional t7 = (TelaVIIDiagnosticoImpressaoNutricional) jc[6];
        
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
        
        TelaVIIIGastoEnergetico t8 = (TelaVIIIGastoEnergetico) jc[7];
        
        
        float geb = -1;
        float get = -1;
        
        if(t8.getJftfGEB().getText() == null)
            geb = Float.valueOf(t8.getJftfGEB().getText());
        
        if(t8.getJftfGET().getText() == null)
            get = Float.valueOf(t8.getJftfGET().getText());
        
        GastoEnergetico gastoEnergetico = new GastoEnergetico (
            geb,
            get
        );
        
        //Dados Bioquimicos
        
        ArrayList<DadoBioquimico> arrayDadosBioquimicos = new  ArrayList<DadoBioquimico>();
        DefaultTableModel model = (DefaultTableModel)  ((TelaIVDadosBioquimicos) jc[3]).getJtDados().getModel();
        for(int x = 0; x < model.getRowCount(); x++){
            DadoBioquimico db = new DadoBioquimico();
            db.setNome((String)model.getValueAt(x,0)); 
            db.setValor((String)model.getValueAt(x,1)); 
            db.setData((String)model.getValueAt(x,2)); 
            arrayDadosBioquimicos.add(db);
        }
        
        DadosBioquimicos dadosBioquimicos = new DadosBioquimicos(arrayDadosBioquimicos);
                   
        //Atividades Fisicas
        
        ArrayList<AtividadeFisica> arrayAtividadesFisicas = new  ArrayList<AtividadeFisica>();
        model = (DefaultTableModel)  ((TelaVAtividadeFisica) jc[4]).getJtDados().getModel();
        for(int x = 0; x < model.getRowCount(); x++){
            AtividadeFisica af = new AtividadeFisica();
            af.setTipo((String)model.getValueAt(x,0)); 
            af.setHorario((String)model.getValueAt(x,1)); 
            af.setFrequencia((String)model.getValueAt(x,2)); 
            af.setTempo((String)model.getValueAt(x,3)); 
            
            arrayAtividadesFisicas.add(af);
        }
        
        AtividadesFisicas atividadesFisicas = new AtividadesFisicas(arrayAtividadesFisicas);
                   
        //Conduta Nutricional
        TelaIXCondutaNutricional t9 = (TelaIXCondutaNutricional) jc[8];
        
        float vet = -1;
        if(t9.getJftfVet().getText() == null)
            vet = Float.valueOf(t9.getJftfVet().getText());
        
        CondutaNutricional condutaNutricional = new CondutaNutricional(
            t9.getJtaDescricao().getText(),
            vet,
            t9.getJtaOrientacoes().getText()
        );
        
        //Alimentacao
        TelaVIAnamneseAlimentar t5 = (TelaVIAnamneseAlimentar) jc[5];
        
        Alimentacao alimentacao = new Alimentacao(
            new Refeicao(t5.getJtaDesjejum().getText(), t5.getJtfHorarioDesjejum().getText()),
            new Refeicao(t5.getJtaLanche().getText(), t5.getJtfHorarioLanche().getText()),
            new Refeicao(t5.getJtaColacao().getText(), t5.getJtfHorarioColacao().getText()),
            new Refeicao(t5.getJtaJantar().getText(), t5.getJtfHorarioJantar().getText()),
            new Refeicao(t5.getJtaAlmoco().getText(), t5.getJtfHorarioAlmoco().getText()),
            new Refeicao(t5.getJtaCeia().getText(), t5.getJtfHorarioCeia().getText()),
            t5.getJtfObs().getText(), 
            t5.getJtfGosta().getText(), 
            t5.getJtfNaoGosta().getText()
        );
        
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
            alimentacao, 
            atividadesFisicas, 
            dadosBioquimicos, 
            dadosClinicos, 
            habitos, 
            diagnostico, 
            gastoEnergetico, 
            condutaNutricional  
        );
        
        boolean retorno = PacienteDAO.salvaPaciente(p);
        this.janelaMestre.dispose();
        tp.setVisible(true);

    }


    public void actionPerformed(ActionEvent e) {
    }

    public void keyTyped(KeyEvent e) {
        System.out.println(e.toString());
    }

    public void keyPressed(KeyEvent e) {
        System.out.println(e.toString());
    }

    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
