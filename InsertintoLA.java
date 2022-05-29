// insert into a linear array

import java.util.Scanner;

public class InsertintoLA {
    public static void main(String[] args) {
        int n, k, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial size of array");
        n = sc.nextInt();
        int[] ar = new int[n + 10];
        // user input array
        System.out.println("Enter the element of array");
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        

        // inserting procedure
        do{
            System.out.print("Enter the inserting position : ");
            k = sc.nextInt();
            // initialize counter j
            j = n - 1;
            k--;
            while (j >= k) {
                ar[j + 1] = ar[j];
                j--;
            }
            System.out.print("Enter the value at position " + (k + 1) + " : ");
            ar[k] = sc.nextInt();
            n = n + 1;
            System.out.print("To stop insert press zero ");
        } while (sc.nextInt() != 0);
        for (int i = 0; i < n; i++)
            System.out.print(ar[i] + ", ");
        sc.close();
    }
}
