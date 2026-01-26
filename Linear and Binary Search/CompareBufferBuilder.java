public class CompareBufferBuilder {
    public static long measureBuilder(int n){
        StringBuilder sb=new StringBuilder();
        long t=System.nanoTime();
        for(int i=0;i<n;i++) sb.append("hello");
        return System.nanoTime()-t;
    }
    public static long measureBuffer(int n){
        StringBuffer sb=new StringBuffer();
        long t=System.nanoTime();
        for(int i=0;i<n;i++) sb.append("hello");
        return System.nanoTime()-t;
    }
    public static void main(String[] args){
        int n=1000000;
        try{ if(args.length>0) n=Integer.parseInt(args[0]); }catch(Exception e){}
        long b=measureBuilder(n);
        long f=measureBuffer(n);
        System.out.println("StringBuilder: "+b);
        System.out.println("StringBuffer: "+f);
    }
}
