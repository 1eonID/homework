import java.util.Arrays;

public class ArraysCopier {
        int[] a;
        public static void main(String[] args) {
            int[] a = {1, 2, 9, 8, 12, 15, 21, 5, 8, 12};
            ArraysCopier array = new ArraysCopier(a);
            System.out.println(Arrays.toString(array.copyOf(5)));
            System.out.println(Arrays.toString(array.copyOf(15)));
            System.out.println(Arrays.toString(array.copyOfRange(5, 9)));
            System.out.println(Arrays.toString(array.copyOfRange(10, 15)));
            System.out.println(Arrays.toString(array.fill(99)));
            System.out.println(Arrays.toString(a));
        }
        //конструктор, который принимает массив
        //целых чисел в качестве параметра
        public ArraysCopier(int[] array) {
            this.a = array;
        }

        public int[] copyOf(int newLength) {
            if (newLength > a.length) return null;
            int[] arr = new int[newLength];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = a[i];
            }
            return arr;
        }// возвращает новый массив указанной длины.

    public int[] copyOfRange(int from, int to) {

        if (to >= a.length || to < from) return null;

        int[] arr = new int[to-from+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a[from + i];
        }
        return arr;
    }// возвращает новый массив начиная с элемента from до элемента to

    public int[] fill(int value) {
        int[] arr = new int[a.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        return arr;
    }// возвращает новый массив заполненный значением параметра value

}
