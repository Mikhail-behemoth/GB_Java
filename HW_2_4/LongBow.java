package HW_2_4;

public class LongBow extends Bow {

    @Override
    public int damage() {
        return 10;
    }

    @Override
    public int range() {
        return 100;
    }
    // 0:24 аналога щита для длинного лука нет

    @Override
    public String toString() {
        return "Большой лук: "+ super.toString();
    }
}
