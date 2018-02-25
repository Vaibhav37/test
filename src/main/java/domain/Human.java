package domain;

public class Human implements Animal {
    public String eat() {
        System.out.println("Chewing");
        return "";
    }

    public void speak() {
        System.out.println("mc/bc");
    }

    public void hear() {
        System.out.println("human's hearing");
    }

    public String move() {
        return "Walking";
    }
}
