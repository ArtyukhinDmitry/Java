package org.example.classwork.lesson1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ex2(n);
        int count = 0;
        int a = 0, b = 0;
        a = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            b = scanner.nextInt();
            if(a > 0 && b < 0) count++;
            a = b;
        }
        System.out.println("count = " + count);
        scanner.close();
    }

}







//    public static void main(String[] args) {
//        Scanner scaner = new Scanner(System.in);
//        int n = scaner.nextInt();
//        System.out.println("zadanie2(n, scaner) = " + zadanie2(n, scaner));
//
//    }
//
//    /**
//     * @apiNote Дана последовательность N целых чисел. Найти количество положительных чисел, после которых следует
//     * отрицательное число.
//     * @param n int
//     * @param scaner scaner
//     * @return count
//     */
//    private static int zadanie2(int n, Scanner scaner) {
//
//        int count = 0;
//        int a = 0, b = 0;
//        a = scaner.nextInt();
//        for (int i = 0; i < n; i++) {
//            b = scaner.nextInt();
//            if(a > 0 && b < 0) count++;
//            a = b;
//        }
//        scaner.close();
//        return count;
//    }