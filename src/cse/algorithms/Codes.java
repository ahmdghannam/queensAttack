package cse.algorithms;

    import java.util.ArrayList;

    public final class Codes {

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

        public static int noOfCarpet(String s){
            boolean isItC=false;
            int count=1;
            char temp=s.charAt(0);
            int innerCounter=1;

            for (int i = 1; i <s.length() ; i++) {
                if(innerCounter>=5||s.charAt(i)!=temp ){
                    count++;
                    temp=s.charAt(i);
                    innerCounter=1;
                }
                else
                    innerCounter++;
            }
            return count;
        }

    }
