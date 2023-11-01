package SquareRootProblem;
/*
Naive Solution is : Time Complexity is : 0(squareRoot of (x))

 */
public class SquareRootFind {
    public static void main(String[] args) {
        int x=25;
        int result =squareRoot(x);
        System.out.println(result);
    }
    public static int squareRoot(int x){
        int i=1;
        while (i*i<=x){
            i++;
        }
        return (i-1);
    }
}
