
package modelo;

public class EstudianteFactory implements Factory{
    
    @Override
    public Estudiante crear(String pCarrera, String pCedula, 
            String pCorreoEstudiante, boolean pUniversidadPublica, String pNombre, 
            String pTelefono, String pUniversidadDato) {

        if (pUniversidadPublica) {
            EstudianteUPublica estudiante = new EstudianteUPublica(pUniversidadDato, 
                    pNombre, Integer.parseInt(pCedula), pCorreoEstudiante, Integer.parseInt(pTelefono), pCarrera);
            return estudiante;
        }else{
            EstudianteUPrivada estudiante = new EstudianteUPrivada(Integer.parseInt(pUniversidadDato),
                    pNombre, Integer.parseInt(pCedula), pCarrera, Integer.parseInt(pTelefono), pCarrera);
            return estudiante;
        }
    }
    
}
