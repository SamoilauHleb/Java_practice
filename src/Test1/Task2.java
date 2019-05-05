package Test1;


import java.util.Arrays;
//Не забывай про форматирование кода: ctrl + alt + l в идее
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 1; i <= array.length; i++) {
            array[i - 1] = i;
        }
        System.out.println(Arrays.toString(array));
    }
}
