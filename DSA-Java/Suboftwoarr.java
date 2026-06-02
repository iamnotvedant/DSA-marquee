import java.util.Scanner;

public class Suboftwoarr{

    public static int[] subOfArrays(int[] arr1, int[] arr2, int num1, int num2) {

        int[] result = new int[Math.max(num1, num2)];

        int i = num1 - 1;
        int j = num2 - 1;
        int k = result.length - 1;

        int borrow = 0;

        while (k >= 0) {

            int a = 0;
            int b = 0;

            if (i >= 0) {
                a = arr1[i];
            }

            if (j >= 0) {
                b = arr2[j];
            }

            a = a - borrow;

            if (a < b) {
                a = a + 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            result[k] = a - b;

            i--;
            j--;
            k--;
        }


        int start = 0;

        while (start < result.length - 1 && result[start] == 0) {
            start++;
        }

        int[] finalResult = new int[result.length - start];

        int index = 0;

        for (int p = start; p < result.length; p++) {
            finalResult[index] = result[p];
            index++;
        }

        return finalResult;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int num1 = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int num2 = sc.nextInt();

        int[] arr1 = new int[num1];
        int[] arr2 = new int[num2];

        System.out.println("Enter elements of first array:");

        for (int i = 0; i < num1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter elements of second array:");

        for (int i = 0; i < num2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] result = subOfArrays(arr1, arr2, num1, num2);

        System.out.print("Subtraction of two arrays: ");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
