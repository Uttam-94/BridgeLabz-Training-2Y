package level3;

public class Q7 {
    public static void main(String[] args) {
        String value = "abc";  // not a valid number

        // This will throw NumberFormatException
        int num = Integer.parseInt(value);

        System.out.println(num);
    }
}
