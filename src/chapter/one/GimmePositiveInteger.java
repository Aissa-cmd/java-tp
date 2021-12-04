package chapter.one;

import java.util.Scanner;

public class GimmePositiveInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Please enter a positive integer: ");
        while((number = scanner.nextInt()) < 0) {
            System.out.print("Please enter a positive integer: ");
        }
        System.out.printf("\nThank you!\nYour number is: %d", number);
    }
}
