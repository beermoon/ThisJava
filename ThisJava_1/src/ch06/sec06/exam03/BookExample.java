package ch06.sec06.exam03;

public class BookExample {
    public static void main(String[] args) {

        Book mybook = new Book();

        System.out.println("제목 : " + mybook.title);
        System.out.println("저서 : " + mybook.author);
        System.out.println("회사 : " + mybook.company);
        System.out.println("책번호 : " + mybook.bookNum);

        mybook.author = "이명박";
        System.out.println("저서 : " + mybook.author);
    }
}
