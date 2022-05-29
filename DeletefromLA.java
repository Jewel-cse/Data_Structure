// delete from a linear array

import java.util.Scanner;

public class DeletefromLA {
    public static void main(String[] args) {
        int n, k, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial size of array");
        n = sc.nextInt();
        int[] ar = new int[n];
        // user input array
        System.out.println("Enter the element of array");
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();

        // deleting procedure [upward]
        do {
            System.out.print("Enter the deleting position : ");
            k = sc.nextInt();
            int item = ar[k-1];
            for (j = k; j < n; j++) {
                ar[j - 1] = ar[j];
            }
            System.out.println("Deleted item " + item);
            n = n - 1;
            if (n < k)
                break;
                       
            System.out.print("To stop delete press zero ");
        } while (sc.nextInt() != 0);
        for (int i = 0; i < n; i++)
            System.out.print(ar[i] + " ");
        sc.close();
    }
}
