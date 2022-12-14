/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversores;


/**
 *
 * @author Fabio
 */
public class Convertir {
    public void Conversion(String cadena){
        
        switch (cadena) {
            case "De Pesos a Dólar":
                System.out.println("Pesos a dolares");
                break;
            case "De Pesos a Euros":
                System.out.println("Pesos a Euros");
                break;    
            default:
                throw new AssertionError();
        }
        
        //return 0;
    }
}
