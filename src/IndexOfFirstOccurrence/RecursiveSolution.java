package IndexOfFirstOccurrence;

public class RecursiveSolution {
    public static void main(String[] args) {
        int arr[]={5,10,10,20,20}; int n=5;
        int x=20;
        int result=recursiveWay(arr,n,x,0,n-1);
        System.out.println(result);
    }
    public static int recursiveWay(int arr[], int n, int x, int low, int high){
        if (low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if (arr[mid]>x){
            return recursiveWay(arr,n,x,low,high-1);
        } else if (arr[mid]<x) {
            return recursiveWay(arr, n, x, low+1, high);
        }else {
            if (mid==0 || arr[mid-1]!=arr[mid]){
                return mid;
            }else {
                return recursiveWay(arr, n, x, low, high-1);
            }
        }
    }
}
