/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_clase;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Alu {
    float numero1;
    float numero2;
    int suma;
    int resta;
    float multiplicacion;
    float division;
    
    /* AQUI SE PROGRAMAN LOS METODOS */
    public void Datos(){
        Scanner enter = new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
        numero1 = enter.nextFloat();
        System.out.println("Ingrese el segundo valor");
        numero2 = enter.nextFloat();
        
    }
    
    public int Suma(){
        suma = (int) (numero1 + numero2);
        return suma;
    }
    
    public int Resta(){
        resta = (int) (numero1 - numero2);
        return resta;
    }
    
    public float Multiplicar(){
        multiplicacion = numero1 * numero2;
        return multiplicacion;
    }
    
    public float Dividir(){
        division = numero1 / numero2;
        return division;
    }
    
    
}
