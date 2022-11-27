//4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

public class HW_1_4 {
    public static void main (String[] args) {
        int n = 2;
        int j = 20;
        int[] m2 = new int[10];
        for (int i = 0; i < m2.length;) {
            for (int MIN_VALUE = 0; MIN_VALUE < j; MIN_VALUE++) {
                if (MIN_VALUE % n != 0) {
                m2[i] = MIN_VALUE;
                System.out.print(m2[i] + " ");
                i++;   
                }
            }
        }
    }
}