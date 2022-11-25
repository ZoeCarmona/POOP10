/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionesPropias;

/**
 *
 * @author Carmona Ayala Mariana Zoe, Lechuga Castillo Shareny Ixchel y Ochoa Lozano Miguel Angel
 */
public class MaxRetiro extends Exception{
    /*
    * Con MaxRetiro creamos mensaje que solo podemos retirar max 3 veces
    */
    public MaxRetiro(){
        super("\nSolo puedes retirar dinero máximo 3 veces");
    }
}
