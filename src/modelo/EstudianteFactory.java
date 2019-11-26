
package modelo;

public class EstudianteFactory implements Factory{
    
    @Override
    public Object crear(String pCarrera, String pCedula, 
            String pCorreoEstudiante, boolean pUniversidadPublica, String pNombre, 
            String pTelefono, String pUniversidadDato, String pDireccion) {
        
        if (pUniversidadPublica) {
            EstudianteUPublica estudiante = new EstudianteUPublica(pUniversidadDato, 
                    pNombre, Integer.parseInt(pCedula), pCorreoEstudiante, Integer.parseInt(pTelefono), pCarrera, pDireccion);
            return estudiante;
        }else{
            EstudianteUPrivada estudiante = new EstudianteUPrivada(Integer.parseInt(pUniversidadDato),
                    pNombre, Integer.parseInt(pCedula), pCarrera, Integer.parseInt(pTelefono), pCarrera, pDireccion);
            return estudiante;
        }
    }
    
}
