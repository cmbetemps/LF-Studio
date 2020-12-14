/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modulos.AutomatoFinitoDeterministico.screens;

import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import main.LFStudio;
import main.modulos.AutomatoFinitoDeterministico.FdInjection;
import main.modulos.AutomatoFinitoDeterministico.controllers.AFDController;
import main.modulos.AutomatoFinitoDeterministico.domain.AFD;
import main.modulos.Commons.FileChooser;

/**
 *
 * @author michel
 */
public class FdInicioPanel extends javax.swing.JPanel {
  javax.swing.JPanel JanelaExecucao;
  FdConfigPanel fdConfigPanel;
  AFDController controller = new AFDController();
  FileChooser file = new FileChooser();


  public FdInicioPanel(JPanel JanelaExecucao, FdConfigPanel fdConfigPanel) {
   this.JanelaExecucao = JanelaExecucao;
   this.fdConfigPanel = fdConfigPanel;
    initComponents();
  }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fndBody = new javax.swing.JPanel();
        FD_LabelAutomato = new javax.swing.JLabel();
        FD_LabelNovoAutomato = new javax.swing.JLabel();
        FD_LabelImportarAutomato = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(28, 28, 28));
        setMaximumSize(new java.awt.Dimension(1024, 720));
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setPreferredSize(new java.awt.Dimension(1024, 720));

        fndBody.setBackground(new java.awt.Color(28, 28, 28));
        fndBody.setMaximumSize(new java.awt.Dimension(1024, 720));
        fndBody.setMinimumSize(new java.awt.Dimension(1024, 720));
        fndBody.setPreferredSize(new java.awt.Dimension(1024, 720));

        FD_LabelAutomato.setFont(new java.awt.Font("Noto Sans", 0, 44)); // NOI18N
        FD_LabelAutomato.setForeground(new java.awt.Color(255, 255, 255));
        FD_LabelAutomato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FD_LabelAutomato.setText("<html><p style=\"padding-bottom: 16px;\">Autômato Finito Determinístico</p></html>");

        FD_LabelNovoAutomato.setBackground(new java.awt.Color(0, 0, 0));
        FD_LabelNovoAutomato.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        FD_LabelNovoAutomato.setForeground(new java.awt.Color(255, 255, 255));
        FD_LabelNovoAutomato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FD_LabelNovoAutomato.setText("Novo autômato");
        FD_LabelNovoAutomato.setAlignmentX(5.0F);
        FD_LabelNovoAutomato.setAlignmentY(5.0F);
        FD_LabelNovoAutomato.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FD_LabelNovoAutomato.setPreferredSize(new java.awt.Dimension(150, 22));
        FD_LabelNovoAutomato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FD_LabelNovoAutomatoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FD_LabelNovoAutomatoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FD_LabelNovoAutomatoMouseExited(evt);
            }
        });

        FD_LabelImportarAutomato.setBackground(new java.awt.Color(0, 0, 0));
        FD_LabelImportarAutomato.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        FD_LabelImportarAutomato.setForeground(new java.awt.Color(255, 255, 255));
        FD_LabelImportarAutomato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FD_LabelImportarAutomato.setText("Importar autômato");
        FD_LabelImportarAutomato.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FD_LabelImportarAutomato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FD_LabelImportarAutomatoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FD_LabelImportarAutomatoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FD_LabelImportarAutomatoMouseExited(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(28, 28, 28));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout fndBodyLayout = new javax.swing.GroupLayout(fndBody);
        fndBody.setLayout(fndBodyLayout);
        fndBodyLayout.setHorizontalGroup(
            fndBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fndBodyLayout.createSequentialGroup()
                .addGroup(fndBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FD_LabelNovoAutomato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FD_LabelImportarAutomato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(FD_LabelAutomato, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
            .addGroup(fndBodyLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fndBodyLayout.setVerticalGroup(
            fndBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fndBodyLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(FD_LabelAutomato, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(FD_LabelNovoAutomato, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FD_LabelImportarAutomato)
                .addContainerGap(316, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fndBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fndBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

  private void FD_LabelNovoAutomatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FD_LabelNovoAutomatoMouseClicked
    LFStudio.cl.show(JanelaExecucao,"fdConfigPanel");
  }//GEN-LAST:event_FD_LabelNovoAutomatoMouseClicked

  private void FD_LabelNovoAutomatoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FD_LabelNovoAutomatoMouseEntered
    Font f = FD_LabelNovoAutomato.getFont();
    FD_LabelNovoAutomato.setFont(f.deriveFont(f.getStyle(), f.getSize2D()+4));
  }//GEN-LAST:event_FD_LabelNovoAutomatoMouseEntered

  private void FD_LabelNovoAutomatoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FD_LabelNovoAutomatoMouseExited
    Font f = FD_LabelNovoAutomato.getFont();
    FD_LabelNovoAutomato.setFont(f.deriveFont(f.getStyle(), f.getSize2D()-4));
  }//GEN-LAST:event_FD_LabelNovoAutomatoMouseExited

  private void FD_LabelImportarAutomatoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FD_LabelImportarAutomatoMouseEntered
    Font f = FD_LabelImportarAutomato.getFont();
    FD_LabelImportarAutomato.setFont(f.deriveFont(f.getStyle(), f.getSize2D()+4));
  }//GEN-LAST:event_FD_LabelImportarAutomatoMouseEntered

  private void FD_LabelImportarAutomatoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FD_LabelImportarAutomatoMouseExited
    Font f = FD_LabelImportarAutomato.getFont();
    FD_LabelImportarAutomato.setFont(f.deriveFont(f.getStyle(), f.getSize2D()-4));
  }//GEN-LAST:event_FD_LabelImportarAutomatoMouseExited

    private void FD_LabelImportarAutomatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FD_LabelImportarAutomatoMouseClicked
        String pathAbsolute = file.getPathAbsolute();
        if(!pathAbsolute.contains(".json")){
          JOptionPane.showMessageDialog(null, "Formato do Arquivo invalido");
          return;
       }
       try {
         AFD automato  = controller.instanciationAutomato(pathAbsolute);
         if(automato != null && pathAbsolute != null){
             FdInjection.setAutomato(automato);
             this.fdConfigPanel.carregar();
               if(FdInjection.getAutomato()!= null){
                   LFStudio.cl.show(JanelaExecucao,"fdConfigPanel");
                   JOptionPane.showMessageDialog(null, "Automato lido com sucesso!!!");
               }
         }
       } catch (Exception ex){
          JOptionPane.showMessageDialog(null, "Arquivo invalido ou erro na formatação do arquivo");
          ex.printStackTrace();
          return;
       } 
        // TODO add your handling code here:
    }//GEN-LAST:event_FD_LabelImportarAutomatoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FD_LabelAutomato;
    private javax.swing.JLabel FD_LabelImportarAutomato;
    private javax.swing.JLabel FD_LabelNovoAutomato;
    private javax.swing.JPanel fndBody;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
