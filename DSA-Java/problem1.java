public class problem1 {

    static int sumOfDigits(int n) {

        int res = 0;

        while(n > 0) {

            int dig = n % 10;

            n = n / 10;

            res = res + dig;
        }

        return res;
    }
}