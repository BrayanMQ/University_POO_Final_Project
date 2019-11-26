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
public class LugarFactory implements Factory{
    
    @Override
    public Object crear(String pCorreo, String pDireccion, String pNombre, 
            boolean pRequerimiento, String pTelefono, String pTipoLugar, String vacio1, String vacio2) {
        
        switch(pTipoLugar) {
            case "Municipalidad":
                Municipalidad municipalidad = new Municipalidad(pRequerimiento, 
                        pNombre, pDireccion, Integer.parseInt(pTelefono), pCorreo);
                return municipalidad;
            case "Institucion Educativa":
                InstitucionEducativa institucionEducativa = new InstitucionEducativa(pRequerimiento, 
                        pNombre, pDireccion, Integer.parseInt(pTelefono), pCorreo);
              return institucionEducativa;
            case "Albergue":
                Albergue albergue = new Albergue(pRequerimiento, pNombre, pDireccion, Integer.parseInt(pTelefono), pCorreo);
                return albergue;
            case "Asilo":
                Asilo asilo = new Asilo(pRequerimiento, pNombre, pDireccion, Integer.parseInt(pTelefono), pCorreo);
                return asilo;
          }
        return null;
    }
}
