/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modulos.AutomatoFinitoNaoDeterministico.screens;

import com.google.gson.JsonSyntaxException;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import main.LFStudio;
import main.modulos.AutomatoFinitoNaoDeterministico.FNDInjection;
import main.modulos.AutomatoFinitoNaoDeterministico.controllers.FndController;
import main.modulos.AutomatoFinitoNaoDeterministico.domain.NaoDeterministico;
import main.modulos.Commons.FileChooser;

/**
 *
 * @author michel
 */
public class FndInicioPanel extends javax.swing.JPanel {
    javax.swing.JPanel JanelaExecucao;
    FndController controller = new FndController();
    FileChooser file = new FileChooser();
    FndConfigPanel fndConfig;
    /**
     * Creates new form test1
     */
    public FndInicioPanel(javax.swing.JPanel janela ,FndConfigPanel fndConfig) {
        JanelaExecucao = janela;
        this.fndConfig = fndConfig;
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

        fndTitle = new javax.swing.JPanel();
        AFND1_LabelAutomatoFND = new javax.swing.JLabel();
        AFND1_LabelNovoAutomato = new javax.swing.JLabel();
        AFND1_LabelImportarAutomato = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(28, 28, 28));
        setPreferredSize(new java.awt.Dimension(1028, 741));

        fndTitle.setBackground(new java.awt.Color(28, 28, 28));
        fndTitle.setPreferredSize(new java.awt.Dimension(1028, 741));

        AFND1_LabelAutomatoFND.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 48)); // NOI18N
        AFND1_LabelAutomatoFND.setForeground(new java.awt.Color(255, 255, 255));
        AFND1_LabelAutomatoFND.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AFND1_LabelAutomatoFND.setText("<html><p style=\"padding-bottom: 16px;\">Autômato FND</p></html>");

        AFND1_LabelNovoAutomato.setBackground(new java.awt.Color(0, 0, 0));
        AFND1_LabelNovoAutomato.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        AFND1_LabelNovoAutomato.setForeground(new java.awt.Color(255, 255, 255));
        AFND1_LabelNovoAutomato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AFND1_LabelNovoAutomato.setText("Novo autômato");
        AFND1_LabelNovoAutomato.setAlignmentX(5.0F);
        AFND1_LabelNovoAutomato.setAlignmentY(5.0F);
        AFND1_LabelNovoAutomato.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AFND1_LabelNovoAutomato.setPreferredSize(new java.awt.Dimension(150, 22));
        AFND1_LabelNovoAutomato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AFND1_LabelNovoAutomatoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AFND1_LabelNovoAutomatoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AFND1_LabelNovoAutomatoMouseExited(evt);
            }
        });

        AFND1_LabelImportarAutomato.setBackground(new java.awt.Color(0, 0, 0));
        AFND1_LabelImportarAutomato.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        AFND1_LabelImportarAutomato.setForeground(new java.awt.Color(255, 255, 255));
        AFND1_LabelImportarAutomato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AFND1_LabelImportarAutomato.setText("Importar autômato");
        AFND1_LabelImportarAutomato.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AFND1_LabelImportarAutomato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AFND1_LabelImportarAutomatoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AFND1_LabelImportarAutomatoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AFND1_LabelImportarAutomatoMouseExited(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(28, 28, 28));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout fndTitleLayout = new javax.swing.GroupLayout(fndTitle);
        fndTitle.setLayout(fndTitleLayout);
        fndTitleLayout.setHorizontalGroup(
          fndTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fndTitleLayout.createSequentialGroup()
              .addGroup(fndTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AFND1_LabelNovoAutomato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AFND1_LabelImportarAutomato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AFND1_LabelAutomatoFND, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE))
              .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fndTitleLayout.createSequentialGroup()
              .addGap(0, 373, Short.MAX_VALUE)
              .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(371, 371, 371))
        );
        fndTitleLayout.setVerticalGroup(
          fndTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fndTitleLayout.createSequentialGroup()
              .addGap(191, 191, 191)
              .addComponent(AFND1_LabelAutomatoFND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(57, 57, 57)
              .addComponent(AFND1_LabelNovoAutomato, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(AFND1_LabelImportarAutomato)
              .addContainerGap(337, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
          layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
              .addComponent(fndTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
          layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fndTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fndTitle.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void AFND1_LabelNovoAutomatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AFND1_LabelNovoAutomatoMouseClicked
        LFStudio.cl.show(JanelaExecucao,"fndConfigPanel");
    }//GEN-LAST:event_AFND1_LabelNovoAutomatoMouseClicked

    private void AFND1_LabelNovoAutomatoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AFND1_LabelNovoAutomatoMouseEntered
        Font f = AFND1_LabelNovoAutomato.getFont();
        AFND1_LabelNovoAutomato.setFont(f.deriveFont(f.getStyle(), f.getSize2D()+4));
        //AFND1_LabelNovoAutomato.setForeground(AFND1_LabelNovoAutomato.getForeground().darker());
    }//GEN-LAST:event_AFND1_LabelNovoAutomatoMouseEntered

    private void AFND1_LabelNovoAutomatoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AFND1_LabelNovoAutomatoMouseExited
        Font f = AFND1_LabelNovoAutomato.getFont();
        AFND1_LabelNovoAutomato.setFont(f.deriveFont(f.getStyle(), f.getSize2D()-4));
        //AFND1_LabelNovoAutomato.setForeground(AFND1_LabelNovoAutomato.getForeground().brighter());
    }//GEN-LAST:event_AFND1_LabelNovoAutomatoMouseExited

    private void AFND1_LabelImportarAutomatoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AFND1_LabelImportarAutomatoMouseEntered
        Font f = AFND1_LabelImportarAutomato.getFont();
        AFND1_LabelImportarAutomato.setFont(f.deriveFont(f.getStyle(), f.getSize2D()+4));
        //AFND1_LabelImportarAutomato.setForeground(AFND1_LabelNovoAutomato.getForeground().darker());
    }//GEN-LAST:event_AFND1_LabelImportarAutomatoMouseEntered

    private void AFND1_LabelImportarAutomatoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AFND1_LabelImportarAutomatoMouseExited
        Font f = AFND1_LabelImportarAutomato.getFont();
        AFND1_LabelImportarAutomato.setFont(f.deriveFont(f.getStyle(), f.getSize2D()-4));
        //AFND1_LabelImportarAutomato.setForeground(AFND1_LabelNovoAutomato.getForeground().brighter());
    }//GEN-LAST:event_AFND1_LabelImportarAutomatoMouseExited

    private void AFND1_LabelImportarAutomatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AFND1_LabelImportarAutomatoMouseClicked
        String pathAbsolute = file.getPathAbsolute();
        try {
            NaoDeterministico automato  = controller.instanciationAutomato(pathAbsolute);
            if(automato != null){
                FNDInjection.setAutomato(automato);
                this.fndConfig.carregar();
                LFStudio.cl.show(JanelaExecucao,"fndConfigPanel");
            }
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Arquivo invalido ou erro na formatação do arquivo");
            ex.printStackTrace();
            return;
        }

        JOptionPane.showMessageDialog(null, "Automato lido com sucesso!!!");


        // TODO add your handling code here:
    }//GEN-LAST:event_AFND1_LabelImportarAutomatoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AFND1_LabelAutomatoFND;
    private javax.swing.JLabel AFND1_LabelImportarAutomato;
    private javax.swing.JLabel AFND1_LabelNovoAutomato;
    private javax.swing.JPanel fndTitle;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
