/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public abstract class ClasePadre_Abstracta {

    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);

    public void Operaciones() {
        int bandera = 0;
        int seleccion = 0;
        do {
            do {
                System.out.println("Por favor seleccione una opcion:");
                System.out.println("    1.Consulta de Saldo:");
                System.out.println("    2.Retiro de efectivo:");
                System.out.println("    3.Deposito en efectivo:");
                System.out.println("    4.Salir");
                seleccion = entrada.nextInt();
                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;

                } else {
                    System.out.println("------------------------------------------------");
                    System.out.println("Opcion no disponible vuelva a intentar por favor");
                    System.out.println("------------------------------------------------");
                }
            } while (bandera == 0);
            
            if (seleccion == 1) {
                ClasePadre_Abstracta mensajero = new Clasehija_Consulta();
                mensajero.Transacciones  ();
            } else if (seleccion == 2) {
                ClasePadre_Abstracta mensajero = new Clasehija_Retiro();
                mensajero.Transacciones  ();
            } else if (seleccion == 3) {
                Clasehija_Deposito mensajero = new Clasehija_Deposito();
                mensajero.Transacciones  ();
            } else if (seleccion == 4) {
                System.out.println("----------------------");
                System.out.println("Gracias vuelva pronto.");
                System.out.println("----------------------");
                bandera = 2;
            }
        } while (bandera != 2);
    }

    public void Retiro() {
        retiro = entrada.nextInt();
    }

    public void Deposito() {
        deposito = entrada.nextInt();
    }

    public abstract void Transacciones();

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
