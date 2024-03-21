package org.example;

import java.util.Scanner;

public class tasks_2 {
    public static void main(String[] args) {
        //TASK1
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a>=1 && a<=3){
            System.out.println("Initial");
        }else if(a>=4 && a<=6){
            System.out.println("Average");
        }else if(a>=7 && a<=9){
            System.out.println("Sufficient");
        }else{
            System.out.println("High");
        }*/

//TASK2
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a/100;
        int c = a%10;

        if(b>c){
            System.out.println(b);
        }else if(b<c){
            System.out.println(c);
        }else{
            System.out.println("=");
        }

//TASK3
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();
        byte b = sc.nextByte();
        byte c = sc.nextByte();

        if(a==b && b==c && a==c){
            System.out.println("1");
        }else if(a!=b && b!=c && a!=c){
            System.out.println("3");
        }else{
            System.out.println("2");
        }
*/
//TASK4
       /* Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if((a>=1 && a<=2) || a==12){
            System.out.println("Winter");
        }else if(a>=3 && a<=5){
            System.out.println("Spring");
        }else if(a>=6 && a<=8){
            System.out.println("Summer");
        }else if(a>=9 && a<=11){
            System.out.println("Autumn");
        }

//TASK5
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String first = (a%2==0) ? "even" : "odd";
        String second = (b%2==0) ? "even" : "odd";
        String third = (c%2==0) ? "even" : "odd";

        if(first == second && second==third){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }

//TASK6
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();

        if(a>=1 && a<=3){
            System.out.println("First");
        }else if(a>=4 && a<=6){
            System.out.println("Second");
        }else if(a>=7 && a<=9){
            System.out.println("Third");
        }else{
            System.out.println("Fourth");
        }

//TASK7
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();

        switch (a){
            case 1 : {
                System.out.println("January");
                break;
            }
            case 2 : {
                System.out.println("February");
                break;
            }
            case 3 : {
                System.out.println("March");
                break;
            }
            case 4 : {
                System.out.println("April");
                break;
            }
            case 5 : {
                System.out.println("May");
                break;
            }
            case 6 : {
                System.out.println("June");
                break;
            }
            case 7 : {
                System.out.println("July");
                break;
            }
            case 8 : {
                System.out.println("August");
                break;
            }
            case 9 : {
                System.out.println("September");
                break;
            }
            case 10 : {
                System.out.println("October");
                break;
            }
            case 11 : {
                System.out.println("November");
                break;
            }
            case 12 : {
                System.out.println("December");
                break;
            }
        }

//TASK8
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.print(b);
            System.out.print(" " + a);
        } else if (a < b) {
            System.out.print(a);
            System.out.print(" " + b);
        }

//TASK9
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b = a%100;
        int c = (a%1000)/10;
        int d = a/100;

        if(b==37 || c==37 || d==37){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

//TASK10
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b = (a/10)%10;
        int c = (a/100)%10;
        int d = a/1000;

        if(a%2==0 && b%2==0 && c%2==0 && d%2==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

//TASK11
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b = (a/10)%10;
        int c = (a/100)%10;
        int d = a/1000;

        if(a%2==1 || b%2==1 || c%2==1 || d%2==1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

//TASK12
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a%2!=0 || (a>=0 && a/1000<1 && a/100>=1)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

//TASK13
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a%3==0 && a%2==0 && a>=10 && a<100){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }*/

//TASK14
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if((a%2!=0 || a<0) && (a%2==0 || a>0)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        //TASK15
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a > 0 || b > 0 || c > 0) && (a < 0 || b < 0 || c < 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }*/
    }
}