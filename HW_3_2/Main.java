package HW_3_2;

public class Main {
    public static void main(String[] args){
        int[] array2 = new int[] {
            4, 2, 5, 2, 1, 6, 6, 7, 1
        } ;

        sort(array2);

        for (int i = 0; i < array2.length; i++){
            System.out.print(array2[i] + " ");
        }
    }

    public static void sort(int[] array){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int element : array)
        {
            if (element < min)
            {
                min = element;
            }
            if (element > max)
            {
                max = element;
            }
        }
        int[] buckets = new int[max - min + 1];
        for (int element : array)
        {
            buckets[element - min]++;
        }
        int arrayIndex = 0;
        for (int i = 0; i < buckets.length; i++)
        {
            for (int j = buckets[i]; j > 0; j--)
            {
                array[arrayIndex++] = i + min;
            }
        }
    }
}