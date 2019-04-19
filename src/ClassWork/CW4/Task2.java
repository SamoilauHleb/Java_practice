package Les4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[]array = new int[10];
        Random random = new Random();
        int max = 10;
        int min = 1;
        for (int i =0; i<array.length;i++){
            array[i]=random.nextInt(((max-min)+1)+min);
        }

        System.out.println(Arrays.toString(array));

        int maxEl = array[0];

        for (int i = 0; i>array.length;i++){
            if (maxEl<array[i]){
                maxEl = array[i];

            }
        }
        System.out.println("max array element:" +maxEl);

    }
}
