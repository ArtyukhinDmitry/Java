package org.example.classwork.lesson1;

public class Ex3 {
    String str = scanner.nextLine();
    Ex3(str);
    scanner.close();
}





    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scaner = new Scanner(System.in);
        String str = scaner.nextLine();
        System.out.println("zadanie3(str) = " + zadanie3(str));
        scaner.close();
    }

    /**
     * @apiNote Разделить строку пополам и склеить наоборот
     * @param str str
     * @return str
     */
    private static String zadanie3(String str) {
        String up = str.substring(0, str.length()/2);
        String down = str.substring(str.length()/2);
        return down + up;
    }