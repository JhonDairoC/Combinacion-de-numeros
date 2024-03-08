package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class ListadoDeNumeros extends Validaciones{
    private ArrayList<Integer> numeros = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private int esperado;
    CombinacionDeNumeros combinacionDeNumeros = new CombinacionDeNumeros();

    public int getEsperado(){
        return esperado;
    }

    public ArrayList<Integer> getNumeros(){
        return numeros;
    }
    void imputNumeros(){
            do {
                if (!error.isEmpty()) {
                    System.err.println(error);
                }
                System.out.println("Ingerese el numero esperado \nEl numero debe ser mayor a 0");
                sc = new Scanner(System.in);
                validarScanner(sc);
                if (!getBol())
                    this.esperado = getNumeroEsperado();
            } while (getBol());

            System.out.println("Ingresa el listado de numeros enteros para la comparativa");
            int i = 1;

            do {
                if (!error.isEmpty())
                    System.err.println(error);
                System.out.println("\nPara salir del bucle escribe el numero '0'");
                System.out.println("Ingresa el numero entero en la posicion " + i);
                sc = new Scanner(System.in);
                validarScanner(sc);

                validation:if (getNumeroEsperado() == 0) {
                    combinacionDeNumeros.calcular(getNumeros(), getEsperado());
                    if (validarCombinacion(getNumeros(), combinacionDeNumeros.getNumUsados())) {
                        combinacionDeNumeros.numUsuados.clear();
                        break validation;
                    }
                } else {
                    if (!getBol()) {
                        numeros.add(getNumeroEsperado());
                        i += 1;
                        setBol(true);
                    }
                }
            } while (getBol());

        do {
            if(!error.isEmpty())
                System.err.println("Ingrese un numero valido");

            System.out.println("\nQuieres intentarlo de nuevo?");
            System.out.println("1. Si");
            System.out.println("2. No");
            sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                if (i == 1){
                    numeros.clear();
                    combinacionDeNumeros.numUsuados.clear();
                    imputNumeros();
                } else if (i == 2) {
                    setBol(true);
                    break;
                }else {
                    setBol(false);
                }
            }else{
                setBol(false);
            }
        }while (!getBol());
    }
}