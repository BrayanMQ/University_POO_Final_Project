
package controlador;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import modelo.Estudiante;
import modelo.EstudianteUPrivada;
import modelo.EstudianteUPublica;
import modelo.Lugar;

public class FileManager {

    
    public boolean escribirArchivo (String pNombreArch, Estudiante pEstudiante) throws IOException {
        
        FileWriter fichero;
        PrintWriter pw;
        
        //Si el archivo existe hace un append, sino lo crea desde 0
        if (existeArchivo(pNombreArch)) {
            fichero = new FileWriter(pNombreArch, true);  
        } else {
            fichero = new FileWriter(pNombreArch);  
        }
        
        try {         
            pw = new PrintWriter(fichero);
            
            String datosEstudiante = "";
                
            datosEstudiante += pEstudiante.getNombre() + "|"; 
            datosEstudiante += pEstudiante.getCedula() + "|";
            datosEstudiante += pEstudiante.getCorreo() + "|";
            datosEstudiante += pEstudiante.getTelefono() + "|";
            datosEstudiante += pEstudiante.getDireccion() + "|";
            datosEstudiante += pEstudiante.getCarrera() + "|";
            datosEstudiante += pEstudiante.getCantidadHorasCompletadas() + "|";
            //Lugar lugar = pEstudiante.getLugarServicioSocial();//Agregar el lugar

            if (pEstudiante instanceof EstudianteUPublica) {
                datosEstudiante += ((EstudianteUPublica) pEstudiante).getCorreoInstitucional();
            } else {
                datosEstudiante += ((EstudianteUPrivada) pEstudiante).getDineroRequerido();
            }
            
            datosEstudiante += ",";    
            pw.println(datosEstudiante);
            
            fichero.close();
            return true;

        } catch (IOException e) {
            return false;
        } 
    }

    public boolean leerArchivo(String pNombreArch, boolean pEsListaEstudiantes) throws FileNotFoundException, IOException {
        File archivo = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File(pNombreArch);
            fileReader = new FileReader(archivo);
            bufferedReader = new BufferedReader(fileReader);

            // Lectura del fichero
            String linea;
            String listaTotal = "";
            while ((linea = bufferedReader.readLine()) != null) {
                listaTotal += linea;
            }
 
            fileReader.close();
            return true;
            
        } catch (IOException e) {
            return false;
        }
    }
    
    public boolean existeArchivo (String pNombreArch){
        File archivo = new File(pNombreArch);
        return archivo.exists();
    }
    
    public ArrayList parseToList(String pLista, boolean pEsListaEstudiantes){
        
        String[] lista = pLista.split(",");
        ArrayList listaFinal = new ArrayList();
        
        if (pEsListaEstudiantes) {
            for (String elemento : lista) {
                
            }
        }
        return listaFinal;
    }
    
}
