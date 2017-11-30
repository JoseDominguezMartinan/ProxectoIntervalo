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
public class OperacionChamadaMain
{
     private int numerador;
    private int denominador;

    public OperacionChamadaMain()
    {

    }

    public void DividirNoIntervalo() throws IntervaloException
    {
        numerador = Integer.parseInt(JOptionPane.showInputDialog("Teclea o numerador, recorda que ten que ser entre 20 e 100"));
        denominador = Integer.parseInt(JOptionPane.showInputDialog("Teclea o denominador"));

        if(numerador<20 || numerador>100)

        {
            throw new IntervaloException("***numerador non valido ***");
        }

        System.out.println("resultado = "+numerador/denominador);
    }
}    

