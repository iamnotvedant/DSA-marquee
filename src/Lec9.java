public class Lec9 {
    //Eucledia's Algorithm
    public static void main(String[] args) {
        int max = 60;
        int min = 18;
        while(min != 0) {
            int rem = max % min;
            max = min;
            min = rem;
        }
        System.out.println(max);
/*
        public class Lec9 {

            public static boolean isPower(int n, int m) {

                if(m == 1) {
                    return (n == 1);
                }

                while(n % m == 0) {
                    n = n / m;
                }

                return (n == 1);
            }

            public static void main(String[] args) {

                System.out.println(isPower(81, 3));
            }
        }
        }
*/


    }
}

