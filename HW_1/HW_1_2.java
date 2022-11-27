//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

public class HW_1_2 {
    public static void main (String[] args) {
        Integer number = 54;
        int n = Integer.highestOneBit(number);
        System.out.print("Highest one bit of the given integer is = ");
        System.out.println(n);
    }
}

// для числа 54 результат равен 2^5 = 32