package org.example;

import java.util.ArrayList;

public class CombNum extends ListNum{

    ArrayList<Integer> num = getNumeros();
    void calcular(){
        System.out.println(num);
        for(int i = 0; i < num.size(); i++){
            System.out.println(num.get(i));
        }
    }
}
