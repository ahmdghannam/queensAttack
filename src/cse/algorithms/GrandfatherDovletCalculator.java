package cse.algorithms;

import java.util.Scanner;

public class GrandfatherDovletCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
//        scanner.nextLine();
         int b= scanner.nextInt();
//         scanner.next();
        System.out.println(totalNoOfDigits(a,b));

    }
 
    public static int totalNoOfDigits(int a, int b) {
        int sum=0;
        for (int i = a; i <=b ; i++) {
            int temp=i;
            while (temp!=0) {
                sum+=digitValue(temp%10);
                temp/=10;
            }
        }
 
        return sum;
    }
    public static int digitValue(int digit){
        if (digit==0||digit==6||digit==9) return 6;
        if (digit==2||digit==3||digit==5) return 5;
        if (digit==1) return 2;
        if (digit==4) return 4;
        if (digit==7) return 3;
        if (digit==8) return 7;
        else  return Integer.MIN_VALUE;
    }

    public static int digitValue2(int digit){

        byte A= (byte) (digit>>3&1);
        byte B= (byte) (digit>>2&1);
        byte C= (byte) (digit>>1&1);
        byte D= (byte) (digit&1);

        byte f1= (byte) ~(~A&~B&~C&D|~A&B&C&D);
        byte f2= (byte) ~(A&~C|~B&~C|B&C);
        byte f3= (byte) ~(B&D|C&D|C&~B&~A|C&~D&A);


     return Integer.parseInt(f1+""+f2+""+f3,2);

    }
}