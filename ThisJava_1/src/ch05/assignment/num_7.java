package ch05.assignment;

public class num_7 {
    public static void main(String[] args) {

        int[] array = {1,5,3,8,2};
        int max = array[0];
        int min = array[0];


        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("최대값 " + max);
        System.out.println("최소값 " + min);
    }
}
