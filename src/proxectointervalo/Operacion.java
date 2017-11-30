/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxectointervalo;


import javax.swing.JOptionPane;

/**
 *
 * @author jdominguezmartinan
 */
public class Operacion
{
    private int numerador;
    private int denominador;

    public Operacion()
    {
    }
    
    
    
    public void dividir() throws IntervaloException
    {
        numerador = Integer.parseInt(JOptionPane.showInputDialog("Teclea o numerador"));
        denominador = Integer.parseInt(JOptionPane.showInputDialog("Teclea o denominador"));
         try
        {
        if(numerador<20 || numerador>100)
        {
            throw new IntervaloException("numerador non valido");
        }
       
            System.out.println("resultado = "+numerador/denominador);
        }catch(IntervaloException e)
        {
            System.out.println("numerador non valido");
        }
        
    }

        
          
    }
    

