package HW_4_2;
import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        while (true) {
            System.out.print("Введите дробное число: ");
 
            String line = scan.nextLine();
            boolean result = line.matches("\\D.*");
 
            System.out.printf("Строка %s символы отличные от цифр\n",
                    (result) ? "ИМЕЕТ" : "НЕ ИМЕЕТ");
 
            if (!result) {
                System.out.println(line);
                break;
            }
        }
    }
}