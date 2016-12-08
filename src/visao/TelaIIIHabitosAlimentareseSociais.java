package visao;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaIIIHabitosAlimentareseSociais extends javax.swing.JFrame {

    public TelaIIIHabitosAlimentareseSociais() {
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
        jlAlergia = new javax.swing.JLabel();
        jtfAlergia = new javax.swing.JTextField();
        jlAgua = new javax.swing.JLabel();
        jtfAgua = new javax.swing.JTextField();
        jtfEtilismo = new javax.swing.JLabel();
        jrbSimEtilismo = new javax.swing.JRadioButton();
        jrbNaoEtilismo = new javax.swing.JRadioButton();
        jlFumante = new javax.swing.JLabel();
        jrbSimFumante = new javax.swing.JRadioButton();
        jrbNaoFumante = new javax.swing.JRadioButton();
        jrbExFumante = new javax.swing.JRadioButton();
        jlSono = new javax.swing.JLabel();
        jtfSono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbTituloSecao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbTituloSecao.setText("III - Hábitos Alimentares e Sociais");

        jbProximo.setText("Próximo");

        jbAnterior.setText("Anterior");

        jlAlergia.setText("Alergia ou intolerância alimentar: ");

        jlAgua.setText("Água: ");

        jtfEtilismo.setText("Etilismo: ");

        bgEtilismo.add(jrbSimEtilismo);
        jrbSimEtilismo.setText("Sim");

        bgEtilismo.add(jrbNaoEtilismo);
        jrbNaoEtilismo.setText("Não");

        jlFumante.setText("Fumante");

        bgFumante.add(jrbSimFumante);
        jrbSimFumante.setText("Sim");

        bgFumante.add(jrbNaoFumante);
        jrbNaoFumante.setText("Não");

        bgFumante.add(jrbExFumante);
        jrbExFumante.setText("Ex");

        jlSono.setText("Sono: ");

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
                        .addGap(0, 327, Short.MAX_VALUE)
                        .addComponent(jbAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbProximo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlAlergia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfAlergia))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlAgua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfEtilismo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbSimEtilismo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbNaoEtilismo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlFumante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbSimFumante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbNaoFumante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbExFumante))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbTituloSecao)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlSono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfSono, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAlergia)
                    .addComponent(jtfAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAgua)
                    .addComponent(jtfAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfEtilismo)
                    .addComponent(jrbSimEtilismo)
                    .addComponent(jrbNaoEtilismo)
                    .addComponent(jlFumante)
                    .addComponent(jrbSimFumante)
                    .addComponent(jrbNaoFumante)
                    .addComponent(jrbExFumante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSono)
                    .addComponent(jtfSono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbProximo)
                    .addComponent(jbAnterior))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

   

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgEtilismo;
    private javax.swing.ButtonGroup bgFumante;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbAnterior;
    private javax.swing.JButton jbProximo;
    private javax.swing.JLabel jbTituloSecao;
    private javax.swing.JLabel jlAgua;
    private javax.swing.JLabel jlAlergia;
    private javax.swing.JLabel jlFumante;
    private javax.swing.JLabel jlSono;
    private javax.swing.JRadioButton jrbExFumante;
    private javax.swing.JRadioButton jrbNaoEtilismo;
    private javax.swing.JRadioButton jrbNaoFumante;
    private javax.swing.JRadioButton jrbSimEtilismo;
    private javax.swing.JRadioButton jrbSimFumante;
    private javax.swing.JSeparator js1;
    private javax.swing.JTextField jtfAgua;
    private javax.swing.JTextField jtfAlergia;
    private javax.swing.JLabel jtfEtilismo;
    private javax.swing.JTextField jtfSono;
    // End of variables declaration//GEN-END:variables
}
