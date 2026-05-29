import java.util.Scanner;
public class Lec15 {
    // arrays :
    //int[] arr:       (declaration)
    //int [] br = {1, 2, 3, 4}      (initialisation)
    //to find length of array - arr.length


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int number = sc.nextInt();
        int[] arr = new int[number];
        System.out.println("Enter the elements:");
        for (int i = 0; i < number; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are:");

        for (int i = 0; i < number; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
