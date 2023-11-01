package IndexOfFirstOccurrence;
/*
There are two ways to solve this prob :
1) Linear Way :

 */
public class IndexOfFirstOccurrence {
    public static void main(String[] args) {
        int arr[]={1,10,10,10,20,20,40}; int x=20; int n=7;
        int res=indexOfFirstOccurrance(arr,x,n);
        System.out.println(res);
    }
    public static int indexOfFirstOccurrance(int arr[], int x, int n){
        for (int i=0; i<n; i++){
            if (arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
