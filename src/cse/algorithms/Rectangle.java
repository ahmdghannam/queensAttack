package cse.algorithms;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void swapWidthAndHeight(){
    int temp=width;
    width= height;
    height =temp;
    }
    public void setMaxOfHeightAndWidth(){
        if (height<width) swapWidthAndHeight();
    }
}
