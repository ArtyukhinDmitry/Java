//package org.example;
//
//// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
//// then press Enter. You can now see whitespace characters in your code.
//public class Main {
//    public static void main(String[] args) {
//        // Press Alt+Enter with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
//    }
//}





//    public static void main(String[] args) {
//        System.out.println("Hello world");
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        System.out.println("subtractProductAndSum(n) = " + subtractProductAndSum(n));
//        scanner.close();
//    }
//
//    /**
//     * @param n заданное число
//     * @return результат
//     * @apiNote Заданное целое число возвращает разность между произведением его цифр на сумму его цифр. n
//     */
//    private static int subtractProductAndSum(int n) {
//        int sum = 0, pr = 1;
//        while (n != 0) {
//            pr *= n % 10;
//            sum += n % 10;
//            n = n / 10;
//        }
//        return pr - sum;
//    }


//    Дана последовательность N целых чисел.
//        Найти количество положительных чисел, после которых следует отрицательное число.

