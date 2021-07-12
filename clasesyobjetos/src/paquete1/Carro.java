/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *Ejercicio 1
Crear una clase de nombre Casa y un paquete de nombre PartesdeCasa
Crear 3 objetos con sus atributos de nombre 
Nombre del objeto1 puerta
Atributo 1 color
Atributo 2 material

Nombre del objeto2 techo
Atributo 1 color
Atributo 2 material


Nombre del objeto3 piso
Atributo 1 color
Atributo 2 material

Ingreso de datos Puerta color verde material metálico
Techo color verde material barro
Piso color ladrillo material tableta
Imprima los valores asignados a cada objeto

 * @author David
 */
public class Carro {
    String marca;
    String color;
    int largo;
    
    public static void main(String[] args){
        Carro carro1 = new Carro();
        carro1.color = "azul";
        carro1.largo = 5;
        carro1.marca = "Mercedes-Benz";
        System.out.println("El color del carro es "+carro1.color);
        System.out.println("La marca del carro es "+carro1.marca);
        System.out.println("El largo del carro es "+carro1.largo);
        
    }
    
}
