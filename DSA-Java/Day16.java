import java.util.*;
public class Day16 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        buildings(arr, n);
    }

    public static void buildings(int[] arr, int n) {
        // your code here
        int row = 0;
        int column = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}