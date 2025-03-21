package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    String[]  original;
    String[] inverso;
    Scanner scanner;

    public Ejercicio2(){
        original = new String[5];
        inverso = new String[5];

        scanner = new Scanner(System.in);
    }

    public void ejecutar(){
        for (int i =0; i<original.length; i++){
            System.out.println("original [" +i+ "]: ");
            String cadena = scanner.nextLine();

            original[i] = cadena;
        }
        int indiceOrginal = 0;
        int indiceInverso = 4;
        while (indiceOrginal < original.length){
            inverso[indiceInverso] = original[indiceOrginal];

            indiceOrginal++;
            indiceInverso--;
        }
        for (int i=0; i<inverso.length; i++){
            System.out.println("inverso[" +i+ "]: " +inverso[i]);
        }
    }
}
