/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Ronny
 */
public interface Factory {
    
    public Estudiante crear(String pCarrera, String pCedula, 
            String pCorreoEstudiante, boolean pUniversidadPublica, String pNombre, 
            String pTelefono, String pUniversidadDato);
    
}
