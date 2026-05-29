import java.util.Scanner;
public class lec3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float c = 42;
        float f = (c * 9/5) + 32;
        System.out.println("The temp is " + f);

        boolean b1 = true;
        boolean b2 = false;
        System.out.println((b1==b2));

        double d1 = 0.1+0.2;
        System.out.println("Equals?" + (d1!=0.3));


       /* int x=1, y =4, z = 5;
        System.out.println(x>y>z);*/

    }
}
