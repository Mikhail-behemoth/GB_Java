//Создать интерфейс, скорость плаванья. Добавить новое животное, способное плавать. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

package HW_2_2;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Dog("Dimka", 4, "Oleg"))
            .addAnimal(new Capybara("Swinka", 4, "Oleg"));
        System.out.println(zoo.toString());

        System.out.println(zoo.swimming());
    }
}
