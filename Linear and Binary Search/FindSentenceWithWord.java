public class FindSentenceWithWord {
    public static String find(String[] sentences,String word){
        for(String s:sentences) if(s.contains(word)) return s;
        return "Not Found";
    }
    public static void main(String[] args){
        if(args.length<2){
            String[] s={"this is a test","hello world"};
            System.out.println(find(s,"hello"));
            return;
        }
        String word=args[0];
        String[] sentences=new String[args.length-1];
        System.arraycopy(args,1,sentences,0,sentences.length);
        System.out.println(find(sentences,word));
    }
}
