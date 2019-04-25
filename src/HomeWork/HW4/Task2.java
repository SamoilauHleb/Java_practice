package HomeWork.HW4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[]array=new int[5];
        int[]array2=new int[5];

        for (int i=0;i< array.length; i++){
            array[i]=(int)(Math.random()*6);
            array2[i]=(int)(Math.random()*6);

        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        double number1 = 0;
        double number2 = 0;
        for (int i = 0; i<5; i++){
            number1 +=array[i];
            number2 +=array2[i];
            if (number1>number2) {
                System.out.println("Среднее арифметическое первого массива (array) больше среднего арифметического второго массива(array2)");
            }
            else if (number1<number2){
                System.out.println("Среднее арифметическое первго массива (array) меньше среднего арифметического второго массива (array2)");
                            }
            else {
                System.out.println("Средние арифметические массивов равны(array)");
            }

        }

    }
}
