package chapter14;

public class Ex07_length {
    public static void main(String[] args) {
        String str = "apple";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'l') {
                break;
            }
            System.out.println(ch);
        }
    }

}
