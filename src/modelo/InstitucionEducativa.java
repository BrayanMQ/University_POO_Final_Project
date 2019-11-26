
package modelo;

public class InstitucionEducativa extends Lugar{
   private boolean requiereConocimiento; 
   
   public InstitucionEducativa(boolean requiereConocimiento, String nombre, String direccion, int telefono, String correo) {
        super(nombre, direccion, telefono, correo);
        this.requiereConocimiento = requiereConocimiento;
    }

    public boolean isRequiereConocimiento() {
        return requiereConocimiento;
    }
   
   
   
}
