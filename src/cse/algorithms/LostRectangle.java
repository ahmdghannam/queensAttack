package cse.algorithms;
//P13. Lost rectangle
//time limit per test1 second
//memory limit per test256 megabytes
//input standard input
//output standard output
//Bitek lost a rectangle. He just remembers that the lengths of the sides of the rectangle were all integers, and the area of the rectangle was equal to A. He also know that his rectangle had a minimum possible perimeter out of all the possible rectangles with the conditions above. What was that perimeter?
//
//Input
//The single input line consists of a single integer A (1≤A≤1012).
//
//Output
//Output a single line containing a single integer – the perimeter of the rectangle.

import java.util.Scanner;

public class LostRectangle {

    public static long minRectanglePerimeter(long area){

    long minPerimeter=Long.MAX_VALUE;
         double j;
        for (double i = 1; i <=Math.sqrt(area)+1; i++) {
          j=area/i;
          if (isInteger(j)){
              minPerimeter= (long) Math.min(minPerimeter,2*(i+j));
          }
        }
        return minPerimeter;
    }

    public static boolean isInteger(double j) {
        return (j%1)==0;
    }
    public static boolean isInteger2(double j) {
        return Math.floor(j)==j;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long area=scanner.nextLong();
        System.out.println(minRectanglePerimeter(area));


    }

}
