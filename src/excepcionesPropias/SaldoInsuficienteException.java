/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionesPropias;

/**
 *
 * @author Carmona Ayala Mariana Zoe, Lechuga Castillo Shareny Ixchel y Ochoa Lozano Miguel Angel
 */
public class SaldoInsuficienteException extends Exception{
    /*
    * Con SaldoInsuficienteException creamos mensaje de saldo insuficiente
    */
    public SaldoInsuficienteException() {
        super("\nSaldo insuficiente"); //se guarda en message
    }
    
}
