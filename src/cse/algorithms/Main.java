package cse.algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        Scanner scanner =new Scanner(System.in);
//        String s=scanner.nextLine();
//
//        System.out.println( Codes.noOfCarpet(s));
//        System.out.println((2^1));
//        for (int i = 0; i <=9; i++) {
//            System.out.println("i : "+GrandfatherDovletCalculator.digitValue2(i));
//        }
//        System.out.println("====================");
//        for (int i = 0; i <=9; i++) {
//            System.out.println("i : "+GrandfatherDovletCalculator.digitValue(i));
//        }
//      double a=3/2;
//        System.out.println(a);
//        System.out.println(1.00%1);
        System.out.println(Integer.MAX_VALUE);

    }

    private static void forQueen() {
        ArrayList <Position> queensPositions=new ArrayList<>();

        queensPositions.add(new Position(4,5));
        queensPositions.add(new Position(2,6));
        queensPositions.add(new Position(8,4));
        queensPositions.add(new Position(7,6));
        queensPositions.add(new Position(2,1));
        queensPositions.add(new Position(1,3));
        queensPositions.add(new Position(8,3));
        queensPositions.add(new Position(3,2));

        for (boolean b:Codes.queensAttack(8,8,queensPositions)) {
            if (b) System.out.println("yes");
            else System.out.println("No");
        }
    }
}
