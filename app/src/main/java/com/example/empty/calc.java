package com.example.empty;

public class calc {
    public int plus(int a, int b) {
        int c = a + b;
        return c;
    }
    public int plus2(int a, int b) {
        int c = a + b;
        return c;
    }

    public int div(int a, int b){
        if (b == 0){
            return 0;
        }
        if (a >= 999 ){
            return 0;
        }
            
        else {
            int c = a / b;
            return c;
        }
    }

}
