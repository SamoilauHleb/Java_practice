package HomeWork.HW4;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = 0;
        size = sc.nextInt();
        if (size>=3){
        int []array = new int[size];
        for (int i=1;i<= array.length; i++) {
            array[i-1]=i;
        }

        System.out.println(Arrays.toString(array));}

        else  {
            System.out.println("Введите другое число");
        }


        }


        }






