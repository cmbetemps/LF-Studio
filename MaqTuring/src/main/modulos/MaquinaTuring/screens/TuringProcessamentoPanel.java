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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaExec = new javax.swing.JTable();
        btnLimpar = new javax.swing.JToggleButton();
        palavraReconhecida = new javax.swing.JLabel();
        palavraNReconhecida = new javax.swing.JLabel();
        erroPalavra = new javax.swing.JLabel();

        setBackground(new java.awt.Color(28, 28, 28));
        setPreferredSize(new java.awt.Dimension(553, 633));

        bodyFd.setBackground(new java.awt.Color(28, 28, 28));
        bodyFd.setPreferredSize(new java.awt.Dimension(579, 648));
        bodyFd.setRequestFocusEnabled(false);

        Pilha_ConfigTitulo1.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 36)); // NOI18N
        Pilha_ConfigTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        Pilha_ConfigTitulo1.setText("<html><p style=\"padding-bottom: 16px;\">Máquina de Turing</p></html>");
        Pilha_ConfigTitulo1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        Pilha_subTitulo.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 24)); // NOI18N
        Pilha_subTitulo.setForeground(new java.awt.Color(255, 255, 255));
        Pilha_subTitulo.setText("Entrada");

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

        carregaEntrada.setText("EXECUTAR ");
        carregaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carregaEntradaActionPerformed(evt);
            }
        });

        executaPasso.setText("EXECUTAR PASSO A PASSO");
        executaPasso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executaPassoActionPerformed(evt);
            }
        });

        tabelaExec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Estado atual", "Símbolo lido", "Novo estado", "Símbolo escrito", "Movimento"
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

        javax.swing.GroupLayout bodyFdLayout = new javax.swing.GroupLayout(bodyFd);
        bodyFd.setLayout(bodyFdLayout);
        bodyFdLayout.setHorizontalGroup(
            bodyFdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyFdLayout.createSequentialGroup()
                .addContainerGap(511, Short.MAX_VALUE)
                .addComponent(erroPalavra)
                .addContainerGap())
            .addGroup(bodyFdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bodyFdLayout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addGroup(bodyFdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bodyFdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyFdLayout.createSequentialGroup()
                                .addComponent(carregaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(executaPasso))
                            .addGroup(bodyFdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyFdLayout.createSequentialGroup()
                                    .addComponent(palavraReconhecida, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(bodyFdLayout.createSequentialGroup()
                                    .addGap(97, 97, 97)
                                    .addComponent(Pilha_ConfigTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(bodyFdLayout.createSequentialGroup()
                                    .addComponent(Pilha_subTitulo)
                                    .addGap(18, 18, 18)
                                    .addComponent(inputPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1)))
                        .addGroup(bodyFdLayout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(palavraNReconhecida)))
                    .addContainerGap(44, Short.MAX_VALUE)))
        );
        bodyFdLayout.setVerticalGroup(
            bodyFdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyFdLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(erroPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(482, Short.MAX_VALUE))
            .addGroup(bodyFdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bodyFdLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(Pilha_ConfigTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29)
                    .addGroup(bodyFdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Pilha_subTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inputPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(bodyFdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(carregaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(executaPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addGroup(bodyFdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(palavraReconhecida))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(palavraNReconhecida)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bodyFd, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 649, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bodyFd, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
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
                row[4],
                row[2],
                row[3],
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
                    row[4],
                    row[2],
                    row[3],
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
