package HW_2_4;

public class Comandor extends Warrior<Weapon, Shield> { //01:33

    public Comandor(String name, int healpoint, Weapon weapon, Shield shield) {
        super(name, healpoint, weapon, shield);
    }
    
    @Override
    public String toString() {
        return "Командир: " + super.toString();
    }
}
