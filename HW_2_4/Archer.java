package HW_2_4;

public class Archer extends Warrior<Bow, WoodenShield>{
    // 0:20

    public Archer(String name, int healpoint, Bow bow, WoodenShield woodenShield) {
        super(name, healpoint, bow, woodenShield);
    }

    @Override
    public String toString() {
        return "Лучник: " + super.toString();
    }
}
