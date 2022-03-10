package cse.algorithms;

public class NoOfCarpet {
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
