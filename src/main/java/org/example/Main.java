package org.example;

public class Main {
    public static void main(String[] args) {
        int result = Sum(20);
            System.out.println(result);
        }

    public static int Sum(int k) {
        if ( k > 0){
            return k + Sum(k - 1 );
        }else {
            return 0;
        }
    }

    }
