package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Validaciones {
    private boolean bol = true;
    private int numeroEsperado;
    StringBuilder error = new StringBuilder();
    public boolean getBol(){
        return bol;
    }
    void validarScanner(Scanner sc) {
        if(sc.hasNextInt()){
            error = new StringBuilder();
            numeroEsperado = sc.nextInt();
            this.bol = (numeroEsperado == 0);
            if(getBol()){
                error = new StringBuilder("Ingrese un numero valido");
            }
        } else {
            error = new StringBuilder("Ingrese un numero valido");
            this.bol = true;
        }

    }
    void setBol(boolean bol){
        this.bol = bol;
    }
    public int getNumeroEsperado(){
        return numeroEsperado;
    }

    public boolean validarCombinacion(ArrayList<Integer> array1, ArrayList<Integer>array2){
        if(array1.equals(array2)){
            error = new StringBuilder("Los nuemeros ingresados no pueden ser combinados ingresa mas numeros");
        }else {
            error = new StringBuilder();
        }
        return this.bol = array1.equals(array2);
    }
}
