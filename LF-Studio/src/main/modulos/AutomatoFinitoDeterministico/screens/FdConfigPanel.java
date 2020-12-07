/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modulos.AutomatoFinitoDeterministico.screens;

import main.LFStudio;
import main.modulos.AutomatoFinitoDeterministico.controllers.AutomatoFinitoController;
import main.layout.CustomTable;
import main.modulos.AutomatoFinitoDeterministico.domain.model.AFD;
import main.modulos.AutomatoFinitoDeterministico.validators.AFDValidator;

import javax.swing.*;

/*
 * @author michel
 */
public class FdConfigPanel extends javax.swing.JPanel {
  javax.swing.JPanel JanelaExecucao;
  AutomatoFinitoController controller = new AutomatoFinitoController();
  AFDValidator validator = new AFDValidator();

  public FdConfigPanel(javax.swing.JPanel janela) {
    this.JanelaExecucao = janela;
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    FDAutomato = new javax.swing.JPanel();
    FD_BodyConfig = new javax.swing.JPanel();
    FD_LabelAlfabeto = new javax.swing.JLabel();
    FD_LabelEstadosFinais = new javax.swing.JLabel();
    FD_LabelEstados = new javax.swing.JLabel();
    FD_LabelEstadoInicial1 = new javax.swing.JLabel();
    FD_LabelTabelaTransicao1 = new javax.swing.JLabel();
    FD_TextFieldAlfabeto = new javax.swing.JTextField();
    FD_jScrollPane = new javax.swing.JScrollPane();
    FD_jTable = new javax.swing.JTable();
    FD_TextFieldEstados = new javax.swing.JTextField();
    FD_TextFieldEstadoInicial1 = new javax.swing.JTextField();
    FD_TextFieldEstadosFinais1 = new javax.swing.JTextField();
    FD_ConfigTitulo = new javax.swing.JLabel();
    FD_ConfigSubTitulo = new javax.swing.JLabel();
    FD_salvarAutomatoBtn = new javax.swing.JLabel();
    FD_processarAutomatoBtn = new javax.swing.JLabel();

    setBackground(new java.awt.Color(28, 28, 28));

    FDAutomato.setBackground(new java.awt.Color(28, 28, 28));

    FD_BodyConfig.setBackground(new java.awt.Color(28, 28, 28));
    FD_BodyConfig.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    FD_BodyConfig.setForeground(new java.awt.Color(51, 51, 51));

    FD_LabelAlfabeto.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
    FD_LabelAlfabeto.setForeground(new java.awt.Color(255, 255, 255));
    FD_LabelAlfabeto.setText("Alfabeto");

    FD_LabelEstadosFinais.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
    FD_LabelEstadosFinais.setForeground(new java.awt.Color(255, 255, 255));
    FD_LabelEstadosFinais.setText("Estados Finais");

    FD_LabelEstados.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
    FD_LabelEstados.setForeground(new java.awt.Color(255, 255, 255));
    FD_LabelEstados.setText("Estados");

    FD_LabelEstadoInicial1.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
    FD_LabelEstadoInicial1.setForeground(new java.awt.Color(255, 255, 255));
    FD_LabelEstadoInicial1.setText("Estado Inicial");

    FD_LabelTabelaTransicao1.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
    FD_LabelTabelaTransicao1.setForeground(new java.awt.Color(255, 255, 255));
    FD_LabelTabelaTransicao1.setText("Tabela de Transições");

    FD_TextFieldAlfabeto.setBackground(new java.awt.Color(255, 255, 255));
    FD_TextFieldAlfabeto.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
    FD_TextFieldAlfabeto.setForeground(new java.awt.Color(0, 0, 0));
    FD_TextFieldAlfabeto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    FD_TextFieldAlfabeto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FD_TextFieldAlfabetoActionPerformed(evt);
      }
    });
    FD_TextFieldAlfabeto.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        FD_TextFieldAlfabetoKeyReleased(evt);
      }
    });

    FD_jTable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {"q0", "q0", "q2"},
        {"q1", "q1", "q1"},
        {"q2", "q2", "q2"}
      },
      new String [] {
        "Estados", "0", "1"
      }
    ));
    FD_jScrollPane.setViewportView(FD_jTable);

    FD_TextFieldEstados.setBackground(new java.awt.Color(255, 255, 255));
    FD_TextFieldEstados.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
    FD_TextFieldEstados.setForeground(new java.awt.Color(0, 0, 0));
    FD_TextFieldEstados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    FD_TextFieldEstados.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        FD_TextFieldEstadosKeyReleased(evt);
      }
    });

    FD_TextFieldEstadoInicial1.setBackground(new java.awt.Color(255, 255, 255));
    FD_TextFieldEstadoInicial1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
    FD_TextFieldEstadoInicial1.setForeground(new java.awt.Color(0, 0, 0));
    FD_TextFieldEstadoInicial1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    FD_TextFieldEstadoInicial1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FD_TextFieldEstadoInicial1ActionPerformed(evt);
      }
    });

    FD_TextFieldEstadosFinais1.setBackground(new java.awt.Color(255, 255, 255));
    FD_TextFieldEstadosFinais1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
    FD_TextFieldEstadosFinais1.setForeground(new java.awt.Color(0, 0, 0));
    FD_TextFieldEstadosFinais1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    FD_TextFieldEstadosFinais1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FD_TextFieldEstadosFinais1ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout FD_BodyConfigLayout = new javax.swing.GroupLayout(FD_BodyConfig);
    FD_BodyConfig.setLayout(FD_BodyConfigLayout);
    FD_BodyConfigLayout.setHorizontalGroup(
      FD_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FD_BodyConfigLayout.createSequentialGroup()
          .addGap(35, 35, 35)
          .addGroup(FD_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(FD_jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FD_BodyConfigLayout.createSequentialGroup()
              .addGroup(FD_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(FD_LabelEstadoInicial1)
                .addComponent(FD_LabelEstados)
                .addComponent(FD_LabelEstadosFinais)
                .addComponent(FD_LabelAlfabeto))
              .addGap(88, 88, 88)
              .addGroup(FD_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(FD_TextFieldEstadosFinais1)
                .addComponent(FD_TextFieldEstados)
                .addComponent(FD_TextFieldEstadoInicial1)
                .addComponent(FD_TextFieldAlfabeto))))
          .addGap(18, 18, 18))
        .addGroup(FD_BodyConfigLayout.createSequentialGroup()
          .addGap(114, 114, 114)
          .addComponent(FD_LabelTabelaTransicao1)
          .addContainerGap(156, Short.MAX_VALUE))
    );
    FD_BodyConfigLayout.setVerticalGroup(
      FD_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(FD_BodyConfigLayout.createSequentialGroup()
          .addGap(20, 20, 20)
          .addGroup(FD_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(FD_LabelAlfabeto)
            .addComponent(FD_TextFieldAlfabeto))
          .addGap(10, 10, 10)
          .addGroup(FD_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FD_LabelEstadosFinais)
            .addComponent(FD_TextFieldEstadosFinais1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGap(10, 10, 10)
          .addGroup(FD_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(FD_TextFieldEstadoInicial1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(FD_LabelEstadoInicial1))
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
          .addGroup(FD_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(FD_LabelEstados)
            .addComponent(FD_TextFieldEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
          .addComponent(FD_LabelTabelaTransicao1)
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addComponent(FD_jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGap(14, 14, 14))
    );

    FD_ConfigTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
    FD_ConfigTitulo.setForeground(new java.awt.Color(255, 255, 255));
    FD_ConfigTitulo.setText("<html><p style=\"padding-bottom: 16px;\">Autômato FD</p></html>");
    FD_ConfigTitulo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

    FD_ConfigSubTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
    FD_ConfigSubTitulo.setForeground(new java.awt.Color(255, 255, 255));
    FD_ConfigSubTitulo.setText("Configuração");

    FD_salvarAutomatoBtn.setBackground(new java.awt.Color(51, 51, 51));
    FD_salvarAutomatoBtn.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
    FD_salvarAutomatoBtn.setForeground(new java.awt.Color(255, 255, 255));
    FD_salvarAutomatoBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    FD_salvarAutomatoBtn.setText("Salvar Automato");
    FD_salvarAutomatoBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    FD_salvarAutomatoBtn.setOpaque(true);
    FD_salvarAutomatoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        FD_salvarAutomatoBtnMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        FD_salvarAutomatoBtnMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        FD_salvarAutomatoBtnMouseExited(evt);
      }
    });

    FD_processarAutomatoBtn.setBackground(new java.awt.Color(51, 51, 51));
    FD_processarAutomatoBtn.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
    FD_processarAutomatoBtn.setForeground(new java.awt.Color(255, 255, 255));
    FD_processarAutomatoBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    FD_processarAutomatoBtn.setText("Processar Automato");
    FD_processarAutomatoBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    FD_processarAutomatoBtn.setOpaque(true);
    FD_processarAutomatoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        FD_processarAutomatoBtnMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        FD_processarAutomatoBtnMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        FD_processarAutomatoBtnMouseExited(evt);
      }
    });

    javax.swing.GroupLayout FDAutomatoLayout = new javax.swing.GroupLayout(FDAutomato);
    FDAutomato.setLayout(FDAutomatoLayout);
    FDAutomatoLayout.setHorizontalGroup(
      FDAutomatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(FDAutomatoLayout.createSequentialGroup()
          .addGap(40, 40, 40)
          .addGroup(FDAutomatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(FD_salvarAutomatoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(FD_processarAutomatoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(FDAutomatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(FD_ConfigSubTitulo)
              .addComponent(FD_BodyConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FDAutomatoLayout.createSequentialGroup()
          .addContainerGap(179, Short.MAX_VALUE)
          .addComponent(FD_ConfigTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGap(181, 181, 181))
    );
    FDAutomatoLayout.setVerticalGroup(
      FDAutomatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(FDAutomatoLayout.createSequentialGroup()
          .addContainerGap()
          .addComponent(FD_ConfigTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGap(18, 18, 18)
          .addComponent(FD_ConfigSubTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGap(11, 11, 11)
          .addComponent(FD_BodyConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
          .addComponent(FD_salvarAutomatoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
          .addComponent(FD_processarAutomatoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGap(56, 56, 56))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGap(0, 0, 0)
          .addComponent(FDAutomato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGap(0, 0, 0)
          .addComponent(FDAutomato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    getAccessibleContext().setAccessibleParent(this);
  }// </editor-fold>//GEN-END:initComponents

  private void FD_TextFieldAlfabetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FD_TextFieldAlfabetoActionPerformed
  }//GEN-LAST:event_FD_TextFieldAlfabetoActionPerformed

  private void FD_TextFieldAlfabetoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FD_TextFieldAlfabetoKeyReleased
    CustomTable tableModel = controller.insertTabela(validator.separarPorVirgula(FD_TextFieldEstados), validator.separarPorVirgula(FD_TextFieldAlfabeto));
    FD_jTable.setModel(tableModel);
  }//GEN-LAST:event_FD_TextFieldAlfabetoKeyReleased

  private void FD_TextFieldEstadoInicial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FD_TextFieldEstadoInicial1ActionPerformed
  }//GEN-LAST:event_FD_TextFieldEstadoInicial1ActionPerformed

  private void FD_TextFieldEstadosFinais1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FD_TextFieldEstadosFinais1ActionPerformed
  }//GEN-LAST:event_FD_TextFieldEstadosFinais1ActionPerformed

  private void FD_salvarAutomatoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FD_salvarAutomatoBtnMouseClicked
  }//GEN-LAST:event_FD_salvarAutomatoBtnMouseClicked

  private void FD_processarAutomatoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FD_processarAutomatoBtnMouseClicked
    try{
      AFD automato = controller.gerarAutomato(
        FD_TextFieldAlfabeto.getText(), FD_jTable, FD_LabelEstadoInicial1.getText(), FD_TextFieldEstadosFinais1.getText()
      );
      if(controller.processarAutomato(automato) == true){
        LFStudio.cl.show(JanelaExecucao, "fdProcessamentoPanel");
      }
    } catch (Exception e){
      JOptionPane.showMessageDialog(null, e.getMessage());
    }

  }//GEN-LAST:event_FD_processarAutomatoBtnMouseClicked

  private void FD_salvarAutomatoBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FD_salvarAutomatoBtnMouseEntered
    FD_salvarAutomatoBtn.setBackground(FD_salvarAutomatoBtn.getBackground().brighter().brighter());
  }//GEN-LAST:event_FD_salvarAutomatoBtnMouseEntered

  private void FD_salvarAutomatoBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FD_salvarAutomatoBtnMouseExited
    FD_salvarAutomatoBtn.setBackground(FD_salvarAutomatoBtn.getBackground().darker().darker());
  }//GEN-LAST:event_FD_salvarAutomatoBtnMouseExited

  private void FD_processarAutomatoBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FD_processarAutomatoBtnMouseEntered
    FD_processarAutomatoBtn.setBackground(FD_processarAutomatoBtn.getBackground().brighter().brighter());    }//GEN-LAST:event_FD_processarAutomatoBtnMouseEntered

  private void FD_processarAutomatoBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FD_processarAutomatoBtnMouseExited
    FD_processarAutomatoBtn.setBackground(FD_processarAutomatoBtn.getBackground().darker().darker());
  }//GEN-LAST:event_FD_processarAutomatoBtnMouseExited

  private void FD_TextFieldEstadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FD_TextFieldEstadosKeyReleased
    CustomTable tableModel = controller.insertTabela(validator.separarPorVirgula( FD_TextFieldEstados), validator.separarPorVirgula( FD_TextFieldAlfabeto));
    FD_jTable.setModel(tableModel);
  }//GEN-LAST:event_FD_TextFieldEstadosKeyReleased

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel FDAutomato;
  private javax.swing.JPanel FD_BodyConfig;
  private javax.swing.JLabel FD_ConfigSubTitulo;
  private javax.swing.JLabel FD_ConfigTitulo;
  private javax.swing.JLabel FD_LabelAlfabeto;
  private javax.swing.JLabel FD_LabelEstadoInicial1;
  private javax.swing.JLabel FD_LabelEstados;
  private javax.swing.JLabel FD_LabelEstadosFinais;
  private javax.swing.JLabel FD_LabelTabelaTransicao1;
  private javax.swing.JTextField FD_TextFieldAlfabeto;
  private javax.swing.JTextField FD_TextFieldEstadoInicial1;
  private javax.swing.JTextField FD_TextFieldEstados;
  private javax.swing.JTextField FD_TextFieldEstadosFinais1;
  private javax.swing.JScrollPane FD_jScrollPane;
  private javax.swing.JTable FD_jTable;
  private javax.swing.JLabel FD_processarAutomatoBtn;
  private javax.swing.JLabel FD_salvarAutomatoBtn;
  // End of variables declaration//GEN-END:variables


}
