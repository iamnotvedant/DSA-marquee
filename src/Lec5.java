/*local and global variable difference and its use case declaratio
public class Lec5 {
    int x;

}*/




/*class hi{
    static int x = 10;
}
class hello{
    int y =5;
    public static void main() {
        System.out.println(hi.x);
    }
}*/

import java.util.Scanner;
public class Lec5{
    static void main() {
        final byte a =10;
        final byte b=20;
        byte c = a +b;
        System.out.println(c);



        //int x = 13;
        //int y = 14;
        //int z = 15;
        //
        // int maxofthree = x>y && x>z ? x : y>x && y>Z ? y:z;
       // Scanner sc = new Scanner(System.in);
        //int v = sc.nextInt();

        //String res = v>18? "eligible to vote":"Not Eligible";
        //System.out.println(res);

        int m = 5;
        System.out.println(m++ + ++m * m++);
        int s = 1;
        System.out.println(++s + s++ + --s + s--);

    }

}