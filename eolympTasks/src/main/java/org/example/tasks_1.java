package org.example;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class tasks_1 {
    public static void main(String[] args) {

        //TASK1
/*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int first = a / 100;
        int second = (a / 10) % 10;
        int third = a % 10;
        System.out.println(first + " " + second + " " + third);*/


//TASK 2
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int first = a/10;
        int second = a%10;
        System.out.print(first+second);
        System.out.print(" "+first*second);*/

//TASK3
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(10*(n%10)+n/10);*/

//TASK4

              /*  Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                if(n>=100 && n<1000){
                    System.out.println(n/100);
                }else{
                    System.out.println((n%1000)/100);
                }
            */


//TASK5
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int first = a % 10;
        int second = (a / 10) % 10;
        int third = a / 100;
        System.out.print(second + first + third);
        System.out.print(" " + second * first * third);*/

//TASK6
        /*Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        Scanner sc1 = new Scanner(System.in);
        float b = sc1.nextFloat();
        float c = a+b;
        DecimalFormat df = new DecimalFormat("#.0000");
        df.format(c);
        System.out.println(c);*/

//TASK7
        /*Scanner sc = new Scanner(System.in);
        float a  = sc.nextFloat();
        Scanner sc1 = new Scanner(System.in);
        float b = sc1.nextFloat();
        Scanner sc2 = new Scanner(System.in);
        float c = sc2.nextFloat();
        float res1 = a+b;
        float res2 = a+c;
        float res3 = b+c;*/


        /*DecimalFormat df = new DecimalFormat("#.0000");
        String sum1 = df.format(res1);
        String sum2 = df.format(res2);
        String sum3 = df.format(res3);
        System.out.print(sum1);
        System.out.print(" "+sum2);
        System.out.print(" "+sum3);*/

//TASK8
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        Scanner sc1 = new Scanner(System.in);
        float b = sc.nextFloat();
        Scanner sc2 = new Scanner(System.in);
        float c = sc.nextFloat();
        Scanner sc3 = new Scanner(System.in);
        float d = sc.nextFloat();

        float sum1 = a + b;
        float sum2 = a + b + c;
        float sum3 = a + b + c + d;

        DecimalFormat df = new DecimalFormat("#.0000");
        String res1 = df.format(sum1);
        String res2 = df.format(sum2);
        String res3 = df.format(sum3);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

//TASK9
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double pow1 = Math.pow(a%10,2);
        double pow2 = Math.pow((a/10)%10,2);
        double pow3 = Math.pow((a/100)%10,2);
        double pow4 = Math.pow(a/1000,2);
        int result = (int)(pow1+pow2+pow3+pow4);
        System.out.println(result);*/

//TASK10
        /*Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        char previous = (char) (ch - 1);
        char next = (char) (ch + 1);
        System.out.println(previous + " " + next);*/


//TASK11
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(a+1);*/

//TASK12
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(a-1);*/

//TASK13
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(a+b);*/

//TASK14
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b = ((a%10)*100)+a/10;
        System.out.println(b);*/

//TASK15
       /* Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a<0){
            System.out.println("Ice");
        }else if(a>=0){
            System.out.println("Water");
        }
*/
    }
}
