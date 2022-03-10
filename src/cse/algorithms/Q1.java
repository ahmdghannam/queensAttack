package cse.algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        ArrayList [] cases = new ArrayList[t];

        for (int i = 0; i < t; i++) {

            int n= scanner.nextInt();
            ArrayList<Integer> locations=new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int s= scanner.nextInt();
                locations.add(s);
            }
            cases[i]=locations;
        }

        for (ArrayList aCase : cases) {
            sol(aCase);
        }

    }

    private static void sol(ArrayList<Integer> locations) {
        int lastOne=0;
        int total=0;

        for (int i = 1; i < locations.size() ; i++)
            if (locations.get(i)==1) {
                total+=(i-lastOne)>1?(i-lastOne):0;
                lastOne=i;
            }


        System.out.println(total);
    }
}
