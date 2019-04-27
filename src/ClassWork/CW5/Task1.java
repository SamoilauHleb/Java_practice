package ClassWork.CW5;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,5,12,3,7};
        for (int a:array){
            if (a>10){
                break;
            }
            System.out.println(a);
        }
    }
}
