package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();//рандом
        int[]numbers = new int[10]; // размер массива
        for (int i = 0 ; i<10; i++){//заполнение массива случайнными числами

            numbers[i] = rand.nextInt(101);

        }
        float sum1 = 0f;//0.5 ---> числа меньше 50
        float sum2 = 0f; //числа больше -->50
        int counter1 = 0;
        int counter2 = 0;
        for(int i = 0; i<10; i++){
            System.out.println(numbers[i] + "");
            if (numbers[i] < 50) {
                sum1 = sum1 + numbers[i];
                counter1++;
            }
            else{
                sum2 = sum2 +numbers[i];
                counter2++;
            }
        }
//        System.out.println("\naverage(n<50):) :" + sum1/counter1);
//        System.out.println("\naverage(n<50):) :" + sum2/counter2);
//        int number = sc.nextInt();
//        int []A = {1,4,6,7,4};
//        int i = 0;
//        while (A[i] != number){
//            i++;
//            System.out.println("A[" + i + "] = " + number);
//        }
//        Random random = new Random();
//        int num = 36 + random.nextInt(100 - 36);
//        System.out.println(num);
//        Random aksakal = new Random();
//        int[] numbers = new int [10];
//        for(int i = 0; i< numbers.length; i++){
//            numbers[i] = aksakal.nextInt(10);
//            System.out.println(numbers[i] + "");
//
//        }
//        System.out.println("\nЧто ищем ?");
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//
//        boolean found = false;
//        for(int i = 0 ; i < numbers.length; i++){
//            if(x == numbers[i]){
//                found = true;
//                System.out.println("A[" + i + "] = " + numbers);
//            }
//        }
//        if(!found){
//            System.out.println("Не нашли");
//
//        }
//        Random rand = new Random();
//        int[] array = new int [5];
//        for(int i =0 ; i<5; i++){
//            array[i] = rand.nextInt(6);
//            System.out.println(array[i] + " ");
//
//        }
//        int pred = array[0];
//        boolean notfound = true;
//        for (int i =1 ; i<5; i++){
//            if(pred == array[i]){
//                System.out.println("есть " + array[i]);
//                notfound = false;
//                break;
//            }else{
//                pred = array[i];
//            }
//        }
//        if(notfound)
//            System.out.println("не нашли");
//
//        Random rand = new Random();
//
//        int[] array = new int [5];
//
//
//        for(int i =0 ; i<5; i++) {
//
//            array[i] = rand.nextInt(6);
//
//            System.out.println(array[i] + " ");
//
//        }
//        int Max = array[0];
//        int Max_index = 0;
//        for(int i =1 ; i< 5;i++ ){
//            if (array[i] > 5){
//                Max = array[i];
//                Max_index = i;
//            }
//        }
//        System.out.println(Max + Max_index );
    }
}
//
