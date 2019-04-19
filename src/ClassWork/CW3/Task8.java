package Les3;

public class Task8 {
    public static void main(String[] args) {
        int rew = 5;
        int wer = 7;
        rew = rew^wer;
        wer = rew^wer;
        rew = wer^rew;
        System.out.println("rew="+rew);
        System.out.println("wer="+wer);


    }
}
