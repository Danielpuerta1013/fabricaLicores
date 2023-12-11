package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner leerDato = new Scanner(System.in);
        System.out.println("Bienvenido a su programa de fabricación de cerveza");
        System.out.println("ingrese que tipo de cerveza es");
        String tipoCerveza = leerDato.nextLine();
        System.out.println("ahora ingrese cuantos grados de alcohol va a tener su cerveza tipo "+ tipoCerveza);
        short gradosAlcohol =leerDato.nextShort();
        System.out.println("Ahora ingrese la temperatura en grados Celcius a la que se va a producir");
        short temperaturaCerveza = leerDato.nextShort();
        System.out.println(" su cerveza es de tipo: "+ tipoCerveza+" con: "+ gradosAlcohol+ " grados de alcohol");
        System.out.println("y se va a producir a: "+ temperaturaCerveza+" grados Celcius");



    }
}