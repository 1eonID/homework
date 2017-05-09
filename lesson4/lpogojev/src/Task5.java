public class Task5 {
    public static void main(String[] args) {
        String BinNum1 = "111";
        String BinNum2 = "10101";
        String BinNum3 = "111000";
        System.out.println(BinNum1 + " in demical => " + convertBinToDec1

(BinNum1));
        System.out.println(BinNum2 + " in demical => " + convertBinToDec1

(BinNum2));
        System.out.println(BinNum3 + " in demical => " + convertBinToDec1

(BinNum3));
    }

    public static int convertBinToDec1(String binary) {
        int res = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                res += power(2, binary.length() - 1 - i);
            }
        }
        return res;
    }

    public static int power(int a, int b) {
        int res = 1;
        if (b != 0) {
            for (int i = 0; i < b; i++) {
                res *= a;
            }
        } else {res = 1;}
        return res;
    }
}

