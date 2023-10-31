package BinarySearch;

public class RecursiveCallForBinarySearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70}; int n=7;
        //searching element :
        int x=200;
        int res=bSearch(arr,x,0,n-1);
        System.out.println(res);
    }
    public static int bSearch(int arr[], int x, int low, int high){
        if (low>high){
            return -1;
        }
        int mid=(low+high)/2;

        if (arr[mid]==x){
            return mid;
        } else if (arr[mid]>x) {
            return bSearch(arr,x,low,mid-1);
        }else {
            return bSearch(arr,x,mid+1,high);
        }
    }
}
