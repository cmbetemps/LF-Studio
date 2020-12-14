/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modulos.AutomatoFinitoNaoDeterministico.screens;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import main.LFStudio;
import main.modulos.AutomatoFinitoNaoDeterministico.controllers.FndController;
import main.modulos.AutomatoFinitoNaoDeterministico.domain.NaoDeterministico;
import main.layout.CustomTable;


public class FndConfigPanel extends javax.swing.JPanel {
    FndController controller = new FndController();
    javax.swing.JPanel JanelaExecucao;
    NaoDeterministico automato;
    /**
     * Creates new form test1
     */
    public FndConfigPanel(javax.swing.JPanel janela) {
        JanelaExecucao = janela;
        initComponents();

    }
    
    public void carregar(){
        controller.setarCampos(FND_jTable1, FND_TextFieldAlfabeto, FND_TextFieldEstadosFinais, FND_TextFieldEstadoInicial, FND_TextFieldEstados);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JdialogTabelaExterna = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        FND_BodyConfig = new javax.swing.JPanel();
        FND_LabelAlfabeto = new javax.swing.JLabel();
        FND_LabelEstadosFinais = new javax.swing.JLabel();
        FND_LabelEstados = new javax.swing.JLabel();
        FND_LabelEstadoInicial = new javax.swing.JLabel();
        FND_LabelTabelaTransicao = new javax.swing.JLabel();
        FND_TextFieldAlfabeto = new javax.swing.JTextField();
        FND_jScrollPane2 = new javax.swing.JScrollPane();
        FND_jTable1 = new javax.swing.JTable();
        FND_TextFieldEstados = new javax.swing.JTextField();
        FND_TextFieldEstadoInicial = new javax.swing.JTextField();
        FND_TextFieldEstadosFinais = new javax.swing.JTextField();
        FND_Titulo = new javax.swing.JLabel();
        FND_LabelProcessarAutomato = new javax.swing.JLabel();
        FND_SalvarAutomatojlbl = new javax.swing.JLabel();
        FND_SubTitulo = new javax.swing.JLabel();

        JdialogTabelaExterna.setAlwaysOnTop(true);
        JdialogTabelaExterna.setBackground(new java.awt.Color(28, 28, 28));
        JdialogTabelaExterna.setMinimumSize(new java.awt.Dimension(400, 300));

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

        javax.swing.GroupLayout JdialogTabelaExternaLayout = new javax.swing.GroupLayout(JdialogTabelaExterna.getContentPane());
        JdialogTabelaExterna.getContentPane().setLayout(JdialogTabelaExternaLayout);
        JdialogTabelaExternaLayout.setHorizontalGroup(
            JdialogTabelaExternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JdialogTabelaExternaLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        JdialogTabelaExternaLayout.setVerticalGroup(
            JdialogTabelaExternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 51, 51));
        setForeground(new java.awt.Color(28, 28, 28));
        setMaximumSize(new java.awt.Dimension(1024, 720));
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setPreferredSize(new java.awt.Dimension(1024, 720));

        jPanel1.setBackground(new java.awt.Color(28, 28, 28));
        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 720));

        FND_BodyConfig.setBackground(new java.awt.Color(28, 28, 28));
        FND_BodyConfig.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        FND_BodyConfig.setForeground(new java.awt.Color(28, 28, 28));

        FND_LabelAlfabeto.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        FND_LabelAlfabeto.setForeground(new java.awt.Color(255, 255, 255));
        FND_LabelAlfabeto.setText("Alfabeto");
        FND_LabelAlfabeto.setToolTipText("<html>\nElementos que constituem o alfabeto do autômato, são utilizados como \"meio\" de transição para uma transição qualquer\n<br>\nExemplo de input: \"0,1,a,b,c,\" (Uma vírgula por elemento)\n</html>");

        FND_LabelEstadosFinais.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        FND_LabelEstadosFinais.setForeground(new java.awt.Color(255, 255, 255));
        FND_LabelEstadosFinais.setText("Estados Finais");
        FND_LabelEstadosFinais.setToolTipText("<html>\nEstados que levam ao reconhecimento de dada String de entrada, pode existir mais de um estado final\n<br>\nExemplo de input: \"l,m\" (Uma vírgula por elemento)\n</html>");

        FND_LabelEstados.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        FND_LabelEstados.setForeground(new java.awt.Color(255, 255, 255));
        FND_LabelEstados.setText("Estados");
        FND_LabelEstados.setToolTipText("<html>\nEstados que constitutem o autômato, estado inicial e estados finais devem estar contidos\n<br>\nExemplo de input: \"l,m,s,t,p\"\n</html>");

        FND_LabelEstadoInicial.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        FND_LabelEstadoInicial.setForeground(new java.awt.Color(255, 255, 255));
        FND_LabelEstadoInicial.setText("Estado Inicial");
        FND_LabelEstadoInicial.setToolTipText("<html>\nPonto de partida do referido autômato, só um estado inicial pode existir\n<br>\nExemplo de input: \"s\" (apenas um elemento)\n</html>");

        FND_LabelTabelaTransicao.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        FND_LabelTabelaTransicao.setForeground(new java.awt.Color(255, 255, 255));
        FND_LabelTabelaTransicao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FND_LabelTabelaTransicao.setText("Tabela de Transições");
        FND_LabelTabelaTransicao.setToolTipText("<html>\nTabela utilizada para expressar todas as transições existentes, as transições\nseguem o seguinte modelo: \n<br>   | Estados (linhas da coluna 0) x Alfabeto (colunas) = estado para o qual irá (apenas um estado, visto que é um AFD) |\n<br>\nExemplo de Input: (linha) ('l') (coluna) ('0') = 'l' |  Existe uma transição saindo do estado 'l', utilizando '0' como alfabeto para transição, vai para o estado 'l'\n</html>");
        FND_LabelTabelaTransicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FND_LabelTabelaTransicaoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FND_LabelTabelaTransicaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FND_LabelTabelaTransicaoMouseExited(evt);
            }
        });

        FND_TextFieldAlfabeto.setFont(new java.awt.Font("Noto Sans", 0, 13)); // NOI18N
        FND_TextFieldAlfabeto.setForeground(new java.awt.Color(0, 0, 0));
        FND_TextFieldAlfabeto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FND_TextFieldAlfabeto.setToolTipText("");
        FND_TextFieldAlfabeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FND_TextFieldAlfabetoActionPerformed(evt);
            }
        });
        FND_TextFieldAlfabeto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FND_TextFieldAlfabetoKeyReleased(evt);
            }
        });

        FND_jTable1.setFont(new java.awt.Font("Noto Sans", 0, 13)); // NOI18N
        FND_jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estados"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        FND_jTable1.setToolTipText("<html>\nTabela utilizada para expressar todas as transições existentes, as transições\nseguem o seguinte modelo: \n<br>   | Estados (linhas da coluna 0) x Alfabeto (colunas) = estado para o qual irá (apenas um estado, visto que é um AFD) |\n<br>\nExemplo de Input: (linha) ('l') (coluna) ('0') = 'l' |  Existe uma transição saindo do estado 'l', utilizando '0' como alfabeto para transição, vai para o estado 'l'\n</html>");
        FND_jScrollPane2.setViewportView(FND_jTable1);

        FND_TextFieldEstados.setFont(new java.awt.Font("Noto Sans", 0, 13)); // NOI18N
        FND_TextFieldEstados.setForeground(new java.awt.Color(0, 0, 0));
        FND_TextFieldEstados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FND_TextFieldEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FND_TextFieldEstadosActionPerformed(evt);
            }
        });
        FND_TextFieldEstados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FND_TextFieldEstadosKeyReleased(evt);
            }
        });

        FND_TextFieldEstadoInicial.setFont(new java.awt.Font("Noto Sans", 0, 13)); // NOI18N
        FND_TextFieldEstadoInicial.setForeground(new java.awt.Color(0, 0, 0));
        FND_TextFieldEstadoInicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        FND_TextFieldEstadosFinais.setFont(new java.awt.Font("Noto Sans", 0, 13)); // NOI18N
        FND_TextFieldEstadosFinais.setForeground(new java.awt.Color(0, 0, 0));
        FND_TextFieldEstadosFinais.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FND_TextFieldEstadosFinais.setToolTipText("");
        FND_TextFieldEstadosFinais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FND_TextFieldEstadosFinaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FND_BodyConfigLayout = new javax.swing.GroupLayout(FND_BodyConfig);
        FND_BodyConfig.setLayout(FND_BodyConfigLayout);
        FND_BodyConfigLayout.setHorizontalGroup(
            FND_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FND_BodyConfigLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FND_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FND_BodyConfigLayout.createSequentialGroup()
                        .addGroup(FND_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FND_LabelEstadosFinais)
                            .addComponent(FND_LabelAlfabeto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(FND_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FND_TextFieldEstadosFinais, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                            .addComponent(FND_TextFieldAlfabeto)))
                    .addGroup(FND_BodyConfigLayout.createSequentialGroup()
                        .addGroup(FND_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FND_LabelEstadoInicial)
                            .addComponent(FND_LabelEstados))
                        .addGap(46, 46, 46)
                        .addGroup(FND_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FND_TextFieldEstadoInicial)
                            .addComponent(FND_TextFieldEstados)))
                    .addComponent(FND_LabelTabelaTransicao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FND_jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE))
                .addContainerGap())
        );
        FND_BodyConfigLayout.setVerticalGroup(
            FND_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FND_BodyConfigLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FND_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FND_TextFieldAlfabeto)
                    .addComponent(FND_LabelAlfabeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FND_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FND_TextFieldEstadosFinais, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FND_LabelEstadosFinais, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FND_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FND_TextFieldEstadoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FND_BodyConfigLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(FND_LabelEstadoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(FND_BodyConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FND_TextFieldEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FND_BodyConfigLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(FND_LabelEstados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FND_LabelTabelaTransicao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FND_jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addContainerGap())
        );

        FND_Titulo.setFont(new java.awt.Font("Noto Sans", 0, 32)); // NOI18N
        FND_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        FND_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FND_Titulo.setText("<html><p style=\"padding-bottom: 16px;\">Autômato Finito Não Determinístico</p></html>");
        FND_Titulo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        FND_LabelProcessarAutomato.setBackground(new java.awt.Color(51, 51, 51));
        FND_LabelProcessarAutomato.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        FND_LabelProcessarAutomato.setForeground(new java.awt.Color(255, 255, 255));
        FND_LabelProcessarAutomato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FND_LabelProcessarAutomato.setText(" Processar Autômato ");
        FND_LabelProcessarAutomato.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FND_LabelProcessarAutomato.setOpaque(true);
        FND_LabelProcessarAutomato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FND_LabelProcessarAutomatoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FND_LabelProcessarAutomatoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FND_LabelProcessarAutomatoMouseExited(evt);
            }
        });

        FND_SalvarAutomatojlbl.setBackground(new java.awt.Color(51, 51, 51));
        FND_SalvarAutomatojlbl.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        FND_SalvarAutomatojlbl.setForeground(new java.awt.Color(255, 255, 255));
        FND_SalvarAutomatojlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FND_SalvarAutomatojlbl.setText("Salvar Autômato");
        FND_SalvarAutomatojlbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FND_SalvarAutomatojlbl.setOpaque(true);
        FND_SalvarAutomatojlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FND_SalvarAutomatojlblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FND_SalvarAutomatojlblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FND_SalvarAutomatojlblMouseExited(evt);
            }
        });

        FND_SubTitulo.setFont(new java.awt.Font("Noto Sans", 0, 22)); // NOI18N
        FND_SubTitulo.setForeground(new java.awt.Color(255, 255, 255));
        FND_SubTitulo.setText("Configuração");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(192, 210, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FND_SubTitulo)
                            .addComponent(FND_BodyConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(208, 208, 208))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(FND_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(FND_SalvarAutomatojlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(FND_LabelProcessarAutomato, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(325, 325, 325)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(FND_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FND_SubTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FND_BodyConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FND_SalvarAutomatojlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FND_LabelProcessarAutomato, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FND_SalvarAutomatojlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FND_SalvarAutomatojlblMouseExited
        FND_SalvarAutomatojlbl.setBackground(FND_SalvarAutomatojlbl.getBackground().darker().darker());
    }//GEN-LAST:event_FND_SalvarAutomatojlblMouseExited

    private void FND_SalvarAutomatojlblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FND_SalvarAutomatojlblMouseEntered
        FND_SalvarAutomatojlbl.setBackground(FND_SalvarAutomatojlbl.getBackground().brighter().brighter());
    }//GEN-LAST:event_FND_SalvarAutomatojlblMouseEntered

    private void FND_LabelProcessarAutomatoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FND_LabelProcessarAutomatoMouseExited
        FND_LabelProcessarAutomato.setBackground(FND_LabelProcessarAutomato.getBackground().darker().darker());
    }//GEN-LAST:event_FND_LabelProcessarAutomatoMouseExited

    private void FND_LabelProcessarAutomatoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FND_LabelProcessarAutomatoMouseEntered
        FND_LabelProcessarAutomato.setBackground(FND_LabelProcessarAutomato.getBackground().brighter().brighter());
    }//GEN-LAST:event_FND_LabelProcessarAutomatoMouseEntered

    private void FND_LabelProcessarAutomatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FND_LabelProcessarAutomatoMouseClicked
        String[] estados = FND_TextFieldEstados.getText().split(",");
        String inicial = FND_TextFieldEstadoInicial.getText();
        String[] finais = FND_TextFieldEstadosFinais.getText().split(",");
        List<String> estadosLista = new ArrayList<String>();
        List<String> finaisLista = new ArrayList<String>();
        Collections.addAll(estadosLista, estados);
        Collections.addAll(finaisLista, finais);


        if (estadosLista.containsAll(finaisLista)) {
            if (estadosLista.contains(inicial)) {
//(JTextField alfabeto, JTextField estadoInicialJ, JTextField estadosJ, JTextField estadosFinaisJ , JTable table) {
                NaoDeterministico atual = controller.gerarAutomato(
                  FND_TextFieldAlfabeto,
                  FND_TextFieldEstadoInicial,
                  FND_TextFieldEstados,
                  FND_TextFieldEstadosFinais,
                  FND_jTable1,
                  false
                );
                LFStudio.cl.show(JanelaExecucao, "fndProcessamentoPanel");
            }
        }
    }//GEN-LAST:event_FND_LabelProcessarAutomatoMouseClicked

    private void FND_TextFieldEstadosFinaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FND_TextFieldEstadosFinaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FND_TextFieldEstadosFinaisActionPerformed

    private void FND_TextFieldEstadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FND_TextFieldEstadosKeyReleased
        String[] estados = FND_TextFieldEstados.getText().split(",");
        String[] alfabeto = FND_TextFieldAlfabeto.getText().split(",");
        Vector<String> vector = null;
        CustomTable tableModel = new CustomTable();
        tableModel.addColumn("Estados");
        for (String rowName : estados) {
            vector = new Vector<String>();
            vector.add(rowName);
            tableModel.insertRow(0, vector);
        }
        for (String columnName : alfabeto) {
            tableModel.addColumn(columnName);
        }
        FND_jTable1.setModel(tableModel);
    }//GEN-LAST:event_FND_TextFieldEstadosKeyReleased

    private void FND_TextFieldEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FND_TextFieldEstadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FND_TextFieldEstadosActionPerformed

    private void FND_TextFieldAlfabetoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FND_TextFieldAlfabetoKeyReleased
        if (FND_TextFieldAlfabeto.getText().charAt(FND_TextFieldAlfabeto.getText().length() - 1) != ',') {
            if (evt.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
                FND_TextFieldAlfabeto.setText(FND_TextFieldAlfabeto.getText() + ",");
            }
        }
        String[] estados = FND_TextFieldEstados.getText().split(",");
        String[] alfabeto = FND_TextFieldAlfabeto.getText().split(",");
        Vector<String> vector = null;
        CustomTable tableModel = new CustomTable();
        tableModel.addColumn("Estados");
        for (String rowName : estados) {
            vector = new Vector<String>();
            vector.add(rowName);
            tableModel.insertRow(0, vector);
        }
        for (String columnName : alfabeto) {
            tableModel.addColumn(columnName);
        }
        FND_jTable1.setModel(tableModel);
    }//GEN-LAST:event_FND_TextFieldAlfabetoKeyReleased

    private void FND_TextFieldAlfabetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FND_TextFieldAlfabetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FND_TextFieldAlfabetoActionPerformed

    private void FND_LabelTabelaTransicaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FND_LabelTabelaTransicaoMouseClicked
        JdialogTabelaExterna.setVisible(true);
        jTable1.setModel(FND_jTable1.getModel());
    }//GEN-LAST:event_FND_LabelTabelaTransicaoMouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        FND_jTable1.setModel(jTable1.getModel());
    }//GEN-LAST:event_jTable1KeyReleased

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        JdialogTabelaExterna.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        Font f = jLabel1.getFont();
        jLabel1.setFont(f.deriveFont(f.getStyle(), f.getSize2D() + 4));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        Font f = jLabel1.getFont();
        jLabel1.setFont(f.deriveFont(f.getStyle(), f.getSize2D() - 4));
    }//GEN-LAST:event_jLabel1MouseExited

    private void FND_LabelTabelaTransicaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FND_LabelTabelaTransicaoMouseEntered
        Font f = FND_LabelTabelaTransicao.getFont();
        FND_LabelTabelaTransicao.setFont(f.deriveFont(f.getStyle(), f.getSize2D() + 4));
    }//GEN-LAST:event_FND_LabelTabelaTransicaoMouseEntered

    private void FND_LabelTabelaTransicaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FND_LabelTabelaTransicaoMouseExited
        Font f = FND_LabelTabelaTransicao.getFont();
        FND_LabelTabelaTransicao.setFont(f.deriveFont(f.getStyle(), f.getSize2D() - 4));
    }//GEN-LAST:event_FND_LabelTabelaTransicaoMouseExited

    private void FND_SalvarAutomatojlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FND_SalvarAutomatojlblMouseClicked
       controller.gerarAutomato( FND_TextFieldAlfabeto,
            FND_TextFieldEstadoInicial,FND_TextFieldEstados, 
            FND_TextFieldEstadosFinais,FND_jTable1,
            true);       
        // TODO add your handling code here:
    }//GEN-LAST:event_FND_SalvarAutomatojlblMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FND_BodyConfig;
    private javax.swing.JLabel FND_LabelAlfabeto;
    private javax.swing.JLabel FND_LabelEstadoInicial;
    private javax.swing.JLabel FND_LabelEstados;
    private javax.swing.JLabel FND_LabelEstadosFinais;
    private javax.swing.JLabel FND_LabelProcessarAutomato;
    private javax.swing.JLabel FND_LabelTabelaTransicao;
    private javax.swing.JLabel FND_SalvarAutomatojlbl;
    private javax.swing.JLabel FND_SubTitulo;
    private javax.swing.JTextField FND_TextFieldAlfabeto;
    private javax.swing.JTextField FND_TextFieldEstadoInicial;
    private javax.swing.JTextField FND_TextFieldEstados;
    private javax.swing.JTextField FND_TextFieldEstadosFinais;
    private javax.swing.JLabel FND_Titulo;
    private javax.swing.JScrollPane FND_jScrollPane2;
    private javax.swing.JTable FND_jTable1;
    private javax.swing.JDialog JdialogTabelaExterna;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
