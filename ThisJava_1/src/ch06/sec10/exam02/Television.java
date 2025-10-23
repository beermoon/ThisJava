package ch06.sec10.exam02;

public class Television {
    static String company = "MyCompany";
    static String model = "LCD";
    static String info;
    static String info2;

    static {
        info = company + "-" + model;
    }

    static {
        info2 = company + "=" + model;

    }


}
