public class Task7 {
    public static void main(String[] args) {
        int Num1 = 7;
        int Num2 = 21;
        int Num3 = 0;
        int Num4 = 56;
        System.out.println(Num1 + " in binary => " + convertDecToBin1(Num1));
        System.out.println(Num2 + " in binary => " + convertDecToBin1(Num2));
        System.out.println(Num3 + " in binary => " + convertDecToBin1(Num3));
        System.out.println(Num4 + " in binary => " + convertDecToBin1(Num4));

    }

    public static String convertDecToBin1(int decimal) {
        String res = "";
        do {
            if (decimal%2 == 0) {
                res = 0 + res;
            } else {
                res = 1 + res;
            }
            decimal /= 2;
        } while (decimal >= 1);
        return res;
    }
}
