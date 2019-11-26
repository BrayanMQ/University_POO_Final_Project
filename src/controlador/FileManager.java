
package controlador;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import modelo.Albergue;
import modelo.Asilo;
import modelo.Estudiante;
import modelo.EstudianteFactory;
import modelo.EstudianteUPrivada;
import modelo.EstudianteUPublica;
import modelo.InstitucionEducativa;
import modelo.Lugar;
import modelo.Municipalidad;

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
                
            datosEstudiante = pEstudiante.getCedula() + "-";
            datosEstudiante += pEstudiante.getNombre() + "-"; 
            datosEstudiante += pEstudiante.getCorreo() + "-";
            datosEstudiante += pEstudiante.getTelefono() + "-";
            datosEstudiante += pEstudiante.getDireccion() + "-";
            datosEstudiante += pEstudiante.getCarrera() + "-";
            datosEstudiante += pEstudiante.getCantidadHorasCompletadas() + "-";
            datosEstudiante += pEstudiante.getLugarServicioSocial() + "-";

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
    
    public boolean escribirArchivo(String pNombreArch, Lugar pLugar) throws IOException {

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

            String datosLugar = "";

            datosLugar = pLugar.getId() + "-";
            datosLugar += pLugar.getNombre() + "-";
            datosLugar += pLugar.getDireccion() + "-";
            datosLugar += pLugar.getTelefono() + "-";
            datosLugar += pLugar.getCorreo() + "-";

            if (pLugar instanceof Municipalidad) {
                datosLugar += ((Municipalidad) pLugar).isRequiereConocimiento() + "-";
                datosLugar += "0-";
            } else if (pLugar instanceof InstitucionEducativa) {
                datosLugar += ((InstitucionEducativa) pLugar).isRequiereConocimiento() + "-";
                datosLugar += "1-";
            } else if (pLugar instanceof Albergue) {
                datosLugar += ((Albergue) pLugar).isRequiereExperiencia() + "-";
                datosLugar += "2-";
            } else if (pLugar instanceof Asilo) {
                datosLugar += ((Asilo) pLugar).isRequiereExperiencia() + "-";
                datosLugar += "3-";
            }
            
            if (!pLugar.getListaEstudiantes().isEmpty()) {
                for (Integer estudiante : pLugar.getListaEstudiantes()) {
                datosLugar += String.valueOf(estudiante) + "/";
                }
            } else {
                datosLugar += "_"; 
            }

            datosLugar += ",";
            pw.println(datosLugar);

            fichero.close();
            return true;

        } catch (IOException e) {
            return false;
        }
    }
    
    public boolean sobrescribirArchivo (String pNombreArch, ArrayList<Estudiante> pLista) throws IOException {
        
        FileWriter fichero;
        PrintWriter pw;

        fichero = new FileWriter(pNombreArch); 
        
        try {         
            pw = new PrintWriter(fichero);
            
            String datosEstudiante = "";
            
            for (Estudiante estudiante : pLista) {
                datosEstudiante = estudiante.getNombre() + "-"; 
                datosEstudiante += estudiante.getCedula() + "-";
                datosEstudiante += estudiante.getCorreo() + "-";
                datosEstudiante += estudiante.getTelefono() + "-";
                datosEstudiante += estudiante.getDireccion() + "-";
                datosEstudiante += estudiante.getCarrera() + "-";
                datosEstudiante += estudiante.getCantidadHorasCompletadas() + "-";
                datosEstudiante += estudiante.getLugarServicioSocial() + "-";

                if (estudiante instanceof EstudianteUPublica) {
                    datosEstudiante += ((EstudianteUPublica) estudiante).getCorreoInstitucional();
                } else {
                    datosEstudiante += ((EstudianteUPrivada) estudiante).getDineroRequerido();
                }

                datosEstudiante += ",";
            }

            pw.println(datosEstudiante);

            fichero.close();
            return true;

        } catch (IOException e) {
            return false;
        } 
    }
    
    public boolean sobreescribirArchivo(String pNombreArch, ArrayList<Lugar> pLista) throws IOException {

        FileWriter fichero;
        PrintWriter pw;

        fichero = new FileWriter(pNombreArch);

        try {
            pw = new PrintWriter(fichero);

            String datosLugar = "";
            for (Lugar lugar : pLista) {

                datosLugar = lugar.getId() + "-";
                datosLugar += lugar.getNombre() + "-";
                datosLugar += lugar.getDireccion() + "-";
                datosLugar += lugar.getTelefono() + "-";
                datosLugar += lugar.getCorreo() + "-";

                if (lugar instanceof Municipalidad) {
                    datosLugar += ((Municipalidad) lugar).isRequiereConocimiento() + "-";
                    datosLugar += "0-";
                } else if (lugar instanceof InstitucionEducativa) {
                    datosLugar += ((InstitucionEducativa) lugar).isRequiereConocimiento() + "-";
                    datosLugar += "1-";
                } else if (lugar instanceof Albergue) {
                    datosLugar += ((Albergue) lugar).isRequiereExperiencia() + "-";
                    datosLugar += "2-";
                } else if (lugar instanceof Asilo) {
                    datosLugar += ((Asilo) lugar).isRequiereExperiencia() + "-";
                    datosLugar += "3-";
                }
                
                for (Integer estudiante : lugar.getListaEstudiantes()) {
                datosLugar += String.valueOf(estudiante) + "/";
                }

                datosLugar += ",";
            }

            pw.println(datosLugar);

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
            
            parseToList(listaTotal, pEsListaEstudiantes);
 
            fileReader.close();
            return true;
            
        } catch (IOException e) {
            return false;
        }
    }
    
    public void parseToList(String pLista, boolean pEsListaEstudiantes) throws IOException{
        
        String[] lista = pLista.split(",");

       
        if (pEsListaEstudiantes) { //Cargar listaEstudiantes
            Controlador.getSingletonInstance().getListaEstudiantesRegistrados().clear();
            for (String estudiante : lista) {
                
                String[] datosEstudiante = estudiante.split("-");
                
                //Validacion que funciona para saber si es de upublica o privada
                if (Controlador.getSingletonInstance().getValidacion().validarCorreo(datosEstudiante[8])) {
                    
                    String cedula = datosEstudiante[0];
                    String nombre = datosEstudiante[1];
                    String correo = datosEstudiante[2];
                    String telefono = datosEstudiante[3];
                    String direccion = datosEstudiante[4];
                    String carrera = datosEstudiante[5];
                    String cantidadHorasCompletadas = datosEstudiante[6];
                    String lugarServicioSocial = datosEstudiante[7];
                    String datoUniversidad = datosEstudiante[8];
                    
                    Controlador.getSingletonInstance().getGestorEstudiantes().registrarEstudiante(carrera, cedula, correo, nombre, telefono, datoUniversidad, true, direccion);
                    Estudiante estudianteNuevo = Controlador.getSingletonInstance().getGestorEstudiantes().buscarEstudiante(cedula);
                    estudianteNuevo.setCantidadHorasCompletadas(Integer.parseInt(cantidadHorasCompletadas));
                    estudianteNuevo.setLugarServicioSocial(Integer.parseInt(lugarServicioSocial));             
                }
                
            }
        } else { //Cargar listalugares
            Controlador.getSingletonInstance().getListaLugaresRegistrados().clear();
            boolean requerimiento;
            for (String lugar : lista) {
                
                String[] datosLugar = lugar.split("-");
                
                String id = datosLugar[0];
                String nombre = datosLugar[1];
                String direccion = datosLugar[2];
                String telefono = datosLugar[3];
                String correo = datosLugar[4];
                String requiere = datosLugar[5];
                
                if (requiere == "true") {
                    requerimiento = true;
                } else {
                    requerimiento = false;
                }
                
                String tipoLugar = "";
                switch(datosLugar[6]){
                    case "0": //Municipalidad
                        tipoLugar = "Municipalidad";
                        break;
                        
                    case "1": //Institución educativa
                        tipoLugar = "Institucion Educativa";
                        break;
                        
                    case "2": //Albergue
                        tipoLugar = "Albergue";
                        break;
                        
                    case "3": //Asilo
                        tipoLugar = "Asilo";
                        break;
                }
                
                Controlador.getSingletonInstance().getGestorLugares().registrarLugar(correo, nombre, direccion, requerimiento, telefono, tipoLugar);
                Lugar lugarNuevo = Controlador.getSingletonInstance().getGestorLugares().buscarLugar(id);
                
                
                ArrayList<Integer> cedulas = new ArrayList<>();
                if (!"_".equals(datosLugar[7])) {
                    String[] cedulasEstudiantes = datosLugar[7].split("/");
                    
                    for (String cedulaEstudiante : cedulasEstudiantes) {
                        cedulas.add(Integer.parseInt(cedulaEstudiante));
                    }
                    
                    lugarNuevo.setListaEstudiantes(cedulas);
                    
                } else {
                    lugarNuevo.setListaEstudiantes(cedulas);
                }
                
            }
        
        }

    }
    
    public boolean existeArchivo(String pNombreArch) {
        File archivo = new File(pNombreArch);
        return archivo.exists();
    }
    
}
