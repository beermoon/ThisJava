package ch05.sec11;

public class MainStringArrayArgument {
    public static void main(String[] aa) {
        if (aa.length != 2) {
            System.out.println("프로그램 입력값이 부족");
            System.exit(0);
        }
        String strNum1 = aa[0];
        String strNum2 = aa[1];

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);

    }
}
