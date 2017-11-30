/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxectointervalo;

/**
 *
 * @author jdominguezmartinan
 */
public class IntervaloException extends Exception
{
    public IntervaloException()
    {
        super("información da excepción");
    }
    public IntervaloException(String mensaxe)
    {
        super(mensaxe);
    }

    
}
