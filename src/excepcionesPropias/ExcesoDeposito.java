/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionesPropias;

/**
 *
 * @author Carmona Ayala Mariana Zoe, Lechuga Castillo Shareny Ixchel y Ochoa Lozano Miguel Angel
 */
public class ExcesoDeposito extends Exception{
    /*
    * Con ExcesoDeposito creamos mensaje que no se puede depositar mas de $20 000
    */
     public ExcesoDeposito() {
        super("\nNo se puede depositar mas de $20 000"); 
    }
}
