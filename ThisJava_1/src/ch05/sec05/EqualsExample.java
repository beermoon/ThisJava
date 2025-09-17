package ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {

        String strVal1 = "홍길동";
        String strVal2 = "홍길동";

        if (strVal1 == strVal2) {
            System.out.println("strVal1과 strVal2 는 참조가 같음");
            System.out.println("strVal1" + strVal1);
            System.out.println("strVal1" + strVal2);
        } else {
            System.out.println("strVal1과strVal2 참조가 다름 ");
        }

        if (strVal1.equals(strVal2)) {
            System.out.println("strVal1과strVal2 문자열이 같음 ");

        }

        String strVal3 = new String("홍길동");
        String strVal4 = new String("홍길동");

        if (strVal3 == strVal4) {
            System.out.println("strVal3 과strVal4 참조가 같음 ");

        } else {
            System.out.println("strVal3 과strVal4 참조가 다름 ");
            System.out.println("strVal1" + strVal1);
            System.out.println("strVal1" + strVal2);

        }

        if (strVal3.equals(strVal4)) {
            System.out.println("strVal3 과 strVal4  문자열이 같음");
        }
    }
}
