
package modelo;

public abstract class Estudiante {
    protected String nombre;
    protected int cedula;
    protected String correo;
    protected int telefono;
    protected String direccion;
    protected String carrera;
    protected int cantidadHorasCompletadas;
    protected Lugar lugarServicioSocial;
    
    public Estudiante(String pNombre, int pCedula, String pCorreo, int pTelefono, String pCarrera) {
        this.nombre = pNombre;
        this.cedula = pCedula;
        this.correo = pCorreo;
        this.telefono = pTelefono;
        this.carrera = pCarrera;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getCantidadHorasCompletadas() {
        return cantidadHorasCompletadas;
    }

    public Lugar getLugarServicioSocial() {
        return lugarServicioSocial;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setCantidadHorasCompletadas(int cantidadHorasCompletadas) {
        this.cantidadHorasCompletadas = cantidadHorasCompletadas;
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
        final Estudiante other = (Estudiante) obj;
        if (this.cedula != other.cedula) {
            return false;
        }
        return true;
    }
}
