package Test1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        System.out.printf("%d!=%d",number,factorial(number));
    }
    static int factorial(int number){
        if (number==1){
            return 1;
        }
        return factorial(number-1)*number;
    }
}
