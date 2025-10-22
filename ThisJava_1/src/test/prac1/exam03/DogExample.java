package test.prac1.exam03;

public class DogExample {
    public static void main(String[] args) {
        Dog firstDog = new Dog("칠숙이","샤르고종");
        Dog secondDog = new Dog("오숙이","이브종");

        System.out.println("첫번째 이름 : " + firstDog.name );
        System.out.println("첫번째 품종 : " + firstDog.breed );

        System.out.println("2번째 이름 : " + secondDog.name );
        System.out.println("2번째 품종 : " + secondDog.breed );
    }
}
