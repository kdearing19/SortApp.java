/* Name: Koda Dearing
      File: SortApp.java
      Date: October 22, 2024
      Description: sorts through the 9 integers that are listed and orders them from 1 - 14 in order
    */
public class Main {
    public static void main(String[] args) {
        int[] myArray = {1,4,3,5,7,2,6,9,8,10};

        System.out.print("Original array: ");
        printArray(myArray);

        myBubbleSort(myArray);

        System.out.print("Sorted array: ");
        printArray(myArray);
    }

    public static void myBubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            System.out.print("Array after pass " + (i + 1) + ": ");
            printArray(a);
        }
    }

    public static void printArray(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
