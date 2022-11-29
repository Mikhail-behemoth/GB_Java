//3. *Напишите программу на Java, чтобы перевернуть строку с помощью рекурсии.

public class HW_2_3 {    
    private static void swap(char[] c, int i, int j)
    {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
 
    // Рекурсивная функция для обращения заданной строки
    public static void reverse(char[] c, int l, int h)
    {
        if (l < h)
        {
            swap(c, l, h);
            reverse(c, l + 1, h - 1);
        }
    }
 
    public static void main(String[] args)
    {
        String str = "А роза упала на лапу Азора";
 
        char[] c = str.toCharArray();
        reverse(c, 0, c.length - 1);
        str = new String(c);
 
        System.out.print("Reverse of the given string is " + str);
    }
}