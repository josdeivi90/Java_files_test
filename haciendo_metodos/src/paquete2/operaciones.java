/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class operaciones {
    int numero1;
    int numero2;
    int suma;
    int resta;
    
    public void Ingreso_Datos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer valor \n");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese el segundo valor \n");
        numero2 = entrada.nextInt();
    }
    
    public void Suma(){
        suma = numero1 + numero2;
    }
    
    public void Resta(){
        resta = numero1 - numero2;
    }
    
    public void Mostrar(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
    }
    
}
