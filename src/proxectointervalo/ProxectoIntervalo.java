/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxectointervalo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jdominguezmartinan
 */
public class ProxectoIntervalo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
       // Operacion obx1=new Operacion();
        // obx1.dividir();
        
        OperacionChamadaMain obx2=new OperacionChamadaMain();
        try
        {
            obx2.DividirNoIntervalo();
        } catch(IntervaloException ex)
        {
            System.out.println("numerador non valido");
        }
        
        
        
    }
    
}
