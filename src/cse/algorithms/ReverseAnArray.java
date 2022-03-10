package cse.algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n= scanner.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for (long i = 0; i < n; i++) {
           arr.add(scanner.nextInt());
        }
        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

    }

}
