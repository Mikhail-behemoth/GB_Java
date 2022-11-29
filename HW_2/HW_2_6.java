//6. *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().

public class HW_2_6 {    
    public static void main (String[] args) {
        int a = 3;
        int b = 56;
        StringBuilder builder = new StringBuilder();
        builder.append(a + " + " + b + " = " + (a + b));
        builder.append(" " + a + " - " + b + " = " + (a - b));
        builder.append(" " + a + " * " + b + " = " + (3*56));
        System.out.println(builder);
        builder.replace(7, 8, "равно");
        builder.replace(23, 24, "равно");
        builder.replace(40, 41, "равно");
        System.out.print(builder);       
    }
}