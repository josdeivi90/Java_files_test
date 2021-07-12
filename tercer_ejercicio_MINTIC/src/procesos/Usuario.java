/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

/**
 *
 * @author ADMIN
 */
public class Usuario {
    public static void main(String[] args){
        Gastos first = new Gastos();
        first.Data();
        first.Reducciones();
        System.out.println("Sr "+first.name +" con el salario de "+first.sueldo );
        System.out.println("para beber necesitas " + first.rumba +" y tienes "+ first.restante+ " Por lo tanto");
        first.farra();
        
        
    }
    
}
