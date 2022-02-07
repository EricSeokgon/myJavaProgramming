package chapter24;

public class Ex12_Unit implements java.io.Serializable {
    private final long serialversionUID = 1L;
    private String name;

    public Ex12_Unit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
