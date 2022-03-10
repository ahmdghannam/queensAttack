package cse.algorithms;

public class SandN {
    private int s;
    private int n;

    public SandN( int n,int s) {
        this.s = s;
        this.n = n;
    }
    public  int numberOfSquares() {

        return n!=0 ? (int) (s / (Math.pow(n, 2))) : 0;

    }
}
