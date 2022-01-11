package chapter07;

public class Ex01_MethodType {
    public static void main(String[] args) {
        sayHello();

        addTwoNum1(5, 2);

        int age = getAge();
        System.out.println(age);
        System.out.println(getAge());

        int sum = addTwoNum2(1, 2);
        System.out.println("합은 : " + sum);
    }

    private static int addTwoNum2(int num1, int num2) {
        return num1 + num2;
    }

    private static int getAge() {
        return 20;
    }

    private static void addTwoNum1(int num1, int num2) {
        int nResult = num1 + num2;
        System.out.println(nResult);
    }

    private static void sayHello() {
        System.out.println("Hello");
    }
}
