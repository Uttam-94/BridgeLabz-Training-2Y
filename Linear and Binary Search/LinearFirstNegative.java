public class LinearFirstNegative {
    public static int firstNegative(int[] a){
        for(int i=0;i<a.length;i++) if(a[i]<0) return i;
        return -1;
    }
    public static void main(String[] args){
        if(args.length==0){
            int[] example={1,2,-3,4};
            System.out.println(firstNegative(example));
            return;
        }
        int[] a=new int[args.length];
        for(int i=0;i<args.length;i++) a[i]=Integer.parseInt(args[i]);
        System.out.println(firstNegative(a));
    }
}
