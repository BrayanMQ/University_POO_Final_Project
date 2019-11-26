
package proyectofinalpoo;

import com.opencsv.exceptions.CsvValidationException;
import controlador.FileManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import modelo.Estudiante;
import modelo.EstudianteUPublica;

import vista.PantallaPrincipal;

public class ProyectoFinalPOO {

    public static void main(String[] args) throws IOException, FileNotFoundException, CsvValidationException {
        
        PantallaPrincipal pantallaPrincipal = new PantallaPrincipal();
        pantallaPrincipal.setVisible(true);
        
    }
    
}
