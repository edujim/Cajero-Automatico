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
public class ClasePrincipal {
    public static void main(String[] args){
        ClasePadre_Abstracta mensajero = new Clasehija_Consulta();
        mensajero.setSaldo(500);
        mensajero.Operaciones();
        }
    
}
