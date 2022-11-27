//3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1

public class HW_1_3 {    
    public static void main (String[] args) {
        int n = 2;
        int MAX_VALUE = 20;
        int[] m1 = new int[10];
        for (int i = 0; i < m1.length;) {
            for (int j = 1; j <= MAX_VALUE; j++) {
                if (j % n == 0) {
                m1[i] = j;
                System.out.print(m1[i] + " ");
                i++;   
                }
            }
        }
    }
}