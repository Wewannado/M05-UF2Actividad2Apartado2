/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m05uf2actividad2apartado2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Roger G. Coscojuela
 */
public class M05UF2Actividad2Apartado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DNI dni = new DNI("46947903G");
        try {
            dni.esValid();
        } catch (IncorrectNumericalDataException | IncorrectFormatLengthException ex) {
            Logger.getLogger(M05UF2Actividad2Apartado2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
