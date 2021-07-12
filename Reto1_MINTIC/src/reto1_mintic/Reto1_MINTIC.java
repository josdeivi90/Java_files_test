/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1_mintic;

import java.util.Scanner;

/**
 *
 * @author David Angarita
 */
public class Reto1_MINTIC {

    /**
     * @param anios
     * @param bono
     * @return 
     */
    
    public static double calcularPorcentajeBono(int anios,float bono) {

        double porcentaje = 0;

        if(anios >= 10){
            porcentaje = 0.3;            
        }
        else if(anios >= 5 && anios <10){
            porcentaje = 0.2;
        }
        else if(anios >= 3 && anios <5){
            porcentaje = 0.1;
        }
        else if(anios < 3){
            porcentaje = 0.05;
        }
        
        
        return porcentaje*bono;

    }
    
    public static double uso_switch(int anios, int bono){
        String texto;
        switch(anios){
            case (10):
                texto = "tiene dies anios";
                break;
            case 3:
                System.out.println("tiene 10 anios");
                
                
        }
        
        return 0;
        
    }

 
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         
        int bono;
        System.out.println("Ingresa el valor del bono");
        bono = entrada.nextInt();
        int anio;
        System.out.println("Ingresa los años del trabajo");
        anio = entrada.nextInt();
        System.out.println(calcularPorcentajeBono(anio,bono));
    }
    
}
