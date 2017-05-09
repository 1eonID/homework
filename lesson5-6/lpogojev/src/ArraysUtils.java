import java.util.Arrays;

public class ArraysUtils {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3, 4, 5},{55, 44, 33, 22, 11}};
        int[][] arr2 = {{1, 2, 3, 4, 5},{55, 44, 33, 22, 11}};
        int[][] arr3 = {{1, 2, 3, 4, 5},{55, 44, 33, 2}};
        System.out.println(areEqual(arr1, arr2));
        System.out.println(areEqual(arr1, arr3));
        System.out.println();
        System.out.println(Arrays.deepToString(arr3));
        System.out.println();
        System.out.println(Arrays.toString(linearize(arr3)));
        System.out.println();
        System.out.println(Arrays.deepToString(transpose(arr2)));
//      System.out.println(Arrays.deepToString(transpose(arr3)));
//  В случае, когда в нашем массиве разное количество элементов в стоках, то наш метод не сработает,
//  т.к. будет проблема с обьявлением нового массива. Нужно будет реализовать обьявление массива через
//  класс ArrayList
        System.out.println();
        createSpiral(5, 5);
        System.out.println();
        print(arr3);
    }
    public static boolean areEqual(int[][] arr1, int[][] arr2) {
        boolean eq = true;
        if (arr1.length != arr2.length) eq = false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].length != arr2[i].length) {eq = false; break;}
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    eq = false;
                }
            }
        }
        return eq;
    }
    // возвращает true если двумерные массивы одинаковы.

    public static int[] linearize(int[][] arr) {
        int k = 0;
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                k++;
            }
        }
        int[] a = new int[k];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                a[n] = arr[i][j];
                n++;
            }
        }
        return a;
    }
    // "Распрямляет" двумерный массив. Например из {{1, 2}, {1, 2}} делает {1, 2, 1, 2}

    public static int[][] createSpiral(int n, int m) {
        int[][] arr = new int[n][m];
        int k=1, col1=0, col2=n-1, row1=0, row2=m-1;

        while(k<=n*m) {
            for(int i=col1;i<=col2;i++) {
                arr[row1][i]=k++;
            }
            for(int j=row1+1;j<=row2;j++) {
                arr[j][col2]=k++;
            }
            for(int i=col2-1;i>=col1;i--) {
                arr[row2][i]=k++;
            }
            for(int j=row2-1;j>=row1+1;j--) {
                arr[j][col1]=k++;
            }
            col1++;
            col2--;
            row1++;
            row2--;
        }

        //вывод "спирального" массива
        for(int i=0; i<n ;i++) {
            for(int j=0; j<m; j++) {
                System.out.print(arr[i][j]+ "\t");
            }
            System.out.println();
        }
        return arr;
    }
    // создает и заполняет двумерный массив размерности [n][m] по спирали

    public static int[][] transpose(int[][] arr) {
        int[][] a = new int[arr[0].length][arr.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = arr[j][i];
            }
        }
        return a;
    }
    // Если представить двумерный массив как матрицу из R столбцов и C строк,
    // то результатом будет "матрица" [C][R]

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    // печатает двумерный массив в консоль
}

