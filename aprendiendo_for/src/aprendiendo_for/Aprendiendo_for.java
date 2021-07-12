/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendiendo_for;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Aprendiendo_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Ingrese el valor hasta donde desea ver");
        int num1 = enter.nextInt();
        
        for(int i = 1; i <= num1; i++){
            System.out.print(i+",");
        }
        
        // TODO code application logic here
    }
    
}
