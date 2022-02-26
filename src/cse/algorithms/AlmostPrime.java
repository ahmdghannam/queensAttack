package cse.algorithms;
//P16. Almost Prime
//time limit per test2 seconds
//memory limit per test256 megabytes
//input standard input
//output standard output
//A number is called almost prime if it has exactly two distinct prime divisors. For example, numbers 6, 18, 24 are almost prime, while 4, 8, 9, 42 are not. Find the amount of almost prime numbers which are between 1 and n, inclusive.
//
//Input
//Input contains one integer number n (1≤n≤3000).
//
//Output
//Output the amount of almost prime numbers between 1 and n, inclusive.

import java.util.ArrayList;
import java.util.Scanner;

public class AlmostPrime {

    public static void main(String[] args) {

//        for (Integer integer : arrayList) {
//            System.out.println(integer);
//        }
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        ArrayList<Integer> arrayList=primes_sieveOfEratosthenes(n);
        System.out.println(arrayList.size());
        for (Integer integer : arrayList) {
            System.out.print(integer+" ");

        }
        System.out.println();
    }
    public static ArrayList<Integer> almostPrime(int n){

        int sqrt=(int) (Math.sqrt(n)+1);
        ArrayList <Integer> primes =primes_sieveOfEratosthenes(n);
        ArrayList<Integer> almostPrimes=new ArrayList<>();

        for (int i = 3; i <= n; i++) {

            int j=0;
            int timesOfDivisionByPrimes=0;

            while ((j<primes.size())&&(i>primes.get(j))){
                if (( i % primes.get(j++))==0) timesOfDivisionByPrimes++;
            }
            if (timesOfDivisionByPrimes==2) almostPrimes.add(i);

        }
     return almostPrimes;
    }
    public static ArrayList<Integer> primes_sieveOfEratosthenes(int n){
        // this method returns the prime numbers which they are <= n

        int []A=new int[n];
        int j;
        // filling the array
        for (int p=2;p<=n;p++) {
            A[p-2]=p;
        }
        // eliminates the prime numbers by assign zero in it is position
        for (int p = 2; p <=Math.sqrt(n); p++) {
            if(A[p]!=0){ // if statement so no need to delete multiples of numbers they are a multiples so its multiples have been deleted , ex : number 4
                j=p*p;
                while (j<=n) {  // the first multiple of a number we should consider deleting is number^2 , because smaller numbers have been deleted , and surly the number^2 must be smaller than n
                    A[j-2] = 0; // j-2 not j due to my arrangement of the array
                    j += p;  // to eliminate multiples bigger than number^2
                }
            }
        }
        // fill the needed values (prime numbers) in the array list
        ArrayList<Integer> L=new ArrayList<>();
        for (int p = 0; p < n; p++) {
            if(A[p]!=0){
                L.add(A[p]);
            }
        }

        return L;
    }
}
