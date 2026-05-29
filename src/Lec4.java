import java.math.BigDecimal;

public class Lec4 {
    public static void main(String[] args){
        System.out.println(20+30+"Java");

        /*System.out.print(System.out.print("Java"));
        (Void type not allowed)*/
        System.out.println(2+3*4%5);
        System.out.println("A"+'B');/*if the first character is string then after that no matter whats written itll be string, unless its string*/
        System.out.println('A'+'B');
        System.out.println("A"+"B");
        System.out.println('A'+"B");
        System.out.println("5"+'B');
        System.out.println('B'+"5");
        System.out.println(5>3||10>20 && 2>1);

        /*BigDecimal is itself an class

        BigDecimal


        System.out.println(result.equals(new BigDecimal("0.3")));
         */
         byte b1=125;
         ++b1;
        System.out.println(b1);
         b1++;
        System.out.println(b1);
       /* byte b3 = b1+3;
          System.out.println(b3);             (it'll throw am incompatible type)*/
    }
}


//when to put static and when to not put it while variable declaration.
