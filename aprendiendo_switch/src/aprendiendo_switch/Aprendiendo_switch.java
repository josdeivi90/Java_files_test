/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendiendo_switch;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Aprendiendo_switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int num1 = 5, num2=3,resultado=0;
        System.out.println("Ingrese su opcion");
        int parametro =enter.nextInt();
        
        
        switch(parametro){
            case 1: System.out.println("La suma es: "+(num1+num2));
                break;
            case 2: System.out.println("La resta es: "+(num1-num2));
                break;
            default: System.out.println("Esa monda no existe");
                break;
            
        }
        // TODO code application logic here
    }
    
}
