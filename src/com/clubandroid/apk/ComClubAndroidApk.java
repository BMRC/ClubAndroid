/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clubandroid.apk;

import qwerty.perro;

/**
 *
 * @author ALUMNO
 */
public class ComClubAndroidApk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
       System.out.println("Hola mundo"); //esta funcion me ayuda a imprimir
       perro perro1 = new perro();
       perro perro2 = new perro ("shizu","mediano","2","cafe");
               
        System.out.println("la raza del perro es: " + perro2.getRaza());
        System.out.println("el tamaño del perro es:" + perro2.getTamaño());
        System.out.println("el color del perro es: " + perro2.getColor());
        System.out.println("la edad del perro es: " + perro2.getAños());
    
    int opcion = 0;
           
      do {
         System.out.println("Menu Principal");
      
         
      
      
      
      }while (opcion !=0);     
            
            
            
            
    
    }
    
    
    
    
    
    
    
    
}
