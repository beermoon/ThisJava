package ch06.sec07.exam04;

public class Car {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;
    int carNum;

    // 생성자 선언
    Car() {}

    Car(String model) {
        this.model = model;
    }

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    Car(String model, String color, int maxSpeed , int carNum) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.carNum = carNum;
    }

}
