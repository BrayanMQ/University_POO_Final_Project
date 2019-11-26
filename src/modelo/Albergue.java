
package modelo;

public class Albergue extends Lugar{
    private boolean requiereExperiencia;
    
    public Albergue(boolean requiereExperiencia, String nombre, String direccion, 
            int telefono, String correo) {
        super(nombre, direccion, telefono, correo);
        this.requiereExperiencia = requiereExperiencia;
    }
}
