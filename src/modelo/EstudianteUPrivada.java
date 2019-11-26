
package modelo;

public class EstudianteUPrivada extends Estudiante{
    private int dineroRequerido;
    
    public EstudianteUPrivada(int dineroRequerido, String pNombre, int pCedula, 
            String pCorreo, int pTelefono, String pCarrera) {
        super(pNombre, pCedula, pCorreo, pTelefono, pCarrera);
        this.dineroRequerido = dineroRequerido;
    }

    public int getDineroRequerido() {
        return dineroRequerido;
    }

    public void setDineroRequerido(int dineroRequerido) {
        this.dineroRequerido = dineroRequerido;
    }

}
