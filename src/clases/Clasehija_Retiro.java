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
public class Clasehija_Retiro extends ClasePadre_Abstracta {

    @Override
    public void Transacciones() {
        System.out.print("Cuanto deseas retirar:");
        Retiro();
        if (retiro <= getSaldo()) {
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            System.out.println("-------------------------------");
            System.out.println("Retirastes:" + retiro);
            System.out.println("Tu saldo 3"
                    + "actual es:" + getSaldo());
            System.out.println("-------------------------------");
        } else {
            System.out.println("--------------------");
            System.out.println("Saldo insuficiente.");
            System.out.println("--------------------");
        }
    }

}
