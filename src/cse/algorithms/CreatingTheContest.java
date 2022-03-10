package cse.algorithms;

import java.util.Scanner;

public class CreatingTheContest {

    public static void main(String[] args) {
        int maxNumberOfProblems = Integer.MIN_VALUE;
        int counter = 1;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i]= scanner.nextInt();
        }

        for (int i = 1; i < n; i++) {

            if (a[i] <= ((a[i - 1]) * 2)) counter++;

            else {
                maxNumberOfProblems = Math.max(maxNumberOfProblems, counter);
                counter=1;
            }
        }
        maxNumberOfProblems = Math.max(maxNumberOfProblems, counter);

        System.out.println(maxNumberOfProblems);
    }
}
