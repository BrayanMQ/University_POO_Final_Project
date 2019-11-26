
package modelo;

public class EstudianteUPublica extends Estudiante{
    private String correoInstitucional;
    
    public EstudianteUPublica(String correoInstitucional, String pNombre, int pCedula, 
            String pCorreo, int pTelefono, String pCarrera) {
        
        super(pNombre, pCedula, pCorreo, pTelefono, pCarrera);
        this.correoInstitucional = correoInstitucional;
        
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }
    
    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }
    
}
