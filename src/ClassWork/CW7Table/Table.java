package ClassWork.CW7Table;

public class Table {
    public static void main(String[] args) {
    }

    static int counter;
    int size;
    String color;

    public Table(int size, String color) {
        this.size = size;
        this.color = color;
        counter++;
    }

    public int getCounter() {
        return counter;

    }



}
