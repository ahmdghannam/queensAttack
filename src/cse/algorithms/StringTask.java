package cse.algorithms;


import java.util.Scanner;

public class StringTask {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();
        StringBuilder output = new StringBuilder();
        input=input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char c=input.charAt(i);
            if (c!=('a')&&c!=('o')&&c!=('y')&&c!=('e')&&c!=('u')&&c!=('i'))
            output.append( "." + c);
        }

        System.out.println(output);
    }
}
