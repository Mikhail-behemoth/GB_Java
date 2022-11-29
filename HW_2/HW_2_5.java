//5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().

public class HW_2_5 {    
    public static void main (String[] args) {
        int a = 3;
        int b = 56;
        StringBuilder builder = new StringBuilder();
        builder.append(a + " + " + b + " = " + (a + b));
        builder.append(" " + a + " - " + b + " = " + (a - b));
        builder.append(" " + a + " * " + b + " = " + (3*56));
        System.out.println(builder);
        CharSequence cs = "равно";
        builder.deleteCharAt(7);
        builder.insert(7, cs);
        builder.deleteCharAt(23);
        builder.insert(23, cs);
        builder.deleteCharAt(40);
        builder.insert(40, cs);
        System.out.print(builder);
    }
}