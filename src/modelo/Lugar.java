
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
    protected ArrayList<Integer> listaEstudiantes;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<Integer> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Integer> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public int getCuposDisponibles() {
        return cuposDisponibles;
    }
    
    public int getCuposRestantes(){
        return cuposDisponibles - listaEstudiantes.size();
    }

    public void setCuposDisponibles(int cuposDisponibles) {
        this.cuposDisponibles = cuposDisponibles;
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
