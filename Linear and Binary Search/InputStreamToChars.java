import java.io.*;
import java.nio.charset.*;
public class InputStreamToChars {
    public static void main(String[] args){
        if(args.length==0) return;
        String path=args[0];
        Charset cs = args.length>1?Charset.forName(args[1]):StandardCharsets.UTF_8;
        try(FileInputStream fis=new FileInputStream(path);
            InputStreamReader isr=new InputStreamReader(fis,cs);
            BufferedReader r=new BufferedReader(isr)){
            String line;
            while((line=r.readLine())!=null) System.out.println(line);
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
