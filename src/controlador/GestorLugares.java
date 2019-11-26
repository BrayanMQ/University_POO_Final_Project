
package controlador;

import modelo.Lugar;
import modelo.LugarFactory;

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
}
