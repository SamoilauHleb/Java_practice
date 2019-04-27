package Test1;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[]array = new int[]{1,2,3,4,5,6,7,8,9,10};
        for (int i=0;i<array.length;i++){
            if (array[i]==5){
                continue;
            }
            System.out.println(array[i]+".");
        }
    }
}
