package cse.algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        long n= scanner.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for (long i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        int a = scanner.nextInt();
        int b= scanner.nextInt();
        int t=0;
        for (int i = a; i <=b ; i++) {
            t+=arr.get(i);
        }
        System.out.println(t);
        
    }
}
