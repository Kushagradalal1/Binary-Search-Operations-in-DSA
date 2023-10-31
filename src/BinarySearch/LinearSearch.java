package BinarySearch;
//linear Search Code :
//worst case time complexity is 0(n).

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60}; int n=6;
        //x is a searching element :
        int x=20;
        int res=linearSearch(arr,n,x);
        System.out.println(res);
    }
    public static int linearSearch(int arr[], int n, int x){
        for (int i=0; i<n; i++){
            if (arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
