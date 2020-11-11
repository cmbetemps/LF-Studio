/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modulos.AutomatoFinitoPilha.screens;

import java.awt.Font;
import javax.swing.JLabel;
import main.LFStudio;
import main.modulos.AutomatoFinitoNaoDeterministico.controllers.FndController;

/**
 *
 * @author michel
 */
public class PilhaInicioPanel extends javax.swing.JPanel {
    javax.swing.JPanel JanelaExecucao;
    /**
     * Creates new form test1
     */
    public PilhaInicioPanel(javax.swing.JPanel janela) {
        this.JanelaExecucao = janela;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pilhaTitle = new javax.swing.JPanel();
        PILHA_LabelNovoAutomato4 = new javax.swing.JLabel();
        PILHA_LabelImportarAutomato4 = new javax.swing.JLabel();
        PILHA_LabelAutomatoFND4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(579, 648));

        pilhaTitle.setBackground(new java.awt.Color(28, 28, 28));
        pilhaTitle.setPreferredSize(new java.awt.Dimension(579, 648));

        PILHA_LabelNovoAutomato4.setBackground(new java.awt.Color(0, 0, 0));
        PILHA_LabelNovoAutomato4.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        PILHA_LabelNovoAutomato4.setForeground(new java.awt.Color(255, 255, 255));
        PILHA_LabelNovoAutomato4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PILHA_LabelNovoAutomato4.setText("Novo autômato");
        PILHA_LabelNovoAutomato4.setAlignmentX(5.0F);
        PILHA_LabelNovoAutomato4.setAlignmentY(5.0F);
        PILHA_LabelNovoAutomato4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PILHA_LabelNovoAutomato4.setPreferredSize(new java.awt.Dimension(150, 22));
        PILHA_LabelNovoAutomato4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PILHA_LabelNovoAutomato4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PILHA_LabelNovoAutomato4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PILHA_LabelNovoAutomato4MouseExited(evt);
            }
        });

        PILHA_LabelImportarAutomato4.setBackground(new java.awt.Color(0, 0, 0));
        PILHA_LabelImportarAutomato4.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        PILHA_LabelImportarAutomato4.setForeground(new java.awt.Color(255, 255, 255));
        PILHA_LabelImportarAutomato4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PILHA_LabelImportarAutomato4.setText("Importar autômato");
        PILHA_LabelImportarAutomato4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PILHA_LabelImportarAutomato4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PILHA_LabelImportarAutomato4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PILHA_LabelImportarAutomato4MouseExited(evt);
            }
        });

        PILHA_LabelAutomatoFND4.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 48)); // NOI18N
        PILHA_LabelAutomatoFND4.setForeground(new java.awt.Color(255, 255, 255));
        PILHA_LabelAutomatoFND4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PILHA_LabelAutomatoFND4.setText("<html><p style=\"padding-bottom: 16px;\">Autômato de Pilha</p></html>");

        jSeparator1.setBackground(new java.awt.Color(28, 28, 28));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pilhaTitleLayout = new javax.swing.GroupLayout(pilhaTitle);
        pilhaTitle.setLayout(pilhaTitleLayout);
        pilhaTitleLayout.setHorizontalGroup(
            pilhaTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PILHA_LabelNovoAutomato4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pilhaTitleLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(pilhaTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pilhaTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PILHA_LabelAutomatoFND4)
                    .addComponent(PILHA_LabelImportarAutomato4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pilhaTitleLayout.setVerticalGroup(
            pilhaTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pilhaTitleLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(PILHA_LabelAutomatoFND4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(PILHA_LabelNovoAutomato4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PILHA_LabelImportarAutomato4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pilhaTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pilhaTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PILHA_LabelNovoAutomato4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PILHA_LabelNovoAutomato4MouseClicked
        LFStudio.cl.show(JanelaExecucao, "pilhaConfigPanel");        // TODO add your handling code here:
    }//GEN-LAST:event_PILHA_LabelNovoAutomato4MouseClicked

    private void PILHA_LabelNovoAutomato4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PILHA_LabelNovoAutomato4MouseEntered
        Font f = PILHA_LabelNovoAutomato4.getFont();
        PILHA_LabelNovoAutomato4.setFont(f.deriveFont(f.getStyle(), f.getSize2D()+4));
    }//GEN-LAST:event_PILHA_LabelNovoAutomato4MouseEntered

    private void PILHA_LabelNovoAutomato4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PILHA_LabelNovoAutomato4MouseExited
        Font f = PILHA_LabelNovoAutomato4.getFont();
        PILHA_LabelNovoAutomato4.setFont(f.deriveFont(f.getStyle(), f.getSize2D()-4));
    }//GEN-LAST:event_PILHA_LabelNovoAutomato4MouseExited

    private void PILHA_LabelImportarAutomato4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PILHA_LabelImportarAutomato4MouseEntered
        Font f = PILHA_LabelImportarAutomato4.getFont();
        PILHA_LabelImportarAutomato4.setFont(f.deriveFont(f.getStyle(), f.getSize2D()+4));
    }//GEN-LAST:event_PILHA_LabelImportarAutomato4MouseEntered

    private void PILHA_LabelImportarAutomato4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PILHA_LabelImportarAutomato4MouseExited
        Font f = PILHA_LabelImportarAutomato4.getFont();
        PILHA_LabelImportarAutomato4.setFont(f.deriveFont(f.getStyle(), f.getSize2D()-4));
    }//GEN-LAST:event_PILHA_LabelImportarAutomato4MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PILHA_LabelAutomatoFND4;
    private javax.swing.JLabel PILHA_LabelImportarAutomato4;
    private javax.swing.JLabel PILHA_LabelNovoAutomato4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pilhaTitle;
    // End of variables declaration//GEN-END:variables
}
