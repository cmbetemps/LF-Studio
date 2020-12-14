/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

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
    
    Color defaultColor = null;
    
    void setFdInicioPanel(){
        fdInicioPanel =  new FdInicioPanel(JanelaExecucao, fdConfigPanel);
        fdInicioPanel.setBackground(new java.awt.Color(70, 71, 74));
        fdInicioPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        JanelaExecucao.add(fdInicioPanel, "fdInicioPanel");
    }
    
    void setFndInicioPanel(){
        fndInicioPanel =  new FndInicioPanel(JanelaExecucao, fndConfigPanel);
        fndInicioPanel.setBackground(new java.awt.Color(70, 71, 74));
        fndInicioPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        JanelaExecucao.add(fndInicioPanel, "fndInicioPanel");
    }
    
    void setPilhaInicioPanel(){
        pilhaInicioPanel =  new PilhaInicioPanel(JanelaExecucao, pilhaConfigPanel);
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
        setFndConfigPanel();
        setFndInicioPanel();
        setFndProcessamentoPanel();
        setFdConfigPanel();
        setFdInicioPanel();
        setFdProcessamentoPanel();
        setPilhaConfigPanel();
        setPilhaInicioPanel();
        setPilhaProcessamentoPanel();
    }
    
    public LFStudio() {
        super("LF-Studio");
        ImageIcon image = new ImageIcon(LFStudio.class.getResource("/main/layout/images/taskbarIcon.png"));
        super.setIconImage(image.getImage());
        initComponents();
        initPanels();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JanelaPrincipal.setSize(1200, 700);
        JanelaPrincipal.setLocation(100, 160);
        cl = (CardLayout) JanelaExecucao.getLayout();
        cl.show(JanelaExecucao, "HomePage");
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
        JanelaExecucao = new javax.swing.JPanel();
        HomePage = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        menuScroll = new javax.swing.JScrollPane();
        menuPanel = new javax.swing.JPanel();
        menuPilha = new javax.swing.JLabel();
        menuRegX = new javax.swing.JLabel();
        menuAfd = new javax.swing.JLabel();
        menuAFND = new javax.swing.JLabel();
        titleLFStudio = new javax.swing.JLabel();
        menuGLC = new javax.swing.JLabel();
        menuGramaticasRegulares = new javax.swing.JLabel();
        menuTuring = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(28, 28, 28));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        JanelaPrincipal.setBackground(new java.awt.Color(28, 28, 28));
        JanelaPrincipal.setForeground(new java.awt.Color(28, 28, 28));
        JanelaPrincipal.setMaximumSize(new java.awt.Dimension(1280, 720));
        JanelaPrincipal.setMinimumSize(new java.awt.Dimension(1280, 720));
        JanelaPrincipal.setPreferredSize(new java.awt.Dimension(1280, 720));

        JanelaExecucao.setBackground(new java.awt.Color(28, 28, 28));
        JanelaExecucao.setForeground(new java.awt.Color(255, 255, 255));
        JanelaExecucao.setMaximumSize(new java.awt.Dimension(1030, 720));
        JanelaExecucao.setMinimumSize(new java.awt.Dimension(1030, 720));
        JanelaExecucao.setPreferredSize(new java.awt.Dimension(1030, 720));
        JanelaExecucao.setLayout(new java.awt.CardLayout());

        HomePage.setBackground(new java.awt.Color(28, 28, 28));

        logo.setBackground(new java.awt.Color(28, 28, 28));
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/layout/icons/logo.png"))); // NOI18N

        javax.swing.GroupLayout HomePageLayout = new javax.swing.GroupLayout(HomePage);
        HomePage.setLayout(HomePageLayout);
        HomePageLayout.setHorizontalGroup(
            HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePageLayout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
                .addContainerGap())
        );
        HomePageLayout.setVerticalGroup(
            HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                .addContainerGap())
        );

        JanelaExecucao.add(HomePage, "home");

        Menu.setBackground(new java.awt.Color(28, 28, 28));
        Menu.setForeground(new java.awt.Color(255, 255, 255));
        Menu.setMaximumSize(new java.awt.Dimension(250, 720));
        Menu.setMinimumSize(new java.awt.Dimension(250, 720));
        Menu.setName(""); // NOI18N
        Menu.setPreferredSize(new java.awt.Dimension(250, 720));
        Menu.setLayout(new javax.swing.BoxLayout(Menu, javax.swing.BoxLayout.LINE_AXIS));

        menuScroll.setBackground(new java.awt.Color(27, 28, 29));
        menuScroll.setBorder(null);
        menuScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        menuScroll.setMaximumSize(null);
        menuScroll.setName(""); // NOI18N
        menuScroll.setPreferredSize(new java.awt.Dimension(400, 560));

        menuPanel.setBackground(new java.awt.Color(28, 28, 28));
        menuPanel.setForeground(new java.awt.Color(255, 255, 255));
        menuPanel.setMaximumSize(new java.awt.Dimension(344, 539));
        menuPanel.setPreferredSize(new java.awt.Dimension(250, 560));

        menuPilha.setBackground(new java.awt.Color(60, 60, 60));
        menuPilha.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        menuPilha.setForeground(new java.awt.Color(255, 255, 255));
        menuPilha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuPilha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/layout/images/AutPilhaBlack.png"))); // NOI18N
        menuPilha.setMaximumSize(new java.awt.Dimension(344, 539));
        menuPilha.setOpaque(true);
        menuPilha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPilhaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuPilhaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuPilhaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuPilhaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menuPilhaMouseReleased(evt);
            }
        });

        menuRegX.setBackground(new java.awt.Color(20, 20, 20));
        menuRegX.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        menuRegX.setForeground(new java.awt.Color(255, 255, 255));
        menuRegX.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuRegX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/layout/images/ExpRegBlack.png"))); // NOI18N
        menuRegX.setMaximumSize(new java.awt.Dimension(344, 539));
        menuRegX.setOpaque(true);
        menuRegX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuRegXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuRegXMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuRegXMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menuRegXMouseReleased(evt);
            }
        });

        menuAfd.setBackground(new java.awt.Color(20, 20, 20));
        menuAfd.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        menuAfd.setForeground(new java.awt.Color(255, 255, 255));
        menuAfd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuAfd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/layout/images/AutFdBlack.png"))); // NOI18N
        menuAfd.setMaximumSize(new java.awt.Dimension(344, 539));
        menuAfd.setOpaque(true);
        menuAfd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAfdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuAfdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuAfdMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuAfdMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menuAfdMouseReleased(evt);
            }
        });

        menuAFND.setBackground(new java.awt.Color(60, 60, 60));
        menuAFND.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        menuAFND.setForeground(new java.awt.Color(255, 255, 255));
        menuAFND.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuAFND.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/layout/images/AutFndBlack.png"))); // NOI18N
        menuAFND.setMaximumSize(new java.awt.Dimension(344, 539));
        menuAFND.setOpaque(true);
        menuAFND.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAFNDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuAFNDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuAFNDMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuAFNDMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menuAFNDMouseReleased(evt);
            }
        });

        titleLFStudio.setBackground(new java.awt.Color(51, 51, 51));
        titleLFStudio.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        titleLFStudio.setForeground(new java.awt.Color(255, 255, 255));
        titleLFStudio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titleLFStudio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/layout/icons/Webp.net-resizeimage.png"))); // NOI18N
        titleLFStudio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titleLFStudio.setMaximumSize(new java.awt.Dimension(344, 539));
        titleLFStudio.setOpaque(true);
        titleLFStudio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titleLFStudioMouseClicked(evt);
            }
        });

        menuGLC.setBackground(new java.awt.Color(20, 20, 20));
        menuGLC.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        menuGLC.setForeground(new java.awt.Color(255, 255, 255));
        menuGLC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuGLC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/layout/images/GramLDCBlack.png"))); // NOI18N
        menuGLC.setMaximumSize(new java.awt.Dimension(344, 539));
        menuGLC.setOpaque(true);
        menuGLC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuGLCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuGLCMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuGLCMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menuGLCMouseReleased(evt);
            }
        });

        menuGramaticasRegulares.setBackground(new java.awt.Color(60, 60, 60));
        menuGramaticasRegulares.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        menuGramaticasRegulares.setForeground(new java.awt.Color(255, 255, 255));
        menuGramaticasRegulares.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuGramaticasRegulares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/layout/images/GramRegBlack.png"))); // NOI18N
        menuGramaticasRegulares.setMaximumSize(new java.awt.Dimension(344, 539));
        menuGramaticasRegulares.setOpaque(true);
        menuGramaticasRegulares.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuGramaticasRegularesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuGramaticasRegularesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuGramaticasRegularesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menuGramaticasRegularesMouseReleased(evt);
            }
        });

        menuTuring.setBackground(new java.awt.Color(60, 60, 60));
        menuTuring.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        menuTuring.setForeground(new java.awt.Color(255, 255, 255));
        menuTuring.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuTuring.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/layout/images/MaqTuringBlack.png"))); // NOI18N
        menuTuring.setMaximumSize(new java.awt.Dimension(344, 539));
        menuTuring.setOpaque(true);
        menuTuring.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuTuringMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuTuringMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuTuringMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menuTuringMouseReleased(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/layout/images/peenchimento.png"))); // NOI18N

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuTuring, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(menuGLC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuGramaticasRegulares, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleLFStudio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuRegX, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuPilha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuAfd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuAFND, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addComponent(menuGramaticasRegulares, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuGLC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuTuring, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        menuScroll.setViewportView(menuPanel);

        Menu.add(menuScroll);

        javax.swing.GroupLayout JanelaPrincipalLayout = new javax.swing.GroupLayout(JanelaPrincipal);
        JanelaPrincipal.setLayout(JanelaPrincipalLayout);
        JanelaPrincipalLayout.setHorizontalGroup(
            JanelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JanelaPrincipalLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JanelaExecucao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JanelaPrincipalLayout.setVerticalGroup(
            JanelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JanelaExecucao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(JanelaPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuTuringMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTuringMouseReleased
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/MaqTuringBlack.png"));
        menuTuring.setIcon(ico);
    }//GEN-LAST:event_menuTuringMouseReleased

    private void menuTuringMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTuringMousePressed
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/MaqTuringWhite.png"));
        menuTuring.setIcon(ico);
    }//GEN-LAST:event_menuTuringMousePressed

    private void menuTuringMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTuringMouseExited
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/MaqTuringBlack.png"));
        menuTuring.setIcon(ico);
    }//GEN-LAST:event_menuTuringMouseExited

    private void menuTuringMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTuringMouseEntered
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/MaqTuringGray.png"));
        menuTuring.setIcon(ico);
    }//GEN-LAST:event_menuTuringMouseEntered

    private void menuGramaticasRegularesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuGramaticasRegularesMouseReleased
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/ExpRegBlack.png"));
        menuGramaticasRegulares.setIcon(ico);
    }//GEN-LAST:event_menuGramaticasRegularesMouseReleased

    private void menuGramaticasRegularesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuGramaticasRegularesMousePressed
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/ExpRegWhite.png"));
        menuGramaticasRegulares.setIcon(ico);
    }//GEN-LAST:event_menuGramaticasRegularesMousePressed

    private void menuGramaticasRegularesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuGramaticasRegularesMouseExited
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/ExpRegBlack.png"));
        menuGramaticasRegulares.setIcon(ico);
    }//GEN-LAST:event_menuGramaticasRegularesMouseExited

    private void menuGramaticasRegularesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuGramaticasRegularesMouseEntered
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/ExpRegGray.png"));
        menuGramaticasRegulares.setIcon(ico);
    }//GEN-LAST:event_menuGramaticasRegularesMouseEntered

    private void menuGLCMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuGLCMouseReleased
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/GramLDCBlack.png"));
        menuGLC.setIcon(ico);
    }//GEN-LAST:event_menuGLCMouseReleased

    private void menuGLCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuGLCMousePressed
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/GramLDCWhite.png"));
        menuGLC.setIcon(ico);
    }//GEN-LAST:event_menuGLCMousePressed

    private void menuGLCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuGLCMouseExited
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/GramLDCBlack.png"));
        menuGLC.setIcon(ico);
    }//GEN-LAST:event_menuGLCMouseExited

    private void menuGLCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuGLCMouseEntered
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/GramLDCGray.png"));
        menuGLC.setIcon(ico);
    }//GEN-LAST:event_menuGLCMouseEntered

    private void titleLFStudioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleLFStudioMouseClicked
        cl.show(JanelaExecucao, "home");
    }//GEN-LAST:event_titleLFStudioMouseClicked

    private void menuAFNDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAFNDMouseReleased
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/AutFndBlack.png"));
        menuAFND.setIcon(ico);
    }//GEN-LAST:event_menuAFNDMouseReleased

    private void menuAFNDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAFNDMousePressed
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/AutFndWhite.png"));
        menuAFND.setIcon(ico);
    }//GEN-LAST:event_menuAFNDMousePressed

    private void menuAFNDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAFNDMouseExited
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/AutFndBlack.png"));
        menuAFND.setIcon(ico);
    }//GEN-LAST:event_menuAFNDMouseExited

    private void menuAFNDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAFNDMouseEntered
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/AutFndGray.png"));
        menuAFND.setIcon(ico);
    }//GEN-LAST:event_menuAFNDMouseEntered

    private void menuAFNDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAFNDMouseClicked
        cl.show(JanelaExecucao, "fndInicioPanel");
    }//GEN-LAST:event_menuAFNDMouseClicked

    private void menuAfdMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAfdMouseReleased
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/AutFdBlack.png"));
        menuAfd.setIcon(ico);
    }//GEN-LAST:event_menuAfdMouseReleased

    private void menuAfdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAfdMousePressed
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/AutFdWhite.png"));
        menuAfd.setIcon(ico);
    }//GEN-LAST:event_menuAfdMousePressed

    private void menuAfdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAfdMouseExited
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/AutFdBlack.png"));
        menuAfd.setIcon(ico);
    }//GEN-LAST:event_menuAfdMouseExited

    private void menuAfdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAfdMouseEntered
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/AutFdGray.png"));
        menuAfd.setIcon(ico);
    }//GEN-LAST:event_menuAfdMouseEntered

    private void menuAfdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAfdMouseClicked
        cl.show(JanelaExecucao, "fdInicioPanel");
    }//GEN-LAST:event_menuAfdMouseClicked

    private void menuRegXMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRegXMouseReleased
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/GramRegBlack.png"));
        menuRegX.setIcon(ico);
    }//GEN-LAST:event_menuRegXMouseReleased

    private void menuRegXMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRegXMousePressed
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/GramRegWhite.png"));
        menuRegX.setIcon(ico);
    }//GEN-LAST:event_menuRegXMousePressed

    private void menuRegXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRegXMouseExited
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/GramRegBlack.png"));
        menuRegX.setIcon(ico);
    }//GEN-LAST:event_menuRegXMouseExited

    private void menuRegXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRegXMouseEntered
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/GramRegGray.png"));
        menuRegX.setIcon(ico);
    }//GEN-LAST:event_menuRegXMouseEntered

    private void menuPilhaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPilhaMouseReleased
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/AutPilhaBlack.png"));
        menuPilha.setIcon(ico);
    }//GEN-LAST:event_menuPilhaMouseReleased

    private void menuPilhaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPilhaMousePressed
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/AutPilhaWhite.png"));
        menuPilha.setIcon(ico);
    }//GEN-LAST:event_menuPilhaMousePressed

    private void menuPilhaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPilhaMouseExited
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/AutPilhaBlack.png"));
        menuPilha.setIcon(ico);
    }//GEN-LAST:event_menuPilhaMouseExited

    private void menuPilhaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPilhaMouseEntered
        Icon ico = new ImageIcon(LFStudio.class.getResource("/main/layout/images/AutPilhaGray.png"));
        menuPilha.setIcon(ico);
    }//GEN-LAST:event_menuPilhaMouseEntered

    private void menuPilhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPilhaMouseClicked
        cl.show(JanelaExecucao, "pilhaInicioPanel");
    }//GEN-LAST:event_menuPilhaMouseClicked


  
    /**
     * @param args the command line arguments
     */
    
   public static void main(String args[]) {
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomePage;
    private javax.swing.JPanel JanelaExecucao;
    private javax.swing.JPanel JanelaPrincipal;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel menuAFND;
    private javax.swing.JLabel menuAfd;
    private javax.swing.JLabel menuGLC;
    private javax.swing.JLabel menuGramaticasRegulares;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel menuPilha;
    private javax.swing.JLabel menuRegX;
    private javax.swing.JScrollPane menuScroll;
    private javax.swing.JLabel menuTuring;
    private javax.swing.JLabel titleLFStudio;
    // End of variables declaration//GEN-END:variables
}
