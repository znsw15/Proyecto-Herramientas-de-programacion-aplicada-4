package com.example.proyecto1zsjn;

import java.io.Serializable;

public class Usuario{

    public static int cand1=0, cand2=0, cand3=0;


    public Usuario(){

    }

    public static int getCand1() {
        return cand1;
    }

    public static void setCand1(int cand1) {
        Usuario.cand1 = cand1;
    }

    public static int getCand2() {
        return cand2;
    }

    public static void setCand2(int cand2) {
        Usuario.cand2 = cand2;
    }

    public static int getCand3() {
        return cand3;
    }

    public static void setCand3(int cand3) {
        Usuario.cand3 = cand3;
    }
}
