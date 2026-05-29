public class Lec8 {
    //sum of square of digits
    public static void main(String[] args) {
        //int number = sc.nextInt()
        int number = 12131;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum = sum + (digit * digit);
            number = number / 10;
        }
        System.out.println("Sum of squares = " + sum);
//armstrong nnumber
        int num = 153;
        int summ = 0;
        while (num > 0) {
            int dig = num % 10;
            summ = summ + (dig * dig * dig);
            num = num / 10;
        }
        System.out.println("Sum of cubes = " + summ);

        // summation of perfect squares of number between 20 to 60

               /* int summa = 0;
                for(int i = 20; i <= 60; i++) {
                    int root = (int)Math.sqrt(i);
                    if(root * root == i) {
                        summa = summa + i;
                    }
                }
                System.out.println("Sum = " + sum);
            }
        }*/
       /* int su = 0;

        for (int i = 20; i <= 80; i++) {

            for (int j = 1; j <= i; j++) {

                if (j * j == i) {
                    su = su + i;
                }
            }
        }
        System.out.println("Sum = " + su);
    }
}*/

/*public class Main {
    public static void main(String[] args) {

        int sum = 0;

        for(int i = 20; i <= 60; i++) {

            double sq = Math.sqrt(i);

            if(sq == (int)sq) {
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }
}*/

        //   for (i = 1; i <= 80; i++) {
        //     if (i * i >= 20 && i * i <= 80) {
        //       System.out.println(i * i);
        // }
        //}
        int n = 5;
        int num1 = 0;
        int num2 = 1;

        for (int i = 1; i <= 5; i++) {

            System.out.println(num1);

            int next = num1 + num2;
            num1 = num2;
            num2 = next;
        }
        /*class GfG {

            public static boolean isPower(int x, int y) {

                if (x == 1)
                    return (y == 1);

                long pow = 1;
                while (pow < y)
                    pow *= x;

                // Check if power of x becomes y
                return (pow == y);
            }

            public static void main(String[] args) {
                System.out.println(isPower(10, 1));
                System.out.println(isPower(1, 20));
                System.out.println(isPower(2, 128));
                System.out.println(isPower(2, 30));
            }
        }
            }
        }*/
        //to  hceck the power of a number
        //while(y%x--0)
        //     y = y / x
        //}
        //y==1


        int y = 27;
        int x = 3;

        while (y % x == 0) {
            y = y / x;
        }

        if (y == 1) {
            System.out.println("It is it's Power");
        } else {
            System.out.println("Not a Power");
        }
    }
}


