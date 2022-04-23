/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Metodes {

    static Scanner sc = new Scanner(System.in);

    public static String mostrarOpcions() {
        System.out.println("\n Quina operació vols realitzar? (Indica el signe)");
        System.out.println("+ = sumar \n - = restar \n"
                + " x = multiplicar \n / = dividir \n * = elevar primer num al segon num."
                + "\n % = residu");

        return sc.nextLine();
    }

    public static String demanarPrimerNum() {

        System.out.print("\n Introdueix el primer numero: ");

        return sc.nextLine();
    }

    public static String demanarSegonNum() {

        System.out.print("\n Introdueix el segon numero: ");

        return sc.nextLine();
    }

    public static void resultat(String numero1, String operacion, String numero2, double res) {
        System.out.println("Operació: (" + numero1 + ") " + operacion + " (" + numero2 + ")" + " = " + res);
    }

    public static void seguirOperant() {
        System.out.println("\n Vols continuar operant? \n");
        System.out.println(" [s/n]");
    }
}
