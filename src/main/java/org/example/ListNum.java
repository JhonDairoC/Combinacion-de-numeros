package org.example;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ListNum extends Validaciones{
    private ArrayList<Integer> numeros = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private int esperado;
    void imputNumeros(){
        do{
            if(getBol())
                System.err.println("Ingrese un numero valido");

            System.out.println("Ingerese el numero esperado \nEl numero debe ser mayor a 0");
            sc = new Scanner(System.in);
            valScanner(sc);
            if(!getBol())
                this.esperado = getI();
        }while (getBol());

        do {
            int i = 1;
            if(getBol())
                System.err.println("Ingrese un numero valido");
            System.out.println("Ingresa el listado de numeros para la comparativa");

            do{
                System.out.println("Para salir del bucle escribe una letra");
                System.out.println("Ingresa el numero " + i++);
                sc = new Scanner(System.in);
                valScanner(sc);
                if(!getBol())
                    numeros.add(getI());
            }while (!getBol());
            setBol(false);
        }while (getBol());

    }
    public int getEsperado(){
        return esperado;
    }

    public ArrayList<Integer> getNumeros(){
        return numeros;
    }


}
