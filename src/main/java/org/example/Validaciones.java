package org.example;

import java.util.Scanner;

public class Validaciones {
    private boolean bol;
    private int i;
    public boolean getBol(){
        return bol;
    }
    void valScanner(Scanner sc) {
        this.bol = !sc.hasNextInt() || (i = sc.nextInt()) <= 0;
    }

    public int getI(){
        return i;
    }

    void setBol(boolean bol){
        this.bol = bol;
    }
}
