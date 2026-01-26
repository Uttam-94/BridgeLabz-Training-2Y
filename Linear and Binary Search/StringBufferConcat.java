public class StringBufferConcat {
    public static String concat(String[] parts){
        StringBuffer buf=new StringBuffer();
        for(String p:parts) buf.append(p);
        return buf.toString();
    }
    public static void main(String[] args){
        String[] sample = args.length>0?args:new String[]{"hello"," ","world"};
        System.out.println(concat(sample));
    }
}
