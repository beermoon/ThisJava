package test.prac1.exam04;

public class testExample {
    public static void main(String[] args) {
        System.out.println("=== new Person(\"홍길동\") 실행 ===");
        test t1 = new test("홍길동");

        System.out.println("=== p1.Person(\"김철수\") 실행 ===");
        t1.test("김철수");

    }
}
