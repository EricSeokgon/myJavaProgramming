package chapter20;

class myData {
    public static <T> T showData(T data) {
        if (data instanceof String) {
            System.out.println("String");
        } else if (data instanceof Integer) {
            System.out.println("Integer");
        } else if (data instanceof Double) {
            System.out.println("Double");
        }
        return data;
    }
}

public class Ex09_GenericMethod {
    public static void main(String[] args) {
        myData.<String>showData("Hello World");
        myData.showData(1);
        myData.showData(1.0);
    }
}
