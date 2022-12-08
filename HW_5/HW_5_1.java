//Написать приложение для ввода ФИО, возраст и пол пользователей. Данные хранить в разных списках. Сортировать пользователей по возрасту. Не вывести в порядке возрастания возрастов а именно сортировать!)

import java.util.*;
public class HW_5_1 {    
    public static void main(String[] args)
    {
        ArrayList<String> list_fname = new ArrayList<>();
        ArrayList<String> list_lname = new ArrayList<>();
        ArrayList<String> list_tname = new ArrayList<>();
        ArrayList<Integer> list_age = new ArrayList<>();
        boolean flag = true;
        while (flag) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner_age = new Scanner(System.in);
        
        System.out.println("ENter your fio: ");
        String fio = scanner.nextLine();
        System.out.println("Eneter ur age: ");
        Integer age = scanner_age.nextInt();
        list_age.add(age);
        String[] fio1 = fio.split(" ");
        if (fio1.length == 3) {
        list_fname.add(fio1[1]);
        list_lname.add(fio1[0]);
        list_tname.add(fio1[2]);
        } else if (fio1.length == 2) {
        list_lname.add(fio1[0]);
        list_fname.add(fio1[1]);
        list_tname.add("");
        } else {
        list_lname.add(fio1[0]);
        list_fname.add("");
        list_tname.add("");
        }
        System.out.println("Do u want enter next one? Y/N");
        Scanner scanner1 = new Scanner(System.in);
        String yn = scanner1.nextLine();
        if(yn.toUpperCase().equals("N")) {
        flag = false;
        }
    }
}