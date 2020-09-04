import java.util.Scanner;

public class q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number to get the hailstone sequence of it:");
        int m = sc.nextInt();
        if(m==1) {
            System.out.print("1");
            return;
        }
        if(m<1) {
            System.out.print("Invalid input");
            return;
        }
        while(m!=1) {
            System.out.print(m+" ");
            if(m%2==0) m = m/2;
            else m = m*3+1;
        }
        System.out.print("1");
    }
}