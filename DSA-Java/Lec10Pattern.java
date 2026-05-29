public class Lec10Pattern {
    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }
        System.out.println();
        //TO print 1 then 12 then 123 then 1234

        for (int t = 1; t <= 4; t++) {

            for (int s = 1; s <= t; s++) {
                System.out.print(s);
            }

            System.out.println();

        }

        for (int i = 5; i >= 1; i--) {
            for (int g = 1; g <= i; g++) {
                System.out.print(g);
            }
            System.out.println();

        }

        System.out.println();

        // to print *  * *  * * *
        System.out.println();
        System.out.println("*\t* * \t* * *");
        System.out.println();


        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // to print a solid square out of *

        System.out.println();
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //for right triangle using *
        //int n = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //inverse of a right triangle
        //System.out.println();
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println();

        //to print a binary pattern
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }

            System.out.println();

            //print the pattern 1, 22, 33, 4444, 5555
        }


        //Class 11 (21/5/26) TO Print a pyramid using *

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //inverse pyramid and pyramid using *
        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 4- i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();

        for (int i = 4; i >= 1; i--) {

            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();

        //a right triangle using abcde:
        for (int i = 1; i <= 5; i++) {

            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }

            System.out.println();

        }
        System.out.println();
        //inverse of that right abcde triangle:


        for (int i = 5; i >= 1; i--) {

            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }

            System.out.println();
        }
        //to print a hollow square and circle

        //to print a hollow square

        System.out.println();

        for (int i = 1; i <= 8; i++) {

            for (int j = 1; j <= 6; j++) {

                if (i == 1 || i == 8 || j == 1 || j == 6) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        System.out.println();
        for (int i = 1; i <= 5; i++) {

            // spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            // stars and hollow spaces
            for (int j = 1; j <= i; j++) {

                if (j == 1 || j == i || i == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
        System.out.println();

        // to print a stair case
        int stars = 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
            if (i % 2 == 0) {
                stars += 2;
            }

        }
        System.out.println();
            int sat = 2;
            for (int i=1; i<=n; i++){
                for(int j = 1; j<= sat; j++){
                    System.out.print("* ");
                }
                System.out.println();
                if(i%2==0){
                    sat += 2;
                }
            }

        System.out.println();
        System.out.println();

        // to print a x using *
                int cross = 5;

                for(int i = 1; i <= cross; i++) {

                    for(int j = 1; j <= cross; j++) {

                        if(i == j || i + j == cross + 1) {
                            System.out.print("o ");
                        }
                        else {
                            System.out.print("  ");
                        }
                    }

                    System.out.println();
                }
            }
        }







