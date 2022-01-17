package chapter12_4;

abstract class Building {
    int health;

    abstract void doBuild();
}

interface Fly {
    void flyBuilding();
}

class Barracks extends Building implements Fly {
    void doBuild() {
        System.out.println("인간형 유닛 생산 건물을 짓습니다.");
    }

    void doMakerMarine() {
        System.out.println("총쏘는 유닛을 생산합니다.");
    }

    public void flyBuilding() {
        System.out.println("건물이 날아서 이동하게 합니다.");
    }
}

class Factory extends Building implements Fly {
    void doBuild() {
        System.out.println("기갑형 유닛 생산 건물을 짓습니다.");
    }

    void doMakeTank() {
        System.out.println("탱크 유닛을 생산합니다.");
    }

    public void flyBuilding() {
        System.out.println("건물이 날아서 이동하게 합니다.");
    }
}

class Bunker extends Building {
    void doBuild() {
        System.out.println("인간형 유닛이 숨을 건물을 짓습니다.");
    }

    void doDefense() {
        System.out.println("숨은 유닛을 적의 공격으로부터 보호합니다.");
    }
}

public class Ex02_Starcraft {
    public static void main(String[] args) {
        Barracks barracks = new Barracks();
        barracks.doBuild();
        barracks.doMakerMarine();
        barracks.flyBuilding();

        Factory factory = new Factory();
        factory.doBuild();
        factory.doMakeTank();
        factory.flyBuilding();

        Bunker bunker = new Bunker();
        bunker.doBuild();
        bunker.doDefense();
    }
}
