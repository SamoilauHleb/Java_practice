package HomeWork.HW4;

public class Task4 {
    public static void main(String[] args) {
        String[] original = {"Каждый","охотник","желает","знать","где","сидит","фазан"};
        for (int i =0; i<original.length;i++){
            System.out.println(original[i]);
        }
        System.out.println();
        int number1 = original.length;
        String change;
        for (int i=0;i<number1/2;i++){
            change=original[number1-i-1];
            original[number1-i-1]=original[i];
            original[i]=change;

        }
        for (int i=0; i<original.length;i++){
            System.out.println(original[i]);
        }
    }
}
