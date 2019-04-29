package ClassWork.CW6;

public class Task2 {
    public static void main(String[] args) {
        Book AroundTheWorld = new Book("AroundTheWorld", "Uknown", 2019);
        String name = AroundTheWorld.getName();
        String author = AroundTheWorld.getAuthor();
        int year = AroundTheWorld.getYear();
        System.out.println(name + " " + author + " " + year);
        Book ops = new Book("Uknown");
        String opsName = ops.getName();
        opsName = "Xachapyri";
        System.out.println(opsName);
        int opsYear = ops.setYear(1131);
        System.out.println(opsYear);
    }

}
