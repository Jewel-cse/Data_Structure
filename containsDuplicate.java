import java.util.Scanner;

class containsDuplicate {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the element of array");
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        sc.close();
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (ar[j] == ar[i]) {
                    System.out.println("true");
                    System.exit(1);
                }
            }
        }  
        System.out.println("false");
    }    
}