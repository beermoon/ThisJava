package ch05.sec08;

public class ArrayReferenceObjectExample {
    public static void main(String[] args) {

        String[] familyArray = new String[3];
        familyArray[0] = "가족";
        familyArray[1] = "가족";
        familyArray[2] = new String("가족");

        System.out.println(familyArray[0] == familyArray[1]);
        System.out.println(familyArray[0] == familyArray[2]);
        System.out.println(familyArray[1].equals(familyArray[2]));



    }
}
