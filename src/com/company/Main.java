package com.company;


public class Main {

    public static void main(String[] args) {
        double[] numbers = {1.8, -2.5, -4.2, 2.3, 3.5, 6.7, -7.2, 9.5, -11.11, 13.4, -5.6, 1.4, 15.7, -17.6, 19.3};

        double num = 0;
        double number = 0;
        boolean number1 = false;

        for (double arr : numbers) {
            if (arr < 0)
            {
                number1 = true;

              } else { if (number1) {
                    number++; //8
                    num += arr;
              }
              }
        }

        System.out.println(num/number);

    }
 


}



        








