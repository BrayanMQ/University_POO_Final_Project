/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import controlador.Controlador;
import controlador.FileManager;
import java.awt.Frame;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Email;
import modelo.Estudiante;
import static modelo.IConstants.RUTA_LISTA_ESTUDIANTES;
import static modelo.IConstants.RUTA_LISTA_LUGARES;
import modelo.Lugar;

public class MatricularEstudiante extends javax.swing.JDialog {

    /**
     * Creates new form MatricularEstudiante
     */
    public MatricularEstudiante(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_guardar = new rojeru_san.RSButtonRiple();
        txt_cedula = new rojeru_san.RSMTextFull();
        txt_idLugar = new rojeru_san.RSMTextFull();
        jLabel1 = new javax.swing.JLabel();
        btn_cancelar = new rojeru_san.RSButtonRiple();
        btn_consultarLugares = new rojeru_san.RSButtonRiple();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_guardar.setBackground(new java.awt.Color(0, 153, 0));
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/round_done_white_18dp.png"))); // NOI18N
        btn_guardar.setBorderPainted(false);
        btn_guardar.setColorHover(new java.awt.Color(0, 102, 0));
        btn_guardar.setFocusPainted(false);
        btn_guardar.setFocusable(false);
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        txt_cedula.setForeground(new java.awt.Color(0, 153, 51));
        txt_cedula.setBordeColorFocus(new java.awt.Color(0, 153, 51));
        txt_cedula.setBotonColor(new java.awt.Color(0, 153, 51));
        txt_cedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_cedula.setPlaceholder("Cédula Estudiante");

        txt_idLugar.setForeground(new java.awt.Color(0, 102, 51));
        txt_idLugar.setBordeColorFocus(new java.awt.Color(0, 102, 51));
        txt_idLugar.setBotonColor(new java.awt.Color(0, 102, 51));
        txt_idLugar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_idLugar.setPlaceholder("Identificador Lugar");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("Matricular Estudiante");

        btn_cancelar.setBackground(new java.awt.Color(204, 0, 0));
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/round_close_white_18dp.png"))); // NOI18N
        btn_cancelar.setBorderPainted(false);
        btn_cancelar.setColorHover(new java.awt.Color(153, 0, 0));
        btn_cancelar.setFocusPainted(false);
        btn_cancelar.setFocusable(false);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_consultarLugares.setBackground(new java.awt.Color(0, 153, 51));
        btn_consultarLugares.setText("Consultar Lugares");
        btn_consultarLugares.setBorderPainted(false);
        btn_consultarLugares.setColorHover(new java.awt.Color(0, 102, 51));
        btn_consultarLugares.setFocusPainted(false);
        btn_consultarLugares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarLugaresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_idLugar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txt_cedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_consultarLugares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_idLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_consultarLugares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        String cedula = txt_cedula.getText();
        String idLugar = txt_idLugar.getText();
        
        Estudiante estudiante = Controlador.getSingletonInstance().getGestorEstudiantes().buscarEstudiante(cedula);
        Lugar lugar = Controlador.getSingletonInstance().getGestorLugares().buscarLugar(idLugar);
        
        if (estudiante != null) {
            
            if (lugar != null) {
                
                if (estudiante.getLugarServicioSocial() == 0) {
                    
                    if (lugar.getCuposRestantes() != 0) {
                        
                        estudiante.setLugarServicioSocial(lugar.getId());
                        lugar.getListaEstudiantes().add(estudiante.getCedula());
                        Email email = new Email();
                        if ( email.enviarMail(lugar.getCorreo(), estudiante.getNombre(), estudiante.getCedula())) {
                            
                            FileManager fileManager = new FileManager();
                            try {
                                fileManager.sobrescribirArchivo(RUTA_LISTA_ESTUDIANTES, Controlador.getSingletonInstance().getListaEstudiantesRegistrados());
                                fileManager.sobreescribirArchivo(RUTA_LISTA_LUGARES, Controlador.getSingletonInstance().getListaLugaresRegistrados());

                                //fileManager.leerArchivo(RUTA_LISTA_ESTUDIANTES, true);
                               // fileManager.leerArchivo(RUTA_LISTA_LUGARES, false);
                            } catch (IOException ex) {
                                Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            JOptionPane.showMessageDialog(this, "Se ha matriculado con éxito el estudiante con cédula " + cedula + " en " + lugar.getNombre() + ".", "Matricular estudiante", JOptionPane.INFORMATION_MESSAGE);
                            this.dispose();
                        }
                         
                        
                    } else {
                        JOptionPane.showMessageDialog(this, "El lugar con identificador " + idLugar + " no cuenta con cupos disponibles.", "Matricular estudiante", JOptionPane.ERROR_MESSAGE);
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(this, "El estudiante con cédula " + cedula + " ya se encuentra matriculado.", "Matricular estudiante", JOptionPane.ERROR_MESSAGE);
                }
                
            } else {
                JOptionPane.showMessageDialog(this, "No se ha encontrado el lugar con identificador " + idLugar + ".", "Matricular estudiante", JOptionPane.ERROR_MESSAGE);
            }
            
        } else {
             JOptionPane.showMessageDialog(this, "No se ha encontrado el estudiante con cédula " + cedula + ".", "Matricular estudiante", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_consultarLugaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarLugaresActionPerformed
        new ConsultarLugares((Frame) getParent(), rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_btn_consultarLugaresActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
    this.dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MatricularEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatricularEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatricularEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatricularEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MatricularEstudiante dialog = new MatricularEstudiante(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btn_cancelar;
    private rojeru_san.RSButtonRiple btn_consultarLugares;
    private rojeru_san.RSButtonRiple btn_guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private rojeru_san.RSMTextFull txt_cedula;
    private rojeru_san.RSMTextFull txt_idLugar;
    // End of variables declaration//GEN-END:variables
}
