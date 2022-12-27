package HW_2_4;

// Создать класс щита, разработать разные типы щитов, добавить в семейство классов Warriors обобщения в виде щитов. Реструктуризировать код в конечных классах семейства Warriors.

public class Main {
    public static void main(String[] args) {
        Comandor comandor = new Comandor("Легалас", 150, new LongBow(), new LargeIronShield());
        Team<Archer> archers = new Team<>(comandor);
        System.out.println(comandor);
        archers.addWarior(new Archer("Гимли", 100, new LongBow(), new SmallWoodenShield()));
        archers.addWarior(new Archer("Бимли", 100, new LongBow(), new SmallWoodenShield()));
        archers.addWarior(new Archer("Димли", 100, new LongBow(), new SmallWoodenShield()));

        archers.forEach (item -> System.out.println(item));
        //0:54 тайм коды семинара
    }
}
