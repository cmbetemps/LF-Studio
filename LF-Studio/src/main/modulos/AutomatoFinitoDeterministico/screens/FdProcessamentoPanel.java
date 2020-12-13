/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modulos.AutomatoFinitoDeterministico.screens;

import main.modulos.AutomatoFinitoDeterministico.InjectionFd;
import main.modulos.AutomatoFinitoNaoDeterministico.controllers.Injection;

/**
 *
 * @author michel
 */
public class FdProcessamentoPanel extends javax.swing.JPanel {
  javax.swing.JPanel JanelaExecucao;

  public FdProcessamentoPanel(javax.swing.JPanel janela) {
    JanelaExecucao = janela;
    initComponents();
  }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodyFd = new javax.swing.JPanel();
        FD_SubtituloProcessamento = new javax.swing.JLabel();
        FD_BodyProcessamento = new javax.swing.JPanel();
        FD_validarBtn = new javax.swing.JLabel();
        FD_inputEntrada = new javax.swing.JTextField();
        FD_labelEntrada = new javax.swing.JLabel();
        FD_TituloProcessamento = new javax.swing.JLabel();

        setBackground(new java.awt.Color(28, 28, 28));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        bodyFd.setBackground(new java.awt.Color(28, 28, 28));
        bodyFd.setPreferredSize(new java.awt.Dimension(1280, 720));

        FD_SubtituloProcessamento.setBackground(new java.awt.Color(70, 71, 74));
        FD_SubtituloProcessamento.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        FD_SubtituloProcessamento.setForeground(new java.awt.Color(255, 255, 255));
        FD_SubtituloProcessamento.setText("Processamento");

        FD_BodyProcessamento.setBackground(new java.awt.Color(10, 10, 10));
        FD_BodyProcessamento.setForeground(new java.awt.Color(204, 204, 204));
        FD_BodyProcessamento.setPreferredSize(new java.awt.Dimension(360, 321));

        javax.swing.GroupLayout FD_BodyProcessamentoLayout = new javax.swing.GroupLayout(FD_BodyProcessamento);
        FD_BodyProcessamento.setLayout(FD_BodyProcessamentoLayout);
        FD_BodyProcessamentoLayout.setHorizontalGroup(
            FD_BodyProcessamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        FD_BodyProcessamentoLayout.setVerticalGroup(
            FD_BodyProcessamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );

        FD_validarBtn.setBackground(new java.awt.Color(51, 51, 51));
        FD_validarBtn.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        FD_validarBtn.setForeground(new java.awt.Color(255, 255, 255));
        FD_validarBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FD_validarBtn.setText("Validar Palavra");
        FD_validarBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FD_validarBtn.setOpaque(true);
        FD_validarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FD_validarBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FD_validarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FD_validarBtnMouseExited(evt);
            }
        });

        FD_inputEntrada.setBackground(new java.awt.Color(255, 255, 255));

        FD_labelEntrada.setBackground(new java.awt.Color(70, 71, 74));
        FD_labelEntrada.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        FD_labelEntrada.setForeground(new java.awt.Color(255, 255, 255));
        FD_labelEntrada.setText("Entrada");

        FD_TituloProcessamento.setFont(new java.awt.Font("Noto Sans", 0, 32)); // NOI18N
        FD_TituloProcessamento.setForeground(new java.awt.Color(255, 255, 255));
        FD_TituloProcessamento.setText("<html><p style=\"padding-bottom: 16px;\">Autômato Finito Determinístico</p></html>");
        FD_TituloProcessamento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout bodyFdLayout = new javax.swing.GroupLayout(bodyFd);
        bodyFd.setLayout(bodyFdLayout);
        bodyFdLayout.setHorizontalGroup(
            bodyFdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyFdLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(bodyFdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(FD_SubtituloProcessamento, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FD_TituloProcessamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                    .addComponent(FD_BodyProcessamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                    .addGroup(bodyFdLayout.createSequentialGroup()
                        .addComponent(FD_labelEntrada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FD_inputEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FD_validarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        bodyFdLayout.setVerticalGroup(
            bodyFdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyFdLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(FD_TituloProcessamento, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(FD_SubtituloProcessamento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(FD_BodyProcessamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(bodyFdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FD_labelEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(FD_inputEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(FD_validarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(336, Short.MAX_VALUE)
                    .addComponent(bodyFd, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(105, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 749, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(bodyFd, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                    .addGap(13, 13, 13)))
        );

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

  private void FD_validarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FD_validarBtnMouseClicked
    InjectionFd.getAutomato().reconhecer(FD_inputEntrada.getText().toCharArray());
  }//GEN-LAST:event_FD_validarBtnMouseClicked

  private void FD_validarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FD_validarBtnMouseEntered
    FD_validarBtn.setBackground(FD_validarBtn.getBackground().brighter().brighter());
  }//GEN-LAST:event_FD_validarBtnMouseEntered

  private void FD_validarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FD_validarBtnMouseExited
    FD_validarBtn.setBackground(FD_validarBtn.getBackground().darker().darker());
  }//GEN-LAST:event_FD_validarBtnMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FD_BodyProcessamento;
    private javax.swing.JLabel FD_SubtituloProcessamento;
    private javax.swing.JLabel FD_TituloProcessamento;
    private javax.swing.JTextField FD_inputEntrada;
    private javax.swing.JLabel FD_labelEntrada;
    private javax.swing.JLabel FD_validarBtn;
    private javax.swing.JPanel bodyFd;
    // End of variables declaration//GEN-END:variables
}
