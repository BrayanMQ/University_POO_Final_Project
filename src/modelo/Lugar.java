
package modelo;

import java.util.ArrayList;

public abstract class Lugar {
    protected int id;
    protected String nombre;
    protected String direccion;
    protected int telefono;
    protected String correo;
    protected ArrayList<Estudiante> listaEstudiantes;
    protected int cuposDisponibles;
}
