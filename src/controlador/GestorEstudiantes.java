
package controlador;

import modelo.Estudiante;
import modelo.EstudianteFactory;
import modelo.EstudianteUPrivada;
import modelo.EstudianteUPublica;

public class GestorEstudiantes {
    
    public boolean registrarEstudiante(String pCarrera, String pCedula, 
            String pCorreoEstudiante, String pNombre, 
            String pTelefono, String pUniversidadDato, boolean pUniversidadPublica){
        
        //Creador de estudiantes 
        EstudianteFactory crearEstudiante = new EstudianteFactory();
        
        //Estudiante posible a insertar
        Estudiante estudiante = crearEstudiante.crear(pCarrera, pCedula, 
                pCorreoEstudiante, pUniversidadPublica, pNombre, 
                pTelefono, pUniversidadDato);
        
        //Si el estudiante no está en lista, lo agrega
        if (!Controlador.getSingletonInstance().getListaEstudiantesRegistrados().contains(estudiante)) {
            
            Controlador.getSingletonInstance().getListaEstudiantesRegistrados().add(estudiante);
            return true;
            
        }
        return false;       
    }
    
        public boolean modificarEstudiante(String pCarrera, String pCedula, 
            String pCorreoEstudiante, String pNombre, 
            String pTelefono, String pUniversidadDato, boolean pUniversidadPublica){
        
            for (int i = 0; i < Controlador.getSingletonInstance().getListaEstudiantesRegistrados().size(); i++) {
                if (Controlador.getSingletonInstance().getListaEstudiantesRegistrados().get(i).getCedula() == Integer.parseInt(pCedula)) {
                    Controlador.getSingletonInstance().getListaEstudiantesRegistrados().get(i).setNombre(pNombre);
                    Controlador.getSingletonInstance().getListaEstudiantesRegistrados().get(i).setCorreo(pCorreoEstudiante);
                    Controlador.getSingletonInstance().getListaEstudiantesRegistrados().get(i).setTelefono(Integer.parseInt(pTelefono));
                    Controlador.getSingletonInstance().getListaEstudiantesRegistrados().get(i).setCarrera(pCarrera);
                    Controlador.getSingletonInstance().getListaEstudiantesRegistrados().get(i).setDireccion(pDireccion);
                    
                    if (pUniversidadPublica) {
                         ((EstudianteUPublica)Controlador.getSingletonInstance().getListaEstudiantesRegistrados().get(i)).setCorreoInstitucional(pUniversidadDato);
                    } else {
                        ((EstudianteUPrivada)Controlador.getSingletonInstance().getListaEstudiantesRegistrados().get(i)).setDineroRequerido(Integer.parseInt(pUniversidadDato));
                    }
                }
            }
    
            
        //Creador de estudiantes 
        EstudianteFactory crearEstudiante = new EstudianteFactory();
        
        //Estudiante posible a insertar
        Estudiante estudiante = crearEstudiante.crear(pCarrera, pCedula, 
                pCorreoEstudiante, pUniversidadPublica, pNombre, 
                pTelefono, pUniversidadDato);
        
        //Si el estudiante no está en lista, lo agrega
        if (!Controlador.getSingletonInstance().getListaEstudiantesRegistrados().contains(estudiante)) {
            
            Controlador.getSingletonInstance().getListaEstudiantesRegistrados().add(estudiante);
            return true;
            
        }
        return false;       
    }
    
    public Estudiante buscarEstudiante(String pCedula){
    
        for (Estudiante estudiante : Controlador.getSingletonInstance().getListaEstudiantesRegistrados()) {
            if (estudiante.getCedula() == Integer.parseInt(pCedula)) {
                return estudiante;
            }
        }
        return null; 
    }     
    
    
    public boolean eliminarEstudiante(String pCedula){
        
        for (int i = 0; i < Controlador.getSingletonInstance().getListaEstudiantesRegistrados().size(); i++) {
            if (Controlador.getSingletonInstance().getListaEstudiantesRegistrados().get(i).getCedula() == Integer.parseInt(pCedula)) {
                    Controlador.getSingletonInstance().getListaEstudiantesRegistrados().remove(i);
                    return true;
                }
        }
        return false;
    }
}