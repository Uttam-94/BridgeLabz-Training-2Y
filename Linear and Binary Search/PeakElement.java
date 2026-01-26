public class PeakElement {
    public static int findPeak(int[] a){
        int l=0,r=a.length-1;
        while(l<r){
            int m=l+(r-l)/2;
            if(m>0 && a[m]<a[m-1]) r=m-1;
            else if(m<a.length-1 && a[m]<a[m+1]) l=m+1;
            else return m;
        }
        return l;
    }
    public static void main(String[] args){
        int[] a={1,3,20,4,1,0};
        if(args.length>0){
            a=new int[args.length];
            for(int i=0;i<args.length;i++) a[i]=Integer.parseInt(args[i]);
        }
        System.out.println(findPeak(a));
    }
}
