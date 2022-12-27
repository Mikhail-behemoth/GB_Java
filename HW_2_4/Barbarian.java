package HW_2_4;

public class Barbarian extends Warrior<Axe, IronShield> {
    public Barbarian(String name, int healpoint, Axe weapon, IronShield shield) { //01:34
        super(name, healpoint, weapon, shield);
    }

    @Override
    public String toString() {
        return "Варвар: " + super.toString();
    }
}
