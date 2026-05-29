// A = clesius to farenheit
//if a vowel is boolean or not using char
// write a function to check if a number is prime or not using boolean



    public class diif_function {

       /* static void prime(int n) {

            int count = 0;

            for(int i = 1; i <= n; i++) {

                if(n % i == 0) {
                    count++;
                }
            }

            if(count == 2) {
                System.out.println("Prime Number");
            }
            else {
                System.out.println("Not Prime");
            }
        }

        public static void main(String[] args) {

            prime(11);

        }*/

            static boolean prime(int n) {

                if(n <= 1) {
                    return false;
                }

                for(int i = 2; i < n; i++) {

                    if(n % i == 0) {
                        return false;
                    }
                }

                return true;
            }

            public static void main(String[] args) {

                int num = 2;

                boolean ans = prime(num);

                System.out.println(ans);

            }
        }
