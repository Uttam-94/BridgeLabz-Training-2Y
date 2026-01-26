import java.io.*;
public class FileWordCount {
    public static void main(String[] args){
        if(args.length<2) return;
        String path=args[0];
        String target=args[1];
        int count=0;
        try(BufferedReader r=new BufferedReader(new FileReader(path))){
            String line;
            while((line=r.readLine())!=null){
                String[] words=line.split("\\W+");
                for(String w:words) if(w.equals(target)) count++;
            }
            System.out.println(count);
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}
