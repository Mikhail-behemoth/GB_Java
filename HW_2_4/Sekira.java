package HW_2_4;

public class Sekira implements Weapon {

    @Override
    public int damage() {
        return 20;
    }
    
    @Override
    public String toString() {
        return String.format("Секира наносит урон: %d ", damage());
    }
}
