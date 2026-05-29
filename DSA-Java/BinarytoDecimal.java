public class BinarytoDecimal {
    // Binary to Decimal

    public static int binaryToDecimal(int num) {
        int decimal = 0;
        int place = 1;
        while(num > 0) {
            int digit = num % 10;
            decimal = decimal + digit * place;
            place = place * 2;
            num = num / 10;
        }
        return decimal;
    }
    public static void main(String[] args) {
        int number = 1010;
        int ans = binaryToDecimal(number);
        System.out.println(ans);
    }
}

