package chapter12_5;

interface Cry {
    void cry();
}

class Cat implements Cry {

    public void cry() {
        System.out.println("야옹~");
    }
}

class Dong implements Cry {

    public void cry() {
        System.out.println("멍멍!");
    }
}

public class Ex03_instanceof {
    public static void main(String[] args) {
        Cry test1 = new Cat();
        //Cry test1 = new Dog();

        if (test1 instanceof Cat) {
            test1.cry();
        } else if (test1 instanceof Dong) {
            System.out.println("고양이가 아닙니다.");
        }
    }
}
