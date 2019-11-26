
package controlador;

import java.util.ArrayList;
import modelo.Estudiante;
import modelo.Validacion;

public class Controlador {
    private static Controlador controlador;
    private GestorEstudiantes gestorEstudiantes;
    private GestorLugares gestorLugares;
    private FileManager fileManager;
    private Validacion validacion;
    private ArrayList<Estudiante> listaEstudiantesRegistrados;
        
    public Controlador() {
        this.gestorEstudiantes = new GestorEstudiantes();
        this.gestorLugares = new GestorLugares();
        this.fileManager = new FileManager();
        this.validacion = new Validacion();
        this.listaEstudiantesRegistrados = new ArrayList<>();  //|Por hacer| Se debe meter en la lista los datos del archivo
    }

    public static Controlador getSingletonInstance() {
        if (controlador == null){
            controlador = new Controlador();
        }
        return controlador;
    }

    public Validacion getValidacion() {
        return validacion;
    }

    public GestorEstudiantes getGestorEstudiantes() {
        return gestorEstudiantes;
    }
    
    public ArrayList<Estudiante> getListaEstudiantesRegistrados() {
        return listaEstudiantesRegistrados;
    }
    
}
