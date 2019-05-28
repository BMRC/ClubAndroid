/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qwerty;

/**
 *
 * @author ALUMNO
 */
public class perro {
     public String raza;
     public String edad;
     public String color;

    public perro() {
    }

    public perro(String raza, String años, String color) {
        this.raza = raza;
        this.edad = años;
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getAños() {
        return edad;
    }

    public void setAños(String años) {
        this.edad = años;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

   
    
    
    
}
