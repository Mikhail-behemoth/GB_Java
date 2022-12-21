package HW_2_2;

public class Dog extends Animal implements Swimable {
    public Dog(String nickname, int legs, String owner){
        super(nickname, legs, owner);
    }

    @Override
    public String swim() {
        // TODO Auto-generated method stub
        return "yes 1km/h";
    }

    
}
