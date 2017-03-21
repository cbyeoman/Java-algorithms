import java.util.*;
import java.lang.*;
import java.io.*;

class  Solution {
    public static void main (String[] args) throws java.lang.Exception {
        int arr[] = {1, 3, 2, 5, 7, 11, 31, 20, 8}; // the initial array
        int len = arr.length;
        int start = 0, end = len - 1;

        while(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for(int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}