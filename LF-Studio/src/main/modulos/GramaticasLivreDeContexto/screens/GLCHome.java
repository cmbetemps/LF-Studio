package main.modulos.GramaticasLivreDeContexto.screens;

import com.google.gson.Gson;
import java.awt.Font;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import main.LFStudio;
import main.modulos.GramaticasLivreDeContexto.controllers.GLCController;
import main.modulos.GramaticasLivreDeContexto.domain.models.GLC;
import main.modulos.GramaticasLivreDeContexto.domain.utils.JsonFormatter;

/**
 *
 * @author Grupo-03
 */
public class GLCHome extends javax.swing.JPanel {

    javax.swing.JPanel JanelaExecucao;
    
    GLCController glcNovo = new GLCController();
    
    /**
     * Creates new form GLCHome
     * @param janela
     */
    public GLCHome(javax.swing.JPanel janela) {
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

        fndTitle = new javax.swing.JPanel();
        labelTituloGLC = new javax.swing.JLabel();
        labelNovaGLC = new javax.swing.JLabel();
        labelImportarGLC = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(28, 28, 28));
        setMaximumSize(new java.awt.Dimension(1024, 720));
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setPreferredSize(new java.awt.Dimension(1024, 720));

        fndTitle.setBackground(new java.awt.Color(28, 28, 28));
        fndTitle.setMaximumSize(new java.awt.Dimension(1024, 720));
        fndTitle.setPreferredSize(new java.awt.Dimension(1024, 720));

        labelTituloGLC.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 48)); // NOI18N
        labelTituloGLC.setForeground(new java.awt.Color(255, 255, 255));
        labelTituloGLC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloGLC.setText("<html><p style=\"padding-bottom: 16px; font-size:30px;\">Gramática Livre de Contexto</p></html>");
        labelTituloGLC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelTituloGLCMouseEntered(evt);
            }
        });

        labelNovaGLC.setBackground(new java.awt.Color(0, 0, 0));
        labelNovaGLC.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        labelNovaGLC.setForeground(new java.awt.Color(255, 255, 255));
        labelNovaGLC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNovaGLC.setText("Nova GLC");
        labelNovaGLC.setAlignmentX(5.0F);
        labelNovaGLC.setAlignmentY(5.0F);
        labelNovaGLC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelNovaGLC.setPreferredSize(new java.awt.Dimension(150, 22));
        labelNovaGLC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelNovaGLCMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelNovaGLCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelNovaGLCMouseExited(evt);
            }
        });

        labelImportarGLC.setBackground(new java.awt.Color(0, 0, 0));
        labelImportarGLC.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 28)); // NOI18N
        labelImportarGLC.setForeground(new java.awt.Color(255, 255, 255));
        labelImportarGLC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImportarGLC.setText("Importar GLC");
        labelImportarGLC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelImportarGLC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelImportarGLCMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelImportarGLCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelImportarGLCMouseExited(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(28, 28, 28));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout fndTitleLayout = new javax.swing.GroupLayout(fndTitle);
        fndTitle.setLayout(fndTitleLayout);
        fndTitleLayout.setHorizontalGroup(
            fndTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fndTitleLayout.createSequentialGroup()
                .addGroup(fndTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelImportarGLC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNovaGLC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTituloGLC, javax.swing.GroupLayout.DEFAULT_SIZE, 1014, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(fndTitleLayout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fndTitleLayout.setVerticalGroup(
            fndTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fndTitleLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(labelTituloGLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(labelNovaGLC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelImportarGLC)
                .addContainerGap(318, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void labelImportarGLCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelImportarGLCMouseExited
        Font f = labelImportarGLC.getFont();
        labelImportarGLC.setFont(f.deriveFont(f.getStyle(), f.getSize2D()-4));
    }//GEN-LAST:event_labelImportarGLCMouseExited

    private void labelImportarGLCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelImportarGLCMouseEntered
        Font f = labelImportarGLC.getFont();
        labelImportarGLC.setFont(f.deriveFont(f.getStyle(), f.getSize2D()+4));
    }//GEN-LAST:event_labelImportarGLCMouseEntered

    private void labelImportarGLCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelImportarGLCMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        // fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Json File", "json"));

        fileChooser.setAcceptAllFileFilterUsed(false);

        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            String pathFile = fileChooser.getCurrentDirectory().toString() + "\\" + fileChooser.getSelectedFile().getName();
            File arquivoJson = new File(pathFile);

            if (!fileChooser.getSelectedFile().getName().endsWith(".json") || !arquivoJson.exists()) {
                JOptionPane.showMessageDialog(this,
                    "Arquivo Inválido para importar!", //mensagem
                    "Importação", // titulo da janela
                    JOptionPane.WARNING_MESSAGE);
            } else {
                // Gson json = new Gson();
                try {
                    // Reader fileJson = new FileReader( arquivoJson );
                    JsonFormatter jsonGLC = new JsonFormatter();
                    
                    try {
                        // GLC glc = json.fromJson(fileJson, GLC.class);
                        GLC glc = jsonGLC.readJson(pathFile, false);
                        
                        if (!glc.getTipo().equals(GLC.Tooltip.GLC)) {
                            JOptionPane.showMessageDialog(this,
                                "Tipo de Linguagem Inválido!", //mensagem
                                "Importação", // titulo da janela
                                JOptionPane.WARNING_MESSAGE);
                        } else {
                            // System.out.println(glc.toString());
                            GLCForm.setFromImport(true);
                            GLCForm.setNovoGLCP(glc);
                            LFStudio.cl.show(JanelaExecucao, "glcForm");
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this,
                            "Tipo de Linguagem Inválido!", //mensagem
                            "Importação", // titulo da janela
                            JOptionPane.WARNING_MESSAGE);
                    }
                    // fileJson.close();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this,
                        "Erro ao abrir o arquivo!", //mensagem
                        "Importação", // titulo da janela
                        JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        // if (result == JFileChooser.CANCEL_OPTION) {
            // System.out.println("You pressed cancel");
            // }
    }//GEN-LAST:event_labelImportarGLCMouseClicked

    private void labelNovaGLCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNovaGLCMouseExited
        Font f = labelNovaGLC.getFont();
        labelNovaGLC.setFont(f.deriveFont(f.getStyle(), f.getSize2D()-4));
    }//GEN-LAST:event_labelNovaGLCMouseExited

    private void labelNovaGLCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNovaGLCMouseEntered
        Font f = labelNovaGLC.getFont();
        labelNovaGLC.setFont(f.deriveFont(f.getStyle(), f.getSize2D()+4));
    }//GEN-LAST:event_labelNovaGLCMouseEntered

    private void labelNovaGLCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNovaGLCMouseClicked
        LFStudio.cl.show(JanelaExecucao, "glcForm");
    }//GEN-LAST:event_labelNovaGLCMouseClicked

    private void labelTituloGLCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelTituloGLCMouseEntered

    }//GEN-LAST:event_labelTituloGLCMouseEntered
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fndTitle;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelImportarGLC;
    private javax.swing.JLabel labelNovaGLC;
    private javax.swing.JLabel labelTituloGLC;
    // End of variables declaration//GEN-END:variables
}
