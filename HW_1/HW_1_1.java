//1. Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i

public class HW_1_1 {
    public static void main (String[] args) {
        double i = (int)(Math.random()*((1000+1000)+1))-1000;
        System.out.println(i);
    }
}