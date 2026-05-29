import java.util.Scanner;
public class Lec7m1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean prime = true;

        for(int i = 2; i <= n - 1; i++) {

            if(n % i == 0) {
                prime = false;
                break;
            }
        }
        if(prime == true && n > 1) {
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not Prime");
        }


        //reversing a number

                Scanner sd = new Scanner(System.in);

                System.out.print("Enter number: ");
                int x = sc.nextInt();

                int reverse = 0;

                while(x > 0) {

                    int digit =x % 10;

                    reverse = reverse * 10 + digit;

                    x = x / 10;
                }

                System.out.println("Reverse = " + reverse);



                //Palindrome

                /*Scanner sv = new Scanner(System.in);

                System.out.print("Enter number: ");
                int y = sc.nextInt();

                int original = y;
                int rev = 0;

                for( ; y > 0; y = y / 10) {

                    int digit = y % 10;

                    rev = rev * 10 + digit;
                }

                if(original == rev) {
                    System.out.println("Palindrome");
                }
                else {
                    System.out.println("Not Palindrome");
                }
            */

                Scanner st = new Scanner(System.in);

                System.out.print("Enter number: ");
                int num = sc.nextInt();

                int original = num;
                int rev = 0;

                while(num > 0) {

                    int digit = num % 10;

                    rev = rev * 10 + digit;

                    num = num / 10;
                }

                System.out.println("Reverse = " + rev);

                if(original == rev) {
                    System.out.println("palindrome");
                }
                else {
                    System.out.println("not a palindrome");
                }
            }
        }
