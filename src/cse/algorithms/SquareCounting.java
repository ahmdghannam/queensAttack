package cse.algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class SquareCounting {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long cases=scanner.nextLong();
        ArrayList<SandN> arrayList=new ArrayList<>();

        for (int i = 0; i < cases; i++) {
            long n=scanner.nextLong();
            long s=scanner.nextLong();
            arrayList.add(new SandN(n,s));
        }

        for (SandN o : arrayList) {
            System.out.println(o.numberOfSquares());
        }

    }




    public static class SandN {
        private long s;
        private long n;

        public SandN( long n,long s) {
            this.s = s;
            this.n = n;
        }
        public  long numberOfSquares() {

            return n!=0 ? s/(n*n) : 0 ;

        }
    }

}
