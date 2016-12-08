package visao;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaIDadosPessoais extends javax.swing.JFrame {

    public TelaIDadosPessoais() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbTituloSecao = new javax.swing.JLabel();
        js1 = new javax.swing.JSeparator();
        jlNome = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jlProfissao = new javax.swing.JLabel();
        jtfProfissao = new javax.swing.JTextField();
        jlSexo = new javax.swing.JLabel();
        jcbSexo = new javax.swing.JComboBox<>();
        jlIdade = new javax.swing.JLabel();
        jlNaturalidade = new javax.swing.JLabel();
        jtfNaturalidade = new javax.swing.JTextField();
        jlLocalTrabalho = new javax.swing.JLabel();
        jtfLocalTrabalho = new javax.swing.JTextField();
        jlHorarioTrabalho = new javax.swing.JLabel();
        jtfHorarioTrabalho = new javax.swing.JTextField();
        jlDataNasc = new javax.swing.JLabel();
        js2 = new javax.swing.JSeparator();
        jlPeso = new javax.swing.JLabel();
        jlAltura = new javax.swing.JLabel();
        jlBia = new javax.swing.JLabel();
        jlPu = new javax.swing.JLabel();
        jlPP = new javax.swing.JLabel();
        jlCB = new javax.swing.JLabel();
        jlIMC = new javax.swing.JLabel();
        jlDCT = new javax.swing.JLabel();
        jbProximo = new javax.swing.JButton();
        jbAnterior = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jftfDataCriacao = new javax.swing.JFormattedTextField();
        jtftDataNasc = new javax.swing.JFormattedTextField();
        jtftIdade = new javax.swing.JFormattedTextField();
        jtftPeso = new javax.swing.JFormattedTextField();
        jtftPU = new javax.swing.JFormattedTextField();
        jtftAltura = new javax.swing.JFormattedTextField();
        jtftPP = new javax.swing.JFormattedTextField();
        jtftBia = new javax.swing.JFormattedTextField();
        jtftIMC = new javax.swing.JFormattedTextField();
        jtftCB = new javax.swing.JFormattedTextField();
        jtftDCT = new javax.swing.JFormattedTextField();
        jlCPF = new javax.swing.JLabel();
        jftfCPF = new javax.swing.JFormattedTextField();
        jlDCS = new javax.swing.JLabel();
        jftfDCS = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbTituloSecao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbTituloSecao.setText("I - Dados Pessoais");

        jlNome.setText("Nome: ");

        jlProfissao.setText("Profissão: ");

        jtfProfissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfProfissaoActionPerformed(evt);
            }
        });

        jlSexo.setText("Sexo: ");

        jcbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        jcbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSexoActionPerformed(evt);
            }
        });

        jlIdade.setText("Idade: ");

        jlNaturalidade.setText("Naturalidade: ");

        jlLocalTrabalho.setText("Local de trabalho:");

        jlHorarioTrabalho.setText("Horário de trabalho: ");

        jtfHorarioTrabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfHorarioTrabalhoActionPerformed(evt);
            }
        });

        jlDataNasc.setText("Data de Nascimento: ");

        jlPeso.setText("Peso: ");

        jlAltura.setText("Altura: ");

        jlBia.setText("Bia: ");

        jlPu.setText("PU: ");

        jlPP.setText("PP%: ");

        jlCB.setText("CB:");

        jlIMC.setText("IMC:");

        jlDCT.setText("DCT:");

        jbProximo.setText("Próximo");

        jbAnterior.setText("Anterior");
        jbAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnteriorActionPerformed(evt);
            }
        });

        jftfDataCriacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jftfDataCriacao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jtftDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jtftDataNasc.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jtftIdade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jtftPeso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jtftPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtftPesoActionPerformed(evt);
            }
        });

        jtftPU.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        jtftAltura.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        jtftPP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        jtftBia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        jtftIMC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        jtftCB.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        jtftDCT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        jlCPF.setText("CPF: ");

        jftfCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jlDCS.setText("DCS:");

        jftfDCS.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(js1)
            .addComponent(jSeparator3)
            .addComponent(js2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlDataNasc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtftDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtftPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlAltura))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlPu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(jtftPU, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlPP)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtftAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlBia, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtftBia, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jlIMC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtftIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtftPP, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlCB)
                                        .addGap(8, 8, 8)
                                        .addComponent(jtftCB, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtftDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlDCS, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jftfDCS, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbProximo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbTituloSecao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jftfDataCriacao, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlIdade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtftIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlNaturalidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlProfissao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfProfissao))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlLocalTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlHorarioTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfLocalTrabalho)
                                    .addComponent(jtfHorarioTrabalho)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNome)
                                    .addComponent(jlCPF))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfNome)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jftfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbTituloSecao)
                    .addComponent(jftfDataCriacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(js1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCPF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jftfCPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSexo)
                    .addComponent(jcbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlIdade)
                    .addComponent(jlNaturalidade)
                    .addComponent(jtfNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtftIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlProfissao)
                    .addComponent(jtfProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLocalTrabalho)
                    .addComponent(jtfLocalTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlHorarioTrabalho)
                    .addComponent(jtfHorarioTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDataNasc)
                    .addComponent(jtftDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(js2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPeso)
                    .addComponent(jlIMC)
                    .addComponent(jlBia)
                    .addComponent(jlAltura)
                    .addComponent(jtftPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtftAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtftBia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtftIMC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlDCS)
                        .addComponent(jftfDCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPu)
                    .addComponent(jlDCT)
                    .addComponent(jlCB)
                    .addComponent(jlPP)
                    .addComponent(jtftPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtftPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtftDCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtftCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbProximo)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbAnterior)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbSexoActionPerformed

    private void jtfHorarioTrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfHorarioTrabalhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfHorarioTrabalhoActionPerformed

    private void jtfProfissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfProfissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfProfissaoActionPerformed

    private void jbAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAnteriorActionPerformed

    private void jtftPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtftPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtftPesoActionPerformed

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

    public JComboBox<String> getJcbSexo() {
        return jcbSexo;
    }

    public void setJcbSexo(JComboBox<String> jcbSexo) {
        this.jcbSexo = jcbSexo;
    }

    public JFormattedTextField getJftfDataCriacao() {
        return jftfDataCriacao;
    }

    public void setJftfDataCriacao(JFormattedTextField jftfDataCriacao) {
        this.jftfDataCriacao = jftfDataCriacao;
    }

    public JTextField getJtfHorarioTrabalho() {
        return jtfHorarioTrabalho;
    }

    public void setJtfHorarioTrabalho(JTextField jtfHorarioTrabalho) {
        this.jtfHorarioTrabalho = jtfHorarioTrabalho;
    }

    public JTextField getJtfLocalTrabalho() {
        return jtfLocalTrabalho;
    }

    public void setJtfLocalTrabalho(JTextField jtfLocalTrabalho) {
        this.jtfLocalTrabalho = jtfLocalTrabalho;
    }

    public JTextField getJtfNaturalidade() {
        return jtfNaturalidade;
    }

    public void setJtfNaturalidade(JTextField jtfNaturalidade) {
        this.jtfNaturalidade = jtfNaturalidade;
    }

    public JTextField getJtfNome() {
        return jtfNome;
    }

    public void setJtfNome(JTextField jtfNome) {
        this.jtfNome = jtfNome;
    }

    public JTextField getJtfProfissao() {
        return jtfProfissao;
    }

    public void setJtfProfissao(JTextField jtfProfissao) {
        this.jtfProfissao = jtfProfissao;
    }

    public JFormattedTextField getJtftAltura() {
        return jtftAltura;
    }

    public void setJtftAltura(JFormattedTextField jtftAltura) {
        this.jtftAltura = jtftAltura;
    }

    public JFormattedTextField getJtftBia() {
        return jtftBia;
    }

    public void setJtftBia(JFormattedTextField jtftBia) {
        this.jtftBia = jtftBia;
    }

    public JFormattedTextField getJtftCB() {
        return jtftCB;
    }

    public void setJtftCB(JFormattedTextField jtftCB) {
        this.jtftCB = jtftCB;
    }

    public JFormattedTextField getJtftDCT() {
        return jtftDCT;
    }

    public void setJtftDCT(JFormattedTextField jtftDCT) {
        this.jtftDCT = jtftDCT;
    }

    public JFormattedTextField getJtftDataNasc() {
        return jtftDataNasc;
    }

    public void setJtftDataNasc(JFormattedTextField jtftDataNasc) {
        this.jtftDataNasc = jtftDataNasc;
    }

    public JFormattedTextField getJtftIMC() {
        return jtftIMC;
    }

    public void setJtftIMC(JFormattedTextField jtftIMC) {
        this.jtftIMC = jtftIMC;
    }

    public JFormattedTextField getJtftIdade() {
        return jtftIdade;
    }

    public void setJtftIdade(JFormattedTextField jtftIdade) {
        this.jtftIdade = jtftIdade;
    }

    public JFormattedTextField getJtftPP() {
        return jtftPP;
    }

    public void setJtftPP(JFormattedTextField jtftPP) {
        this.jtftPP = jtftPP;
    }

    public JFormattedTextField getJtftPU() {
        return jtftPU;
    }

    public void setJtftPU(JFormattedTextField jtftPU) {
        this.jtftPU = jtftPU;
    }

    public JFormattedTextField getJtftPeso() {
        return jtftPeso;
    }

    public void setJtftPeso(JFormattedTextField jtftPeso) {
        this.jtftPeso = jtftPeso;
    }

    public JFormattedTextField getJftfCPF() {
        return jftfCPF;
    }

    public void setJftfCPF(JFormattedTextField jftfCPF) {
        this.jftfCPF = jftfCPF;
    }

    public JFormattedTextField getJftfDCS() {
        return jftfDCS;
    }

    public void setJftfDCS(JFormattedTextField jftfDCS) {
        this.jftfDCS = jftfDCS;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbAnterior;
    private javax.swing.JButton jbProximo;
    private javax.swing.JLabel jbTituloSecao;
    private javax.swing.JComboBox<String> jcbSexo;
    private javax.swing.JFormattedTextField jftfCPF;
    private javax.swing.JFormattedTextField jftfDCS;
    private javax.swing.JFormattedTextField jftfDataCriacao;
    private javax.swing.JLabel jlAltura;
    private javax.swing.JLabel jlBia;
    private javax.swing.JLabel jlCB;
    private javax.swing.JLabel jlCPF;
    private javax.swing.JLabel jlDCS;
    private javax.swing.JLabel jlDCT;
    private javax.swing.JLabel jlDataNasc;
    private javax.swing.JLabel jlHorarioTrabalho;
    private javax.swing.JLabel jlIMC;
    private javax.swing.JLabel jlIdade;
    private javax.swing.JLabel jlLocalTrabalho;
    private javax.swing.JLabel jlNaturalidade;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlPP;
    private javax.swing.JLabel jlPeso;
    private javax.swing.JLabel jlProfissao;
    private javax.swing.JLabel jlPu;
    private javax.swing.JLabel jlSexo;
    private javax.swing.JSeparator js1;
    private javax.swing.JSeparator js2;
    private javax.swing.JTextField jtfHorarioTrabalho;
    private javax.swing.JTextField jtfLocalTrabalho;
    private javax.swing.JTextField jtfNaturalidade;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfProfissao;
    private javax.swing.JFormattedTextField jtftAltura;
    private javax.swing.JFormattedTextField jtftBia;
    private javax.swing.JFormattedTextField jtftCB;
    private javax.swing.JFormattedTextField jtftDCT;
    private javax.swing.JFormattedTextField jtftDataNasc;
    private javax.swing.JFormattedTextField jtftIMC;
    private javax.swing.JFormattedTextField jtftIdade;
    private javax.swing.JFormattedTextField jtftPP;
    private javax.swing.JFormattedTextField jtftPU;
    private javax.swing.JFormattedTextField jtftPeso;
    // End of variables declaration//GEN-END:variables
}
