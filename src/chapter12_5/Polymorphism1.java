package chapter12_5;

abstract class Calc {
    int a = 5;
    int b = 6;

    abstract void plus();
}

class MyCalc extends Calc {
    void plus() {
        System.out.println(a + b);
    }

    void minus() {
        System.out.println(a - b);
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {
        MyCalc myCalc1 = new MyCalc();
        myCalc1.plus();
        myCalc1.minus();

        MyCalc myCalc2 = new MyCalc();
        myCalc2.plus();
    }

}
