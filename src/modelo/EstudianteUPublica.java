
package modelo;

public class EstudianteUPublica extends Estudiante{
    private String correoInstitucional;
    
    public EstudianteUPublica(String correoInstitucional, String pNombre, int pCedula, 
            String pCorreo, int pTelefono, String pCarrera, String pDireccion) {
        
        super(pNombre, pCedula, pCorreo, pTelefono, pCarrera, pDireccion);
        this.correoInstitucional = correoInstitucional;
        
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }
    
    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }
    
}
