package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class tasks_4 {
    public static void main(String[] args) {
        //TASK1
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        int first;
        int second;
        int third;
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            first = i % 10;
            second = (i / 10) % 10;
            third = i / 100;
            if (first + second + third == num) {
                count++;
                list.add(i);
            }
        }
        System.out.println(count);
        for (Integer integer : list) {
            System.out.println(integer);
        }

/*TASK2
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();


        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = sc.nextInt();
            System.out.println(array[i]);
        }

//TASK3
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = sc.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for (int num : array) {
            System.out.print(num + " ");
        }

//TASK4
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int[] array = new int[count];

        int count2 = 0;

        for (int i = 0; i < count; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < count; i++) {
            if (array[i] > 0) {
                count2++;
            }
        }
        if (count2 == 0) {
            System.out.println("NO");
        } else {
            System.out.println(count2);
            for (int i = 0; i < count; i++) {
                if (array[i] > 0) {
                    System.out.print(array[i] + " ");
                }
            }
        }

//TASK5
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] array = new int[count];
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count2 = 0;
        for (int i = 0; i < count; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < count; i++) {
            if (array[i] < 0) {
                count2++;
                list.add(array[i]);
            }
        }
        int temp = 0;
        if (count2 == 0) {
            System.out.println("NO");
        } else {
            System.out.println(count2);
            list.reversed().forEach(num -> System.out.print(num + " "));
        }

//TASK6
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] array = new int[count];
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count2 = 0;
        for (int i = 0; i < count; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < count; i++) {
            if (array[i] % 2 == 0) {
                count2++;
                list.add(array[i]);
            }
        }
        int temp = 0;
        if (count2 == 0) {
            System.out.println("NO");
        } else {
            System.out.println(count2);
            list.reversed().forEach(num -> System.out.print(num + " "));
        }

//TASK7
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = sc.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(array[array.length - 1] - array[0]);

//TASK8
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = sc.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i = 0; i < 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                }
                if (array[array.length - 1] == array[j - 1]) {
                    array[j - 1] = 0;
                }
            }
        }
        int sum = 0;
        for (int i = 1; i < array.length - 1; i++) {
            sum += array[i];
        }
        System.out.println(sum);

//TASK9
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = sc.nextInt();
        }
        int[] array2 = new int[count];
        for (int i = 0; i < count; i++) {
            array2[i] = array[i];
        }
        int temp = 0;
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        int temp2 = 0;
        for (int i = 0; i < count; i++) {
            if (array2[i] == array[0]) {
                temp2 = array2[0];
                array2[0] = array2[i];
                array2[i] = temp2;
                break;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(array2[i] + " ");
        }

//TASK10
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < length / 2; i++) {
            temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }

//TASK11
        Scanner sc = new Scanner(System.in);
        int lenght = sc.nextInt();
        int[] array = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            array[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < lenght; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        int temp = 0;
        for (int i = lenght - 1; i >= 0; i--) {
            if (array[i] == max) {
                temp = array[i];
                array[i] = array[lenght - 1];
                array[lenght - 1] = temp;
                break;
            }
        }
        for (int i = 0; i < lenght; i++) {
            System.out.print(array[i] + " ");
        }

//TASK12
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        int addedValue = min / 2;
        for (int i = 0; i < length; i++) {
            array[i] -= addedValue;
            System.out.print(array[i] + " ");
        } */
    }
}






