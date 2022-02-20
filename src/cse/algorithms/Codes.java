package cse.algorithms;

import java.util.ArrayList;

public abstract class Codes {

    public static boolean[] queensAttack(int boardSize, int numberOfQueens, ArrayList<Position> queensPositions){

          int queenValidityPosition=0;

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
               while (i<=7&&i>=0&&j<=7&&j>=0){
                   chessBoard[i++][j++]=true;
               }

               //main diagonal - upper
               i= p.getX()-1; j= p.getY()-1;
               while (i<=7&&i>=0&&j<=7&&j>=0){
                   chessBoard[i--][j--]=true;
               }

               //secondary diagonal - upper
               i= p.getX()-1; j= p.getY()-1;
               while (i<=7&&i>=0&&j<=7&&j>=0){
                   chessBoard[i--][j++]=true;
               }

               //secondary diagonal - lower
               i= p.getX()-1; j= p.getY()-1;
               while (i<=7&&i>=0&&j<=7&&j>=0){
                   chessBoard[i++][j--]=true;
               }

           }
        }

        return isItValid;
    }

}
