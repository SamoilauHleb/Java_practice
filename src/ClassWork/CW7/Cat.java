package ClassWork.CW7;

public class Cat extends Animal {
    private String soft;
    private String color;
    private int size;

    public Cat(String name, int age, String kind, String soft, String color, int size) {
        super(name, age, kind);
        this.soft = soft;
        this.color = color;
        this.size = size;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("мягкий:" + soft + " " + "цвет:" + color + " " + "размер:" + size);
    }

    public static void main(String[] args) {
        Cat cats = new Cat("Jerry", 3, "Siamese", "fluffy", "Black", 50);
        cats.displayInfo();

    }
}




