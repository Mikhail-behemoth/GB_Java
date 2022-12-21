package HW_2_2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal>animals = new ArrayList<>();

    public Zoo addAnimal(Animal animal){
        animals.add(animal);
        return this;
    }

    @Override
    public String toString(){
        return "Zoo {" +
        "animals=" + animals + 
        '}';
    }
    public String swimming(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Swimable item:getSwimable()) {
            stringBuilder.append(item.swim() + "\n");
        }
        return stringBuilder.toString();
    }
    private List<Swimable> getSwimable() {
        List<Swimable> result = new ArrayList<>();
        for (Animal item:animals) {
            if (item instanceof Swimable){
                result.add((Swimable) item);
            }
        }
        return result;
    }
}
