package ClassWork.CW6;


class Book {
    private String name;
    private String author;
    private int year;

    Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    Book(String name) {
        this.name = name;
    }

    Book(String author, int year) {
        this.author = author;
        this.year = year;
    }

    Book(int year) {
        this.year = year;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getName() {
        return name;
    }

    public String setAuthor(String author) {
        return this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public int setYear(int year) {
        return this.year = year;
    }

    public int getYear() {
        return year;
    }

}
