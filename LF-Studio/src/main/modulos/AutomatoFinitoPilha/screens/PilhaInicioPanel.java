/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modulos.AutomatoFinitoPilha.screens;

/**
 *
 * @author michel
 */
public class PilhaInicioPanel extends javax.swing.JPanel {

    /**
     * Creates new form test1
     */
    public PilhaInicioPanel() {
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

        pilhaTitle.setBackground(new java.awt.Color(70, 71, 74));

        PILHA_LabelNovoAutomato4.setBackground(new java.awt.Color(0, 0, 0));
        PILHA_LabelNovoAutomato4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        PILHA_LabelNovoAutomato4.setForeground(new java.awt.Color(255, 255, 255));
        PILHA_LabelNovoAutomato4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PILHA_LabelNovoAutomato4.setText("Novo autômato");
        PILHA_LabelNovoAutomato4.setAlignmentX(5.0F);
        PILHA_LabelNovoAutomato4.setAlignmentY(5.0F);
        PILHA_LabelNovoAutomato4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PILHA_LabelNovoAutomato4.setPreferredSize(new java.awt.Dimension(150, 22));
        PILHA_LabelNovoAutomato4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PILHA_LabelNovoAutomato4MouseClicked(evt);
            }
        });

        PILHA_LabelImportarAutomato4.setBackground(new java.awt.Color(0, 0, 0));
        PILHA_LabelImportarAutomato4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        PILHA_LabelImportarAutomato4.setForeground(new java.awt.Color(255, 255, 255));
        PILHA_LabelImportarAutomato4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PILHA_LabelImportarAutomato4.setText("Importar autômato");
        PILHA_LabelImportarAutomato4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        PILHA_LabelAutomatoFND4.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        PILHA_LabelAutomatoFND4.setForeground(new java.awt.Color(255, 255, 255));
        PILHA_LabelAutomatoFND4.setText("<html><p style=\"padding-bottom: 16px;\">Autômato de Pilha</p></html>");
        PILHA_LabelAutomatoFND4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout pilhaTitleLayout = new javax.swing.GroupLayout(pilhaTitle);
        pilhaTitle.setLayout(pilhaTitleLayout);
        pilhaTitleLayout.setHorizontalGroup(
            pilhaTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pilhaTitleLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(pilhaTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PILHA_LabelImportarAutomato4, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PILHA_LabelNovoAutomato4, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
            .addGroup(pilhaTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pilhaTitleLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PILHA_LabelAutomatoFND4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pilhaTitleLayout.setVerticalGroup(
            pilhaTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pilhaTitleLayout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addComponent(PILHA_LabelNovoAutomato4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PILHA_LabelImportarAutomato4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pilhaTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pilhaTitleLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PILHA_LabelAutomatoFND4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(189, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(pilhaTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(pilhaTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PILHA_LabelNovoAutomato4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PILHA_LabelNovoAutomato4MouseClicked
//        cl.show(JanelaExecucao, "pilhaConfig");        // TODO add your handling code here:
    }//GEN-LAST:event_PILHA_LabelNovoAutomato4MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PILHA_LabelAutomatoFND4;
    private javax.swing.JLabel PILHA_LabelImportarAutomato4;
    private javax.swing.JLabel PILHA_LabelNovoAutomato4;
    private javax.swing.JPanel pilhaTitle;
    // End of variables declaration//GEN-END:variables
}
