/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exce02;

/**
 *
 * @author user
 */
public class Array {
    private int[] lista = {1,8,9,0,7};
   

    
    public void asignar(int indice, int valor){
    
    try{
    lista[indice] = valor;
    
    }catch(ArrayIndexOutOfBoundsException a){
        System.out.println("Indice fuera de rango");
    }finally{
        System.out.println("El valor en la posicion " + indice + " es "+ valor);
    
    }
    
    }
    
}
