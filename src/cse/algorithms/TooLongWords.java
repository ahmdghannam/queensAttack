package cse.algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class TooLongWords {
    public static void main(String[] args) {

        ArrayList<String> arr=new ArrayList<>();

        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextLine());
        }

        for (String s : arr) {
            if (s.length() <= 10) System.out.println(s);
            else System.out.println(s.charAt(0) + String.valueOf(s.length() - 2) + s.charAt(s.length() - 1));
        }
    }
}
