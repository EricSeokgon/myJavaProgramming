package chapter13.com.company;

import chapter13.com.company.area.Circle;

public class Ex93_CircleUsing {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5);
        System.out.println("반지름 3.5 원 넓이 : " + circle.getArea());

        chapter13.com.company.circumference.Circle circle1 = new chapter13.com.company.circumference.Circle(3.5);
        System.out.println("반지름 3.5 원 둘레 : "+circle1.getCircumference());
    }
}
