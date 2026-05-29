public class Lec17 {
    //
    public static int shortestDistance(int[] arr){
        int minDistance = Integer.MAX_VALUE;
        int evenCount = 0;

        for(int i = 0; i < arr.length; i++) {

            if (arr[i] > 0 && arr[i] % 2 == 0) {
                evenCount++;

                for (int j = 1 + i; j < arr.length; j++) {

                    if (arr[j] > 0 && arr[j] % 2 == 0) {
                        int distance = j - i;

                        if (distance < minDistance) {
                            minDistance = distance;
                        }
                        break;
                    }
                }
            }
        }
        if (evenCount <= 1) {
            return -1;
        }
        return minDistance;
    }
    public static void main(String[] args){
        int[] arr = {1, 4, 7, 8, 10, 3};
        int result = shortestDistance(arr);
        System.out.println(result);
    }
}
