package ch06.exercise.n13;

public class MemberExample {
    public static void main(String[] args) {
        Member user1 = new Member("홍길동","hong");

        System.out.println("유저 이름과 성 : " + user1.name + user1.id);
    }
}
