package com.company;

public class Main {

    public static void main(String[] args) {
        Double[] array = {-8.4, 4.54, 4.56, 5.44, 4.4, 3.5, -5.4, 6.5, -5.4, 9.4, -4.2, -9.2, 5.2, 4.1, 5.6
        };
        double kol = 0.0;
        double sum = 0.0;
        boolean switchh = true;
        for (double num : array) {
            if (num < 0) {
switchh = true;


            }else {if (switchh==true){
                kol++;
                sum+= num;
            }

            }
        }
        System.out.println(sum/ kol);
    }
}