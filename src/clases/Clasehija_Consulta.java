/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Usuario
 */
public class Clasehija_Consulta extends ClasePadre_Abstracta {
    @Override
    public void Transacciones (){
        System.out.println("---------------------------------");
        System.out.println("Tu saldo actual es:" + getSaldo());
        System.out.println("---------------------------------");
        }
    
}
