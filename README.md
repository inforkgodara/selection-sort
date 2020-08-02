# Selection Sort

A simple single class implementation of selection sort in Java. The user will be prompted to input the number of elements in a list array which they want to enter. The list array is divided into two parts, the sorted part at the left end and the unsorted part at the right end. Initially, the sorted part is empty and the unsorted part is the entire list.

The smallest element is selected from the unsorted array and swapped with the leftmost element, and that element becomes a part of the sorted array. This process continues moving unsorted array boundaries from one element to the right.

## How to use it.
* Open a command prompt window and go to the directory where you saved the java program (SelectionSort.java).
* Type 'javac SelectionSort.java' and press enter to compile your code. If there are no errors in your code, the command prompt will take you to the next line.
* Now, type 'java SelectionSort' to run your program.
* You will be able to see an output line and asking input to enter the number of elements (integer) you want to enter.
* Next you will enter the number of elements it can be space-separated or in a new line.
* After completion of entering elements in list, the program will show sorted list.

## Code
```
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
```

