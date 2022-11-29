//4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().

public class HW_2_4 {    
    public static void main (String[] args) {
        int a = 3;
        int b = 56;
        StringBuilder builder = new StringBuilder();
        builder.append(a + " + " + b + " = " + (a + b));
        builder.append(" " + a + " - " + b + " = " + (a - b));
        builder.append(" " + a + " * " + b + " = " + (3*56));
        System.out.print(builder);
    }
}
