public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        for(int i = 0; i < n - 1; i++) {
            swapped = false;
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in inner loop, the array is sorted
            if(!swapped) break;
        }
    }
    
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Array before sorting:");
        for(int num : array) {
            System.out.print(num + " ");
        }
        
        bubbleSort(array);
        
        System.out.println("\nArray after sorting:");
        for(int num : array) {
            System.out.print(num + " ");
        }
    }
}