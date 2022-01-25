package chapter18;

enum Human2 {MAN, WOMAN}

enum Machine2 {TANK, AIRPLANE}

public class Ex02_Enum {
    public static void main(String[] args) {
        createUnit(Machine2.TANK);
    }

    private static void createUnit(Machine2 kink) {
        switch (kink) {
            case TANK:
                System.out.println("탱크를 만듭니다.");
                break;
            case AIRPLANE:
                System.out.println("비행기를 만듭니다.");
                break;
        }
    }
}
