package cse.algorithms;

import java.util.Scanner;

public class footBall {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();

        boolean b=isItDangerous(s);
        s= b?"YES":"NO";
        System.out.println(s);
    }

    public static  boolean isItDangerous(String players){
        if (players.length()<7) return false;
        int count =0;
        for (int i = 1; i < players.length(); i++) {
            if ((players.charAt(i)==players.charAt(i-1))) {
                  count++;
                if (count == 6) return true;
            }
            else count=0;
        }
        return false;
    }
}
