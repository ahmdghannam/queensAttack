package cse.algorithms;

import java.util.Scanner;

public class PhoneNumbers {

    public static void main(String[] args) {
        phone();
    }

    private static void phone() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String cards = scanner.nextLine();
        if (n < 11) {
            System.out.println(0);
            return;
        }
        int numberOfEights = 0;
        for (int i = 0; i < cards.length(); i++)
            if (cards.charAt(i) == '8') numberOfEights++;

        System.out.println(Math.min(numberOfEights, (n) / 11));
    }
}
