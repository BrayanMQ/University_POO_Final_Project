
package proyectofinalpoo;

import java.io.FileNotFoundException;
import java.io.IOException;
import controlador.Controlador;
import controlador.FileManager;
import static modelo.IConstants.*;


import vista.PantallaPrincipal;

public class ProyectoFinalPOO {

    public static void main(String[] args) throws IOException, FileNotFoundException{
        FileManager fileManager = new FileManager();
        new PantallaPrincipal().setVisible(true);
        //fileManager.leerArchivo(RUTA_LISTA_ESTUDIANTES, true);
        //fileManager.leerArchivo(RUTA_LISTA_LUGARES, false);
        
    }
    
}
