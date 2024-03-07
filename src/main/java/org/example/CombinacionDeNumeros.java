package org.example;

import java.util.ArrayList;

public class CombinacionDeNumeros {
    Integer num1;
    Integer num2;
    ArrayList<Integer> numUsuados = new ArrayList<>();
    int esperado;
    int i;
    boolean combinarSuma(){
        if (num1 + num2 == esperado) {
            System.out.println("Combinación para " + esperado + ": " + num1 + "+" + num2);
            numUsuados.remove(num1);
            numUsuados.remove(num2);
            i -= 1;
        }
        return num1 + num2 == esperado;

    }
    boolean combinarResta(){
        if (num1 - num2 == esperado) {
            System.out.println("Combinación para " + esperado + ": " + num1 + "-" + num2);
            numUsuados.remove(num1);
            numUsuados.remove(num2);
            i -= 1;
        }
        return num1 - num2 == esperado;
    }
    boolean combinarMultiplicacion(){
        if (num1 * num2 == esperado) {
            System.out.println("Combinación para " + esperado + ": " + num1 + "*" + num2);
            numUsuados.remove(num1);
            numUsuados.remove(num2);
            i -= 1;
        }
        return num1 * num2 == esperado;
    }
    boolean combinarDivicion(){
        if (num1 / num2 == esperado) {
            System.out.println("Combinación para " + esperado + ": " + num1 + "/" + num2);
            numUsuados.remove(num1);
            numUsuados.remove(num2);
            i -= 1;
        }
        return num1 / num2 == esperado;
    }

    protected ArrayList<Integer> getNumUsados(){
        return numUsuados;
    }
    void calcular(ArrayList<Integer> num, int esperado){
        this.i = 0;
        numUsuados.addAll(num);
        this.esperado = esperado;
        for(; i < numUsuados.size();i++){
            interno:for (int j = 1; j < numUsuados.size();j++){
                num1 = numUsuados.get(i);
                num2 = numUsuados.get(j);
                if(combinarSuma())
                    break interno;
                if(combinarResta())
                    break interno;
                if(combinarMultiplicacion())
                    break interno;
                if(combinarDivicion())
                    break interno;
            }
        }
        System.out.println("numeros que no pueden ser convinados");
        System.out.println(numUsuados);
    }
}
