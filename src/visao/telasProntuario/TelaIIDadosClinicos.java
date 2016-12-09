package visao.telasProntuario;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TelaIIDadosClinicos extends javax.swing.JFrame {

    public TelaIIDadosClinicos() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgConsistenciaAlimentacao = new javax.swing.ButtonGroup();
        bgApetite = new javax.swing.ButtonGroup();
        jbTituloSecao = new javax.swing.JLabel();
        js1 = new javax.swing.JSeparator();
        jlHistoria = new javax.swing.JLabel();
        jbProximo = new javax.swing.JButton();
        jbAnterior = new javax.swing.JButton();
        js3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaHistoria = new javax.swing.JTextArea();
        jlInterferencias = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtaAtitudes = new javax.swing.JTextArea();
        jlAtitudes = new javax.swing.JLabel();
        jlHistorico = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtaHistorico = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtaInterferencias = new javax.swing.JTextArea();
        jlAlteracoesGastro = new javax.swing.JLabel();
        jcbMastigacao = new javax.swing.JCheckBox();
        jcbDiasfagia = new javax.swing.JCheckBox();
        jcbPirose = new javax.swing.JCheckBox();
        jcbNausea = new javax.swing.JCheckBox();
        jcbVomitos = new javax.swing.JCheckBox();
        jcbDiarreia = new javax.swing.JCheckBox();
        jcbConstipacao = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jlObs = new javax.swing.JLabel();
        jtfObs = new javax.swing.JTextField();
        jlMudancasConsistencia = new javax.swing.JLabel();
        jrbSim = new javax.swing.JRadioButton();
        jrbNao = new javax.swing.JRadioButton();
        jtfMudancas = new javax.swing.JTextField();
        jrbAbaixoNormal = new javax.swing.JRadioButton();
        jlApetite = new javax.swing.JLabel();
        jrbNormal = new javax.swing.JRadioButton();
        jrbAcimaNormal = new javax.swing.JRadioButton();
        jtfPorque = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbTituloSecao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbTituloSecao.setText("II - Dados Clínicos");

        jlHistoria.setText("História / QP / Diagnóstico Clínico: ");

        jbProximo.setText("Próximo");

        jbAnterior.setText("Anterior");

        jtaHistoria.setColumns(20);
        jtaHistoria.setRows(5);
        jScrollPane1.setViewportView(jtaHistoria);

        jlInterferencias.setText("O que interfere na sua alimentação? ");

        jtaAtitudes.setColumns(20);
        jtaAtitudes.setLineWrap(true);
        jtaAtitudes.setRows(2);
        jtaAtitudes.setTabSize(2);
        jScrollPane3.setViewportView(jtaAtitudes);

        jlAtitudes.setText("Quando decide emagrecer, que atitudes toma?");

        jlHistorico.setText("Patologias pregressas e familiares: ");

        jtaHistorico.setColumns(20);
        jtaHistorico.setRows(5);
        jScrollPane5.setViewportView(jtaHistorico);

        jtaInterferencias.setColumns(20);
        jtaInterferencias.setLineWrap(true);
        jtaInterferencias.setRows(2);
        jtaInterferencias.setTabSize(2);
        jScrollPane6.setViewportView(jtaInterferencias);

        jlAlteracoesGastro.setText("Alterações gastrointestinais:");

        jcbMastigacao.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jcbMastigacao.setText("Mastigação");
        jcbMastigacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMastigacaoActionPerformed(evt);
            }
        });

        jcbDiasfagia.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jcbDiasfagia.setText("Diasfagia");
        jcbDiasfagia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDiasfagiaActionPerformed(evt);
            }
        });

        jcbPirose.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jcbPirose.setText("Pirose");
        jcbPirose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPiroseActionPerformed(evt);
            }
        });

        jcbNausea.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jcbNausea.setText("Náusea");
        jcbNausea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNauseaActionPerformed(evt);
            }
        });

        jcbVomitos.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jcbVomitos.setText("Vômitos");
        jcbVomitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbVomitosActionPerformed(evt);
            }
        });

        jcbDiarreia.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jcbDiarreia.setText("Diarréia");
        jcbDiarreia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDiarreiaActionPerformed(evt);
            }
        });

        jcbConstipacao.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jcbConstipacao.setText("Constipação");
        jcbConstipacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbConstipacaoActionPerformed(evt);
            }
        });

        jlObs.setText("Obs.:");

        jlMudancasConsistencia.setText("Mudanças da consistência da alimentação:");

        bgConsistenciaAlimentacao.add(jrbSim);
        jrbSim.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jrbSim.setText("Sim");
        jrbSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSimActionPerformed(evt);
            }
        });

        bgConsistenciaAlimentacao.add(jrbNao);
        jrbNao.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jrbNao.setSelected(true);
        jrbNao.setText("Não");

        bgApetite.add(jrbAbaixoNormal);
        jrbAbaixoNormal.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jrbAbaixoNormal.setText("Abaixo do normal");
        jrbAbaixoNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAbaixoNormalActionPerformed(evt);
            }
        });

        jlApetite.setText("Apetite / Consumo Alimentar");

        bgApetite.add(jrbNormal);
        jrbNormal.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jrbNormal.setSelected(true);
        jrbNormal.setText("Normal");
        jrbNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNormalActionPerformed(evt);
            }
        });

        bgApetite.add(jrbAcimaNormal);
        jrbAcimaNormal.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jrbAcimaNormal.setText("Acima do normal");
        jrbAcimaNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAcimaNormalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(js1)
            .addComponent(js3)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbProximo))
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlObs)
                            .addComponent(jcbMastigacao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcbDiasfagia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbPirose)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbNausea)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbVomitos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbDiarreia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbConstipacao)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jtfObs))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlMudancasConsistencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbSim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbNao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfMudancas))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbTituloSecao)
                            .addComponent(jlHistoria)
                            .addComponent(jlInterferencias)
                            .addComponent(jlAtitudes)
                            .addComponent(jlHistorico)
                            .addComponent(jlAlteracoesGastro))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlApetite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbAbaixoNormal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbNormal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbAcimaNormal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPorque)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jbTituloSecao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(js1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlHistoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlInterferencias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlAtitudes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlHistorico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlAlteracoesGastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbMastigacao)
                    .addComponent(jcbDiasfagia)
                    .addComponent(jcbPirose)
                    .addComponent(jcbNausea)
                    .addComponent(jcbVomitos)
                    .addComponent(jcbDiarreia)
                    .addComponent(jcbConstipacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlObs)
                    .addComponent(jtfObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlMudancasConsistencia)
                    .addComponent(jrbSim)
                    .addComponent(jrbNao)
                    .addComponent(jtfMudancas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApetite)
                    .addComponent(jrbAbaixoNormal)
                    .addComponent(jrbNormal)
                    .addComponent(jrbAcimaNormal)
                    .addComponent(jtfPorque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(js3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbAnterior)
                    .addComponent(jbProximo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbMastigacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMastigacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMastigacaoActionPerformed

    private void jcbDiasfagiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDiasfagiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbDiasfagiaActionPerformed

    private void jcbPiroseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPiroseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbPiroseActionPerformed

    private void jcbNauseaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNauseaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbNauseaActionPerformed

    private void jcbVomitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbVomitosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbVomitosActionPerformed

    private void jcbDiarreiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDiarreiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbDiarreiaActionPerformed

    private void jcbConstipacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbConstipacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbConstipacaoActionPerformed

    private void jrbSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbSimActionPerformed

    private void jrbAbaixoNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAbaixoNormalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbAbaixoNormalActionPerformed

    private void jrbNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNormalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbNormalActionPerformed

    private void jrbAcimaNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAcimaNormalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbAcimaNormalActionPerformed

    public JButton getJbAnterior() {
        return jbAnterior;
    }

    public void setJbAnterior(JButton jbAnterior) {
        this.jbAnterior = jbAnterior;
    }

    public JButton getJbProximo() {
        return jbProximo;
    }

    public void setJbProximo(JButton jbProximo) {
        this.jbProximo = jbProximo;
    }

    public JLabel getJbTituloSecao() {
        return jbTituloSecao;
    }

    public void setJbTituloSecao(JLabel jbTituloSecao) {
        this.jbTituloSecao = jbTituloSecao;
    }

    public ButtonGroup getBgApetite() {
        return bgApetite;
    }

    public void setBgApetite(ButtonGroup bgApetite) {
        this.bgApetite = bgApetite;
    }

    public ButtonGroup getBgConsistenciaAlimentacao() {
        return bgConsistenciaAlimentacao;
    }

    public void setBgConsistenciaAlimentacao(ButtonGroup bgConsistenciaAlimentacao) {
        this.bgConsistenciaAlimentacao = bgConsistenciaAlimentacao;
    }

    public JCheckBox getJcbConstipacao() {
        return jcbConstipacao;
    }

    public void setJcbConstipacao(JCheckBox jcbConstipacao) {
        this.jcbConstipacao = jcbConstipacao;
    }

    public JCheckBox getJcbDiarreia() {
        return jcbDiarreia;
    }

    public void setJcbDiarreia(JCheckBox jcbDiarreia) {
        this.jcbDiarreia = jcbDiarreia;
    }

    public JCheckBox getJcbDiasfagia() {
        return jcbDiasfagia;
    }

    public void setJcbDiasfagia(JCheckBox jcbDiasfagia) {
        this.jcbDiasfagia = jcbDiasfagia;
    }

    public JCheckBox getJcbMastigacao() {
        return jcbMastigacao;
    }

    public void setJcbMastigacao(JCheckBox jcbMastigacao) {
        this.jcbMastigacao = jcbMastigacao;
    }

    public JCheckBox getJcbNausea() {
        return jcbNausea;
    }

    public void setJcbNausea(JCheckBox jcbNausea) {
        this.jcbNausea = jcbNausea;
    }

    public JCheckBox getJcbPirose() {
        return jcbPirose;
    }

    public void setJcbPirose(JCheckBox jcbPirose) {
        this.jcbPirose = jcbPirose;
    }

    public JCheckBox getJcbVomitos() {
        return jcbVomitos;
    }

    public void setJcbVomitos(JCheckBox jcbVomitos) {
        this.jcbVomitos = jcbVomitos;
    }

    public JTextArea getJtaAtitudes() {
        return jtaAtitudes;
    }

    public void setJtaAtitudes(JTextArea jtaAtitudes) {
        this.jtaAtitudes = jtaAtitudes;
    }

    public JTextArea getJtaHistoria() {
        return jtaHistoria;
    }

    public void setJtaHistoria(JTextArea jtaHistoria) {
        this.jtaHistoria = jtaHistoria;
    }

    public JTextArea getJtaHistorico() {
        return jtaHistorico;
    }

    public void setJtaHistorico(JTextArea jtaHistorico) {
        this.jtaHistorico = jtaHistorico;
    }

    public JTextArea getJtaInterferencias() {
        return jtaInterferencias;
    }

    public void setJtaInterferencias(JTextArea jtaInterferencias) {
        this.jtaInterferencias = jtaInterferencias;
    }

    public JTextField getJtfMudancas() {
        return jtfMudancas;
    }

    public void setJtfMudancas(JTextField jtfMudancas) {
        this.jtfMudancas = jtfMudancas;
    }

    public JTextField getJtfObs() {
        return jtfObs;
    }

    public void setJtfObs(JTextField jtfObs) {
        this.jtfObs = jtfObs;
    }

    public JTextField getJtfPorque() {
        return jtfPorque;
    }

    public void setJtfPorque(JTextField jtfPorque) {
        this.jtfPorque = jtfPorque;
    }

    public JRadioButton getJrbAbaixoNormal() {
        return jrbAbaixoNormal;
    }

    public void setJrbAbaixoNormal(JRadioButton jrbAbaixoNormal) {
        this.jrbAbaixoNormal = jrbAbaixoNormal;
    }

    public JRadioButton getJrbAcimaNormal() {
        return jrbAcimaNormal;
    }

    public void setJrbAcimaNormal(JRadioButton jrbAcimaNormal) {
        this.jrbAcimaNormal = jrbAcimaNormal;
    }

    public JRadioButton getJrbNao() {
        return jrbNao;
    }

    public void setJrbNao(JRadioButton jrbNao) {
        this.jrbNao = jrbNao;
    }

    public JRadioButton getJrbNormal() {
        return jrbNormal;
    }

    public void setJrbNormal(JRadioButton jrbNormal) {
        this.jrbNormal = jrbNormal;
    }

    public JRadioButton getJrbSim() {
        return jrbSim;
    }

    public void setJrbSim(JRadioButton jrbSim) {
        this.jrbSim = jrbSim;
    }

    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgApetite;
    private javax.swing.ButtonGroup bgConsistenciaAlimentacao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbAnterior;
    private javax.swing.JButton jbProximo;
    private javax.swing.JLabel jbTituloSecao;
    private javax.swing.JCheckBox jcbConstipacao;
    private javax.swing.JCheckBox jcbDiarreia;
    private javax.swing.JCheckBox jcbDiasfagia;
    private javax.swing.JCheckBox jcbMastigacao;
    private javax.swing.JCheckBox jcbNausea;
    private javax.swing.JCheckBox jcbPirose;
    private javax.swing.JCheckBox jcbVomitos;
    private javax.swing.JLabel jlAlteracoesGastro;
    private javax.swing.JLabel jlApetite;
    private javax.swing.JLabel jlAtitudes;
    private javax.swing.JLabel jlHistoria;
    private javax.swing.JLabel jlHistorico;
    private javax.swing.JLabel jlInterferencias;
    private javax.swing.JLabel jlMudancasConsistencia;
    private javax.swing.JLabel jlObs;
    private javax.swing.JRadioButton jrbAbaixoNormal;
    private javax.swing.JRadioButton jrbAcimaNormal;
    private javax.swing.JRadioButton jrbNao;
    private javax.swing.JRadioButton jrbNormal;
    private javax.swing.JRadioButton jrbSim;
    private javax.swing.JSeparator js1;
    private javax.swing.JSeparator js3;
    private javax.swing.JTextArea jtaAtitudes;
    private javax.swing.JTextArea jtaHistoria;
    private javax.swing.JTextArea jtaHistorico;
    private javax.swing.JTextArea jtaInterferencias;
    private javax.swing.JTextField jtfMudancas;
    private javax.swing.JTextField jtfObs;
    private javax.swing.JTextField jtfPorque;
    // End of variables declaration//GEN-END:variables
}
