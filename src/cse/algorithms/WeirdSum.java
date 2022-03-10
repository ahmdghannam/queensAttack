package cse.algorithms;

import java.util.HashMap;
import java.util.Scanner;

public class WeirdSum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();


        HashMap<Integer, Position> items=new HashMap<>();
        int total=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int color= scan.nextInt();
                if (items.get(color)==null) items.put(color,new Position(i,j));
                else {
                  total+=distance(new Position(i,j),items.get(color));
                }
            }
        }
    }

    private static int distance(Position position1, Position position2) {

    return 0;
    }
}
