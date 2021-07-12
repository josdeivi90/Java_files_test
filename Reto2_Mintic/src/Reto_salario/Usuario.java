/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto_salario;

/**
 *
 * @author ADMIN
 */
public class Usuario{
    String Nombre;
    int identificacion;
    String email;
    int edad;
    String area;
    boolean jefe_area;
    float salud;
    float sueldo;
    float solidaridad;
    
    public Usuario(){}
    public Usuario(String Nombre,int identificacion, String email, int edad, String area, boolean jefe_area){
        this.Nombre = Nombre;
        this.edad = edad;
        this.identificacion = identificacion;
        this.email = email;
        this.area = area;
        this.jefe_area = jefe_area;
    }
    
    public void info(){
        System.out.println("[Usuario]:");
        System.out.println("Nombre: "+ this.Nombre);
        System.out.println("Identificacion: "+ this.identificacion);
        System.out.println("Email: "+ this.email);
        System.out.println("Edad: "+ this.edad);
        System.out.println("Area: "+ this.area);
        
        if("desarrollo".equals(this.area)){
            
            if(this.jefe_area){
                
                salud = (float) (7000000*0.08);
                solidaridad = (float) (7000000*0.01);
                sueldo = 7000000 - salud - solidaridad;
                System.out.println("Salario: "+(sueldo));
            }
            else{
                salud = (float) (4500000*0.08);
                solidaridad = (float) (4500000*0.01);
                sueldo = 4500000 - salud - solidaridad;
                System.out.println("Salario: "+sueldo);                
            }
            
        }
        else if("administrativa".equals(this.area)){
            if(this.jefe_area){
                
                salud = (float) (6500000*0.08);
                solidaridad = (float) (6500000*0.01);
                sueldo = 6500000 - salud - solidaridad;
                System.out.println("Salario: "+(sueldo));
            }
            else{
                salud = (float) (3500000*0.08);
                solidaridad = (float) (3500000*0.01);
                sueldo = 3500000 - salud ;
                System.out.println("Salario: "+sueldo);                
            }
        }
            
  
        
    }
    
    
    
    
}
