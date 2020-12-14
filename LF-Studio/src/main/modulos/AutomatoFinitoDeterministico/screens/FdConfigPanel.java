/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modulos.AutomatoFinitoDeterministico.screens;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import main.LFStudio;
import main.modulos.AutomatoFinitoDeterministico.controllers.AFDController;
import main.modulos.AutomatoFinitoDeterministico.validators.AFDValidator;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import main.modulos.AutomatoFinitoDeterministico.domain.AFD;

/*
 * @author michel
 */
public class FdConfigPanel extends javax.swing.JPanel {
    DefaultTableModel tableModel = new DefaultTableModel ();

    javax.swing.JPanel JanelaExecucao;
    AFDController controller = new AFDController();
    AFDValidator validator = new AFDValidator();

    public FdConfigPanel(javax.swing.JPanel janela) {
        this.JanelaExecucao = janela;
        initComponents();
        tableModel.addColumn("Estado Atual");
        tableModel.addColumn("Simbolo ");
        tableModel.addColumn("Estado Destino");
        FDjTable.setModel(tableModel); 
    }

    public void carregar() {
        controller.setarCampos(FDjTable, FD_TextFieldAlfabeto, FD_TextFieldEstadosFinais1, FD_TextFieldEstadoInicial1, FD_TextFieldEstados, tableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JdialogTabelaExternaAFD = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        FDAutomato = new javax.swing.JPanel();
        FD_BodyConfig = new javax.swing.JPanel();
        FD_LabelAlfabeto = new javax.swing.JLabel();
        FD_LabelEstadosFinais = new javax.swing.JLabel();
        FD_LabelEstados = new javax.swing.JLabel();
        FD_LabelEstadoInicial1 = new javax.swing.JLabel();
        FD_LabelTabelaTransicao1 = new javax.swing.JLabel();
        FD_TextFieldAlfabeto = new javax.swing.JTextField();
        FD_TextFieldEstados = new javax.swing.JTextField();
        FD_TextFieldEstadoInicial1 = new javax.swing.JTextField();
        FD_TextFieldEstadosFinais1 = new javax.swing.JTextField();
        AFD_button_minus = new javax.swing.JButton();
        AFD_button_plus = new javax.swing.JButton();
        AFND2_jScrollPane4 = new javax.swing.JScrollPane();
        FDjTable = new javax.swing.JTable();
        FD_ConfigTitulo = new javax.swing.JLabel();
        FD_ConfigSubTitulo = new javax.swing.JLabel();
        FD_salvarAutomatoBtn = new javax.swing.JLabel();
        FD_processarAutomatoBtn = new javax.swing.JLabel();

        JdialogTabelaExternaAFD.setAlwaysOnTop(true);
        JdialogTabelaExternaAFD.setBackground(new java.awt.Color(28, 28, 28));
        JdialogTabelaExternaAFD.setMinimumSize(new java.awt.Dimension(400, 300));

        jPanel2.setBackground(new java.awt.Color(28, 28, 28));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(20, 20, 20));
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tabela de Transições");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout JdialogTabelaExternaAFDLayout = new javax.swing.GroupLayout(JdialogTabelaExternaAFD.getContentPane());
        JdialogTabelaExternaAFD.getContentPane().setLayout(JdialogTabelaExternaAFDLayout);
        JdialogTabelaExternaAFDLayout.setHorizontalGroup(
            JdialogTabelaExternaAFDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JdialogTabelaExternaAFDLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        JdialogTabelaExternaAFDLayout.setVerticalGroup(
            JdialogTabelaExternaAFDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(28, 28, 28));
        setMaximumSize(new java.awt.Dimension(1024, 720));
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setPreferredSize(new java.awt.Dimension(1024, 720));

        FDAutomato.setBackground(new java.awt.Color(28, 28, 28));
        FDAutomato.setMaximumSize(new java.awt.Dimension(1024, 720));
        FDAutomato.setMinimumSize(new java.awt.Dimension(1024, 720));
        FDAutomato.setPreferredSize(new java.awt.Dimension(1024, 720));

        FD_BodyConfig.setBackground(new java.awt.Color(28, 28, 28));
        FD_BodyConfig.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FD_BodyConfig.setForeground(new java.awt.Color(51, 51, 51));

        FD_LabelAlfabeto.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        FD_LabelAlfabeto.setForeground(new java.awt.Color(255, 255, 255));
        FD_LabelAlfabeto.setText("Alfabeto");
        FD_LabelAlfabeto.setToolTipText("<html>\nElementos que constituem o alfabeto do autômato, são utilizados como \"meio\" de transição para uma transição qualquer\n<br>\nExemplo de input: \"0,1,a,b,c,\" (Uma vírgula por elemento)\n</html>");

        FD_LabelEstadosFinais.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        FD_LabelEstadosFinais.setForeground(new java.awt.Color(255, 255, 255));
        FD_LabelEstadosFinais.setText("Estados Finais");
        FD_LabelEstadosFinais.setToolTipText("<html>\nEstados que levam ao reconhecimento de dada String de entrada, pode existir mais de um estado final\n<br>\nExemplo de input: \"l,m\" (Uma vírgula por elemento)\n</html>");

        FD_LabelEstados.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        FD_LabelEstados.setForeground(new java.awt.Color(255, 255, 255));
        FD_LabelEstados.setText("Estados");
        FD_LabelEstados.setToolTipText("<html>\nEstados que constitutem o autômato, estado inicial e estados finais devem estar contidos\n<br>\nExemplo de input: \"l,m,s,t,p\"\n</html>");

        FD_LabelEstadoInicial1.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        FD_LabelEstadoInicial1.setForeground(new java.awt.Color(255, 255, 255));
        FD_LabelEstadoInicial1.setText("Estado Inicial");
        FD_LabelEstadoInicial1.setToolTipText("<html>\nPonto de partida do referido autômato, só um estado inicial pode existir\n<br>\nExemplo de input: \"s\" (apenas um elemento)\n</html>");

        FD_LabelTabelaTransicao1.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        FD_LabelTabelaTransicao1.setForeground(new java.awt.Color(255, 255, 255));
        FD_LabelTabelaTransicao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FD_LabelTabelaTransicao1.setText("Tabela de Transições");
        FD_LabelTabelaTransicao1.setToolTipText("<html>\nTabela utilizada para expressar todas as transições existentes, as transições\nseguem o seguinte modelo:<br>   | Estados (linhas da coluna 0) x Alfabeto (colunas) = estados para o qual pode ir, para dado alfabeto |\n<br>\nExemplo de Input: (linha) ('l') (coluna) ('0') = 'l' |  Existe uma transição saindo do estado 'l', utilizando '0' como alfabeto para transição, vai para o estado 'l'\n</html>");
        FD_LabelTabelaTransicao1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FD_LabelTabelaTransicao1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FD_LabelTabelaTransicao1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FD_LabelTabelaTransicao1MouseExited(evt);
            }
        });

        FD_TextFieldAlfabeto.setFont(new java.awt.Font("Noto Sans", 0, 13)); // NOI18N
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

        FD_TextFieldEstados.setFont(new java.awt.Font("Noto Sans", 0, 13)); // NOI18N
        FD_TextFieldEstados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FD_TextFieldEstados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FD_TextFieldEstadosKeyReleased(evt);
            }
        });

        FD_TextFieldEstadoInicial1.setFont(new java.awt.Font("Noto Sans", 0, 13)); // NOI18N
        FD_TextFieldEstadoInicial1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FD_TextFieldEstadoInicial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FD_TextFieldEstadoInicial1ActionPerformed(evt);
            }
        });
        FD_TextFieldEstadoInicial1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FD_TextFieldEstadoInicial1KeyReleased(evt);
            }
        });

        FD_TextFieldEstadosFinais1.setFont(new java.awt.Font("Noto Sans", 0, 13)); // NOI18N
        FD_TextFieldEstadosFinais1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FD_TextFieldEstadosFinais1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FD_TextFieldEstadosFinais1ActionPerformed(evt);
            }
        });
        FD_TextFieldEstadosFinais1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FD_TextFieldEstadosFinais1KeyReleased(evt);
            }
        });

        AFD_button_minus.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        AFD_button_minus.setText(" - ");
        AFD_button_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AFD_button_minusActionPerformed(evt);
            }
        });

        AFD_button_plus.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        AFD_button_plus.setText(" + ");
        AFD_button_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AFD_button_plusActionPerformed(evt);
            }
        });

        FDjTable.setFont(new java.awt.Font("Noto Sans", 0, 13)); // NOI18N
        FDjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estado Origem", "Entrada", "Estado Destino"
            }
        ));
        FDjTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FDjTableKeyReleased(evt);
            }
        });
        AFND2_jScrollPane4.setViewportView(FDjTable);

        javax.swing.GroupLayout FD_BodyConfigLayout = new javax.swing.GroupLayout(FD_BodyConfig);
        FD_BodyConfig.setLayout(FD_BodyConfigLayout);
        FD_BodyConfigLayout.setHorizontalGroup(
            FD_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FD_BodyConfigLayout.createSequentialGroup()
                .addGroup(FD_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FD_BodyConfigLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AFND2_jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FD_BodyConfigLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(FD_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FD_BodyConfigLayout.createSequentialGroup()
                                .addComponent(FD_LabelAlfabeto)
                                .addGap(85, 85, 85))
                            .addGroup(FD_BodyConfigLayout.createSequentialGroup()
                                .addGroup(FD_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FD_LabelEstadosFinais)
                                    .addComponent(FD_LabelEstadoInicial1)
                                    .addComponent(FD_LabelEstados))
                                .addGap(36, 36, 36)))
                        .addGroup(FD_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FD_TextFieldAlfabeto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                            .addComponent(FD_TextFieldEstadosFinais1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FD_TextFieldEstadoInicial1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FD_TextFieldEstados, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FD_BodyConfigLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AFD_button_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(FD_LabelTabelaTransicao1)
                        .addGap(74, 74, 74)
                        .addComponent(AFD_button_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FD_BodyConfigLayout.setVerticalGroup(
            FD_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FD_BodyConfigLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FD_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FD_LabelAlfabeto)
                    .addComponent(FD_TextFieldAlfabeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FD_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FD_TextFieldEstadosFinais1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FD_LabelEstadosFinais))
                .addGap(10, 10, 10)
                .addGroup(FD_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FD_TextFieldEstadoInicial1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FD_LabelEstadoInicial1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FD_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FD_LabelEstados)
                    .addComponent(FD_TextFieldEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(FD_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FD_LabelTabelaTransicao1)
                    .addComponent(AFD_button_plus)
                    .addComponent(AFD_button_minus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AFND2_jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        FD_BodyConfigLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {FD_TextFieldAlfabeto, FD_TextFieldEstadoInicial1, FD_TextFieldEstados, FD_TextFieldEstadosFinais1});

        FD_ConfigTitulo.setFont(new java.awt.Font("Noto Sans", 0, 32)); // NOI18N
        FD_ConfigTitulo.setForeground(new java.awt.Color(255, 255, 255));
        FD_ConfigTitulo.setText("<html><p style=\"padding-bottom: 16px;\">Autômato Finito Determinístico</p></html>");
        FD_ConfigTitulo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        FD_ConfigSubTitulo.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        FD_ConfigSubTitulo.setForeground(new java.awt.Color(255, 255, 255));
        FD_ConfigSubTitulo.setText("Configuração");

        FD_salvarAutomatoBtn.setBackground(new java.awt.Color(51, 51, 51));
        FD_salvarAutomatoBtn.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
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
        FD_processarAutomatoBtn.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
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
                .addGroup(FDAutomatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FDAutomatoLayout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(FD_ConfigTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FDAutomatoLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addGroup(FDAutomatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FDAutomatoLayout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addGroup(FDAutomatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(FD_processarAutomatoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FD_salvarAutomatoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(FD_ConfigSubTitulo)
                            .addComponent(FD_BodyConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        FDAutomatoLayout.setVerticalGroup(
            FDAutomatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FDAutomatoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(FD_ConfigTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FD_ConfigSubTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FD_BodyConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FD_salvarAutomatoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FD_processarAutomatoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FDAutomato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FDAutomato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

  private void FD_TextFieldAlfabetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FD_TextFieldAlfabetoActionPerformed
  }//GEN-LAST:event_FD_TextFieldAlfabetoActionPerformed

  private void FD_TextFieldAlfabetoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FD_TextFieldAlfabetoKeyReleased
      if (FD_TextFieldAlfabeto.getText().charAt(FD_TextFieldAlfabeto.getText().length() - 1) != ',') {
          if (evt.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
              FD_TextFieldAlfabeto.setText(FD_TextFieldAlfabeto.getText() + ",");
          }
      }
//      CustomTable tableModel = controller.insertTabela(validator.separarPorVirgula(FD_TextFieldEstados), validator.separarPorVirgula(FD_TextFieldAlfabeto));
//      FDjTable.setModel(tableModel);
  }//GEN-LAST:event_FD_TextFieldAlfabetoKeyReleased

  private void FD_TextFieldEstadoInicial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FD_TextFieldEstadoInicial1ActionPerformed
  }//GEN-LAST:event_FD_TextFieldEstadoInicial1ActionPerformed

  private void FD_TextFieldEstadosFinais1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FD_TextFieldEstadosFinais1ActionPerformed
  }//GEN-LAST:event_FD_TextFieldEstadosFinais1ActionPerformed

  private void FD_salvarAutomatoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FD_salvarAutomatoBtnMouseClicked
      controller.gerarAutomato(FD_TextFieldAlfabeto.getText().replaceAll(",", ""),
              FD_TextFieldEstadoInicial1.getText(), FD_TextFieldEstados.getText(),
              FD_TextFieldEstadosFinais1.getText(), FDjTable,
              true);
  }//GEN-LAST:event_FD_salvarAutomatoBtnMouseClicked

  private void FD_processarAutomatoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FD_processarAutomatoBtnMouseClicked
      String[] estados = FD_TextFieldEstados.getText().split(",");
      String inicial = FD_TextFieldEstadoInicial1.getText();
      String[] finais = FD_TextFieldEstadosFinais1.getText().split(",");
      List<String> estadosLista = new ArrayList<String>();
      List<String> finaisLista = new ArrayList<String>();
      Collections.addAll(estadosLista, estados);
      Collections.addAll(finaisLista, finais);
      if (estadosLista.containsAll(finaisLista)) {
          if (estadosLista.contains(inicial)) {
              try {
                  AFD automato = controller.gerarAutomato(
                          FD_TextFieldAlfabeto.getText(), FDjTable, FD_LabelEstadoInicial1.getText(), FD_TextFieldEstadosFinais1.getText()
                  );
                  if (controller.processarAutomato(automato) == true) {
                      LFStudio.cl.show(JanelaExecucao, "fdProcessamentoPanel");
                  }
              } catch (Exception e) {
                  JOptionPane.showMessageDialog(null, e.getMessage());
              }
          }
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
      
//      FDjTable.setModel(tableModel);
  }//GEN-LAST:event_FD_TextFieldEstadosKeyReleased

    private void FD_TextFieldEstadosFinais1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FD_TextFieldEstadosFinais1KeyReleased

    }//GEN-LAST:event_FD_TextFieldEstadosFinais1KeyReleased

    private void FD_TextFieldEstadoInicial1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FD_TextFieldEstadoInicial1KeyReleased

    }//GEN-LAST:event_FD_TextFieldEstadoInicial1KeyReleased

    private void FD_LabelTabelaTransicao1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FD_LabelTabelaTransicao1MouseClicked
        JdialogTabelaExternaAFD.setVisible(true);
        jTable1.setModel(FDjTable.getModel());
    }//GEN-LAST:event_FD_LabelTabelaTransicao1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        FDjTable.setModel(jTable1.getModel());
    }//GEN-LAST:event_jTable1KeyReleased

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        JdialogTabelaExternaAFD.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        Font f = jLabel1.getFont();
        jLabel1.setFont(f.deriveFont(f.getStyle(), f.getSize2D() + 4));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        Font f = jLabel1.getFont();
        jLabel1.setFont(f.deriveFont(f.getStyle(), f.getSize2D() - 4));
    }//GEN-LAST:event_jLabel1MouseExited

    private void FD_LabelTabelaTransicao1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FD_LabelTabelaTransicao1MouseEntered
        Font f = FD_LabelTabelaTransicao1.getFont();
        FD_LabelTabelaTransicao1.setFont(f.deriveFont(f.getStyle(), f.getSize2D() + 4));
    }//GEN-LAST:event_FD_LabelTabelaTransicao1MouseEntered

    private void FD_LabelTabelaTransicao1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FD_LabelTabelaTransicao1MouseExited
        Font f = FD_LabelTabelaTransicao1.getFont();
        FD_LabelTabelaTransicao1.setFont(f.deriveFont(f.getStyle(), f.getSize2D() - 4));
    }//GEN-LAST:event_FD_LabelTabelaTransicao1MouseExited

    private void AFD_button_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AFD_button_minusActionPerformed
     if(tableModel.getRowCount() > 0)
        tableModel.removeRow(tableModel.getRowCount()-1);
    }//GEN-LAST:event_AFD_button_minusActionPerformed

    private void AFD_button_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AFD_button_plusActionPerformed
        tableModel.addRow(new Object[]{});
        
    }//GEN-LAST:event_AFD_button_plusActionPerformed

    private void FDjTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FDjTableKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_FDjTableKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AFD_button_minus;
    private javax.swing.JButton AFD_button_plus;
    private javax.swing.JScrollPane AFND2_jScrollPane4;
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
    private javax.swing.JLabel FD_processarAutomatoBtn;
    private javax.swing.JLabel FD_salvarAutomatoBtn;
    private javax.swing.JTable FDjTable;
    private javax.swing.JDialog JdialogTabelaExternaAFD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
