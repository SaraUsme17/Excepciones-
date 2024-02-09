/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exce04;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Exce04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        try {
            System.out.println("Ingrese un número a");
            int a = leer.nextInt();
            System.out.println("Ingrese un número b");
            int b = leer.nextInt();
            
            System.out.println("Ingrese una cadena");
            String cadena = leer.next();
            int cadenaC = Integer.parseInt(cadena);
            
            int division = a/b;

        } catch (InputMismatchException e) {
            System.out.println("Dato inválido. Se debe ingresar un número");

        }catch(NumberFormatException e){
            System.out.println("La cadena no se puede convertir a entero");
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir por cero");
        }



    }
    
}
