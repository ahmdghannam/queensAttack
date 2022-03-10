package cse.algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class Table {
    public static class Player {
        ArrayList <Integer> cards;

        public Player() {
            cards=new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        ArrayList<Player>arrayList=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
         //add
        for (int i = 0; i < n; i++) {

            Player player=new Player();

            for (int j = 0; j < n; j++) {
                int card=scanner.nextInt();
                player.cards.add(card);
            }

            arrayList.add(player);
        }

        printOut(arrayList);


    }

    private static void printOut(ArrayList<Player> players) {
         int k=0;
         ArrayList<Integer> swaps=new ArrayList<>();

        for (int i = 1; i <= players.size(); i++) {

            for (int j = 0; j < players.get(i-1).cards.size()-1; j++) {

                if (players.get(i-1).cards.get(j)!=(i)){
                    k++;
                    players.get( (i) % (players.size())) . cards. add(players.get(i-1).cards.get(j));
                    players.get(i-1).cards.remove(j);
                    swaps.add(players.get(i-1).cards.get(j));
                }

            }
        }
        System.out.println(k/players.size());
        for (int i = swaps.size() - 1; i >= 0; i--) {
            System.out.print(swaps.get(i)+" ");
           if (i% (players.size())==0) System.out.println();
        }

    }
}