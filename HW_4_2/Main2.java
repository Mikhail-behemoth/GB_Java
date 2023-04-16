package HW_4_2;

public class Main2 {
    public static void main(String[] args) {
        // Задание 2
        int[] intArray = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};        
        
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}