package Test1;
import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[][] array1 = new int[3][];
        Random rand = new Random();
        int min = 1;
        int max = 3;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = new int[rand.nextInt((max - min) + 1) + min];

        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = rand.nextInt((max - min) + 1) + min;

            }

        }
        
        //Сделай нормальный вывод в задаче, чтобы строки и столбцы были видны
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + ",");
            }
            System.out.println();
        }
    }
}
