package HW_4_1;

import java.io.File;

public class Main {
    public static void main(String[] args){
        int[] array2 = new int[] {
            4, 2, 5, 2, 1, 6, 6, 7, 1
        } ;
        int[] array3 = new int[] {
            4, 2, 5, 2, 1, 6, 6, 7
        } ;
    try {
        concatArray(array2, array3);
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
    }
// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
    public static void ex1(String[] args){
        String name = null;
        System.out.println(name.length());
    }

    public static void ex2(String[] args){
        Object object = new String ("123");
        File file = (File) object;
        System.out.println(file);
    }

    public static void ex3(String[] args){
        String number = "123abc";
        int result = Integer.parseInt(number);
        System.out.println(result);
    }
// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.


    private static void concatArray(int[] a, int[] b) throws Exception {
        if (a.length != b.length) {
            throw new RuntimeException ("Длины массивов не равны");
        }
            int[] r = new int[a.length];
            for (int i = 0; i < a.length; i++){
            r[i]=a[i]+b[i];
            System.out.print(r[i] + " ");
            }
    }
}