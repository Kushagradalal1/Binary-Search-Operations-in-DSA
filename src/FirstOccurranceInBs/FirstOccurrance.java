package FirstOccurranceInBs;
/*
Time Complexity : O(n)
Now Write in time complexity if : O(logn)

 */
public class FirstOccurrance {
    public static void main(String[] args) {
        int arr[]={1,10,10,10,20,20,40}; int n=7;
        int x=20;
        int res=firstOccur(arr,n,x);
        System.out.println(res);
    }
    public static int firstOccur(int arr[], int n, int x){
        for (int i=0; i<n; i++){
            if (arr[i]==x){
                return i;
            }
        }
        return -1;

    }
}
