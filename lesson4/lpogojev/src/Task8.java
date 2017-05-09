public class Task8 {
    static int arr[] = {512, 256, 128, 64, 32, 16, 8, 4, 2, 1};

    public static void main(String[] args) {
        int Num1 = 7;
        int Num2 = 21;
        int Num3 = 0;
        int Num4 = 56;
        System.out.println(Num1 + " in binary => " + convertDecToBin2(Num1));
        System.out.println(Num2 + " in binary => " + convertDecToBin2(Num2));
        System.out.println(Num3 + " in binary => " + convertDecToBin2(Num3));
        System.out.println(Num4 + " in binary => " + convertDecToBin2(Num4));
    }

    public static String convertDecToBin2(int decimal) {
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            if (decimal < arr[i]) {
                res = res + 0;
            } else {
                decimal = decimal - arr[i];
                res = res + 1;
            }
        }
        return res;
    }
}
