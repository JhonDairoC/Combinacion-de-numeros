package org.example;

import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class CombNum extends ListNum{
    boolean bol;
    int num1;
    int num2;
    void comboSuma(int num1, int num2, int esperado){
        this.bol = num1 + num2 == esperado;
        if (bol)
            System.out.println("Combinación para " + esperado + ": " + num1 + "+" + num2);

    }
    void comboRest(int num1, int num2, int esperado){
        this.bol = num1 - num2 == esperado;
        if (bol)
            System.out.println("Combinación para " + esperado + ": " + num1 + "-" + num2);
    }

    void comboMulti(int num1, int num2, int esperado){
        this.bol = num1 * num2 == esperado;
        if (bol)
            System.out.println("Combinación para " + esperado + ": " + num1 + "*" + num2);
    }

    void comboDiv(int num1, int num2, int esperado){
        this.bol = num1 / num2 == esperado;
        if (bol)
            System.out.println("Combinación para " + esperado + ": " + num1 + "/" + num2);
    }

    void comboPorc(int num1, int num2, int esperado){
        this.bol = num1 % num2 == esperado;
        if (bol)
            System.out.println("Combinación para " + esperado + ": " + num1 + "%" + num2);
    }
    void calcular(ArrayList<Integer> num, int esperado){
        for(int i = 0; i < num.size(); i++){
            for (int j = i + 1; j < num.size(); j++){
                num1 = num.get(i);
                num2 = num.get(j);
                comboSuma(num1, num2, esperado);
                comboRest(num1, num2, esperado);
                comboMulti(num1, num2, esperado);
                comboDiv(num1, num2, esperado);
                comboPorc(num1, num2, esperado);
                if (bol) {
                    num.remove(i);
                    num.remove(j);
                    j--;
                }
            }
        }
        System.out.println("numeros uen no pueden ser convinados");
        System.out.println(num);
    }
}
