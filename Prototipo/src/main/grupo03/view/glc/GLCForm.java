package main.grupo03.view.glc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.filechooser.FileFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import main.grupo03.controller.GLCController;
import main.grupo03.util.LimiteCaracteres;

/**
 *
 * @author IGSF
 */
public class GLCForm extends javax.swing.JPanel {
    
    javax.swing.JPanel JanelaExecucao;
    
    GLCController glcNovo = new GLCController();

    /**
     * Creates new form ER
     */
    public GLCForm(javax.swing.JPanel janela) {
        this.JanelaExecucao = janela;
        initComponents();
        ER_Campo2.setDocument(new LimiteCaracteres(1));
        ER_Campo2.setText("A");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        GLC_Titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ER_Campo1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ER_Campo2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ER_Campo3 = new javax.swing.JTextField();
        ER_Enviar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ER_Campo4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        ER_Enviar3 = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jLabel3.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Input / Regex:");
        jLabel3.setToolTipText("");
        jLabel3.setName("Input"); // NOI18N

        jLabel8.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Regras:");
        jLabel8.setToolTipText("");
        jLabel8.setName("Input"); // NOI18N

        setBackground(new java.awt.Color(54, 54, 54));
        setPreferredSize(new java.awt.Dimension(579, 649));

        GLC_Titulo.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        GLC_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        GLC_Titulo.setText("Gramáticas Livres de Contexto");
        GLC_Titulo.setToolTipText("");
        GLC_Titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        GLC_Titulo.setName("Titulo"); // NOI18N

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Variáveis:");
        jLabel2.setToolTipText("");
        jLabel2.setName("Input"); // NOI18N

        ER_Campo1.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        ER_Campo1.setText("Ab,B,cX,D,t,...");
        ER_Campo1.setName("Campo_de_Texto"); // NOI18N
        ER_Campo1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ER_Campo1FocusGained(evt);
            }
        });
        ER_Campo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ER_Campo1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Símbolo Inicial:");
        jLabel5.setToolTipText("");
        jLabel5.setName("Input"); // NOI18N

        ER_Campo2.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        ER_Campo2.setText("A");
        ER_Campo2.setName("Campo_de_Texto"); // NOI18N
        ER_Campo2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ER_Campo2FocusGained(evt);
            }
        });
        ER_Campo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ER_Campo2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Símbolo Terminal:");
        jLabel6.setToolTipText("");
        jLabel6.setName("Input"); // NOI18N

        ER_Campo3.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        ER_Campo3.setText("Z");
        ER_Campo3.setName("Campo_de_Texto"); // NOI18N
        ER_Campo3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ER_Campo3FocusGained(evt);
            }
        });
        ER_Campo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ER_Campo3ActionPerformed(evt);
            }
        });

        ER_Enviar1.setBackground(new java.awt.Color(105, 105, 105));
        ER_Enviar1.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        ER_Enviar1.setText("Exportar");
        ER_Enviar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ER_Enviar1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea1FocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jLabel7.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Regras:");
        jLabel7.setToolTipText("");
        jLabel7.setName("Input"); // NOI18N

        jLabel9.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Palavra:");
        jLabel9.setToolTipText("");
        jLabel9.setName("Input"); // NOI18N

        ER_Campo4.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        ER_Campo4.setText("AbbCaaOpP");
        ER_Campo4.setName("Campo_de_Texto"); // NOI18N
        ER_Campo4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ER_Campo4FocusGained(evt);
            }
        });
        ER_Campo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ER_Campo4ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Saída do Programa:");
        jLabel10.setToolTipText("");
        jLabel10.setName("Input"); // NOI18N

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        ER_Enviar3.setBackground(new java.awt.Color(105, 105, 105));
        ER_Enviar3.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        ER_Enviar3.setText("Verificar Palavra");
        ER_Enviar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ER_Enviar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ER_Campo4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ER_Campo1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ER_Campo2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ER_Campo3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel10)))
                                .addGap(195, 195, 195))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ER_Enviar1)
                                    .addComponent(ER_Enviar3))
                                .addGap(254, 254, 254))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(GLC_Titulo)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(GLC_Titulo)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ER_Campo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ER_Campo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ER_Campo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ER_Campo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ER_Enviar3))
                .addGap(18, 18, 18)
                .addComponent(ER_Enviar1)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void ER_Campo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ER_Campo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ER_Campo1ActionPerformed

    private void ER_Campo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ER_Campo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ER_Campo2ActionPerformed

    private void ER_Campo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ER_Campo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ER_Campo3ActionPerformed

    private void ER_Enviar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ER_Enviar1ActionPerformed
        glcNovo.teste();
        if (false) { // testeExport.isStatusOK()) {
            JFileChooser fileChooser = new JFileChooser();
            // fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
 
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Json File", "json"));

            fileChooser.setAcceptAllFileFilterUsed(false);

            int result = fileChooser.showOpenDialog(this);

            if (result == JFileChooser.APPROVE_OPTION) {
                // File selectedFile = fileChooser.getSelectedFile();
                // String pathFile = selectedFile.getAbsolutePath().endsWith(".json");
                String pathFile = fileChooser.getCurrentDirectory().toString() + "\\" + fileChooser.getSelectedFile().getName();
                // FileWriter fileJson = new FileWriter( pathFile );
                if (!fileChooser.getSelectedFile().getName().endsWith(".json")) {
                    pathFile += ".json";
                }
                System.out.println(pathFile);
                try {
                    FileWriter fileJson = new FileWriter( pathFile );
                    BufferedWriter bw = new BufferedWriter( fileJson );
                    bw.write("ola mundo");
                    bw.newLine();
                    bw.close();
                    fileJson.close();
                } catch (IOException ex) {
                    Logger.getLogger(GLCForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (result == JFileChooser.CANCEL_OPTION) {
                System.out.println("You pressed cancel");
            }
            
        } else {
            JOptionPane.showMessageDialog(this,
                    "Houve um problema ao exportar o arquivo!", //mensagem
                    "Erro de Exportação", // titulo da janela 
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ER_Enviar1ActionPerformed

    private void ER_Campo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ER_Campo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ER_Campo4ActionPerformed

    private void ER_Enviar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ER_Enviar3ActionPerformed
        if (validaCampos()) {
            
        }
    }//GEN-LAST:event_ER_Enviar3ActionPerformed

    private void ER_Campo1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ER_Campo1FocusGained
        // TODO add your handling code here:
        ER_Campo1.selectAll();
    }//GEN-LAST:event_ER_Campo1FocusGained

    private void ER_Campo2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ER_Campo2FocusGained
        // TODO add your handling code here:
        ER_Campo2.selectAll();
    }//GEN-LAST:event_ER_Campo2FocusGained

    private void ER_Campo3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ER_Campo3FocusGained
        // TODO add your handling code here:
        ER_Campo3.selectAll();
    }//GEN-LAST:event_ER_Campo3FocusGained

    private void jTextArea1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1FocusGained

    private void ER_Campo4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ER_Campo4FocusGained
        // TODO add your handling code here:
        ER_Campo4.selectAll();
    }//GEN-LAST:event_ER_Campo4FocusGained

    public boolean validaCampos() {
        HashMap<String, String> valida = new HashMap<String, String>();
        if (ER_Campo1.getText().toString().equals("")) {
            valida.put("erro", "Variáveis");
        }
        if (ER_Campo2.getText().toString().equals("")) {
            valida.put("erro", "Símbolo Inicial");
        }
        if (ER_Campo3.getText().toString().equals("")) {
            valida.put("erro", "Símbolo Terminal");
        }
        if (ER_Campo4.getText().toString().equals("")) {
            valida.put("erro", "Palavra");
        }
        if (jTextArea1.getText().toString().equals("")) {
            valida.put("erro", "Regras");
        }
        for (String i : valida.keySet()) {
            if (i.equals("erro")) {
                JOptionPane.showMessageDialog(this,
                    "Campo "+ valida.get(i) +" Inválido!", //mensagem
                    "Erro ao Verificar", // titulo da janela 
                    JOptionPane.WARNING_MESSAGE);
                return false;
            }
            System.out.println(i);
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ER_Campo1;
    private javax.swing.JTextField ER_Campo2;
    private javax.swing.JTextField ER_Campo3;
    private javax.swing.JTextField ER_Campo4;
    private javax.swing.JButton ER_Enviar1;
    private javax.swing.JButton ER_Enviar3;
    private javax.swing.JLabel GLC_Titulo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
