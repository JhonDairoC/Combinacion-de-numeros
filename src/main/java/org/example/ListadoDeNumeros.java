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
        do{
            if(!error.isEmpty()){
                System.err.println(error);
            }
            System.out.println("Ingerese el numero esperado \nEl numero debe ser mayor a 0");
            sc = new Scanner(System.in);
            valScanner(sc);
            if(getBol())
                this.esperado = getNumeroEsperado();
        }while (!getBol());

        System.out.println("Ingresa el listado de numeros para la comparativa");
        int i = 1;

        do{
            if(!error.isEmpty()){
                System.err.println(error);
            }
            System.out.println("Para salir del bucle escribe el numero '0'");
            System.out.println("Ingresa el numero en la posicion "+ i);
            sc = new Scanner(System.in);
            valScanner(sc);
            if(getNumeroEsperado() == 0) {
                combinacionDeNumeros.calcular(getNumeros(), getEsperado());
                if(validacionCombinacion(getNumeros(), combinacionDeNumeros.getNumUsados())){
                    break;
                }
            }else {
                if (getBol()) {
                    numeros.add(getNumeroEsperado());
                    i += 1;
                    setBol(false);

                }
            }
        } while(!getBol());
    }
}