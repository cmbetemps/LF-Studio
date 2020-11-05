/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import main.modulos.AutomatoFinitoDeterministico.screens.FdConfigPanel;
import main.modulos.AutomatoFinitoDeterministico.screens.FdInicioPanel;
import main.modulos.AutomatoFinitoDeterministico.screens.FdProcessamentoPanel;
import main.modulos.AutomatoFinitoNaoDeterministico.screens.FndConfigPanel;
import main.modulos.AutomatoFinitoNaoDeterministico.screens.FndInicioPanel;
import main.modulos.AutomatoFinitoNaoDeterministico.screens.FndProcessamentoPanel;
import main.modulos.AutomatoFinitoPilha.screens.PilhaConfigPanel;
import main.modulos.AutomatoFinitoPilha.screens.PilhaInicioPanel;
import main.modulos.AutomatoFinitoPilha.screens.PilhaProcessamentoPanel;
/**
 *
 * @author thiag
 */
public class LFStudio extends javax.swing.JFrame {
    public static CardLayout cl;
    
    FdInicioPanel fdInicioPanel;
    FdProcessamentoPanel fdProcessamentoPanel;
    FdConfigPanel fdConfigPanel;
    FndInicioPanel fndInicioPanel;
    FndProcessamentoPanel fndProcessamentoPanel;
    FndConfigPanel fndConfigPanel;
    PilhaInicioPanel pilhaInicioPanel;
    PilhaProcessamentoPanel pilhaProcessamentoPanel;
    PilhaConfigPanel pilhaConfigPanel;
    
    void setFndInicioPanel(){
        fdInicioPanel =  new FdInicioPanel(JanelaExecucao);
        fdInicioPanel.setBackground(new java.awt.Color(70, 71, 74));
        fdInicioPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        JanelaExecucao.add(fdInicioPanel, "fdInicioPanel");
    }
    
    void setFdInicioPanel(){
        fndInicioPanel =  new FndInicioPanel(JanelaExecucao);
        fndInicioPanel.setBackground(new java.awt.Color(70, 71, 74));
        fndInicioPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        JanelaExecucao.add(fndInicioPanel, "fndInicioPanel");
    }
    
    void setPilhaInicioPanel(){
        pilhaInicioPanel =  new PilhaInicioPanel(JanelaExecucao);
        pilhaInicioPanel.setBackground(new java.awt.Color(70, 71, 74));
        pilhaInicioPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        JanelaExecucao.add(pilhaInicioPanel, "pilhaInicioPanel");
    }
    
    void setFndProcessamentoPanel(){
        fndProcessamentoPanel =  new FndProcessamentoPanel(JanelaExecucao);
        fndProcessamentoPanel.setBackground(new java.awt.Color(70, 71, 74));
        fndProcessamentoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        JanelaExecucao.add(fndProcessamentoPanel, "fndProcessamentoPanel");
  
    }
    
    void setFdProcessamentoPanel(){
        fdProcessamentoPanel =  new FdProcessamentoPanel(JanelaExecucao);
        fdProcessamentoPanel.setBackground(new java.awt.Color(70, 71, 74));
        fdProcessamentoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        JanelaExecucao.add(fdProcessamentoPanel, "fdProcessamentoPanel");
    }
    
    void setPilhaProcessamentoPanel(){
        pilhaProcessamentoPanel =  new PilhaProcessamentoPanel(JanelaExecucao);
        pilhaProcessamentoPanel.setBackground(new java.awt.Color(70, 71, 74));
        pilhaProcessamentoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        JanelaExecucao.add(pilhaProcessamentoPanel, "pilhaProcessamentoPanel");
    }
    
    void setFndConfigPanel(){
        fndConfigPanel =  new FndConfigPanel(JanelaExecucao);
        fndConfigPanel.setBackground(new java.awt.Color(70, 71, 74));
        fndConfigPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        JanelaExecucao.add(fndConfigPanel, "fndConfigPanel");
    }
    
    void setFdConfigPanel(){
        fdConfigPanel =  new FdConfigPanel(JanelaExecucao);
        fdConfigPanel.setBackground(new java.awt.Color(70, 71, 74));
        fdConfigPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        JanelaExecucao.add(fdConfigPanel, "fdConfigPanel");
    }
    
    void setPilhaConfigPanel(){
        pilhaConfigPanel =  new PilhaConfigPanel(JanelaExecucao);
        pilhaConfigPanel.setBackground(new java.awt.Color(70, 71, 74));
        pilhaConfigPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        JanelaExecucao.add(pilhaConfigPanel, "pilhaConfigPanel");
    }
     
    void initPanels(){
        setFndInicioPanel();
        setFndProcessamentoPanel();
        setFndConfigPanel();
        setFdConfigPanel();
        setFdInicioPanel();
        setFdProcessamentoPanel();
        setPilhaProcessamentoPanel();
        setPilhaConfigPanel();
        setPilhaInicioPanel();
    }
    
    public LFStudio() {
        super("LFPrototipo");
        
        initComponents();
        initPanels();
        this.JanelaVisivel.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        JanelaVisivel.setSize(1200, 700);
        JanelaVisivel.setLocation(100, 160);
        this.menuAFND.setBackground(Color.BLACK);
        cl = (CardLayout) JanelaExecucao.getLayout();
        cl.show(JanelaExecucao, "home");
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JanelaPrincipal = new javax.swing.JPanel();
        JanelaVisivel = new javax.swing.JInternalFrame();
        JanelaExecucao = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        menuScroll = new javax.swing.JScrollPane();
        menuPanel = new javax.swing.JPanel();
        menuPilha = new javax.swing.JLabel();
        menuRegX = new javax.swing.JLabel();
        menuAfd = new javax.swing.JLabel();
        menuAFND = new javax.swing.JLabel();
        titleLFStudio = new javax.swing.JLabel();
        menuGLC = new javax.swing.JLabel();
        ExpressoesRegulares = new javax.swing.JLabel();
        menuTuring = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        JanelaPrincipal.setBackground(new java.awt.Color(70, 71, 74));
        JanelaPrincipal.setForeground(new java.awt.Color(70, 71, 74));

        JanelaVisivel.setBackground(new java.awt.Color(1, 2, 3));
        JanelaVisivel.setVisible(true);

        JanelaExecucao.setBackground(new java.awt.Color(70, 71, 74));
        JanelaExecucao.setForeground(new java.awt.Color(255, 255, 255));
        JanelaExecucao.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(70, 71, 74));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
        );

        JanelaExecucao.add(jPanel1, "home");

        Menu.setBackground(new java.awt.Color(27, 28, 29));
        Menu.setForeground(new java.awt.Color(255, 255, 255));
        Menu.setMaximumSize(new java.awt.Dimension(400, 560));
        Menu.setName(""); // NOI18N
        Menu.setPreferredSize(new java.awt.Dimension(400, 560));
        Menu.setLayout(new javax.swing.BoxLayout(Menu, javax.swing.BoxLayout.LINE_AXIS));

        menuScroll.setBackground(new java.awt.Color(27, 28, 29));
        menuScroll.setBorder(null);
        menuScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        menuScroll.setMaximumSize(null);
        menuScroll.setName(""); // NOI18N
        menuScroll.setPreferredSize(new java.awt.Dimension(400, 560));

        menuPanel.setBackground(new java.awt.Color(70, 71, 74));
        menuPanel.setForeground(new java.awt.Color(255, 255, 255));
        menuPanel.setMaximumSize(new java.awt.Dimension(344, 539));
        menuPanel.setPreferredSize(new java.awt.Dimension(250, 560));

        menuPilha.setBackground(new java.awt.Color(37, 37, 37));
        menuPilha.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        menuPilha.setForeground(new java.awt.Color(255, 255, 255));
        menuPilha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuPilha.setText("  Automato Pilha");
        menuPilha.setMaximumSize(new java.awt.Dimension(344, 539));
        menuPilha.setOpaque(true);
        menuPilha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPilhaMouseClicked(evt);
            }
        });

        menuRegX.setBackground(new java.awt.Color(50, 50, 50));
        menuRegX.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        menuRegX.setForeground(new java.awt.Color(255, 255, 255));
        menuRegX.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuRegX.setText("  Expressões Regulares");
        menuRegX.setMaximumSize(new java.awt.Dimension(344, 539));
        menuRegX.setOpaque(true);

        menuAfd.setBackground(new java.awt.Color(37, 37, 37));
        menuAfd.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        menuAfd.setForeground(new java.awt.Color(255, 255, 255));
        menuAfd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuAfd.setText("  Automato FD");
        menuAfd.setMaximumSize(new java.awt.Dimension(344, 539));
        menuAfd.setOpaque(true);
        menuAfd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAfdMouseClicked(evt);
            }
        });

        menuAFND.setBackground(new java.awt.Color(37, 37, 37));
        menuAFND.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        menuAFND.setForeground(new java.awt.Color(255, 255, 255));
        menuAFND.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuAFND.setText("  Automato FND");
        menuAFND.setMaximumSize(new java.awt.Dimension(344, 539));
        menuAFND.setOpaque(true);
        menuAFND.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAFNDMouseClicked(evt);
            }
        });

        titleLFStudio.setBackground(new java.awt.Color(0, 0, 0));
        titleLFStudio.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        titleLFStudio.setForeground(new java.awt.Color(255, 255, 255));
        titleLFStudio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titleLFStudio.setText(" LF Studio");
        titleLFStudio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titleLFStudio.setMaximumSize(new java.awt.Dimension(344, 539));
        titleLFStudio.setOpaque(true);

        menuGLC.setBackground(new java.awt.Color(63, 64, 66));
        menuGLC.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        menuGLC.setForeground(new java.awt.Color(255, 255, 255));
        menuGLC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuGLC.setText("  Gramáticas LC");
        menuGLC.setMaximumSize(new java.awt.Dimension(344, 539));
        menuGLC.setOpaque(true);

        ExpressoesRegulares.setBackground(new java.awt.Color(63, 64, 66));
        ExpressoesRegulares.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        ExpressoesRegulares.setForeground(new java.awt.Color(255, 255, 255));
        ExpressoesRegulares.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ExpressoesRegulares.setText("  Gramáticas Regulares");
        ExpressoesRegulares.setMaximumSize(new java.awt.Dimension(344, 539));
        ExpressoesRegulares.setOpaque(true);

        menuTuring.setBackground(new java.awt.Color(70, 71, 74));
        menuTuring.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        menuTuring.setForeground(new java.awt.Color(255, 255, 255));
        menuTuring.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuTuring.setText("  Máquinas de Turing");
        menuTuring.setMaximumSize(new java.awt.Dimension(344, 539));
        menuTuring.setOpaque(true);

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuPilha, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(menuAfd, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(menuAFND, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(titleLFStudio, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(menuRegX, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(ExpressoesRegulares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(menuGLC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(menuTuring, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(titleLFStudio, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuAFND, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuAfd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuPilha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuRegX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ExpressoesRegulares, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuGLC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuTuring, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        menuScroll.setViewportView(menuPanel);

        Menu.add(menuScroll);

        javax.swing.GroupLayout JanelaVisivelLayout = new javax.swing.GroupLayout(JanelaVisivel.getContentPane());
        JanelaVisivel.getContentPane().setLayout(JanelaVisivelLayout);
        JanelaVisivelLayout.setHorizontalGroup(
            JanelaVisivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JanelaVisivelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(JanelaExecucao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JanelaVisivelLayout.setVerticalGroup(
            JanelaVisivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JanelaVisivelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(JanelaVisivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JanelaExecucao, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout JanelaPrincipalLayout = new javax.swing.GroupLayout(JanelaPrincipal);
        JanelaPrincipal.setLayout(JanelaPrincipalLayout);
        JanelaPrincipalLayout.setHorizontalGroup(
            JanelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JanelaPrincipalLayout.createSequentialGroup()
                .addComponent(JanelaVisivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 49, Short.MAX_VALUE))
        );
        JanelaPrincipalLayout.setVerticalGroup(
            JanelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JanelaVisivel, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        getContentPane().add(JanelaPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents


  
    private void menuAFNDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAFNDMouseClicked
        cl.show(JanelaExecucao, "fndInicioPanel");
    }//GEN-LAST:event_menuAFNDMouseClicked

    private void menuAfdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAfdMouseClicked
        cl.show(JanelaExecucao, "fdInicioPanel");              
    }//GEN-LAST:event_menuAfdMouseClicked

    private void menuPilhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPilhaMouseClicked
        cl.show(JanelaExecucao, "pilhaInicioPanel"); 
    }//GEN-LAST:event_menuPilhaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LFStudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LFStudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LFStudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LFStudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LFStudio().setVisible(true);
            }
        });
    }

    public JInternalFrame getjInternalFrame1() {
        return JanelaVisivel;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ExpressoesRegulares;
    private javax.swing.JPanel JanelaExecucao;
    private javax.swing.JPanel JanelaPrincipal;
    private javax.swing.JInternalFrame JanelaVisivel;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel menuAFND;
    private javax.swing.JLabel menuAfd;
    private javax.swing.JLabel menuGLC;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel menuPilha;
    private javax.swing.JLabel menuRegX;
    private javax.swing.JScrollPane menuScroll;
    private javax.swing.JLabel menuTuring;
    private javax.swing.JLabel titleLFStudio;
    // End of variables declaration//GEN-END:variables
}
