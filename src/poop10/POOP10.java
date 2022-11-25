/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

import java.util.Scanner;
import excepcionesPropias.SaldoInsuficienteException;
import excepcionesPropias.ExcesoDeposito;
import excepcionesPropias.MaxRetiro;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carmona Ayala Mariana Zoe, Lechuga Castillo Shareny Ixchel y Ochoa Lozano Miguel Angel
 */
public class POOP10 {

    public static void main(String[] args) {
        try{
            String mensajes[]={"Mensaje 1", "Mensaje 2", "Mensaje 3"};
            for(int i=0; i<=mensajes.length;i++){
                System.out.println(mensajes[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: apuntador fuera de los limites");
            //e.printStackTrace();
        }
        System.out.println("##########");
        try{
            float x =10/2;
            System.out.println("x="+x);
        }catch(ArithmeticException e){
            System.out.println("Error: no se puede dividir entre 0");
        }finally{
            System.out.println("Cualquier cosa que suceda entra al finally"); // Si la division es valida, no entra el catch
            //finally sirve para ejecutar una instruccion pase lo que pase
        }
        
        //Catch anidados
        System.out.println("######## Catch Anidados ##############");
        try{
            float x =10/0; //podemos tener dos variables x pq son variables locales
            System.out.println("x="+x);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: apuntador fuera de los limites");
            //e.printStackTrace();
        }catch(ArithmeticException e){
            System.out.println("Error: no se puede dividir entre 0");
        }
        
        //Excepcion
        System.out.println("######## Propagaciòn de Excepcion ##############");
        try{
            float division = metodoDivision(4,0); //creamos metodo static
            System.out.println("Division: "+division);
        }catch(ArithmeticException e){
            System.out.println("Excepcion que sucede en el metodo");
        }
        
        System.out.println("########### Excepciones Marcadas ##################");
        try{
            float div = metodoDivisionMarcada(5,0); //creamos metodo static
        }catch(ArithmeticException e){
            System.out.println("Excepcion de division entre 0 marcada");
        }
        
        //Creacion de excpeciones 
        // Actividad Practica 10
        System.out.println("----------------------------------------------------------");
        System.out.println("Actividad Práctica 10");
        Cuenta cuenta = new Cuenta(); 
        /*
        * Creamos una cuenta en ceros
        */
        System.out.println("\nSaldo de cuenta: $"+cuenta.getSaldo());
        
        /*
        * Con try-catch alertamos al usuario que está leyendo este código que pueden surgir errores de exceso de deposito, maximo de retiro y saldo insuficiente
        */
        try {
            cuenta.depositar(12_000);
        } catch (ExcesoDeposito ex) {
            System.out.println(ex.getMessage()); 
            /*
            * Con ayuda del ex.getMessage recuperamos el mensaje de la excepcion
            */
        }
        
        System.out.println("\nSaldo de cuenta: $"+cuenta.getSaldo());
        try{
            try{
                cuenta.retirar(2_000);
            }catch(MaxRetiro ex){
                System.out.println(ex.getMessage());
            }
        }catch(SaldoInsuficienteException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\nSaldo de cuenta: $"+cuenta.getSaldo());
        
        try{
            try{
                cuenta.retirar(8_000);
            }catch(MaxRetiro ex){
                System.out.println(ex.getMessage());
            }
        }catch(SaldoInsuficienteException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\nSaldo de cuenta: $"+cuenta.getSaldo());
        
        try{
            cuenta.depositar(80_976);
        }catch(ExcesoDeposito ex){
            System.out.println(ex.getMessage());
        }
        
        try{
            cuenta.depositar(19_000);
        }catch(ExcesoDeposito ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\nSaldo de cuenta: $"+cuenta.getSaldo());
        
        try{
            cuenta.retirar(12_000);
            cuenta.retirar(9_000);
            cuenta.retirar(8_000);
        }catch(SaldoInsuficienteException ex){
            System.out.println(ex.getMessage());
        }catch(MaxRetiro ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\nSaldo de cuenta: $"+cuenta.getSaldo());
    }

    private static float metodoDivision(int a, int b) {
        return a/b;
        
    }

    private static float metodoDivisionMarcada(int a, int b) throws ArithmeticException{
        return a/b;
    }
    
}
