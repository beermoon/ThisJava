package ch05.assignment;

public class num_8 {
    public static void main(String[] args) {

        int sum = 0;
        int[][] array = {
                {95,86},
                {83,92,96},
                {78,83,93,87,88}
        };

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {

               sum += array[i][k];
            }
        }

        System.out.println(sum);

    }
}
