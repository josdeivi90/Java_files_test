/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Partesdelacasa;

/**
 *Crear una clase de nombre Casa y un paquete de nombre PartesdeCasa
Crear 3 objetos con sus atributos de nombre 
Nombre del objeto1 puerta
Atributo 1 color
Atributo 2 material
 * @author ADMIN
 */
public class Casa {
    String color;
    String material;
    
    public static void main(String[] args){
        Casa puerta = new Casa();
        Casa techo = new Casa();
        Casa piso = new Casa();
        puerta.color = "verde";
        puerta.material="metalico";
        techo.color="verde";
        techo.material = "barro";
        piso.color = "Ladrillo";
        piso.material = "tableta";
        
        System.out.println("this is your new home with ceil in "+ techo.material + "and color "+techo.color + "\nand door in "+ puerta.color);
    }
    
    
}
