
package modelo;

import controlador.Controlador;
import java.util.ArrayList;
import java.util.Objects;

public abstract class Lugar implements IConstants{
    protected int id;
    protected String nombre;
    protected String direccion;
    protected int telefono;
    protected String correo;
    protected ArrayList<Estudiante> listaEstudiantes;
    protected int cuposDisponibles;
    
    public Lugar(String nombre, String direccion, int telefono, String correo) {
        this.id = Controlador.getSingletonInstance().getListaLugaresRegistrados().size() + ID_INICIAL_LUGARES;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.listaEstudiantes = new ArrayList<>(); 
        this.cuposDisponibles = CUPOS_DISPONIBLES;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Lugar other = (Lugar) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
}
