package chapter12_3;

abstract class Unit {
    abstract void doMove();
}

class Marine extends Unit {
    void doMove() {
        System.out.println("마린은 두 발로 이동합니다.");
    }
}

class Zergling extends Unit {
    void doMove() {
        System.out.println("저글링은 네 발로 이동합니다.");
    }
}

public class MyStarcaraft {
    public static void main(String[] args) {
        Marine unit1 = new Marine();
        unit1.doMove();

        Zergling unit2 = new Zergling();
        unit2.doMove();
    }
}
