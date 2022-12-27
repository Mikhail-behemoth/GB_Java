package HW_2_4;

public class SmallWoodenShield extends WoodenShield {

    @Override
    public int defense() {
        return 30;
    }

    @Override
    public String toString() {
        return "Небольщой деревянный щит: "+ super.toString();
    }
}