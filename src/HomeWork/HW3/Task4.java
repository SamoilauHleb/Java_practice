package HomeWork.HW3;

import static java.lang.Math.PI;
import static java.lang.Math.cos;

public class Task4 {
    public static void main(String[] args) {
            double cos = cos(180);
            double pi = PI;
            int number1 = 256;
            int number2 = 8;
            double number3 = 2;
            double power = 3;
            double cosresult = Math.toRadians(cos);
            int division = number1/number2;
            double powerresult = Math.pow(number3,power);
            double answer = ((cosresult+division-powerresult)*pi);
        System.out.println("(cos(180)+256/8-2^3)*Pi="+answer);







    }
}
