//7. **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.

public class HW_2_7 {    
    public static void main (String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            builder.append("=");
        }
        long Start1 = System.currentTimeMillis();        
        //System.out.println(builder);
        for (int i = 0; i < 100000; i++) {
            builder.replace(5*i, 5*i+1, "равно");
        }
        System.out.println(System.currentTimeMillis() - Start1);
        //System.out.println(builder);

        String Str = new String();
        for (int i = 0; i < 100000; i++) {
            Str += "=";
        }
        //System.out.println(Str);
        long Start2 = System.currentTimeMillis();
        String Str2 = Str.replace("=", "равно");
        System.out.println(System.currentTimeMillis() - Start2);
        //System.out.println(Str2);
    }

}

// В первом случае 147 мс, во втором 4 мс