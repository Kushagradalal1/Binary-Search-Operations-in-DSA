package SquareRootProblem;

public class BinarySolutionInSquareRoot {
    public static void main(String[] args) {
        int x=10;
        int res=squareRoot(x);
        System.out.println(res);
    }
    public static int squareRoot(int x){
        int low=0; int high=x; int ans=-1;
        while (low<=high){
            int mid=(low+high)/2;
            int msq=mid*mid;
            if (msq==x){
                return mid;
            }else if (msq>x){
                high=mid-1;
            }else {
                low=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
}
