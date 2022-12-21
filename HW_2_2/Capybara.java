package HW_2_2;

public class Capybara extends Animal implements Swimable {
    public Capybara(String nickname, int legs, String owner){
        super(nickname, legs, owner);
    }

    @Override
    public String swim() {
        // TODO Auto-generated method stub
        return "yes 3km/h";
    }
}
