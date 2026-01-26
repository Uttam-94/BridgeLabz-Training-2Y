import java.io.*;
public class ConsoleToFile {
    public static void main(String[] args){
        if(args.length==0) return;
        String path=args[0];
        try(BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter out=new BufferedWriter(new FileWriter(path,true))){
            String line;
            while((line=in.readLine())!=null){
                if(line.equals("exit")) break;
                out.write(line);
                out.newLine();
            }
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}
