// Implementation of buble sort algorithm o(n^2)

import java.util.Scanner;

public class Bublesort {
    public static void main(String[] args) {
        int n, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial size of array");
        n = sc.nextInt();
        int[] ar = new int[n];
        // user input array
        System.out.println("Enter the element of array");
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();

        // buble sort main theme
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1 ; j++) {
                if (ar[j] > ar[j + 1]) {
                    temp = ar[j + 1];
                    ar[j + 1] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        sc.close();
        // print the array
        System.out.println("Sorted array : ");
        for (int i = 0; i < n; i++)
            System.out.print(ar[i] + " ");
    }
}
