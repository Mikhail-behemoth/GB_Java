package HW_2_4;

public abstract class WoodenShield implements Shield {
    
    @Override
    public String toString() {
        return String.format("Защита %d", defense());
    }
}
