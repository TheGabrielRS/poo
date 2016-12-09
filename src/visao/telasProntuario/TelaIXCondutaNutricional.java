package visao.telasProntuario;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaIXCondutaNutricional extends javax.swing.JFrame {

    public TelaIXCondutaNutricional() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgEtilismo = new javax.swing.ButtonGroup();
        bgFumante = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jbTituloSecao = new javax.swing.JLabel();
        js1 = new javax.swing.JSeparator();
        jbFinalizar = new javax.swing.JButton();
        jbAnterior = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jlVet = new javax.swing.JLabel();
        jlDescricao = new javax.swing.JLabel();
        jftfVet = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescricao = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaOrientacoes = new javax.swing.JTextArea();
        jlOrientacoes = new javax.swing.JLabel();

        jScrollPane3.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbTituloSecao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbTituloSecao.setText("IX - Conduta Nutricional");

        jbFinalizar.setText("Finalizar");
        jbFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFinalizarActionPerformed(evt);
            }
        });

        jbAnterior.setText("Anterior");

        jlVet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlVet.setText("VET da dieta:");

        jlDescricao.setText("Descrição: ");

        jftfVet.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        jtaDescricao.setColumns(20);
        jtaDescricao.setRows(5);
        jScrollPane1.setViewportView(jtaDescricao);

        jtaOrientacoes.setColumns(20);
        jtaOrientacoes.setRows(5);
        jScrollPane2.setViewportView(jtaOrientacoes);

        jlOrientacoes.setText("Orientações: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(js1)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlOrientacoes)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbTituloSecao)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlVet)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jftfVet, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlDescricao)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 9, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbFinalizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbAnterior)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jbTituloSecao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(js1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlVet)
                    .addComponent(jftfVet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlOrientacoes)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbFinalizar)
                    .addComponent(jbAnterior))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFinalizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbFinalizarActionPerformed

    public JButton getJbAnterior() {
        return jbAnterior;
    }

    public void setJbAnterior(JButton jbAnterior) {
        this.jbAnterior = jbAnterior;
    }

    public JButton getJbFinalizar() {
        return jbFinalizar;
    }

    public void setJbFinalizar(JButton jbFinalizar) {
        this.jbFinalizar = jbFinalizar;
    }

   

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgEtilismo;
    private javax.swing.ButtonGroup bgFumante;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTree jTree1;
    private javax.swing.JButton jbAnterior;
    private javax.swing.JButton jbFinalizar;
    private javax.swing.JLabel jbTituloSecao;
    private javax.swing.JFormattedTextField jftfVet;
    private javax.swing.JLabel jlDescricao;
    private javax.swing.JLabel jlOrientacoes;
    private javax.swing.JLabel jlVet;
    private javax.swing.JSeparator js1;
    private javax.swing.JTextArea jtaDescricao;
    private javax.swing.JTextArea jtaOrientacoes;
    // End of variables declaration//GEN-END:variables
}
