/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import javax.swing.JOptionPane;
import modelo.Estudiante;
import modelo.Lugar;

/**
 *
 * @author dark1
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_registrarLugar = new rojeru_san.RSButtonRiple();
        btn_modificarLugar = new rojeru_san.RSButtonRiple();
        btn_EliminarLugar = new rojeru_san.RSButtonRiple();
        jLabel2 = new javax.swing.JLabel();
        btn_registrarEstudiante = new rojeru_san.RSButtonRiple();
        btn_modificarEstudiante = new rojeru_san.RSButtonRiple();
        btn_eliminarEstudiante = new rojeru_san.RSButtonRiple();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_registrarHoras = new rojeru_san.RSButtonRiple();
        btn_realizarMatricula = new rojeru_san.RSButtonRiple();
        jLabel5 = new javax.swing.JLabel();
        consultarEstudiantes = new rojeru_san.RSButtonRiple();
        btn_consultarLugares = new rojeru_san.RSButtonRiple();
        jPanel7 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 51));
        jLabel3.setText("Menú Principal");

        jPanel4.setBackground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("Lugares");

        btn_registrarLugar.setBackground(new java.awt.Color(0, 153, 51));
        btn_registrarLugar.setText("Registrar");
        btn_registrarLugar.setColorHover(new java.awt.Color(0, 102, 51));
        btn_registrarLugar.setFocusPainted(false);
        btn_registrarLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarLugarActionPerformed(evt);
            }
        });

        btn_modificarLugar.setBackground(new java.awt.Color(0, 153, 51));
        btn_modificarLugar.setText("Modificar");
        btn_modificarLugar.setColorHover(new java.awt.Color(0, 102, 51));
        btn_modificarLugar.setFocusPainted(false);
        btn_modificarLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarLugarActionPerformed(evt);
            }
        });

        btn_EliminarLugar.setBackground(new java.awt.Color(0, 153, 51));
        btn_EliminarLugar.setText("Eliminar");
        btn_EliminarLugar.setColorHover(new java.awt.Color(0, 102, 51));
        btn_EliminarLugar.setFocusPainted(false);
        btn_EliminarLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarLugarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 51));
        jLabel2.setText("Estudiantes");

        btn_registrarEstudiante.setBackground(new java.awt.Color(0, 153, 51));
        btn_registrarEstudiante.setText("Registrar");
        btn_registrarEstudiante.setColorHover(new java.awt.Color(0, 102, 51));
        btn_registrarEstudiante.setFocusPainted(false);
        btn_registrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarEstudianteActionPerformed(evt);
            }
        });

        btn_modificarEstudiante.setBackground(new java.awt.Color(0, 153, 51));
        btn_modificarEstudiante.setText("Modificar");
        btn_modificarEstudiante.setColorHover(new java.awt.Color(0, 102, 51));
        btn_modificarEstudiante.setFocusPainted(false);
        btn_modificarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarEstudianteActionPerformed(evt);
            }
        });

        btn_eliminarEstudiante.setBackground(new java.awt.Color(0, 153, 51));
        btn_eliminarEstudiante.setText("Eliminar");
        btn_eliminarEstudiante.setColorHover(new java.awt.Color(0, 102, 51));
        btn_eliminarEstudiante.setFocusPainted(false);
        btn_eliminarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarEstudianteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_registrarLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btn_EliminarLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(61, 61, 61))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_registrarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_eliminarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_modificarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_modificarLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btn_registrarLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_modificarLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_EliminarLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btn_registrarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_modificarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_eliminarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 51));
        jLabel4.setText("Acciones");

        btn_registrarHoras.setBackground(new java.awt.Color(0, 153, 51));
        btn_registrarHoras.setText("Registrar Horas");
        btn_registrarHoras.setColorHover(new java.awt.Color(0, 102, 51));
        btn_registrarHoras.setFocusPainted(false);
        btn_registrarHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarHorasActionPerformed(evt);
            }
        });

        btn_realizarMatricula.setBackground(new java.awt.Color(0, 153, 51));
        btn_realizarMatricula.setText("Realizar Matricula");
        btn_realizarMatricula.setColorHover(new java.awt.Color(0, 102, 51));
        btn_realizarMatricula.setFocusPainted(false);
        btn_realizarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_realizarMatriculaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 51));
        jLabel5.setText("Consultas");

        consultarEstudiantes.setBackground(new java.awt.Color(0, 153, 51));
        consultarEstudiantes.setText(" Consultar Estudiantes");
        consultarEstudiantes.setColorHover(new java.awt.Color(0, 102, 51));
        consultarEstudiantes.setFocusPainted(false);

        btn_consultarLugares.setBackground(new java.awt.Color(0, 153, 51));
        btn_consultarLugares.setText("Consultar Lugares");
        btn_consultarLugares.setColorHover(new java.awt.Color(0, 102, 51));
        btn_consultarLugares.setFocusPainted(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_realizarMatricula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_registrarHoras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addComponent(consultarEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_consultarLugares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(btn_registrarHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_realizarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(consultarEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_consultarLugares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(0, 153, 51));
        jPanel7.setPreferredSize(new java.awt.Dimension(2, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarEstudianteActionPerformed
        RegistrarEstudiante registrarEstudiante = new RegistrarEstudiante(this, rootPaneCheckingEnabled);
        registrarEstudiante.setVisible(true);
    }//GEN-LAST:event_btn_registrarEstudianteActionPerformed

    private void btn_modificarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarEstudianteActionPerformed
        
        String id = JOptionPane.showInputDialog(this, "Indique la cédula del estudiante que desea modificar.", "Modificar estudiante", JOptionPane.QUESTION_MESSAGE);
        
        if (id != null ) {//Si no le da al botón cancelar
             Estudiante estudiante = Controlador.getSingletonInstance().getGestorEstudiantes().buscarEstudiante(id);
             
             if (estudiante != null) {
                
                 new ModificarEstudiante(this, rootPaneCheckingEnabled, estudiante).setVisible(true);
                 
             } else {
             
                 JOptionPane.showMessageDialog(this, "No se ha encontrado el estudiante con cédula " + id + ".", "Modificar estudiante", JOptionPane.INFORMATION_MESSAGE);
                 
             }
        }     
    }//GEN-LAST:event_btn_modificarEstudianteActionPerformed

    private void btn_registrarLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarLugarActionPerformed
        new RegistrarLugar(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_btn_registrarLugarActionPerformed

    private void btn_modificarLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarLugarActionPerformed
        String id = JOptionPane.showInputDialog(this, "Indique el identificador del lugar que desea modificar.", "Modificar lugar", JOptionPane.QUESTION_MESSAGE);
        
        if (id != null ) {//Si no le da al botón cancelar
             Lugar lugar = Controlador.getSingletonInstance().getGestorLugares().buscarLugar(id);
             
             if (lugar != null) {
                
                 new ModificarLugar(this, rootPaneCheckingEnabled, lugar).setVisible(true);
                 
             } else {
             
                 JOptionPane.showMessageDialog(this, "No se ha encontrado el lugar con identificador " + id + ".", "Modificar lugar", JOptionPane.INFORMATION_MESSAGE);
                 
             }
        } 
    }//GEN-LAST:event_btn_modificarLugarActionPerformed

    private void btn_eliminarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarEstudianteActionPerformed
        String id = JOptionPane.showInputDialog(this, "Indique la cédula del estudiante que desea eliminar.", "Eliminar estudiante", JOptionPane.QUESTION_MESSAGE);
        
        if (id != null ) {//Si no le da al botón cancelar
             Estudiante estudiante = Controlador.getSingletonInstance().getGestorEstudiantes().buscarEstudiante(id);
             
             if (estudiante != null) {
                 int Idlugar = estudiante.getLugarServicioSocial();
                 
                 if (Idlugar != 0) {
                     Lugar lugar = Controlador.getSingletonInstance().getGestorLugares().buscarLugar(String.valueOf(id));
                     
                     for (int i = 0; i < lugar.getListaEstudiantes().size(); i++) {
                         if (lugar.getListaEstudiantes().get(i) == Integer.parseInt(id)) {
                             lugar.getListaEstudiantes().remove(i);
                         }
                     }  
                 }            
                 Controlador.getSingletonInstance().getGestorEstudiantes().eliminarEstudiante(id);
                 JOptionPane.showMessageDialog(this, "Se eliminó el estudiante con cédula " + id + ".", "Eliminar estudiante", JOptionPane.INFORMATION_MESSAGE);
                 
             } else {
             
                 JOptionPane.showMessageDialog(this, "No se ha encontrado el estudiante con cédula " + id + ".", "Modificar estudiante", JOptionPane.INFORMATION_MESSAGE);
                 
             }
        }   
    }//GEN-LAST:event_btn_eliminarEstudianteActionPerformed

    private void btn_EliminarLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarLugarActionPerformed
        String id = JOptionPane.showInputDialog(this, "Indique el identificador del lugar que desea eliminar.", "Eliminar lugar", JOptionPane.QUESTION_MESSAGE);
        
        if (id != null ) {//Si no le da al botón cancelar
             Lugar lugar = Controlador.getSingletonInstance().getGestorLugares().buscarLugar(id);
             
             if (lugar != null) {
                
                 for (Integer cedula : lugar.getListaEstudiantes()) {
                     
                    int idEstudiante = cedula;
                    
                    Estudiante estudianteACambiar = Controlador.getSingletonInstance().getGestorEstudiantes().buscarEstudiante(String.valueOf(idEstudiante));
                    estudianteACambiar.setLugarServicioSocial(0);
                     
                 }
                 
                 Controlador.getSingletonInstance().getGestorLugares().eliminarLugar(id);
                 
             } else {
             
                 JOptionPane.showMessageDialog(this, "No se ha encontrado el lugar con identificador " + id + ".", "Eliminar lugar", JOptionPane.INFORMATION_MESSAGE);
                 
             }
        } 
    }//GEN-LAST:event_btn_EliminarLugarActionPerformed

    private void btn_registrarHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarHorasActionPerformed
        new RegistrarHoras(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_btn_registrarHorasActionPerformed

    private void btn_realizarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_realizarMatriculaActionPerformed
        new MatricularEstudiante(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_btn_realizarMatriculaActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btn_EliminarLugar;
    private rojeru_san.RSButtonRiple btn_consultarLugares;
    private rojeru_san.RSButtonRiple btn_eliminarEstudiante;
    private rojeru_san.RSButtonRiple btn_modificarEstudiante;
    private rojeru_san.RSButtonRiple btn_modificarLugar;
    private rojeru_san.RSButtonRiple btn_realizarMatricula;
    private rojeru_san.RSButtonRiple btn_registrarEstudiante;
    private rojeru_san.RSButtonRiple btn_registrarHoras;
    private rojeru_san.RSButtonRiple btn_registrarLugar;
    private rojeru_san.RSButtonRiple consultarEstudiantes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
