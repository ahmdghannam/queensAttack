package cse.algorithms;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
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
