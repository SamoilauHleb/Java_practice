package Test1;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[]array = new int[]{1,3,5,7};
        int buf;
        for (int i =0;i<array.length-1;i++){
            buf = array[i];
            array[i]=array[i+1];
            array[i+1]=buf;

        }
        System.out.println(Arrays.toString(array));
    }
}
