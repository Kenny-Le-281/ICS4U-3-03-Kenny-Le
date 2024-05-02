import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        // Generate an array of 250 random numbers ranging from 0 to 999
        int[] numbers = new int[250];
        for (int i = 0; i < 250; i++) {
            numbers[i] = (int) (Math.random() * 1000); // generates random number between 0 and 999
        }
        
        // Sort the array (binary search requires the array to be sorted)
        Arrays.sort(numbers);
        
        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        
        // Number to search
        int target = 567; // Change this to any number you want to search for
        
        // Perform binary search
        int index = binarySearch(numbers, target);
        
        // Display the result
        if (index != -1) {
            System.out.println(target + " found at index " + index);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
    
    // Binary search method
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1; // Target not found
    }
}
