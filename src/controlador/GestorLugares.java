
package controlador;

import modelo.Albergue;
import modelo.Asilo;
import modelo.InstitucionEducativa;
import modelo.Lugar;
import modelo.LugarFactory;
import modelo.Municipalidad;

public class GestorLugares {
    
    public boolean registrarLugar(String pCorreo, String pNombre, String pDireccion, 
            boolean pRequerimiento, String pTelefono, String pTipoLugar){
        
        //Creador de lugar
        LugarFactory crearLugar = new LugarFactory();
        
        //Lugar posible a insertar
        Lugar lugar = (Lugar) crearLugar.crear(pCorreo, pDireccion, pNombre, pRequerimiento, pTelefono, pTipoLugar, "", "");
        
        //Si el lugar no está en lista, lo agrega
        if (!Controlador.getSingletonInstance().getListaLugaresRegistrados().contains(lugar)) {
            Controlador.getSingletonInstance().getListaLugaresRegistrados().add(lugar);
            return true;
        }
        return false; 
    }
    
    public boolean modificarLugar(String pCorreo, String pNombre, String pDireccion, String pTelefono, int pId){
        
        for (int i = 0; i < Controlador.getSingletonInstance().getListaLugaresRegistrados().size(); i++) {
            if (Controlador.getSingletonInstance().getListaLugaresRegistrados().get(i).getId() == pId) {
                Controlador.getSingletonInstance().getListaLugaresRegistrados().get(i).setNombre(pNombre);
                Controlador.getSingletonInstance().getListaLugaresRegistrados().get(i).setDireccion(pDireccion);
                Controlador.getSingletonInstance().getListaLugaresRegistrados().get(i).setTelefono(Integer.parseInt(pTelefono));
                Controlador.getSingletonInstance().getListaLugaresRegistrados().get(i).setCorreo(pCorreo);
                return true;
            }
        }
        return false; 
    }
    
    public Lugar buscarLugar(String pId) {
    
        for (Lugar lugar : Controlador.getSingletonInstance().getListaLugaresRegistrados()) {
            if (lugar.getId() == Integer.parseInt(pId)) {
                return lugar;
            }
        }
        return null;
    }
    
    public boolean eliminarLugar(String pId) {
        
        for (int i = 0; i < Controlador.getSingletonInstance().getListaLugaresRegistrados().size(); i++) {
            if (Controlador.getSingletonInstance().getListaLugaresRegistrados().get(i).getId() == Integer.parseInt(pId)) {
                Controlador.getSingletonInstance().getListaLugaresRegistrados().remove(i);
                return true;
            }
        } 
        return false;
    }

    
    public String obtenerRequisito(Lugar pLugar){
        if (pLugar instanceof Municipalidad) {
            
            if (((Municipalidad)pLugar).isRequiereConocimiento()) {
                return "Requiere conocimiento en ofimática.";
            }else{
                return "No requiere conocimiento en ofimática.";
            }
        }else if (pLugar instanceof InstitucionEducativa) {
            if (((InstitucionEducativa)pLugar).isRequiereConocimiento()) {
                return "Requiere mínimo de horas.";
            }else{
                return "No requiere mínimo de horas.";
            }
        }else if(pLugar instanceof Asilo){
            if (((Asilo)pLugar).isRequiereExperiencia()) {
                return "Requiere experiencia previa con personas.";
            }else{
                return "No requiere experiencia previa con personas.";
            }
        }else if (pLugar instanceof Albergue) {
            if (((Albergue)pLugar).isRequiereExperiencia()) {
                return "Requiere experiencia previa con personas.";
            }else{
                return "No requiere experiencia previa con personas.";
            }
        }
        return "Error.";
    }
}
