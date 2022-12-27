package HW_2_4;

public abstract class Bow implements Weapon {
    public abstract int range(); //0:23 min

    @Override
    public String toString() {
        return String.format("Радиус поражения %d величина урона %d", range(), damage());
    }
}
