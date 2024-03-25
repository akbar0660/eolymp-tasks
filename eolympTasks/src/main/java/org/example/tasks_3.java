package org.example;

import java.util.Scanner;

public class tasks_3 {
    public static void main(String[] args) {
        //TASK1
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count=0;
        int sum=0;
        while(a>0){
            sum = sum(a);
            a -= sum;
            count+=1;
        }
        System.out.println(count);



//TASK2
        /*Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        int count = 0;
        double exponent = 0;
        int roundedExponent;
        int closestPower = 0;
        while (num >= 1) {
            exponent = Math.log(num) / Math.log(2);
            roundedExponent = (int) Math.floor(exponent);
            closestPower = (int) Math.pow(2, roundedExponent);
            num -=closestPower;
            count++;
        }
        System.out.println(count);

//TASK3
        Scanner s = new Scanner(System.in);
        double num1 = s.nextInt();
        double num2 = s.nextInt();
        long sum = (long)(((num1+num2)/2)*(num2-num1+1));
        System.out.println(sum);

//TASK4
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        long sum = 0;
        if (num1 % 2 == 0 && num2 % 2 == 0) {
            sum = (long) (((num2 - num1) / 2) * ((num1 + num2) / 2));
        } else if (num1 % 2 != 0 && num2 % 2 != 0) {
            sum = (long) (((num2 - num1 + 2) / 2) * ((num1 + num2) / 2));
        } else if(num1%2==0 && num2%2!=0) {
            sum = (long) (((num2 - num1 + 1) / 2) * ((num1 + num2+1) / 2));
        }else{
            sum = (long) (((num2 - num1 - 1) / 2) * ((num1 + num2+1) / 2));
        }
        System.out.println(sum);

//TASK5
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 1;
        for(int i=1;i<=a/2;i++){
            if(a%i==0){
                count++;
            }
        }
        System.out.println(count);

//TASK6
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i = 1;i<=a;i++){
            if(a%i==0 && i%2!=0) {
                System.out.println(i);
            }
        }*/

    }
    //TASK1
    public static int sum(int a){
        int remainder = 0;
        int sum = 0;
        while (a >=1) {
            remainder = a % 10;
            a = a / 10;
            sum += remainder;
        }
        return sum;
    }
}
