
package controlador;

import java.util.ArrayList;
import modelo.Estudiante;
import modelo.EstudianteFactory;
import modelo.EstudianteUPrivada;
import modelo.EstudianteUPublica;
import modelo.Lugar;

public class GestorEstudiantes {
    
    public boolean registrarEstudiante(String pCarrera, String pCedula, 
            String pCorreoEstudiante, String pNombre, 
            String pTelefono, String pUniversidadDato, boolean pUniversidadPublica, String pDireccion){
        
        //Creador de estudiantes 
        EstudianteFactory crearEstudiante = new EstudianteFactory();
        //Estudiante posible a insertar
        Estudiante estudiante = (Estudiante) crearEstudiante.crear(pCarrera, pCedula, 
                pCorreoEstudiante, pUniversidadPublica, pNombre, pTelefono, pUniversidadDato, pDireccion);
        
        //Si el estudiante no está en lista, lo agrega
        if (buscarEstudiante(pCedula) == null) {
            
            Controlador.getSingletonInstance().getListaEstudiantesRegistrados().add(estudiante);
            return true;
            
        }
        return false;       
    }
    
        public boolean modificarEstudiante(String pCarrera, String pCedula, 
            String pCorreoEstudiante, String pNombre, 
            String pTelefono, String pUniversidadDato, boolean pUniversidadPublica, String pDireccion){
        
            for (int i = 0; i < Controlador.getSingletonInstance().getListaEstudiantesRegistrados().size(); i++) {
                if (Controlador.getSingletonInstance().getListaEstudiantesRegistrados().get(i).getCedula() == Integer.parseInt(pCedula)) {
                    
                    if (Controlador.getSingletonInstance().getListaEstudiantesRegistrados().get(i) instanceof EstudianteUPublica && pUniversidadPublica == true) {
                        
                        Controlador.getSingletonInstance().getListaEstudiantesRegistrados().get(i).setNombre(pNombre);
                        Controlador.getSingletonInstance().getListaEstudiantesRegistrados().get(i).setCorreo(pCorreoEstudiante);
                        Controlador.getSingletonInstance().getListaEstudiantesRegistrados().get(i).setTelefono(Integer.parseInt(pTelefono));
                        Controlador.getSingletonInstance().getListaEstudiantesRegistrados().get(i).setCarrera(pCarrera);
                        Controlador.getSingletonInstance().getListaEstudiantesRegistrados().get(i).setDireccion(pDireccion);
                        ((EstudianteUPublica)Controlador.getSingletonInstance().getListaEstudiantesRegistrados().get(i)).setCorreoInstitucional(pUniversidadDato);  
                        return true;
                        
                    } else if (Controlador.getSingletonInstance().getListaEstudiantesRegistrados().get(i) instanceof EstudianteUPrivada && pUniversidadPublica == false){
                    
                        Controlador.getSingletonInstance().getListaEstudiantesRegistrados().get(i).setNombre(pNombre);
                        Controlador.getSingletonInstance().getListaEstudiantesRegistrados().get(i).setCorreo(pCorreoEstudiante);
                        Controlador.getSingletonInstance().getListaEstudiantesRegistrados().get(i).setTelefono(Integer.parseInt(pTelefono));
                        Controlador.getSingletonInstance().getListaEstudiantesRegistrados().get(i).setCarrera(pCarrera);
                        Controlador.getSingletonInstance().getListaEstudiantesRegistrados().get(i).setDireccion(pDireccion);
                        ((EstudianteUPrivada)Controlador.getSingletonInstance().getListaEstudiantesRegistrados().get(i)).setDineroRequerido(Integer.parseInt(pUniversidadDato));
                        return true;
                        
                    } else {

                        //Creador de estudiantes 
                        EstudianteFactory crearEstudiante = new EstudianteFactory();

                        //Estudiante posible a insertar
                        Estudiante estudiante = (Estudiante) crearEstudiante.crear(pCarrera, pCedula,
                                pCorreoEstudiante, pUniversidadPublica, pNombre,
                                pTelefono, pUniversidadDato, pDireccion);
                        
                        estudiante.setCantidadHorasCompletadas(Controlador.getSingletonInstance().getListaEstudiantesRegistrados().get(i).getCantidadHorasCompletadas());
                        estudiante.setLugarServicioSocial(Controlador.getSingletonInstance().getListaEstudiantesRegistrados().get(i).getLugarServicioSocial());
                        
                        Controlador.getSingletonInstance().getListaEstudiantesRegistrados().set(i, estudiante);
                        return true;
                        
                    }

                }
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
    
    public String registrarHorasEstudiante(String pCedula, String pCantidadHoras){
        
        Estudiante estudiante = buscarEstudiante(pCedula);
        if (estudiante != null) {
            
            if (estudiante.getLugarServicioSocial() != 0) {
                estudiante.registrarHoras(Integer.parseInt(pCantidadHoras));
                return "La cantidad de horas restantes del estudiante son:" + estudiante.getCantidadHorasCompletadas();
            }else{
                return "El estudiante no tiene un lugar registrado.";
            }
        }else{
            return "El estudiante no se encuentra registrado.";
        }
        
    }
    
    public String obtenerLugar(int pIdLugar){
        ArrayList<Lugar> listaLugares = Controlador.getSingletonInstance().getListaLugaresRegistrados();
        for (Lugar lugar : listaLugares) {
            if (lugar.getId() == pIdLugar) {
                return lugar.getNombre();
            }
        }
        return "No se encontró el lugar";
    }
}