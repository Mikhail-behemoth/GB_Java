// Создать словарь HashMap. Обобщение <Integer, String>.
// Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
// Изменить значения дописав восклицательные знаки. *Создать TreeMap, заполнить аналогично.
// *Увеличить количество элементов таблиц до 1000 случайными ключами и общей строкой.
// **Сравнить время прямого и случайного перебора тысячи элементов словарей.

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Random;

public class HW_5 {    
    public static void main (String[] args) {
        // Создать словарь HashMap. Обобщение <Integer, String>.
        Map <Integer, String> map = new HashMap<>();

        // Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
        map.put(1, "Red");
        map.put(2, "Blue");
        map.put(3, "Brown");
        
        // Изменить значения дописав восклицательные знаки. *Создать TreeMap, заполнить аналогично.
        Set<Integer> keySet = map.keySet();
        for (int i: keySet) {
            map.compute(i, (k, v) -> v = v + "!");
        }
        System.out.println(map);
        
        // *Увеличить количество элементов таблиц до 1000 случайными ключами и общей строкой.
        while (map.size() < 100000) {
            int j = new Random().nextInt(100001);
            map.put(j, "New");
        }
        System.out.println(map.size());       

        Map <Integer, String> mapthree = new TreeMap<>();
        mapthree.put(1, "Red");
        mapthree.put(2, "Blue");
        mapthree.put(3, "Brown");
        while (mapthree.size() < 100000) {
            int j = new Random().nextInt(100001);
            mapthree.put(j, "New");
        }
        System.out.println(mapthree.size());         

        // **Сравнить время прямого и случайного перебора тысячи элементов словарей.
        long Start = System.currentTimeMillis();
        Set<Integer> keySet2 = map.keySet();
        for (int i: keySet2) {
            map.compute(i, (k, v) -> v = v + "!");
        }
        System.out.println(System.currentTimeMillis() - Start);
        
        Start = System.currentTimeMillis();
        Set<Integer> keySet3 = mapthree.keySet();
        for (int i: keySet3) {
            mapthree.compute(i, (k, v) -> v = v + "!");
        }
        System.out.println(System.currentTimeMillis() - Start);
        
        //10 и 12 мс
    }
}