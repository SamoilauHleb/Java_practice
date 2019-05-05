package ClassWork.CW7;

public class Dog extends Animal {
    private int growth;
    private String taillength;
    private String eyeColor;

    public Dog(String name, int age, String kind, int growth, String taillength, String eyeColor) {
        super(name, age, kind);
        this.growth = growth;
        this.taillength = taillength;
        this.eyeColor = eyeColor;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("рост:" + growth + " " + "длина хвоства:" + taillength + " " + "цвет глаз:" + eyeColor);
    }

    public static void main(String[] args) {
        Dog roy = new Dog("Roy", 1, "Beagle", 30, "long", "brown");
        roy.displayInfo();
    }
}


