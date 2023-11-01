package IndexOfLastOccurrence;

public class RecursiveWay {
    public static void main(String[] args) {
        int arr[]={5,10,10,10,10,20,20}; int n=7; int x=10;
        int result = recursiveWayForLastIdx(arr,n,x,0,n-1);
        System.out.println(result);
    }
    public static int recursiveWayForLastIdx(int arr[], int n, int x, int low, int high){
        if (low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if (arr[mid]>x){
            return recursiveWayForLastIdx(arr,n,x,low,mid-1);
        } else if (arr[mid]<x) {
            return recursiveWayForLastIdx(arr, n, x, mid+1, high);
        }else {
            if (mid==n-1 || mid==0 || arr[mid]!=arr[mid+1]){
                return mid;
            }else {
                return recursiveWayForLastIdx(arr, n, x, mid+1, high);
            }
        }
    }
}
