package cse.algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class TurnTheRectangle {
    public static void main(String[] args) {

        ArrayList<Rectangle> arrayList=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            long width= scanner.nextLong();
            long height=scanner.nextLong();
            arrayList.add(new Rectangle(width,height));

        }
        String isItTurnable=turnTheRectangles(arrayList)?"yes":"no";
        System.out.println(isItTurnable);
    }

    public static boolean turnTheRectangles(ArrayList<Rectangle> rectangles){

        rectangles.get(0).setMaxOfHeightAndWidth();

        for (int i = 1; i < rectangles.size(); i++) {

            if (rectangles.get(i).getHeight() > rectangles.get(i - 1).getHeight())
                rectangles.get(i).swapWidthAndHeight();

             else if (rectangles.get(i).getWidth()<=rectangles.get(i - 1).getHeight())
                  rectangles.get(i).setMaxOfHeightAndWidth();

        }


        for (int i = 1; i < rectangles.size(); i++)
            if (rectangles.get(i).getHeight()>rectangles.get(i-1).getHeight()) return false;


        return true;
    }

    public static class Rectangle {

        private long width;
        private long height;

        public Rectangle(long width, long height) {
            this.width = width;
            this.height = height;
        }

        public long getWidth() {
            return width;
        }

        public void setWidth(long width) {
            this.width = width;
        }

        public long getHeight() {
            return height;
        }

        public void setHeight(long height) {
            this.height = height;
        }
        public void swapWidthAndHeight(){
            long temp=width;
            width= height;
            height =temp;
        }
        public void setMaxOfHeightAndWidth(){
            if (height<width) swapWidthAndHeight();
        }

        @Override
        public String toString() {
            return "Rectangle{" +
                    "width=" + width +
                    ", height=" + height +
                    '}';
        }
    }
}
