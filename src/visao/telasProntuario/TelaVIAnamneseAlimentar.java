package visao.telasProntuario;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TelaVIAnamneseAlimentar extends javax.swing.JFrame {

    public TelaVIAnamneseAlimentar() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgEtilismo = new javax.swing.ButtonGroup();
        bgFumante = new javax.swing.ButtonGroup();
        jbTituloSecao = new javax.swing.JLabel();
        js1 = new javax.swing.JSeparator();
        jbProximo = new javax.swing.JButton();
        jbAnterior = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jlDesjejum = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDesjejum = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtaLanche = new javax.swing.JTextArea();
        jlLanche = new javax.swing.JLabel();
        jlAlmoco = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtaCeia = new javax.swing.JTextArea();
        jlCeia = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtaColacao = new javax.swing.JTextArea();
        jlColacao = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtaJantar = new javax.swing.JTextArea();
        jlJantar = new javax.swing.JLabel();
        jtfHorarioDesjejum = new javax.swing.JTextField();
        jtfHorarioJantar = new javax.swing.JTextField();
        jtfHorarioLanche = new javax.swing.JTextField();
        jtfHorarioColacao = new javax.swing.JTextField();
        jtfHorarioAlmoco = new javax.swing.JTextField();
        jtfHorarioCeia = new javax.swing.JTextField();
        jlObs = new javax.swing.JLabel();
        jlGosta = new javax.swing.JLabel();
        jlNaoGosta = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jtaAlmoco = new javax.swing.JTextArea();
        jtfObs = new javax.swing.JTextField();
        jtfNaoGosta = new javax.swing.JTextField();
        jtfGosta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbTituloSecao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbTituloSecao.setText("VI - Anamnese Alimentar");

        jbProximo.setText("Próximo");

        jbAnterior.setText("Anterior");

        jlDesjejum.setText("Desjejum");

        jtaDesjejum.setColumns(20);
        jtaDesjejum.setRows(5);
        jScrollPane1.setViewportView(jtaDesjejum);

        jtaLanche.setColumns(20);
        jtaLanche.setRows(5);
        jScrollPane3.setViewportView(jtaLanche);

        jlLanche.setText("Lanche");

        jlAlmoco.setText("Almoço");

        jtaCeia.setColumns(20);
        jtaCeia.setRows(5);
        jScrollPane5.setViewportView(jtaCeia);

        jlCeia.setText("Ceia");

        jtaColacao.setColumns(20);
        jtaColacao.setRows(5);
        jScrollPane6.setViewportView(jtaColacao);

        jlColacao.setText("Colação");

        jtaJantar.setColumns(20);
        jtaJantar.setRows(5);
        jScrollPane7.setViewportView(jtaJantar);

        jlJantar.setText("Jantar");

        jtfHorarioJantar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfHorarioJantarActionPerformed(evt);
            }
        });

        jtfHorarioLanche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfHorarioLancheActionPerformed(evt);
            }
        });

        jlObs.setText("Obs.:");

        jlGosta.setText("Gosta");

        jlNaoGosta.setText("Não gosta");

        jtaAlmoco.setColumns(20);
        jtaAlmoco.setRows(5);
        jScrollPane8.setViewportView(jtaAlmoco);

        jtfNaoGosta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNaoGostaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(js1)
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 292, Short.MAX_VALUE)
                        .addComponent(jbAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbProximo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlDesjejum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfHorarioDesjejum, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlLanche)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfHorarioLanche, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jlNaoGosta)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jbTituloSecao, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlColacao)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfHorarioColacao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlJantar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfHorarioJantar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlAlmoco)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfHorarioAlmoco, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlCeia)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfHorarioCeia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlGosta, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlObs, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfGosta, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jtfNaoGosta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                                .addComponent(jtfObs)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jbTituloSecao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(js1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlDesjejum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlLanche)
                            .addComponent(jtfHorarioDesjejum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfHorarioLanche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlJantar)
                            .addComponent(jtfHorarioJantar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfHorarioColacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlColacao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAlmoco)
                    .addComponent(jtfHorarioAlmoco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCeia)
                    .addComponent(jtfHorarioCeia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlObs)
                    .addComponent(jtfObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlGosta)
                    .addComponent(jtfGosta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNaoGosta)
                    .addComponent(jtfNaoGosta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbProximo)
                    .addComponent(jbAnterior))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNaoGostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNaoGostaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNaoGostaActionPerformed

    private void jtfHorarioLancheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfHorarioLancheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfHorarioLancheActionPerformed

    private void jtfHorarioJantarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfHorarioJantarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfHorarioJantarActionPerformed

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

    public JTextArea getJtaAlmoco() {
        return jtaAlmoco;
    }

    public void setJtaAlmoco(JTextArea jtaAlmoco) {
        this.jtaAlmoco = jtaAlmoco;
    }

    public JTextArea getJtaCeia() {
        return jtaCeia;
    }

    public void setJtaCeia(JTextArea jtaCeia) {
        this.jtaCeia = jtaCeia;
    }

    public JTextArea getJtaColacao() {
        return jtaColacao;
    }

    public void setJtaColacao(JTextArea jtaColacao) {
        this.jtaColacao = jtaColacao;
    }

    public JTextArea getJtaDesjejum() {
        return jtaDesjejum;
    }

    public void setJtaDesjejum(JTextArea jtaDesjejum) {
        this.jtaDesjejum = jtaDesjejum;
    }

    public JTextArea getJtaJantar() {
        return jtaJantar;
    }

    public void setJtaJantar(JTextArea jtaJantar) {
        this.jtaJantar = jtaJantar;
    }

    public JTextArea getJtaLanche() {
        return jtaLanche;
    }

    public void setJtaLanche(JTextArea jtaLanche) {
        this.jtaLanche = jtaLanche;
    }

    public JTextField getJtfGosta() {
        return jtfGosta;
    }

    public void setJtfGosta(JTextField jtfGosta) {
        this.jtfGosta = jtfGosta;
    }

    public JTextField getJtfHorarioAlmoco() {
        return jtfHorarioAlmoco;
    }

    public void setJtfHorarioAlmoco(JTextField jtfHorarioAlmoco) {
        this.jtfHorarioAlmoco = jtfHorarioAlmoco;
    }

    public JTextField getJtfHorarioCeia() {
        return jtfHorarioCeia;
    }

    public void setJtfHorarioCeia(JTextField jtfHorarioCeia) {
        this.jtfHorarioCeia = jtfHorarioCeia;
    }

    public JTextField getJtfHorarioColacao() {
        return jtfHorarioColacao;
    }

    public void setJtfHorarioColacao(JTextField jtfHorarioColacao) {
        this.jtfHorarioColacao = jtfHorarioColacao;
    }

    public JTextField getJtfHorarioDesjejum() {
        return jtfHorarioDesjejum;
    }

    public void setJtfHorarioDesjejum(JTextField jtfHorarioDesjejum) {
        this.jtfHorarioDesjejum = jtfHorarioDesjejum;
    }

    public JTextField getJtfHorarioJantar() {
        return jtfHorarioJantar;
    }

    public void setJtfHorarioJantar(JTextField jtfHorarioJantar) {
        this.jtfHorarioJantar = jtfHorarioJantar;
    }

    public JTextField getJtfHorarioLanche() {
        return jtfHorarioLanche;
    }

    public void setJtfHorarioLanche(JTextField jtfHorarioLanche) {
        this.jtfHorarioLanche = jtfHorarioLanche;
    }

    public JTextField getJtfNaoGosta() {
        return jtfNaoGosta;
    }

    public void setJtfNaoGosta(JTextField jtfNaoGosta) {
        this.jtfNaoGosta = jtfNaoGosta;
    }

    public JTextField getJtfObs() {
        return jtfObs;
    }

    public void setJtfObs(JTextField jtfObs) {
        this.jtfObs = jtfObs;
    }

   

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgEtilismo;
    private javax.swing.ButtonGroup bgFumante;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbAnterior;
    private javax.swing.JButton jbProximo;
    private javax.swing.JLabel jbTituloSecao;
    private javax.swing.JLabel jlAlmoco;
    private javax.swing.JLabel jlCeia;
    private javax.swing.JLabel jlColacao;
    private javax.swing.JLabel jlDesjejum;
    private javax.swing.JLabel jlGosta;
    private javax.swing.JLabel jlJantar;
    private javax.swing.JLabel jlLanche;
    private javax.swing.JLabel jlNaoGosta;
    private javax.swing.JLabel jlObs;
    private javax.swing.JSeparator js1;
    private javax.swing.JTextArea jtaAlmoco;
    private javax.swing.JTextArea jtaCeia;
    private javax.swing.JTextArea jtaColacao;
    private javax.swing.JTextArea jtaDesjejum;
    private javax.swing.JTextArea jtaJantar;
    private javax.swing.JTextArea jtaLanche;
    private javax.swing.JTextField jtfGosta;
    private javax.swing.JTextField jtfHorarioAlmoco;
    private javax.swing.JTextField jtfHorarioCeia;
    private javax.swing.JTextField jtfHorarioColacao;
    private javax.swing.JTextField jtfHorarioDesjejum;
    private javax.swing.JTextField jtfHorarioJantar;
    private javax.swing.JTextField jtfHorarioLanche;
    private javax.swing.JTextField jtfNaoGosta;
    private javax.swing.JTextField jtfObs;
    // End of variables declaration//GEN-END:variables
}
