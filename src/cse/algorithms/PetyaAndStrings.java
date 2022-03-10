package cse.algorithms;

import java.util.Scanner;

public class PetyaAndStrings {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String one= scanner.nextLine();
        String two =scanner.nextLine();
        one= one.toLowerCase();
        two=two.toLowerCase();
        System.out.println(compare(one, two));
    }

    private static int compare(String one, String two) {
        for (int i = 0; i < one.length(); i++) {
            if (one.charAt(i)> two.charAt(i)) return 1;
            else if (one.charAt(i) < two.charAt(i)) return -1;
        }
        return 0;
    }

}
