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
import modelo.EstudianteUPublica;
import static modelo.IConstants.RUTA_LISTA_ESTUDIANTES;

public class ModificarEstudiante extends javax.swing.JDialog {

    private static Estudiante estudiante;
    
    public ModificarEstudiante(java.awt.Frame parent, boolean modal, Estudiante pEstudiante) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.estudiante = pEstudiante;
        txt_cedula.setText(String.valueOf(pEstudiante.getCedula()));
        txt_nombre.setText(pEstudiante.getNombre());
        txt_correoEstudiante.setText(pEstudiante.getCorreo());
        txt_carrera.setText(pEstudiante.getCarrera());
        txt_telefono.setText(String.valueOf(pEstudiante.getTelefono()));
        txt_direccion.setText(pEstudiante.getDireccion());
        
        if (pEstudiante instanceof EstudianteUPublica) {
            checkB_universidadPublica.setEnabled(true);
            txt_universidad_P_P.setText(((EstudianteUPublica)pEstudiante).getCorreoInstitucional());
        } else {
            checkB_universidadPublica.setEnabled(false);
        }
        
        checkB_universidadPublica.setEnabled(false);
        txt_cedula.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbl_modificarEstudiante = new javax.swing.JLabel();
        btn_Modificar = new rojeru_san.RSButtonRiple();
        txt_nombre = new rojeru_san.RSMTextFull();
        txt_cedula = new rojeru_san.RSMTextFull();
        txt_correoEstudiante = new rojeru_san.RSMTextFull();
        txt_telefono = new rojeru_san.RSMTextFull();
        txt_carrera = new rojeru_san.RSMTextFull();
        checkB_universidadPublica = new rojerusan.RSSwitch();
        lbl_universidadPublica = new javax.swing.JLabel();
        txt_universidad_P_P = new rojeru_san.RSMTextFull();
        btn_Atras = new rojeru_san.RSButtonRiple();
        txt_direccion = new rojeru_san.RSMTextFull();
        lbl_error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lbl_modificarEstudiante.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_modificarEstudiante.setForeground(new java.awt.Color(0, 153, 51));
        lbl_modificarEstudiante.setText("Modificar Estudiante");

        btn_Modificar.setBackground(new java.awt.Color(0, 153, 51));
        btn_Modificar.setText("Modificar");
        btn_Modificar.setBorderPainted(false);
        btn_Modificar.setColorHover(new java.awt.Color(0, 102, 51));
        btn_Modificar.setFocusPainted(false);
        btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarActionPerformed(evt);
            }
        });

        txt_nombre.setForeground(new java.awt.Color(0, 153, 51));
        txt_nombre.setBordeColorFocus(new java.awt.Color(0, 153, 51));
        txt_nombre.setBotonColor(new java.awt.Color(0, 153, 51));
        txt_nombre.setPlaceholder("Nombre");

        txt_cedula.setForeground(new java.awt.Color(0, 153, 51));
        txt_cedula.setBordeColorFocus(new java.awt.Color(0, 153, 51));
        txt_cedula.setBotonColor(new java.awt.Color(0, 153, 51));
        txt_cedula.setPlaceholder("Cédula");

        txt_correoEstudiante.setForeground(new java.awt.Color(0, 153, 51));
        txt_correoEstudiante.setBordeColorFocus(new java.awt.Color(0, 153, 51));
        txt_correoEstudiante.setBotonColor(new java.awt.Color(0, 153, 51));
        txt_correoEstudiante.setPlaceholder("Correo");

        txt_telefono.setForeground(new java.awt.Color(0, 153, 51));
        txt_telefono.setBordeColorFocus(new java.awt.Color(0, 153, 51));
        txt_telefono.setBotonColor(new java.awt.Color(0, 153, 51));
        txt_telefono.setPlaceholder("Teléfono");

        txt_carrera.setForeground(new java.awt.Color(0, 153, 51));
        txt_carrera.setBordeColorFocus(new java.awt.Color(0, 153, 51));
        txt_carrera.setBotonColor(new java.awt.Color(0, 153, 51));
        txt_carrera.setPlaceholder("Carrera");

        checkB_universidadPublica.setActivado(false);
        checkB_universidadPublica.setColorFondoActivado(new java.awt.Color(0, 153, 51));
        checkB_universidadPublica.setFocusable(false);

        lbl_universidadPublica.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_universidadPublica.setForeground(new java.awt.Color(0, 153, 51));
        lbl_universidadPublica.setText("Universidad Pública");

        txt_universidad_P_P.setForeground(new java.awt.Color(0, 153, 51));
        txt_universidad_P_P.setBordeColorFocus(new java.awt.Color(0, 153, 51));
        txt_universidad_P_P.setBotonColor(new java.awt.Color(0, 153, 51));
        txt_universidad_P_P.setEnabled(false);
        txt_universidad_P_P.setPlaceholder("Correo Institucional");

        btn_Atras.setBackground(new java.awt.Color(0, 153, 51));
        btn_Atras.setBorderPainted(false);
        btn_Atras.setColorHover(new java.awt.Color(0, 102, 51));
        btn_Atras.setFocusPainted(false);
        btn_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtrasActionPerformed(evt);
            }
        });

        txt_direccion.setForeground(new java.awt.Color(0, 153, 51));
        txt_direccion.setBordeColorFocus(new java.awt.Color(0, 153, 51));
        txt_direccion.setBotonColor(new java.awt.Color(0, 153, 51));
        txt_direccion.setPlaceholder("Dirección");

        lbl_error.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_error.setForeground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_correoEstudiante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_carrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_universidad_P_P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_cedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(lbl_modificarEstudiante))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbl_universidadPublica)
                                .addGap(18, 18, 18)
                                .addComponent(checkB_universidadPublica, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 48, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_modificarEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_correoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkB_universidadPublica, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_universidadPublica, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_universidad_P_P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_error, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
        boolean error = false;
        String mensajeError = "";
        lbl_error.setText("");
        ArrayList<String> listaDatos = new ArrayList<>();
        listaDatos.add(txt_carrera.getText());
        listaDatos.add(txt_cedula.getText());
        listaDatos.add(txt_correoEstudiante.getText());
        listaDatos.add(txt_universidad_P_P.getText());
        listaDatos.add(txt_nombre.getText());
        listaDatos.add(txt_telefono.getText());
        if (!Controlador.getSingletonInstance().getValidacion().validarDatoVacio(listaDatos)) {
            mensajeError += "No se debe dejar espacios en blanco.\n";
            lbl_error.setText(mensajeError);
        }else{
            if (!Controlador.getSingletonInstance().getValidacion().validarCedula(txt_cedula.getText())) {
                mensajeError += "La cédula debe contener 9 dígitos.\n";
                lbl_error.setText(mensajeError);
                error = true;
            }
            if (!Controlador.getSingletonInstance().getValidacion().validarCorreo(txt_correoEstudiante.getText())) {
                mensajeError += "El correo del estudiante no es válido.\n";
                lbl_error.setText(mensajeError);
                error = true;
            }
            if (!Controlador.getSingletonInstance().getValidacion().validarTelefono(txt_telefono.getText())) {
                mensajeError += "El teléfono debe contener 8 dígitos.\n";
                lbl_error.setText(mensajeError);
                error = true;
            }

            if (checkB_universidadPublica.isActivado()) {
                if (!Controlador.getSingletonInstance().getValidacion().validarCorreo(txt_universidad_P_P.getText())) {
                    mensajeError += "El correo institucional no es válido.\n";
                    lbl_error.setText(mensajeError);
                    error = true;
                }
            }else{
                if (!Controlador.getSingletonInstance().getValidacion().validarDigitosDobles(txt_universidad_P_P.getText())) {
                    mensajeError += "El monto que ingresó no es válido.\n";
                    lbl_error.setText(mensajeError);
                    error = true;
                }
            }
            if (!error) {
                if (Controlador.getSingletonInstance().getGestorEstudiantes().modificarEstudiante(txt_carrera.getText(),
                    txt_cedula.getText(), txt_correoEstudiante.getText(), txt_nombre.getText(), txt_telefono.getText(),
                    txt_universidad_P_P.getText(), checkB_universidadPublica.isActivado(), txt_direccion.getText())) {
                    FileManager fileManager = new FileManager();
                    try {
                        fileManager.sobrescribirArchivo(RUTA_LISTA_ESTUDIANTES, Controlador.getSingletonInstance().getListaEstudiantesRegistrados());
                        //fileManager.leerArchivo(RUTA_LISTA_ESTUDIANTES, true);
                    } catch (IOException ex) {
                        Logger.getLogger(ModificarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(this, "Se modificó correctamente al estudiante.", "Modificación exitosa", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "No se modificó correctamente al estudiante.", "Modificación fallida", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        

        }
    }//GEN-LAST:event_btn_ModificarActionPerformed

    private void btn_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtrasActionPerformed
    this.dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_btn_AtrasActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModificarEstudiante dialog = new ModificarEstudiante(new javax.swing.JFrame(), true, estudiante);
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
    private rojeru_san.RSButtonRiple btn_Atras;
    private rojeru_san.RSButtonRiple btn_Modificar;
    private rojerusan.RSSwitch checkB_universidadPublica;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_error;
    private javax.swing.JLabel lbl_modificarEstudiante;
    private javax.swing.JLabel lbl_universidadPublica;
    private rojeru_san.RSMTextFull txt_carrera;
    private rojeru_san.RSMTextFull txt_cedula;
    private rojeru_san.RSMTextFull txt_correoEstudiante;
    private rojeru_san.RSMTextFull txt_direccion;
    private rojeru_san.RSMTextFull txt_nombre;
    private rojeru_san.RSMTextFull txt_telefono;
    private rojeru_san.RSMTextFull txt_universidad_P_P;
    // End of variables declaration//GEN-END:variables
}
