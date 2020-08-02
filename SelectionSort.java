import java.util.Scanner;

/**
 * This is an implementation of the selection sort algorithm.
 * @author @inforkgodara
 *
 */
public class SelectionSort {

    /**
     * Selection sort implementation.
     * @param list the array to be sorted.
     * @param length the integer which size of list.
     */
    static void sort(int list[], int length) { 
        for (int i = 0; i < length-1; i++) 
        { 
            int minIndex = i; 
            for (int j = i+1; j < length; j++) {
                if (list[j] < list[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = list[minIndex];
            list[minIndex] = list[i]; 
            list[i] = temp; 
        } 
    }

    public static void main(String[] args) {
        System.out.print("Enter length of list : ");
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] list = new int[length];

        for (int index = 0; index < length; index++) {
            list[index] = scanner.nextInt();
        }

        sort(list, length);

        System.out.print("Sorted list: ");

        for (int element: list) {
            System.out.print(element + " ");
        }
    }
}