/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ronny
 */
public class Validacion {
    
    
    /**
     * Valida que el teléfono tenga 8 dígitos
     * @param pTelefono
     * @return Retornará true si el teléfono es válido, caso contrario retornará false
     */
    public boolean validarTelefono(String pTelefono){
        return pTelefono.matches("[0-9]{8}");
    }
    
    /**
     * Valida que el correo tenga una estructura válida
     * @param pCorreo
     * @return Retornará true si el correo es válido, caso contrario retornará false
     */
    public boolean validarCorreo(String pCorreo){
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pCorreo);
        return matcher.matches();
    }

    /**
     * Valida que la fecha tenga un formato válido
     * @param pFechaNacimiento
     * @return Retornará la fecha en caso de tener un formato válido
     */
    public Date validarFechaNacimiento(String pFechaNacimiento){
        Date date = null;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            date = formatter.parse(pFechaNacimiento);
        } catch (ParseException e) {
        }
        return date;
    }

    /**
     * Valida que los datos de la lista no sen vacíos
     * @param pListaDatos
     * @return Retorna true si no son vacíos
     */
    public boolean validarDatoVacio(ArrayList<String> pListaDatos){
        for (String dato : pListaDatos) {
            if ("".equals(dato)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Valida numeros enteros
     * @param pDigito
     * @return  Retorna true si el string son solo numeros mayores que 0
     */
    public boolean validarDigitosEnteros(String pDigito){
        Pattern patronPalabras = Pattern.compile("[0-9]*");
        Matcher match = patronPalabras.matcher(pDigito);
        if (match.matches()) {
            if (Integer.parseInt(pDigito) > 0) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Valida numeros double
     * @param pDigito
     * @return Retorna true si el string se puede parsear a double
     */
    public boolean validarDigitosDobles(String pDigito){
        
        try {
            double num = Double.parseDouble(pDigito);
            return true;
        } catch (NumberFormatException e) {
        }
        
        return false;

    }
    
    /**
     * Valida que la cedula tenga 10 dígitos
     * @param pCedula
     * @return Retornará true si la cedula es válida, caso contrario retornará false
     */
    public boolean validarCedula(String pCedula){
        return pCedula.matches("[0-9]{10}");
    }
    
}
