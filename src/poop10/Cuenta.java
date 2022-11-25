/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

import excepcionesPropias.SaldoInsuficienteException;
import excepcionesPropias.ExcesoDeposito;
import excepcionesPropias.MaxRetiro;

/**
 *
 * @author Carmona Ayala Mariana Zoe, Lechuga Castillo Shareny Ixchel y Ochoa Lozano Miguel Angel
 */
class Cuenta {
    private double saldo;
    private int retiros;

    public Cuenta() {
    } //inicia saldo en 0
    
    public void retirar(double monto) throws SaldoInsuficienteException, MaxRetiro{
        int ret = 0;
        System.out.println("\n*** Retirando ..... $"+monto+" ***");
        /*if(saldo < monto)
            throw new SaldoInsuficienteException(); //importamos desde el otro paquete
            //Lanzamos un nuevo saldoInsuficienteException, se alamacena
        else
            this.saldo -= monto;*/
        
        if(this.retiros >=3){
            throw new MaxRetiro();
        }
        
        if(saldo < monto){
            throw new SaldoInsuficienteException();
        }else
            this.saldo -= monto;
            this.retiros +=1;
            
    }
    
    public void depositar(double monto) throws ExcesoDeposito{
        System.out.println("\n*** Depositando ...... $"+monto+"***");
        if(monto > 20_000){ 
            throw new ExcesoDeposito();
        }else{
           this.saldo += monto; 
        }
        
    }

    public double getSaldo() {
        return saldo;
    }

    public int getRetiros() {
        return retiros;
    }
    
    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }
   
}
