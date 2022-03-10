package cse.algorithms;


import java.util.Scanner;

public class PrimeSieve {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
       primes_sieveOfEratosthenes(n);

    }

    //find all prime numbers smaller than or equal n
    public static void primes_sieveOfEratosthenes(int n) {

        // this method returns the prime numbers which they are <= n

        int[] A = new int[n+1];
        int j;
         int numberOfPrimes=n;
        // filling the array
        for (int p = 2; p <= n; p++) {
            A[p-2] = p;
        }

        // eliminates the prime numbers by assign zero in it is position
        for (int p = 2; p <= (int) Math.sqrt(n); p++) {
            if (A[p] != 0) { // if statement so no need to delete multiples of numbers they are a multiples so its multiples have been deleted , ex : number 4
                j = p * p;
                while (j <= n) {  // the first multiple of a number we should consider deleting is number^2 , because smaller numbers have been deleted , and surly the number^2 must be smaller than n
                    A[j-2] = 0; // j-2 not j due to my arrangement of the array
                    j += p;  // to eliminate multiples bigger than number^2
                 numberOfPrimes--;
                }

            }
        }

        System.out.println(numberOfPrimes);

        for (int p = 0; p <= n; p++) {
            if (A[p] != 0) {
                System.out.print(A[p]+" ");
            }
        }
        System.out.println();


    }


}
