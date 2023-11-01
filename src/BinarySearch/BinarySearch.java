package BinarySearch;
/*
Binary Search
Mid Element, left pointer & right pointer :
Iterative Method :

 */
public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={12,32,45,76}; int n=4;
        int x=30;
        int res=binarySearch(arr,n,x);
        System.out.println(res);
    }
    public static int binarySearch(int arr[], int n, int x){
        int low=0; int high=n-1;
        while (low<=high){
            int mid=(low+high)/2;
            if (arr[mid]==x){
                return mid;
            } else if (arr[mid]>x) {
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return -1;
    }
}
