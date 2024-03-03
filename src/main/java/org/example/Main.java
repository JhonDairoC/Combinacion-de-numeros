package org.example;

public class Main {
    public static void main(String[] args) {
        ListNum listadoNumeros = new ListNum();
        listadoNumeros.imputNumeros();
        CombNum combNum = new CombNum();
        combNum.calcular(listadoNumeros.getNumeros(), listadoNumeros.getEsperado());
    }
}