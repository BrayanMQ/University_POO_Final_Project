/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import controlador.FileManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Estudiante;
import static modelo.IConstants.RUTA_LISTA_ESTUDIANTES;
import static modelo.IConstants.RUTA_LISTA_LUGARES;
import modelo.Lugar;

/**
 *
 * @author isaac
 */
public class RegistrarHoras extends javax.swing.JDialog {

    /**
     * Creates new form RegistrarHora
     */
    public RegistrarHoras(java.awt.Frame parent, boolean modal) {
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
        btn_aceptar = new rojeru_san.RSButtonRiple();
        btn_cancelar = new rojeru_san.RSButtonRiple();
        txt_cedula = new rojeru_san.RSMTextFull();
        txt_cantidadHoras = new rojeru_san.RSMTextFull();
        lbl_registrarHoras = new javax.swing.JLabel();
        lbl_error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);

        btn_aceptar.setBackground(new java.awt.Color(0, 153, 0));
        btn_aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/round_done_white_18dp.png"))); // NOI18N
        btn_aceptar.setBorderPainted(false);
        btn_aceptar.setColorHover(new java.awt.Color(0, 102, 0));
        btn_aceptar.setFocusPainted(false);
        btn_aceptar.setFocusable(false);
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

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

        txt_cedula.setForeground(new java.awt.Color(0, 153, 51));
        txt_cedula.setBordeColorFocus(new java.awt.Color(0, 153, 51));
        txt_cedula.setBotonColor(new java.awt.Color(0, 153, 51));
        txt_cedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_cedula.setPlaceholder("Cédula Estudiante");

        txt_cantidadHoras.setForeground(new java.awt.Color(0, 153, 51));
        txt_cantidadHoras.setBordeColorFocus(new java.awt.Color(0, 153, 51));
        txt_cantidadHoras.setBotonColor(new java.awt.Color(0, 153, 51));
        txt_cantidadHoras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_cantidadHoras.setPlaceholder("Horas");

        lbl_registrarHoras.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_registrarHoras.setForeground(new java.awt.Color(0, 153, 51));
        lbl_registrarHoras.setText("Registrar Horas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_cantidadHoras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_registrarHoras)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txt_cedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_error, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_registrarHoras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_cantidadHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbl_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        boolean error = false;
        String mensajeError = "";
        lbl_error.setText("");
        ArrayList<String> listaDatos = new ArrayList<>();
        listaDatos.add(txt_cantidadHoras.getText());
        listaDatos.add(txt_cedula.getText());
        if (!Controlador.getSingletonInstance().getValidacion().validarDatoVacio(listaDatos)) {
            mensajeError += "No se debe dejar espacios en blanco.\n";
            lbl_error.setText(mensajeError);
        }else{
            if (!Controlador.getSingletonInstance().getValidacion().validarCedula(txt_cedula.getText())) {
                mensajeError += "La cédula debe contener 10 dígitos.\n";
                lbl_error.setText(mensajeError);
                error = true;
            }
            if (!Controlador.getSingletonInstance().getValidacion().validarDigitosEnteros(txt_cantidadHoras.getText())) {
                mensajeError += "La cantidad de horas no debe tener decimales.\n";
                lbl_error.setText(mensajeError);
                error = true;
            }
            if (!error) {
                String mensaje = Controlador.getSingletonInstance().getGestorEstudiantes().registrarHorasEstudiante(txt_cedula.getText(), txt_cantidadHoras.getText());
                
                if (mensaje != "El estudiante no tiene un lugar registrado.") { 
                
                Estudiante estudiante = Controlador.getSingletonInstance().getGestorEstudiantes().buscarEstudiante(txt_cedula.getText());
                
                if (estudiante.getCantidadFaltantes() <= 0) {
                    
                    Lugar lugar = Controlador.getSingletonInstance().getGestorLugares().buscarLugar(String.valueOf(estudiante.getLugarServicioSocial()));
                    
                    for (int i = 0; i < lugar.getListaEstudiantes().size(); i++) {
                        if ((int)lugar.getListaEstudiantes().get(i) == Integer.parseInt(txt_cedula.getText())) {
                            lugar.getListaEstudiantes().remove(i);
                            JOptionPane.showMessageDialog(this,  "Se ha desmatriculado exitosamente", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
                
                FileManager fileManager = new FileManager();
                try {
                    fileManager.sobrescribirArchivo(RUTA_LISTA_ESTUDIANTES, Controlador.getSingletonInstance().getListaEstudiantesRegistrados());
                    fileManager.sobreescribirArchivo(RUTA_LISTA_LUGARES, Controlador.getSingletonInstance().getListaLugaresRegistrados());

                   // fileManager.leerArchivo(RUTA_LISTA_ESTUDIANTES, true);
                    //fileManager.leerArchivo(RUTA_LISTA_LUGARES, false);
                } catch (IOException ex) {
                    Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                }
                JOptionPane.showMessageDialog(this, mensaje, "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
                
                
            }
        }
    }//GEN-LAST:event_btn_aceptarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarHoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarHoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarHoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarHoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistrarHoras dialog = new RegistrarHoras(new javax.swing.JFrame(), true);
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
    private rojeru_san.RSButtonRiple btn_aceptar;
    private rojeru_san.RSButtonRiple btn_cancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_error;
    private javax.swing.JLabel lbl_registrarHoras;
    private rojeru_san.RSMTextFull txt_cantidadHoras;
    private rojeru_san.RSMTextFull txt_cedula;
    // End of variables declaration//GEN-END:variables
}
