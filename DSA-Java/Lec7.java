
   // public static void main(String[] args) {
     //   int x = 42;
        //checkType (x);
        //int i = 1;
        //System.out.println(i+1); //2
        //System.out.println (i = i + 1) ; //3
        //System.out.println(i++); //4
        //System.out.println(++i); //5
//Operator concept
//initialization concept
//Post increment
//Pre increment
   import java.util.Scanner;



  /* public class Lec7 {
       public static void main(String[] args) {

           Scanner sc = new Scanner(System.in);

           System.out.print("Marks: ");
           int m = sc.nextInt();

           switch (m / 10) {

               case 10:
               case 9:
                   System.out.println("A1");
                   break;

               case 8:
                   System.out.println("A2");
                   break;

               case 7:
                   System.out.println("B1");
                   break;

               default:
                   System.out.println("Fail");
           }
       }
   }*/




   public class Lec7 {
       public static void main(String[] args) {

           Scanner sc = new Scanner(System.in);

           System.out.print("Enter role: ");
           String role = sc.nextLine();

           switch(role) {

               case "admin":
                   System.out.println("Waatashi Admin");
                   break;

               case "student":
                   System.out.println("Watashiwa Student");
                   break;

               case "teacher":
                   System.out.println("Watashi Teacher");
                   break;

               case "guest":
                   System.out.println("watashi Guest");
                   break;

               default:
                   System.out.println("Invalid Role");
           }
           //print sum of whole numbers from 0 to 20!
           //print sum of natural numbers from 1 to 20
           //print sum of multiples of 3 from 1 to 20
            int sum = 0;
           for (int i = 0; i<=20; i++){
               if (i%3 ==0){
                   sum = sum + i;
               }

           }
               System.out.println("sum = "+ sum);


           //if my battery is 10% i have to charge it at 100%, if per minute its charging 10% use while and what will be the number of times itll run

                   int battery = 10;
                   int count = 0;

                   while(battery < 100) {

                       battery = battery + 10;
                       count++;

                       System.out.println("Battery: " + battery + "%");
                   }

                   System.out.println("Loop ran " + count + " times");

                   //using while write a code for factorial

                   Scanner vv = new Scanner(System.in);

                   System.out.print("number: ");
                   int n = sc.nextInt();

                   int f = 1;

                   while(n > 0) {
                       f = f * n;
                       n--;
                   }

                   System.out.println("Factorial = " + f);


                   //if a number is prime number or not


                   Scanner sn = new Scanner(System.in);

                   System.out.print("Enter a number: ");
                   int s = sc.nextInt();

                   int i = 2;
                   boolean prime = true;

                   while(i < s) {

                       if(s % i == 0) {
                           prime = false;
                           break;
                       }

                       i++;
                   }

                   if(prime == true && s > 1) {
                       System.out.println("Prime Number");
                   }
                   else {
                       System.out.println("Not Prime");
                   }

                    //run from 2 to n-1 using for

               }
           }




 /*  public class Lec7 {
       public static void main(String[] args) {

           int sum = 0;

           for(int i = 1; i <= 20; i++) {

               if(i % 3 == 0) {
                   sum = sum + i;
               }
           }

           System.out.println("Sum = " + sum);
       }
   }
*/