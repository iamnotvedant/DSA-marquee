public class Lec14 {
//decimal to binary numbers
    public static int decimalToBinary(int num) {

        int binary = 0;
        int place = 1;
        while(num > 0) {
            int rem = num % 2;
            binary = binary + rem * place;
            place = place * 10;//what is place value
            num = num / 2;
        }
        return binary;
    }
    public static void main(String[] args) {
        int number = 10;
        int ans = decimalToBinary(number);
        System.out.println(ans);
    }
}