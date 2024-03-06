package org.example;

import java.util.ArrayList;

public class CombinacionDeNumeros {
    Integer num1;
    Integer num2;
    ArrayList<Integer> numUsuados = new ArrayList<>();
    int esperado;
    void combinarSuma(){
        if (num1 + num2 == esperado) {
            System.out.println("Combinación para " + esperado + ": " + num1 + "+" + num2);
            numUsuados.remove(num1);
            numUsuados.remove(num2);
        }

    }
    void combinarResta(){
        if (num1 - num2 == esperado) {
            System.out.println("Combinación para " + esperado + ": " + num1 + "-" + num2);
            numUsuados.remove(num1);
            numUsuados.remove(num2);
        }
    }
    void combinarMultiplicacion(){
        if (num1 * num2 == esperado) {
            System.out.println("Combinación para " + esperado + ": " + num1 + "*" + num2);
            numUsuados.remove(num1);
            numUsuados.remove(num2);
        }
    }
    void combinarDivicion(){
        if (num1 / num2 == esperado) {
            System.out.println("Combinación para " + esperado + ": " + num1 + "/" + num2);
            numUsuados.remove(num1);
            numUsuados.remove(num2);
        }
    }

    protected ArrayList<Integer> getNumUsados(){
        return numUsuados;
    }
    void calcular(ArrayList<Integer> num, int esperado){
        System.out.println(num);
        numUsuados.addAll(num);
        this.esperado = esperado;
        for(int i = 1; i < numUsuados.size();i++){
            for (int j = 1; j < numUsuados.size(); j++){
                num1 = numUsuados.get(i-1);
                num2 = numUsuados.get(j);
                combinarSuma();
                combinarResta();
                combinarMultiplicacion();
                combinarDivicion();
            }
        }
        System.out.println("numeros quen no pueden ser convinados");
        System.out.println(numUsuados);
    }
}
