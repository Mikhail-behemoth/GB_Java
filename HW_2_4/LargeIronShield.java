package HW_2_4;

public class LargeIronShield extends IronShield {

    @Override
    public int defense() {
        return 100;
    }

    @Override
    public String toString() {
        return "Большой железный щит: "+ super.toString();
    }
}