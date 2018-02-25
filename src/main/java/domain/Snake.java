package domain;

public class Snake implements Animal {
    public String eat() {
        System.out.println("snake eating");
        return "";
    }

    public void speak() {
        System.out.println("Shhhhhhhhhhh.");
    }

    public void hear() {
        System.out.println("domain.Snake deaf");
    }

    public String move() {
        return "Crawling!";
    }
}
