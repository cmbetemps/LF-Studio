/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modulos.MaquinaTuring.screens;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.modulos.MaquinaTuring.domain.model.Reconhecer;


/**
 *
 * @author andrelise
 * @author thiagoleal
 */
public class TuringProcessamentoPanel extends javax.swing.JPanel {
    javax.swing.JPanel JanelaExecucao;
  
    public DefaultTableModel model1;
    public int indexPassoApasso= 0;
    public static String pathFile;

  public TuringProcessamentoPanel(javax.swing.JPanel janela) {
    initComponents();
    JanelaExecucao = janela;

    palavraReconhecida.setVisible(false);
    palavraNReconhecida.setVisible(false);
    erroPalavra.setVisible(false);
  }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodyFd = new javax.swing.JPanel();
        Pilha_ConfigTitulo1 = new javax.swing.JLabel();
        Pilha_subTitulo = new javax.swing.JLabel();
        inputPalavra = new javax.swing.JTextField();
        carregaEntrada = new javax.swing.JToggleButton();
        executaPasso = new javax.swing.JToggleButton();
        btnLimpar = new javax.swing.JToggleButton();
        palavraReconhecida = new javax.swing.JLabel();
        palavraNReconhecida = new javax.swing.JLabel();
        erroPalavra = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaExec = new javax.swing.JTable();

        setBackground(new java.awt.Color(28, 28, 28));
        setMaximumSize(new java.awt.Dimension(1024, 720));
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setPreferredSize(new java.awt.Dimension(1024, 720));

        bodyFd.setBackground(new java.awt.Color(28, 28, 28));
        bodyFd.setMaximumSize(new java.awt.Dimension(1024, 720));
        bodyFd.setMinimumSize(new java.awt.Dimension(1024, 720));
        bodyFd.setPreferredSize(new java.awt.Dimension(1024, 720));
        bodyFd.setRequestFocusEnabled(false);

        Pilha_ConfigTitulo1.setFont(new java.awt.Font("Noto Sans", 0, 32)); // NOI18N
        Pilha_ConfigTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        Pilha_ConfigTitulo1.setText("<html><p style=\"padding-bottom: 16px;\">Máquina de Turing</p></html>");
        Pilha_ConfigTitulo1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        Pilha_subTitulo.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        Pilha_subTitulo.setForeground(new java.awt.Color(255, 255, 255));
        Pilha_subTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pilha_subTitulo.setText("Entrada:");

        inputPalavra.setBackground(new java.awt.Color(255, 255, 255));
        inputPalavra.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        inputPalavra.setForeground(new java.awt.Color(0, 0, 0));
        inputPalavra.setPreferredSize(new java.awt.Dimension(15, 32));
        inputPalavra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPalavrar_aActionPerformed(evt);
            }
        });
        inputPalavra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputPalavraKeyReleased(evt);
            }
        });

        carregaEntrada.setBackground(new java.awt.Color(51, 51, 51));
        carregaEntrada.setFont(new java.awt.Font("Noto Sans", 0, 16)); // NOI18N
        carregaEntrada.setForeground(new java.awt.Color(255, 255, 255));
        carregaEntrada.setText("EXECUTAR ");
        carregaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carregaEntradaActionPerformed(evt);
            }
        });

        executaPasso.setBackground(new java.awt.Color(51, 51, 51));
        executaPasso.setFont(new java.awt.Font("Noto Sans", 0, 16)); // NOI18N
        executaPasso.setForeground(new java.awt.Color(255, 255, 255));
        executaPasso.setText("EXECUTAR PASSO A PASSO");
        executaPasso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executaPassoActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(51, 51, 51));
        btnLimpar.setFont(new java.awt.Font("Noto Sans", 0, 16)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        palavraReconhecida.setFont(new java.awt.Font("Open Sans Condensed Light", 0, 12)); // NOI18N
        palavraReconhecida.setForeground(new java.awt.Color(0, 255, 0));
        palavraReconhecida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/validado.png"))); // NOI18N
        palavraReconhecida.setText("Palavra reconhecida pela Máquina de Turing");

        palavraNReconhecida.setFont(new java.awt.Font("Open Sans Condensed Light", 0, 12)); // NOI18N
        palavraNReconhecida.setForeground(new java.awt.Color(255, 0, 0));
        palavraNReconhecida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rejeitado.png"))); // NOI18N
        palavraNReconhecida.setText("Palavra não reconhecida pela Máquina de Turing");

        erroPalavra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/erroY.png"))); // NOI18N

        tabelaExec.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        tabelaExec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Estado atual", "Símbolo lido", "Símbolo escrito", "Movimento", "Novo estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaExec.setAutoscrolls(false);
        tabelaExec.setEditingRow(1);
        jScrollPane1.setViewportView(tabelaExec);

        javax.swing.GroupLayout bodyFdLayout = new javax.swing.GroupLayout(bodyFd);
        bodyFd.setLayout(bodyFdLayout);
        bodyFdLayout.setHorizontalGroup(
            bodyFdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyFdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyFdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyFdLayout.createSequentialGroup()
                        .addGroup(bodyFdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bodyFdLayout.createSequentialGroup()
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(carregaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(executaPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bodyFdLayout.createSequentialGroup()
                                .addComponent(Pilha_subTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyFdLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Pilha_ConfigTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(382, 382, 382))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyFdLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(erroPalavra)
                .addGap(18, 18, 18)
                .addComponent(palavraReconhecida, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(palavraNReconhecida)
                .addGap(98, 98, 98))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyFdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        bodyFdLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLimpar, carregaEntrada, executaPasso});

        bodyFdLayout.setVerticalGroup(
            bodyFdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyFdLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Pilha_ConfigTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bodyFdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyFdLayout.createSequentialGroup()
                        .addGroup(bodyFdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(palavraNReconhecida, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(palavraReconhecida, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bodyFdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputPalavra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pilha_subTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bodyFdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(carregaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(executaPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(erroPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bodyFd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bodyFd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    private void inputPalavrar_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPalavrar_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPalavrar_aActionPerformed

    private void inputPalavraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputPalavraKeyReleased

    }//GEN-LAST:event_inputPalavraKeyReleased

    private void carregaEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carregaEntradaActionPerformed
        palavraReconhecida.setVisible(false);
        palavraNReconhecida.setVisible(false);
        erroPalavra.setVisible(false);
        
        //limpar valores da tabela
        //limpando a tabela da execução
        if(indexPassoApasso != 0){
            model1 = (DefaultTableModel) tabelaExec.getModel();
            model1.setNumRows(0);
        }
    
        boolean leitura=false,initPassoAPAsso=false;
        Reconhecer maquinadeTuring = new Reconhecer();
        ArrayList<String> config = new ArrayList<>();

        String palavra = inputPalavra.getText();

        if(initPassoAPAsso == false){
            leitura = maquinadeTuring.reconhecer(palavra, config,pathFile);
            initPassoAPAsso=true;
        }

        if (leitura == true) {
            System.out.println("Palavra reconhecida");
            palavraReconhecida.setVisible(true);
        } else {
            System.out.println("Palavra não reconhecida");
            palavraNReconhecida.setVisible(true);
        }

        model1 = (DefaultTableModel) tabelaExec.getModel();
        
        for (int i = 0; i < config.size(); i++) {
            String row[] = config.get(i).split(",");
            model1.addRow(new Object[]{
                row[0],
                row[1],
                row[2],
                row[3],
                row[4]
            });
        }
    }//GEN-LAST:event_carregaEntradaActionPerformed

    private void executaPassoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executaPassoActionPerformed

        //limpar valores da tabela
        //limpando a tabela da execução
        if(indexPassoApasso == 0){
            model1 = (DefaultTableModel) tabelaExec.getModel();
            model1.setNumRows(0);

            //limpando valor de entrada reconhecida ou não
            palavraReconhecida.setVisible(false);
            palavraNReconhecida.setVisible(false);
        }

        int flagReconhece = -1;

        boolean leitura;
        Reconhecer maquinadeTuring = new Reconhecer();
        ArrayList<String> config = new ArrayList<>();

        String palavra = inputPalavra.getText();

        if(palavra.isEmpty()){
            //está vazio
            //erroPalavra.setVisible(true);
        }else{
            leitura = maquinadeTuring.reconhecer(palavra, config,pathFile);

            if (leitura == true) {
                System.out.println("Palavra reconhecida");
                flagReconhece = 1;
            } else {
                System.out.println("Palavra não reconhecida");
                flagReconhece = 0;
                palavraNReconhecida.setVisible(true);
            }

            model1 = (DefaultTableModel) tabelaExec.getModel();
            if(indexPassoApasso < config.size()){
                String row[] = config.get(indexPassoApasso).split(",");
                model1.addRow(new Object[]{
                    row[0],
                    row[1],
                    row[2],
                    row[3],
                    row[4]
                });
                indexPassoApasso++;
            }
            else{
                if(flagReconhece == 1){
                    palavraReconhecida.setVisible(true);
                }else if (flagReconhece == 0){
                    palavraNReconhecida.setVisible(true);
                }
                JOptionPane.showMessageDialog (null, "A Máquina de Turing terminou a computação da palavra!", "Fim execução", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_executaPassoActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:

        //limpando a tabela da execução
        model1 = (DefaultTableModel) tabelaExec.getModel();
        model1.setNumRows(0);

        //limpando entrada da máquina de turing
        inputPalavra.setText("");

        //limpando valor de entrada reconhecida ou não
        palavraReconhecida.setVisible(false);
        palavraNReconhecida.setVisible(false);
    }//GEN-LAST:event_btnLimparActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pilha_ConfigTitulo1;
    private javax.swing.JLabel Pilha_subTitulo;
    private javax.swing.JPanel bodyFd;
    private javax.swing.JToggleButton btnLimpar;
    private javax.swing.JToggleButton carregaEntrada;
    private javax.swing.JLabel erroPalavra;
    private javax.swing.JToggleButton executaPasso;
    private javax.swing.JTextField inputPalavra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel palavraNReconhecida;
    private javax.swing.JLabel palavraReconhecida;
    private javax.swing.JTable tabelaExec;
    // End of variables declaration//GEN-END:variables
}
