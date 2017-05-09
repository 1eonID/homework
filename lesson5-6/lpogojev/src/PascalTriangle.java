public class PascalTriangle {
    int n;
    public static void main(String[] args) {
        PascalTriangle triangle1 = new PascalTriangle(5);
        triangle1.print();
        triangle1.print("ODD");
    }
    public PascalTriangle(int n) {
        this.n = n;
    }

    public void print() { // печатает в консоль треугольник Паскаля
        int rows = n;
        int[][] arr = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            //для вывода в консоль в виде тругольника, печатаем нужное количество пробелов
            for (int k = i; k < rows-1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                if (j > 0 && j < i) {
                    //все элементы, кроме первого и последнего в строке
                    // представляются, как сумма элементов [i-1][j-1] и [i-1][j]
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                    //печатаем пробел между цифрами, чтобы они не "сливались"
                    System.out.print((arr[i][j]) + " ");
                }
                else {
                    //первым и последним элементом строки всегда будет "1".
                    arr[i][j] = 1;
                    //печатаем пробел между цифрами, чтобы они не "сливались"
                    System.out.print((arr[i][j]) + " ");
                }
            }
            System.out.println("");
        }
    }
    public void print(String filter) {
        int rows = n;
        int[][] arr = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            //для вывода в консоль в виде тругольника, печатаем нужное количество пробелов
            for (int k = i; k < rows-1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                if (j > 0 && j < i) {
                    //все элементы, кроме первого и последнего в строке
                    // представляются, как сумма элементов [i-1][j-1] и [i-1][j]
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                    if (arr[i][j]%2 == 0 && filter.equals("EVEN")) {
                        System.out.print("? ");
                    } else if (arr[i][j]%2 != 0 && filter.equals("ODD")) {
                        System.out.print(". ");
                    } else {
                        //печатаем пробел между цифрами, чтобы они не "сливались"
                        System.out.print((arr[i][j]) + " ");
                    }
                }
                else {
                    //первым и последним элементом строки всегда будет "1".
                    arr[i][j] = 1;
                    if (filter.equals("ODD")) {
                        System.out.print(". ");
                    } else {
                        //печатаем пробел между цифрами, чтобы они не "сливались"
                        System.out.print((arr[i][j]) + " ");
                    }
                }
            }
            System.out.println("");
        }

    }
    // где переменная filter может быть "EVEN" или "ODD".
    // Печатает треугольник Паскаля, заменяет четные или нечетные числа
    // символами на ваше усмотрение, например пробел или `..`
}

