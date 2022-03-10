package cse.algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public final class QueensAttack {

        public static boolean[] queensAttack0(int boardSize, int numberOfQueens, ArrayList<Position> queensPositions){

              int queenValidityPosition=0;
              int bound =boardSize-1;
              // array elements are false by default
             boolean [][] chessBoard=new boolean[boardSize][boardSize];
             boolean [] isItValid =new boolean[numberOfQueens];

            for (Position p:queensPositions) {
                isItValid[queenValidityPosition]=!chessBoard[p.getX()-1][p.getY()-1];
               if(isItValid[queenValidityPosition++]) {

                   chessBoard[p.getX()-1][p.getY()-1]=true;

                   //rows
                   for (int i = 0; i < boardSize; i++) {
                       chessBoard[i][p.getY()-1] = true;
                   }

                   //columns
                   for (int i = 0; i < boardSize; i++) {
                       chessBoard[p.getX()-1][i] = true;
                   }

                   //diagonals

                   //main diagonal - lower
                   int i= p.getX()-1, j= p.getY()-1;
                   while (i<=bound&&i>=0&&j<=bound&&j>=0){
                       chessBoard[i++][j++]=true;
                   }

                   //main diagonal - upper
                   i= p.getX()-1; j= p.getY()-1;
                   while (i<=bound&&i>=0&&j<=bound&&j>=0){
                       chessBoard[i--][j--]=true;
                   }

                   //secondary diagonal - upper
                   i= p.getX()-1; j= p.getY()-1;
                   while (i<=bound&&i>=0&&j<=bound&&j>=0){
                       chessBoard[i--][j++]=true;
                   }

                   //secondary diagonal - lower
                   i= p.getX()-1; j= p.getY()-1;
                   while (i<=bound&&i>=0&&j<=bound&&j>=0){
                       chessBoard[i++][j--]=true;
                   }

               }
            }

            return isItValid;
        }
        public static boolean[] queensAttack(int boardSize, int numberOfQueens, ArrayList<Position> queensPositions){

        int queenValidityPosition=0;

        // boolean arrays elements are false by default
        boolean []rows=new boolean[boardSize];
        boolean []columns=new boolean[boardSize];
        boolean []mainDiagonals=new boolean[(2*boardSize)-1];
        boolean []secondaryDiagonals=new boolean[(2*boardSize)-1];
        boolean [] isItValid =new boolean[numberOfQueens];

        for (Position pos : queensPositions) {

            isItValid[queenValidityPosition]=!(rows[pos.getX()]||columns[pos.getY()]
                                          || mainDiagonals[pos.getX()+pos.getY()]
                                          || secondaryDiagonals[pos.getX()- pos.getY() + boardSize-1]);

            if(isItValid[queenValidityPosition++]) {
                 rows[pos.getX()]=true;
                 columns[pos.getY()]=true;
                 mainDiagonals[pos.getX()+pos.getY()]=true;
                 secondaryDiagonals[pos.getX()- pos.getY()+boardSize-1]=true;
            }
        }


        return isItValid;
    }

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            ArrayList <Position> queensPositions=new ArrayList<>();
            int n,q;
            n=scanner.nextInt();
            q= scanner.nextInt();

            for (int i = 0; i < q; i++) {
                int x= scanner.nextInt();
                int y= scanner.nextInt();
                queensPositions.add(new Position(x,y));

            }

            for (boolean b: queensAttack(n,q,queensPositions)) {
                if (b) System.out.println("yes");
                else System.out.println("No");
            }
        }

        public static class Position {
            private int x;
            private int y;

            public Position() {
            }

            public Position(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public int getX() {
                return x-1;
            }

            public void setX(int x) {
                this.x = x;
            }

            public int getY() {
                return y-1;
            }

            public void setY(int y) {
                this.y = y;
            }

            @Override
            public String toString() {
                return "Position{" +
                        "x=" + x +
                        ", y=" + y +
                        '}';
            }
        }

    }
