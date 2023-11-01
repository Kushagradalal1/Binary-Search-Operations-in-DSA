package CountOccurrenceInSortArrays;
/*
O(n) linear solution but this is not a logn time solutions :

 */
public class CountOfOccurrenceInSortedArrays {
    public static void main(String[] args) {
        int arr[]={10,20,20,20,30,30}; int n=6;
        int x=10;
        int result = countOfRepeat(arr,n,x);
        System.out.println(result);
    }
    public static int countOfRepeat(int arr[], int n, int x){
        int count=0;
        for (int i=0; i<n; i++){
            if (arr[i]==x){
                count++;
            }
        }
        return count;
    }
}
