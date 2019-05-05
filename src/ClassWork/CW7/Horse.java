package ClassWork.CW7;

public class Horse extends Animal {
    private int height;
    private boolean wearthHorseShoe;

    public Horse(String name, int age, String kind, int height, boolean wearthHorseShoe) {
        super(name, age, kind);
        this.height = height;
        this.wearthHorseShoe = wearthHorseShoe;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Рост:" + height + " " + "meters" + " " + "Надеты ли подковы?" + " " + wearthHorseShoe);
    }

    public static void main(String[] args) {
        Horse milka = new Horse("Milka", 5, "Mustang", 2, true);
        milka.displayInfo();
    }
}


