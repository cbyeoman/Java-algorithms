//Shell Sort
import java.io.*;
import java.util.*;
class Solution {

    public static void main(String[] args) {
        //initializing array
        int arr[] = {10, 7, 3, 1, 9, 7, 4, 3};
        System.out.print("Initial Array : ");
        printArray(arr);
        shellsort(arr);
    }
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
    public static void shellsort(int arr[]) {
        int N = arr.length;
        int h = N / 3;
        int pass = 1;

        while(h > 0) {
            for(int i = h; i < N; i++) {
                int temp = arr[i], j;

                for(j = i; j >= h && arr[j - h] > temp; j -= h) {
                    arr[j] = arr[j - h];
                }

                arr[j] = temp;
            }

            System.out.print("After pass " + pass + "  : ");
            printArray(arr);
            pass++;
            h /= 2;
        }
    }
}