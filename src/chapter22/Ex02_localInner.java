package chapter22;

import org.w3c.dom.ls.LSOutput;

class HumanCamp2 {
    private int speed = 10;
    public void getMarine() {
        class Marine2 {
            public void move() {
                System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n", speed);
            }
        }
        Marine2 inner = new Marine2();
        inner.move();
    }
}

public class Ex02_localInner {
    public static void main(String[] args) {
        HumanCamp2 hc = new HumanCamp2();
        hc.getMarine();
    }
}
