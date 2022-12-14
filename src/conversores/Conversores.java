/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversores;

import javax.swing.JOptionPane;

/**
 *
 * @author Fabio
 */
public class Conversores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Object color = JOptionPane.showInputDialog(null,"Seleccione Un Color",
         "COLORES", JOptionPane.QUESTION_MESSAGE, null,
      new Object[] { "Seleccione","Amarillo", "Azul", "Rojo" },"Seleccione");

    }
    
}
