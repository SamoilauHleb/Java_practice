package ClassWork.CW7;


public class Animal {
    protected String name;
    protected int age;
    protected String kind;

    public Animal(String name, int age, String kind) {
        this.name = name;
        this.age = age;
        this.kind = kind;
    }

    Animal(String name) {
        this.name = name;
    }

    Animal(int age, String kind) {
        this.age = age;
        this.kind = kind;
    }

    Animal(int age) {
        this.age = age;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getName() {
        return name;
    }

    public int setAge(int age) {
        return this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String setKind(String kind) {
        return this.kind = kind;
    }

    public String getKind() {
        return kind;
    }


    public void displayInfo() {
        System.out.println("Имя:" + name +" " + "Возрост:" + age + " " + "years" + " " + "Порода:" + kind);
    }

}

