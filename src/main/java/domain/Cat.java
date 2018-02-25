package domain;

public class Cat implements Animal{
    private String state;
    private String SLEEPING_STATE = "sleeping";
    private String HUNGRY_STATE = "hungry";

    public Cat() {
    }

    public Cat(String state) {
        this.state = state;
    }

    public void speak() {
        System.out.println("Meow!");
    }

    public void hear() {
        System.out.println("domain.Cat's hearing");
    }

    public String move() {
        System.out.println("Running");
        return "Running";
    }

    public String eat() {
        if(state == null){
            return "";
        }else if(state.equals(SLEEPING_STATE)){
            return "I can't eat, I'm sleeping";
        }
        return "Yayyy!, I got food";
    }
}
