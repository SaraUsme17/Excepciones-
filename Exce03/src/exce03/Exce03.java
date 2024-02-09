/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exce03;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Exce03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número a");

        String a = leer.next();


        System.out.println("Ingrese el número b");
        String b = leer.next();
        
        int a1=Integer.parseInt(a);
        int b1=Integer.parseInt(b);
        
        DivisionNumero dn = new DivisionNumero();
        
        try{
                dn.division(a1, b1);
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir por cero");
        
        }catch(Exception e){
            System.out.println(e);
        }

        
    }
    
}
