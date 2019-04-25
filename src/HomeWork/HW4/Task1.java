package HomeWork.HW4;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[]array=new int[10];
        for (int i=1;i<= array.length; i++) {
            array[i-1]=i;
        }
        System.out.println(Arrays.toString(array));
        for (int i =1; i<=array.length;i++){
            if (i%2==1){
                array[i]=0;

            }
        }
        System.out.println(Arrays.toString(array));
}
}