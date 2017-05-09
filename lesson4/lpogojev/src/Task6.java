public class Task6 {
    public static void main(String[] args) {
        String BinNum1 = "111";
        String BinNum2 = "10101";
        String BinNum3 = "111000";
        System.out.println(BinNum1 + " in demical => " + convertBinToDec2(BinNum1));
        System.out.println(BinNum2 + " in demical => " + convertBinToDec2(BinNum2));
        System.out.println(BinNum3 + " in demical => " + convertBinToDec2(BinNum3));
    }

    public static int convertBinToDec2(String binary) {
        int res = 0;
        for (int i = 0; i < binary.length(); i++) {
            char n = binary.charAt(i);
            int num = Character.getNumericValue(n);
            res = res * 2 + num;
        }
        return res;
    }
}
