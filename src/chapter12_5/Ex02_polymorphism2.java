package chapter12_5;

abstract class Human {
    abstract void print();
}

class Man extends Human {
    void print() {
        System.out.println("남자 생성");

    }
}

class Woman extends Human {
    void print() {
        System.out.println("여자 생성");
    }
}

public class Ex02_polymorphism2 {

    public static Human humanCreate(int kind) {
        if (kind == 1) {
            return new Man();
        } else {
            return new Woman();
        }
    }

    public static void main(String[] args) {
        Human h1 = humanCreate(1);
        h1.print();

        Human h2 = humanCreate(2);
        h2.print();
    }
}
