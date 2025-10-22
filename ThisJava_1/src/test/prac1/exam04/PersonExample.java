package test.prac1.exam04;

public class PersonExample {
    public static void main(String[] args) {

        // 객체 생성
        Person p1 = new Person("홍길동",12);
        Person p2 = new Person("나나",32);

        System.out.println("p1 이름 : " + p1.name);
        System.out.println("p1 나이 : " + p1.age);

        System.out.println("p2 이름 : " + p2.name);
        System.out.println("p2 나이 : " + p2.age);
    }
}
