//Реализовать множество (set) с помощью TreeMap. Создать метод add, добавляющий элемент в ваше множество. Объявить и инициализировать компаратор с обратной (от большего к меньшеиу) логикой сортировки чисел. Объявить и инициализировать TreeSet использующий ваш компаратор. Добавить несколько эллементов в сет и вывести в консоль.

import java.util.*;
 
// Пользовательский компаратор для сортировки карты в соответствии с естественным порядком ее значений
class CustomComparator<K,V extends Comparable> implements Comparator<K>
{
    private Map<K, V> map;
 
    public CustomComparator(Map<K, V> map) {
        this.map = new HashMap<>(map);
    }
 
    @Override
    public int compare(K s1, K s2) {
        return map.get(s2).compareTo(map.get(s1));
    }
}

class HW {    
    Map<String, String> myint = new TreeMap<>();
    
    public void methodAdd2 (String s1, String s2) {
        myint.put(s1, s2);
    }
}
 
class Main
{
    // Общий метод для сортировки карты по значениям с использованием `TreeMap`
    public static <K, V> Map<K, V> sortByValues(Map<K, V> map)
    {
        Comparator<K> comparator = new CustomComparator(map);
 
        Map<K, V> sortedMap = new TreeMap<>(comparator);
        sortedMap.putAll(map);
 
        return sortedMap;
    }
 
    public static void main(String[] args)
    {
        
        HW hw_6 = new HW ();
 
        hw_6.methodAdd2("India", "New Delhi");
        hw_6.methodAdd2("USA", "Washington D.C.");
        hw_6.methodAdd2("Japan", "Tokyo");
        hw_6.methodAdd2("China", "Beijing");
 
        Map<String, String> country = new TreeMap<>();
        country = sortByValues(hw_6.myint);
 
        System.out.println("Sorted map by values: " + country);
    }
}