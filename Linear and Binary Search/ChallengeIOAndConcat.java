import java.io.*;
public class ChallengeIOAndConcat {
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
    public static long countWordsWithFileReader(String path){
        long count=0;
        try(BufferedReader r=new BufferedReader(new FileReader(path))){
            String line;
            while((line=r.readLine())!=null){
                String[] w=line.split("\\s+");
                count+=w.length;
            }
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
        return count;
    }
    public static void main(String[] args){
        int n=1000000;
        if(args.length>0) try{n=Integer.parseInt(args[0]);}catch(Exception e){}
        System.out.println("Builder: "+measureBuilder(n));
        System.out.println("Buffer: "+measureBuffer(n));
        if(args.length>1) System.out.println("Words: "+countWordsWithFileReader(args[1]));
    }
}
