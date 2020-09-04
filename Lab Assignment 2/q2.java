import java.util.Scanner;

public class q2 {

    static void count_Sort(int[] a) {
        int n = a.length;
        int[] count = new int[21];
        for(int j=0;j<21;j++) count[j] = 0;
        for(int j=0;j<n;j++) {
            count[a[j]]++;
        }
        int l=0;
        for(int i=0;i<21;i++) {
            for(int j=0;j<count[i];j++) {
                a[l] = i;
                l++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("COUNTING SORT (RANGE 0 TO 20)\n\nEnter number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] a = new int[n];
        for(int j=0;j<n;j++) {
            a[j] = sc.nextInt();
        }
        count_Sort(a);
        for(int j=0;j<n;j++) {
            System.out.print(a[j]+" ");
        }
    }
}