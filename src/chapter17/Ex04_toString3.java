package chapter17;

class Book4 {
    String author;

    public String getAuthor() { //메서드 오버라이딩
        return author;
    }
}

public class Ex04_toString3 {
    public static void main(String[] args) {
        Book4 myBook = new Book4();
        myBook.author = "홍길동";
        System.out.println(myBook.author); //참조 변수의 멤버 변수의 값 출력
        System.out.println(myBook); //객체 자체 출력
    }
}
