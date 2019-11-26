
package modelo;

public class Asilo extends Lugar{
    private boolean requiereExperiencia;
    
    public Asilo(boolean requiereExperiencia, String nombre, String direccion, int telefono, String correo) {
        super(nombre, direccion, telefono, correo);
        this.requiereExperiencia = requiereExperiencia;
    }
}
