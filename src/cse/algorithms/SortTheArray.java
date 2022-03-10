package cse.algorithms;

import java.util.Scanner;

public class SortTheArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int start=0;
        int end= a.length-1;
        boolean bs = false;
        int toBreak=0;
        fillTheArray(scanner, a);
        if (isSorted(a)) {
            System.out.println("yes\n"+1+" "+1);
            return;
        }

        for (int i = 1; i < n; i++) {

            if (!bs && (a[i] < a[i - 1])) {
                start = i - 1;
                bs = true;
                toBreak++;
            }

            else if (bs && (a[i] > a[i - 1])) {
                end=i-1;
                toBreak++;
            }
            if (toBreak==2) break;
        }
        flip(a,start,end);
        String s=isSorted(a)?"yes\n"+(start+1)+" "+(end+1):"no";
        System.out.println(s);
    }
    private static void fillTheArray(Scanner scanner, int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i]= scanner.nextInt();
        }
    }
    private static void flip(int[] a, int start, int end) {
        int j=end;
        int i = start;
        while (i <j) swap(i++,j--,a);
    }
    public static void swap(int index, int index2, int[] a) {
        int t=a[index2];
        a[index2]=a[index];
        a[index]=t;
    }
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }

}
