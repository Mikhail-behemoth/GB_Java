//1. Создать новый список, добавить несколько строк и вывести коллекцию на экран.
//2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.
//3. Вставить элемент в список в первой позиции.
//4. Извлечь элемент (по указанному индексу) из заданного списка.
//5. Обновить определенный элемент списка по заданному индексу.
//6. Удалить третий элемент из списка.
//7. Поиска элемента в списке по строке.
//8. Создать новый список и добавить в него несколько елементов первого списка.
//9. Удалить из первого списка все элементы отсутствующие во втором списке.
//10. *Сортировка списка.
//11. *Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.

import java.util.*;
import java.util.stream.Collectors;
public class HW_3 {    
    public static void main (String[] args) {
        //1. Создать новый список, добавить несколько строк и вывести коллекцию на экран.
        System.out.println("1. Создать новый список, добавить несколько строк и вывести коллекцию на экран.");
        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(01);
        array1.add(12);
        array1.add(123);
        array1.add(4);
        array1.add(45);
        System.out.println(array1);
        array1.forEach(i -> System.out.print(i + " "));
        System.out.println();
        
        //2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.
        System.out.println();
        System.out.println("2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.");
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Blue", "Brown", "Purple"));
        String color = "Yellow";
        colors.add(0, color);
        System.out.println(colors);

        for (int i = 0; i < colors.size(); i++) {
            String tmp1 =colors.get(i)+"!";
            colors.set(i, tmp1);           
        }
        System.out.println(colors);
        
        //3. Вставить элемент в список в первой позиции.
        System.out.println();
        System.out.println("3. Вставить элемент в список в первой позиции.");
        array1.add(0, 1234);
        System.out.println(array1);

        //4. Извлечь элемент (по указанному индексу) из заданного списка.
        System.out.println();
        System.out.println("4. Извлечь элемент (по указанному индексу) из заданного списка.");
        int tmp = array1.get(2);
        System.out.println(tmp);
        
        //5. Обновить определенный элемент списка по заданному индексу.
        System.out.println();
        System.out.println("5. Обновить определенный элемент списка по заданному индексу.");
        array1.set(2, 0);
        System.out.println(array1);

        //6. Удалить третий элемент из списка.
        System.out.println();
        System.out.println("6. Удалить третий элемент из списка.");
        array1.remove(2);
        System.out.println(array1);

        //7. Поиска элемента в списке по строке.
        System.out.println();
        System.out.println("7. Поиска элемента в списке по строке.");
        List<String> result = colors.stream()
            .filter(i-> i.contains("e"))
            .collect(Collectors.toList());
        System.out.println(result);

        //8. Создать новый список и добавить в него несколько елементов первого списка.
        System.out.println();
        System.out.println("8. Создать новый список и добавить в него несколько елементов первого списка.");
        ArrayList<Integer> array2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int tmp1 = array1.get(i);
            array2.add(i, tmp1);
        }
        System.out.println(array2);

        //9. Удалить из первого списка все элементы отсутствующие во втором списке.
        System.out.println();
        System.out.println("9. Удалить из первого списка все элементы отсутствующие во втором списке.");
        array1.retainAll(array2);
        System.out.println(array1);

        //10. *Сортировка списка.
        System.out.println();
        System.out.println("10. *Сортировка списка.");
        Collections.sort(array1);
        System.out.println(array1);


        //11. *Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.
        System.out.println();
        System.out.println("11. *Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.");
        long Start1 = System.currentTimeMillis();        
        for (int i = 0; i < 1000000; i++) {
            array1.add(new Random().nextInt(10));
        }
        System.out.println(System.currentTimeMillis() - Start1);

        LinkedList<Integer> strings = new LinkedList<>();
        Start1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            strings.add(new Random().nextInt(10));
        }
        System.out.println(System.currentTimeMillis() - Start1);
        
        // 51 и 185 мс
    }
}