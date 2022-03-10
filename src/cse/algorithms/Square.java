package cse.algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int cases=scan.nextInt();
        ArrayList<SandN> arrayList=new ArrayList<>();
        for (int i = 0; i < cases; i++) {
            int n=scan.nextInt();
            int s=scan.nextInt();
            arrayList.add(new SandN(n,s));
        }

        for (SandN sandN : arrayList) {
            System.out.println(sandN.numberOfSquares());
        }

    }
}
