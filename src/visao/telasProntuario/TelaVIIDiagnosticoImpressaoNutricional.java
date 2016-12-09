package visao.telasProntuario;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TelaVIIDiagnosticoImpressaoNutricional extends javax.swing.JFrame {

    public TelaVIIDiagnosticoImpressaoNutricional() {
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
        jlDiagnostico = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDiagnostico = new javax.swing.JTextArea();
        jlVerduras = new javax.swing.JLabel();
        jcbVerduras = new javax.swing.JComboBox<>();
        jcbFrutas = new javax.swing.JComboBox<>();
        Frutas = new javax.swing.JLabel();
        jcbRefrigerantes = new javax.swing.JComboBox<>();
        jlRefrigerantes = new javax.swing.JLabel();
        jcbDoces = new javax.swing.JComboBox<>();
        jlDoces = new javax.swing.JLabel();
        jcbFastFood = new javax.swing.JComboBox<>();
        jlFastFood = new javax.swing.JLabel();
        jcbFrituras = new javax.swing.JComboBox<>();
        jlFrituras = new javax.swing.JLabel();
        jcbPaes = new javax.swing.JComboBox<>();
        jlPaes = new javax.swing.JLabel();
        jlLegenda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbTituloSecao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbTituloSecao.setText("VII - Diagnóstico / Impressão Nutricional");

        jbProximo.setText("Próximo");

        jbAnterior.setText("Anterior");

        jlDiagnostico.setText("Diagnóstico / Impressão nutricional: ");

        jtaDiagnostico.setColumns(20);
        jtaDiagnostico.setRows(5);
        jScrollPane1.setViewportView(jtaDiagnostico);

        jlVerduras.setText("Verduras");

        jcbVerduras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P", "D", "R", "M" }));

        jcbFrutas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P", "D", "R", "M" }));

        Frutas.setText("Frutas");

        jcbRefrigerantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P", "D", "R", "M" }));

        jlRefrigerantes.setText("Refrigerentes");

        jcbDoces.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P", "D", "R", "M" }));

        jlDoces.setText("Doces");

        jcbFastFood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P", "D", "R", "M" }));

        jlFastFood.setText("Fast food");

        jcbFrituras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P", "D", "R", "M" }));

        jlFrituras.setText("Frituras");

        jcbPaes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P", "D", "R", "M" }));

        jlPaes.setText("Pães/Bolos/Biscoitos");

        jlLegenda.setText("P- pouco / D - diário / R - raro / M - muito ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(js1)
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbTituloSecao)
                            .addComponent(jlDiagnostico))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlVerduras)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcbVerduras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Frutas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcbFrutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlRefrigerantes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcbRefrigerantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlDoces)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcbDoces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlPaes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcbPaes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlFrituras)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcbFrituras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jlFastFood)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcbFastFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(jlLegenda))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbProximo)))
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
                .addComponent(jlDiagnostico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlVerduras)
                    .addComponent(jcbVerduras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Frutas)
                    .addComponent(jcbFrutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlRefrigerantes)
                    .addComponent(jcbRefrigerantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDoces)
                    .addComponent(jcbDoces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPaes)
                    .addComponent(jcbPaes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFrituras)
                    .addComponent(jcbFrituras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFastFood)
                    .addComponent(jcbFastFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlLegenda)
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

    public JComboBox<String> getJcbDoces() {
        return jcbDoces;
    }

    public void setJcbDoces(JComboBox<String> jcbDoces) {
        this.jcbDoces = jcbDoces;
    }

    public JComboBox<String> getJcbFastFood() {
        return jcbFastFood;
    }

    public void setJcbFastFood(JComboBox<String> jcbFastFood) {
        this.jcbFastFood = jcbFastFood;
    }

    public JComboBox<String> getJcbFrituras() {
        return jcbFrituras;
    }

    public void setJcbFrituras(JComboBox<String> jcbFrituras) {
        this.jcbFrituras = jcbFrituras;
    }

    public JComboBox<String> getJcbFrutas() {
        return jcbFrutas;
    }

    public void setJcbFrutas(JComboBox<String> jcbFrutas) {
        this.jcbFrutas = jcbFrutas;
    }

    public JComboBox<String> getJcbPaes() {
        return jcbPaes;
    }

    public void setJcbPaes(JComboBox<String> jcbPaes) {
        this.jcbPaes = jcbPaes;
    }

    public JComboBox<String> getJcbRefrigerantes() {
        return jcbRefrigerantes;
    }

    public void setJcbRefrigerantes(JComboBox<String> jcbRefrigerantes) {
        this.jcbRefrigerantes = jcbRefrigerantes;
    }

    public JComboBox<String> getJcbVerduras() {
        return jcbVerduras;
    }

    public void setJcbVerduras(JComboBox<String> jcbVerduras) {
        this.jcbVerduras = jcbVerduras;
    }

    public JTextArea getJtaDiagnostico() {
        return jtaDiagnostico;
    }

    public void setJtaDiagnostico(JTextArea jtaDiagnostico) {
        this.jtaDiagnostico = jtaDiagnostico;
    }

    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Frutas;
    private javax.swing.ButtonGroup bgEtilismo;
    private javax.swing.ButtonGroup bgFumante;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbAnterior;
    private javax.swing.JButton jbProximo;
    private javax.swing.JLabel jbTituloSecao;
    private javax.swing.JComboBox<String> jcbDoces;
    private javax.swing.JComboBox<String> jcbFastFood;
    private javax.swing.JComboBox<String> jcbFrituras;
    private javax.swing.JComboBox<String> jcbFrutas;
    private javax.swing.JComboBox<String> jcbPaes;
    private javax.swing.JComboBox<String> jcbRefrigerantes;
    private javax.swing.JComboBox<String> jcbVerduras;
    private javax.swing.JLabel jlDiagnostico;
    private javax.swing.JLabel jlDoces;
    private javax.swing.JLabel jlFastFood;
    private javax.swing.JLabel jlFrituras;
    private javax.swing.JLabel jlLegenda;
    private javax.swing.JLabel jlPaes;
    private javax.swing.JLabel jlRefrigerantes;
    private javax.swing.JLabel jlVerduras;
    private javax.swing.JSeparator js1;
    private javax.swing.JTextArea jtaDiagnostico;
    // End of variables declaration//GEN-END:variables
}
