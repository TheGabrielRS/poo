package visao.telasProntuario;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
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
        jlElitismo = new javax.swing.JLabel();
        jrbSimEtilismo = new javax.swing.JRadioButton();
        jrbNaoEtilismo = new javax.swing.JRadioButton();
        jlFumante = new javax.swing.JLabel();
        jrbSimFumante = new javax.swing.JRadioButton();
        jrbNaoFumante = new javax.swing.JRadioButton();
        jrbExFumante = new javax.swing.JRadioButton();
        jlSono = new javax.swing.JLabel();
        jtfSono = new javax.swing.JTextField();
        jtfElitismo = new javax.swing.JTextField();
        jtfAnosCigarros = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbTituloSecao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbTituloSecao.setText("III - Hábitos Alimentares e Sociais");

        jbProximo.setText("Próximo");

        jbAnterior.setText("Anterior");

        jlAlergia.setText("Alergia ou intolerância alimentar: ");

        jlAgua.setText("Água: ");

        jlElitismo.setText("Etilismo: ");

        bgEtilismo.add(jrbSimEtilismo);
        jrbSimEtilismo.setText("Sim");

        bgEtilismo.add(jrbNaoEtilismo);
        jrbNaoEtilismo.setSelected(true);
        jrbNaoEtilismo.setText("Não");

        jlFumante.setText("Fumante");

        bgFumante.add(jrbSimFumante);
        jrbSimFumante.setText("Sim");

        bgFumante.add(jrbNaoFumante);
        jrbNaoFumante.setSelected(true);
        jrbNaoFumante.setText("Não");

        bgFumante.add(jrbExFumante);
        jrbExFumante.setText("Ex");

        jlSono.setText("Sono: ");

        jtfAnosCigarros.setText(" ");

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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbProximo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlAlergia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfAlergia))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlAgua)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlElitismo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbSimEtilismo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbNaoEtilismo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfElitismo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbTituloSecao)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlFumante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrbSimFumante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbNaoFumante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbExFumante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfAnosCigarros, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jlElitismo)
                    .addComponent(jrbSimEtilismo)
                    .addComponent(jrbNaoEtilismo)
                    .addComponent(jtfElitismo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlFumante)
                    .addComponent(jrbSimFumante)
                    .addComponent(jrbNaoFumante)
                    .addComponent(jrbExFumante)
                    .addComponent(jtfAnosCigarros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSono)
                    .addComponent(jtfSono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

    public ButtonGroup getBgEtilismo() {
        return bgEtilismo;
    }

    public void setBgEtilismo(ButtonGroup bgEtilismo) {
        this.bgEtilismo = bgEtilismo;
    }

    public ButtonGroup getBgFumante() {
        return bgFumante;
    }

    public void setBgFumante(ButtonGroup bgFumante) {
        this.bgFumante = bgFumante;
    }

    public JRadioButton getJrbExFumante() {
        return jrbExFumante;
    }

    public void setJrbExFumante(JRadioButton jrbExFumante) {
        this.jrbExFumante = jrbExFumante;
    }

    public JRadioButton getJrbNaoEtilismo() {
        return jrbNaoEtilismo;
    }

    public void setJrbNaoEtilismo(JRadioButton jrbNaoEtilismo) {
        this.jrbNaoEtilismo = jrbNaoEtilismo;
    }

    public JRadioButton getJrbNaoFumante() {
        return jrbNaoFumante;
    }

    public void setJrbNaoFumante(JRadioButton jrbNaoFumante) {
        this.jrbNaoFumante = jrbNaoFumante;
    }

    public JRadioButton getJrbSimEtilismo() {
        return jrbSimEtilismo;
    }

    public void setJrbSimEtilismo(JRadioButton jrbSimEtilismo) {
        this.jrbSimEtilismo = jrbSimEtilismo;
    }

    public JRadioButton getJrbSimFumante() {
        return jrbSimFumante;
    }

    public void setJrbSimFumante(JRadioButton jrbSimFumante) {
        this.jrbSimFumante = jrbSimFumante;
    }

    public JTextField getJtfAgua() {
        return jtfAgua;
    }

    public void setJtfAgua(JTextField jtfAgua) {
        this.jtfAgua = jtfAgua;
    }

    public JTextField getJtfAlergia() {
        return jtfAlergia;
    }

    public void setJtfAlergia(JTextField jtfAlergia) {
        this.jtfAlergia = jtfAlergia;
    }

    public JTextField getJtfSono() {
        return jtfSono;
    }

    public void setJtfSono(JTextField jtfSono) {
        this.jtfSono = jtfSono;
    }

    public JTextField getJtfElitismo() {
        return jtfElitismo;
    }

    public void setJtfElitismo(JTextField jtfElitismo) {
        this.jtfElitismo = jtfElitismo;
    }

    public JTextField getJtfAnosCigarros() {
        return jtfAnosCigarros;
    }

    public void setJtfAnosCigarros(JTextField jtfAnosCigarros) {
        this.jtfAnosCigarros = jtfAnosCigarros;
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
    private javax.swing.JLabel jlElitismo;
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
    private javax.swing.JTextField jtfAnosCigarros;
    private javax.swing.JTextField jtfElitismo;
    private javax.swing.JTextField jtfSono;
    // End of variables declaration//GEN-END:variables
}
