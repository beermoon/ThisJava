package test.prac1.exam04;

public class test {

    String name;

    public test(String name) {
        System.out.println("👉 생성자 실행!");
        this.name = name;
    }

    public void test(String name) {
        System.out.println("👉 메서드 실행!");
        this.name = name;
    }

}
