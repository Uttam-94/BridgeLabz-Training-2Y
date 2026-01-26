import java.io.*;
public class FileReadLines {
    public static void main(String[] args){
        if(args.length==0) return;
        try(BufferedReader r=new BufferedReader(new FileReader(args[0]))){
            String line;
            while((line=r.readLine())!=null) System.out.println(line);
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}
