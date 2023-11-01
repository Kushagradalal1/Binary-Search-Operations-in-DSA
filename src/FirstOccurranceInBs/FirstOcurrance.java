package FirstOccurranceInBs;
/*
Time Complexity : O(logn) :

 */
public class FirstOcurrance {
    public static void main(String[] args) {
        int arr[]={1,10,10,10,20,20,40}; int n=7;
        int x=20;
        int res=firstOccurrance(arr,x,0,n-1);
        System.out.println(res);
    }
    public static int firstOccurrance(int arr[], int x, int low, int high){
        int mid=low+high/2;
        if (arr[mid]==x){
            return mid;
        } else if (arr[mid]>x) {
           return high+1;
        }else {
           // low=low-1;
            return low-1;
        }
    }
}
