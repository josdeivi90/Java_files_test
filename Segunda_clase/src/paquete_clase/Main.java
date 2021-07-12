/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_clase;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args){
        Alu cal = new Alu();
        
        cal.Datos();
        System.out.println("la suma es :" + cal.Suma());
        System.out.println("la resta es : "+cal.Resta());
        System.out.println("La multiplicacion es: " +cal.Multiplicar());
        System.out.println("La Division es : "+cal.Dividir());
        
    }
    
}
