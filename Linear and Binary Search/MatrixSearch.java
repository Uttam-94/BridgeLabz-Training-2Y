public class MatrixSearch {
    public static boolean search(int[][] mat,int target){
        int rows=mat.length,cols=mat[0].length;
        int l=0,r=rows*cols-1;
        while(l<=r){
            int m=l+(r-l)/2;
            int val=mat[m/cols][m%cols];
            if(val==target) return true;
            if(val<target) l=m+1; else r=m-1;
        }
        return false;
    }
    public static void main(String[] args){
        int[][] mat={{1,3,5},{7,9,11},{13,15,17}};
        int target=9;
        if(args.length>0) target=Integer.parseInt(args[0]);
        System.out.println(search(mat,target));
    }
}
