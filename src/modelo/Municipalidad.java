
package modelo;

public class Municipalidad extends Lugar{
   private boolean requiereConocimiento; 
   
   public Municipalidad(boolean requiereConocimiento, String nombre, String direccion, int telefono, String correo) {
        super(nombre, direccion, telefono, correo);
        this.requiereConocimiento = requiereConocimiento;
    }
}
