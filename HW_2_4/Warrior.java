package HW_2_4;

public abstract class Warrior <T extends Weapon, S extends Shield> { //01:32
    private String name;
    private int healpoint;
    private T weapon;
    private S shield;

    
    @Override
    public String toString() {
        return String.format("имя: %s, здоровье: %d, вооружен: %s, щит: %s", name, healpoint, weapon.toString(), shield.toString()); //убрать .toString() 0:33 мин
    }
    
    public Warrior(String name, int healpoint, T weapon, S shield) {
        this.name = name;
        this.healpoint = healpoint;
        this.weapon = weapon;
        this.shield = shield;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealpoint() {
        return healpoint;
    }

    public void setHealpoint (int healpoint) {
        this.healpoint = healpoint;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    public S getShield() {
        return shield;
    }

    public void setShield(S shield) {
        this.shield = shield;
    }
}