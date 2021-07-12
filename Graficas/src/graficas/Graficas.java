/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficas;

import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Graficas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Ingresa tu cadena");
        JOptionPane.showMessageDialog(null, "Tu mensaje "+word);
        // TODO code application logic here
        int entero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu entero"));
        JOptionPane.showMessageDialog(null, "Tu mensaje "+entero);

    }
    
}
