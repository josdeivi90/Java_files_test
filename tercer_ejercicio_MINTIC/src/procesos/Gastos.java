/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Gastos {
    String name;
    float sueldo;
    float restante;
    float carnes;
    float lacteos;
    float aseo;
    int rumba = 200000;
    
    public void Data(){
        Scanner enter = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        name = enter.nextLine();
        System.out.println("Ingrese el salario: ");
        sueldo = enter.nextFloat();
    }
    
    public float Reducciones(){
        carnes = (float) (sueldo * 0.2);
        lacteos = (float) (sueldo * 0.3);
        aseo = (float) (sueldo * 0.3);
        
        return (restante = sueldo - carnes - lacteos - aseo);
    }
    
    public void farra(){
        if(restante >= rumba){
            System.out.println("Si alcanza para salir de farra");
        }
        else{
            System.out.println("Sigue participando");
        }
    }
    
    
}
