import java.util.ArrayList;
import java.util.List;

//На основе кода с урока добавить еще один класс продукта, (Молоко, шоколад ,и т.п., можно добавить несколько классов), они должны наследоваться от класса Product, надо переопределить метод toString и попробовать включить эти классы в VendingMachine, вывести список товаров из VendingMachine

public class HW_2_1 {
    public static void main(String[] args) {
        Product water = new Product("h2o", 15.3);
        System.out.println(water);

        VendingMachine mach1 = new VendingMachine();
        System.out.println(mach1);

        List<Product> tovary = new ArrayList<>();
        tovary.add(water);
        tovary.add(new Product("vine", 12));
        tovary.add(new Product("dust", 10));
        tovary.add(new Soda("kind", 19, "grapes"));
        tovary.add(new Chocolate("Chocolateraisin", 5, "raisin"));

        VendingMachine mach2 = new VendingMachine(tovary);
        System.out.println(mach2);
        System.out.println(mach2.findByName("kind"));
    }
}