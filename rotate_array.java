import java.util.Scanner;

public class rotate_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of array (n): ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        // Calculate rotation size (n/k)
        int rotateBy = n / k;

        // Rotate array by n/k positions
        rotateArray(arr, rotateBy);

        // Print rotated array
        System.out.println("Array after rotation by " + rotateBy + " positions:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    // Function to rotate array to the left by d positions
    public static void rotateArray(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // handle cases where d > n

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    // Helper function to reverse a portion of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
