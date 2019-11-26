/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Ronny
 */
public interface Factory <T> {
    
    public T crear(String pDato1, String pDato2, 
            String pDato3, boolean pDato4, String pDato5, 
            String pDato6, String pDato7, String pDato8);
    
}
