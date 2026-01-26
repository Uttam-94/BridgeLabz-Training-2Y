import java.util.*;
public class SearchChallenges {
    public static int firstMissingPositive(int[] a){
        int n=a.length;
        for(int i=0;i<n;i++){
            while(a[i]>0 && a[i]<=n && a[a[i]-1]!=a[i]){
                int tmp=a[a[i]-1];
                a[a[i]-1]=a[i];
                a[i]=tmp;
            }
        }
        for(int i=0;i<n;i++) if(a[i]!=i+1) return i+1;
        return n+1;
    }
    public static int binarySearch(int[] a,int target){
        int l=0,r=a.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(a[m]==target) return m;
            if(a[m]<target) l=m+1; else r=m-1;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={3,4,-1,1};
        System.out.println(firstMissingPositive(Arrays.copyOf(arr,arr.length)));
        int[] arr2={1,2,3,4,5};
        System.out.println(binarySearch(arr2,3));
    }
}
