import domain.Animal;
import domain.Cat;
import domain.Snake;
import service.AnimalService;

public class Main {
    public static void main(String[] args) {
        Animal animalOne = new Cat();
        Animal animalTwo = new Snake();
        AnimalService service  = new AnimalService(animalTwo);
        System.out.println(service.moveAnimal());
    }
}
